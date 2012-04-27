package com.truman.trippy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockListFragment;
import com.apphance.android.Log;
import com.nostra13.universalimageloader.core.DecodingType;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.truman.trippy.YourTripsFragment.ViewHolder;
import com.truman.trippy.api.Result;
import com.truman.trippy.api.TrippyApi;
import com.truman.trippy.api.TrippyApiException;
import com.truman.trippy.api.entities.Photo;
import com.truman.trippy.api.entities.Trip;
import com.truman.trippy.api.entities.Trips;
import com.truman.trippy.helper.TripFeedHelper;

public class FriendTripsFragment extends SherlockListFragment{
	ImageLoader mImageLoader;
	DisplayImageOptions mOptions;
	ArrayList<Trip> mTripList = new ArrayList<Trip>();
	ArrayAdapter<Trip> adapter;
	HashMap<String, Photo> photoMap = new HashMap<String, Photo>();
	class FriendTripsTask extends AsyncTask<Void, Void, Result<Trips>>{

		protected Result<Trips> doInBackground(Void... params) {
			TrippyApi api = new TrippyApi();
			Result<Trips> set = null;

			try {
				set = api.friendTrips(20, 0, null, null);
			} catch (TrippyApiException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}        
			return set;
		}
		protected void onPostExecute(Result<Trips> result) {
			// TODO Auto-generated method stub
			super.onPostExecute(result);
			if (result != null){
				if (result.getResult() != null){
					mTripList.clear();
					Trip[] list = result.getResult().getTrips();
					for(int i = 0; i< list.length; i++){
						mTripList.add(list[i]);
					}
					adapter.notifyDataSetChanged();
				}else{
					Toast.makeText(getActivity().getApplicationContext(), "Could not retrieve activity feed", 4).show();
				}
			}
		}
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		FriendTripsTask task = new FriendTripsTask();
		task.execute();
		adapter=new FriendTripsListAdapter(getActivity(),
				android.R.layout.simple_list_item_1,
				mTripList);
		setListAdapter(adapter);
		//		getListView().setCacheColorHint(0);
		ColorDrawable divider = new ColorDrawable(this.getResources().getColor(R.color.divider));
		getListView().setDivider(divider);
		getListView().setDividerHeight(1);
		mImageLoader = ImageLoader.getInstance();
		mOptions = new DisplayImageOptions.Builder()
		.showStubImage(R.drawable.feed_placeholder_photo)
		.showImageForEmptyUrl(R.drawable.feed_placeholder_photo)
		.cacheInMemory()
		.cacheOnDisc()
		.decodingType(DecodingType.FAST)
		.build();
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		//		((MenuActivity)getActivity()).getSlideoutHelper().close();
	}
	private class FriendTripsListAdapter extends ArrayAdapter<Trip>{


		public FriendTripsListAdapter(Context context, int textViewResourceId,
				List<Trip> objects) {
			super(context, textViewResourceId, objects);
			// TODO Auto-generated constructor stub
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ViewHolder holder;
			Trip trip = getItem(position);
			if(convertView == null){
				LayoutInflater inflater = LayoutInflater.from(this.getContext());	            	
				convertView = inflater.inflate(R.layout.trip_list_item, parent, false);

				holder = new ViewHolder();

				holder.text = (TextView)convertView.findViewById(R.id.content);
				holder.imageView = (ImageView) convertView.findViewById(R.id.profile_image);
				holder.activityText = (TextView)convertView.findViewById(R.id.activity_text);
				
				// Load and display image asynchronously
				mImageLoader.displayImage(trip.getUser().getImageSource(), holder.imageView, mOptions);
				convertView.setTag(holder);
			}else{
				holder = (ViewHolder) convertView.getTag();
			}
			if (trip.getTripDuration() != null && trip.getTripMonth() != null){
				holder.activityText.setText(trip.getTripDuration() + " " + getString(R.string.my_trips_days) +" ¥ " + TripFeedHelper.getMonthNameFromNumber(trip.getTripMonth()));
			}
			else if(trip.getTripDuration() == null && trip.getTripMonth() != null){
				holder.activityText.setText(trip.getTripMonth());
			}
			else if(trip.getTripDuration() != null && trip.getTripMonth() == null){
				holder.activityText.setText(trip.getTripDuration() + " " + getString(R.string.my_trips_days));
			}
			else{
				holder.activityText.setText("");
			}
			holder.text.setText(trip.getPlace().getName());
			mImageLoader.displayImage(trip.getUser().getImageSource(), holder.imageView, mOptions);
			return convertView;
		}

	}

	static class ViewHolder{
		TextView text;
		ImageView imageView;
		TextView activityText;
	}

}