package com.truman.trippy;

import java.util.HashMap;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;

public class SampleActivity extends SherlockFragmentActivity {
	Fragment mFrag;
	HashMap<String, Fragment> fragmentMap;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sample);
		fragmentMap = new HashMap<String, Fragment>();
		mFrag = new ActivityFragment();
		fragmentMap.put("Activity", mFrag);
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.replace(R.id.inner_list, mFrag);
		ft.commit();
		//		findViewById(R.id.sample_button).setOnClickListener(
		//				new OnClickListener() {
		//					@Override
		//					public void onClick(View v) {
		//						int width = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 40, getResources().getDisplayMetrics());
		//						SlideoutActivity.prepare(SampleActivity.this, R.id.inner_content, width);
		//						startActivity(new Intent(SampleActivity.this,
		//								MenuActivity.class));
		//						overridePendingTransition(0, 0);
		//					}
		//				});

	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		SubMenu sub = menu.addSubMenu("");
		sub.setIcon(R.drawable.main_menu_icon);
		sub.add(0, 1, 0, "Activity");
		sub.add(0, 2, 0, "Your Trips");
		sub.add(0, 3, 0, "Friend Trips");
		sub.getItem().setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == android.R.id.home || item.getItemId() == 0) {
			return false;
		}
		FragmentManager fm = getSupportFragmentManager();
		Log.d("Trippy",fm.getBackStackEntryCount()+"");
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
		Fragment newFrag = null;
		newFrag = fragmentMap.get(item.getTitle().toString()); 
		if (newFrag == null){
			if (item.getItemId() == 1) {
				newFrag = new ActivityFragment();
				fragmentMap.put("Activity", newFrag);
			}else if(item.getItemId() == 2){
				newFrag = new YourTripsFragment();
				fragmentMap.put("Your Trips", newFrag);
			}else if(item.getItemId() == 3){
				newFrag = new YourTripsFragment();
				fragmentMap.put("Friend Trips", newFrag);
			}
		}
		if(!newFrag.equals(mFrag)){
			ft.replace(R.id.inner_list,newFrag);
			ft.commit();
			mFrag = newFrag;
		}
		return true;
	}
}
