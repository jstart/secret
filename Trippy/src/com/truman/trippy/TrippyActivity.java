package com.truman.trippy;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import com.actionbarsherlock.app.SherlockActivity;
import com.apphance.android.Apphance;
import com.truman.trippy.api.Result;
import com.truman.trippy.api.TrippyApi;
import com.truman.trippy.api.TrippyApiException;
import com.truman.trippy.api.entities.FBPermissions;
import com.zubhium.ZubhiumSDK;
import com.zubhium.ZubhiumSDK.CrashReportingMode;

public class TrippyActivity extends SherlockActivity {
    public static final String APP_KEY = "390f3383f3ef06697963e437ca940ad871a5fe3e";
    ZubhiumSDK sdk;
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
        sdk = ZubhiumSDK.getZubhiumSDKInstance(getApplicationContext() ,"ec36da0a4e3fc321399b3fcad985c8");
        
        if(sdk != null){
         	sdk.setCrashReportingMode(CrashReportingMode.SILENT);
         }

        Apphance.startNewSession(this, APP_KEY, Apphance.Mode.QA);
        Apphance.setReportOnShakeEnabled(true);
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