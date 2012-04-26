package com.truman.trippy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import com.apphance.android.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockListFragment;
import com.markupartist.android.widget.PullToRefreshListView;
import com.markupartist.android.widget.PullToRefreshListView.OnRefreshListener;
import com.nostra13.universalimageloader.core.DecodingType;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.truman.trippy.api.Result;
import com.truman.trippy.api.TrippyApi;
import com.truman.trippy.api.TrippyApiException;
import com.truman.trippy.api.entities.Activities;
import com.truman.trippy.api.entities.Activity;
import com.truman.trippy.api.entities.Photo;
import com.truman.trippy.api.entities.Size;

public class ActivityFragment extends SherlockListFragment{
	ArrayList<Activity> mActivityList = new ArrayList<Activity>(1);
	ArrayAdapter<Activity> adapter;
	HashMap<String, Photo> photoMap = new HashMap<String, Photo>();
	PullToRefreshListView mList = null;
	class ActivityFeedTask extends AsyncTask<Void, Void, HashMap<String, Object>>{

		protected HashMap<String, Object> doInBackground(Void... params) {
			TrippyApi api = new TrippyApi();
			HashMap<String, Object> set = null;

			try {
				set = api.activityFeed(null, 20, 0, null, null);
			} catch (TrippyApiException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}        
			return set;
		}
		protected void onPostExecute(HashMap<String, Object> result) {
			// TODO Auto-generated method stub
			super.onPostExecute(result);
			mActivityList.clear();
			if (result != null){
				if (((Result<Activities>)result.get("Activities")).getResult() != null){
					Log.d("Trippy", "Count of results:" + ((Result<Activities>)result.get("Activities")).getResult().getActivities().length);

					Activity[] list = ((Result<Activities>)result.get("Activities")).getResult().getActivities();
					for (int i = 0; i < list.length; i++){
						mActivityList.add(list[i]);
					}
					photoMap = ((HashMap<String, Photo>)result.get("Photos"));
					adapter.notifyDataSetChanged();
				}else{
					Toast.makeText(getActivity().getApplicationContext(), "Could not retrieve activity feed", 4).show();
				}
//				mList.onRefreshComplete();
			}
		}
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		adapter=new ActivityListAdapter(getActivity(),
				android.R.layout.simple_list_item_1,
				mActivityList);
		setListAdapter(adapter);
		new ActivityFeedTask().execute();
		
		ColorDrawable divider = new ColorDrawable(this.getResources().getColor(R.color.divider));
		getListView().setDivider(divider);
		getListView().setDividerHeight(1);
		// Set a listener to be invoked when the list should be refreshed.
		
//		mList.setOnRefreshListener(new OnRefreshListener() {
//			@Override
//			public void onRefresh() {
//				// Do work to refresh the list here.
//				new ActivityFeedTask().execute();
//			}
//		});
//
//		mList.prepareForRefresh();
//		mList.onRefresh();
	}

//	@Override
//	public View onCreateView(LayoutInflater inflater, ViewGroup container,
//			Bundle savedInstanceState) {
//
//		View root = inflater.inflate(R.layout.pull_to_refresh_list_view, null);
//		mList = (PullToRefreshListView)root.findViewById(android.R.id.list);
//
//		return root;
//	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		Toast.makeText(getActivity(), "Clicked", 2).show();
	}
	private class ActivityListAdapter extends ArrayAdapter<Activity>{


		public ActivityListAdapter(Context context, int textViewResourceId,
				List<Activity> objects) {
			super(context, textViewResourceId, objects);
			// TODO Auto-generated constructor stub
		}
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ViewHolder holder;
			Activity activity = getItem(position);
			if(activity.getUser()!=null){
			String group = activity.getActionGroup().replaceAll(" ", "");
			String username = activity.getUser().getUsername();
			if(convertView == null || !((String)convertView.getTag()).equalsIgnoreCase(group)){
				LayoutInflater inflater = LayoutInflater.from(this.getContext());
				if (group.equalsIgnoreCase("PHOTO")){
					convertView = inflater.inflate(R.layout.activity_photo_row, parent, false);
					convertView.setTag("PHOTO");
				}else if(group.equalsIgnoreCase("TRIP_PLACE")){
					convertView = inflater.inflate(R.layout.menu_list_item, parent, false);
					convertView.setTag("TRIP_PLACE");
				}else if(group.equalsIgnoreCase("TRIP")){
					convertView = inflater.inflate(R.layout.menu_list_item, parent, false);
					convertView.setTag("TRIP");
				}else{
					convertView = inflater.inflate(R.layout.menu_list_item, parent, false);
					convertView.setTag("NONE");
				}
			}
			ImageView profile_image_view = (ImageView) convertView.findViewById(R.id.profile_image);
			// Initialize ImageLoader with configuration. Do it once.
			ImageLoader imageLoader = ImageLoader.getInstance();
			// Create configuration for ImageLoader
			ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(getActivity().getApplicationContext())
			.maxImageWidthForMemoryCache(800)
			.maxImageHeightForMemoryCache(800)
			.httpConnectTimeout(5000)
			.httpReadTimeout(30000)
			.threadPoolSize(5)
			.threadPriority(Thread.MIN_PRIORITY + 2)
			.denyCacheImageMultipleSizesInMemory()
			.defaultDisplayImageOptions(DisplayImageOptions.createSimple())
			.build();
			DisplayImageOptions options = new DisplayImageOptions.Builder()
			.showStubImage(R.drawable.feed_placeholder_photo)
			.showImageForEmptyUrl(R.drawable.feed_placeholder_photo)
			.cacheInMemory()
			.cacheOnDisc()
			.decodingType(DecodingType.MEMORY_SAVING)
			.build();
			// Initialize ImageLoader with created configuration. Do it once.
			imageLoader.init(config);
			// Load and display image asynchronously
			imageLoader.displayImage(activity.getUser().getImageSource(), profile_image_view,options);

			if (group.equalsIgnoreCase("PHOTO")){
				ImageView activity_image_view = (ImageView) convertView.findViewById(R.id.activity_image);
				Size[] sizeArray = ((Photo)photoMap.get(activity.getId())).getSizes();
				imageLoader.displayImage(sizeArray[4].getUrl(), activity_image_view, options);
			}
			
			holder = new ViewHolder();
			holder.text = (TextView)convertView.findViewById(R.id.content);
			TextView activityText = (TextView)convertView.findViewById(R.id.activity_text);
			activityText.setText(ActivityFeedHelper.getActivityString(getActivity(), activity));
			holder.text.setText(username);
			}else{
				LayoutInflater inflater = LayoutInflater.from(this.getContext());

				convertView = inflater.inflate(R.layout.menu_list_item, parent, false);
			}
			return convertView;
		}

	}

	static class ViewHolder{
		TextView text;
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}
}


