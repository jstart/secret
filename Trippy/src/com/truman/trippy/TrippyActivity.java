package com.truman.trippy;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import com.actionbarsherlock.app.SherlockActivity;
import com.truman.trippy.api.Result;
import com.truman.trippy.api.TrippyApi;
import com.truman.trippy.api.TrippyApiException;
import com.truman.trippy.api.entities.FBPermissions;

public class TrippyActivity extends SherlockActivity {
    
    class PermissionsTask extends AsyncTask<Void, Void, Result<FBPermissions>>{

    	protected Result<FBPermissions> doInBackground(Void... params) {
            TrippyApi api = new TrippyApi();
            Result<FBPermissions> set = null;

            try {
                set = api.fbPermissions();
    		} catch (TrippyApiException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}        
    		return set;
    	}
    	protected void onPostExecute(Result<FBPermissions> result) {
    		// TODO Auto-generated method stub
    		super.onPostExecute(result);
    		Intent intent = new Intent(TrippyActivity.this, FacebookActivity.class);
    		Bundle b = new Bundle();
    		b.putStringArray("facebookPermissions", result.getResult().getPermissions().split(",")); //Your id
    		intent.putExtras(b); //Put your id to your next Intent
    		startActivity(intent);
    		finish();
    		}
    }
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        String permissions = "friends_location,friends_education_history,friends_work_history,friends_hometown,friends_checkins,email,publish_stream,offline_access";
        Intent intent = new Intent(TrippyActivity.this, FacebookActivity.class);
		Bundle b = new Bundle();
		b.putStringArray("facebookPermissions", permissions.split(","));
		intent.putExtras(b); //Put your id to your next Intent
		startActivity(intent);
		finish();
//        PermissionsTask task = new PermissionsTask();
//		task.execute();
    }
    
}