package com.truman.trippy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;

import com.actionbarsherlock.app.SherlockActivity;
import com.facebook.android.DialogError;
import com.facebook.android.Facebook;
import com.facebook.android.Facebook.DialogListener;
import com.facebook.android.FacebookError;
import com.truman.trippy.api.Result;
import com.truman.trippy.api.TrippyApi;
import com.truman.trippy.api.TrippyApiException;
import com.truman.trippy.api.entities.User;

public class FacebookActivity extends SherlockActivity {
    Facebook fb = new Facebook("237704586324353");
    private SharedPreferences mPrefs;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		mPrefs = getPreferences(MODE_PRIVATE);
        String access_token = mPrefs.getString("access_token", null);
        long expires = mPrefs.getLong("access_expires", 0);
        if(access_token != null) {
        	fb.setAccessToken(access_token);
        }
        if(expires != 0) {
        	fb.setAccessExpires(expires);
        }
        
        /*
         * Only call authorize if the access_token has expired.
         */
        if(!fb.isSessionValid()) {
        	Bundle b = getIntent().getExtras();
    		String[] permissions = b.getStringArray("facebookPermissions");
    		fb.authorize(this, permissions, new DialogListener() {
    			
    			@Override
    			public void onFacebookError(FacebookError e) {
    				// TODO Auto-generated method stub
    				
    			}
    			
    			@Override
    			public void onError(DialogError e) {
    				// TODO Auto-generated method stub
    				
    			}
    			
    			@Override
    			public void onComplete(Bundle values) {
    				SharedPreferences.Editor editor = mPrefs.edit();
                    editor.putString("access_token", fb.getAccessToken());
                    editor.putLong("access_expires", fb.getAccessExpires());
                    editor.commit();
    				AuthenticationTask authTask = new AuthenticationTask();
    				authTask.execute(fb.getAccessToken(), ""+fb.getAccessExpires());
    			}
    			
    			@Override
    			public void onCancel() {
    				// TODO Auto-generated method stub
    				
    			}
    		});
        }
        else{
        	AuthenticationTask authTask = new AuthenticationTask();
			authTask.execute(fb.getAccessToken(), ""+fb.getAccessExpires());
        }
	}
	
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        fb.authorizeCallback(requestCode, resultCode, data);
    }
    private class AuthenticationTask extends AsyncTask<String, Void, Result<User>>{

    	protected Result<User> doInBackground(String... params) {
            TrippyApi api = new TrippyApi();
            Result<User> set = null;

            try {
                set = api.authenticate(params[0], params[1]);
    		} catch (TrippyApiException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}        
    		return set;
    	}

    	protected void onPostExecute(Result<User> result) {
    		// TODO Auto-generated method stub
    		super.onPostExecute(result);
    		CurrentUser.user = result.getResult();
    		Intent intent = new Intent(FacebookActivity.this, SampleActivity.class);
    		startActivity(intent);
    		finish();
    	}
    }
    
    public void onResume() {    
        super.onResume();
        fb.extendAccessTokenIfNeeded(this, null);
    }
}
