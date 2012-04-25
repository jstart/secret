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
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockListFragment;
import com.truman.trippy.api.Result;
import com.truman.trippy.api.TrippyApi;
import com.truman.trippy.api.TrippyApiException;
import com.truman.trippy.api.entities.Photo;
import com.truman.trippy.api.entities.Trip;
import com.truman.trippy.api.entities.Trips;

public class YourTripsFragment extends SherlockListFragment{
	ArrayList<Trip> mActivityList = new ArrayList<Trip>();
	ArrayAdapter<Trip> adapter;
	HashMap<String, Photo> photoMap = new HashMap<String, Photo>();
	class ActivityFeedTask extends AsyncTask<Void, Void, Result<Trips>>{

		protected Result<Trips> doInBackground(Void... params) {
			TrippyApi api = new TrippyApi();
			Result<Trips> set = null;

			try {
				set = api.myTrips(20, 0, null, null);
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

					Trip[] list = result.getResult().getTrips();
					for(int i = 0; i< list.length; i++){
						mActivityList.add(list[i]);
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
		ActivityFeedTask task = new ActivityFeedTask();
		task.execute();
		adapter=new YourTripsListAdapter(getActivity(),
				android.R.layout.simple_list_item_1,
				mActivityList);
		setListAdapter(adapter);
		//		getListView().setCacheColorHint(0);
		ColorDrawable divider = new ColorDrawable(this.getResources().getColor(R.color.divider));
		getListView().setDivider(divider);
		getListView().setDividerHeight(1);
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		//		((MenuActivity)getActivity()).getSlideoutHelper().close();
	}
	private class YourTripsListAdapter extends ArrayAdapter<Trip>{


		public YourTripsListAdapter(Context context, int textViewResourceId,
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
				convertView = inflater.inflate(R.layout.activity_photo_row, parent, false);

				holder = new ViewHolder();

				holder.text = (TextView)convertView.findViewById(R.id.content);

				convertView.setTag(holder);
			}else{
				holder = (ViewHolder) convertView.getTag();
			}

			holder.text.setText(trip.getPlace().getName());
			return convertView;
		}

	}

	static class ViewHolder{
		TextView text;
	}

}