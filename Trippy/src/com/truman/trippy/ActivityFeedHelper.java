package com.truman.trippy;

import android.content.Context;

import com.truman.trippy.api.entities.Activity;

class ActivityFeedHelper {

	static String getActivityString(Context context, Activity activity){
		if (activity.getActionType().equalsIgnoreCase("NEW_TRIP")) {
	        return  context.getResources().getString(R.string.activity_list_item_new_trip);
	    } 
	    else if (activity.getActionType().equalsIgnoreCase("COPY_TRIP")) {
	        return  context.getResources().getString(R.string.activity_list_item_new_trip);
	    } 
	    
	    else if (activity.getActionType().equalsIgnoreCase("RECOMMEND")) {
	        return context.getResources().getString(R.string.activity_list_item_recommend);
	    } 
	    
	    else if (activity.getActionType().equalsIgnoreCase("ADD_TRIP_PLACE_CONSIDER")) {
	        return context.getResources().getString(R.string.activity_list_item_add_trip_place_consider, activity.getUser().getGender());
	    } 

	    else if (activity.getActionType().equalsIgnoreCase("COPY_TRIP_PLACE")) {
	        return context.getResources().getString(R.string.activity_list_item_add_trip_place_consider, activity.getUser().getGender());
	    } 
	    
	    else if (activity.getActionType().equalsIgnoreCase("ADD_TRIP_DETAILS")) {
	        return context.getResources().getString(R.string.activity_list_item_add_trip_details, activity.getUser().getGender());
	    } 
	    
	    else if (activity.getActionType().equalsIgnoreCase("UPLOAD_PHOTO")) {
	        return context.getResources().getString(R.string.activity_list_item_upload_photo);
	    } 
	    
	    else if (activity.getActionType().equalsIgnoreCase("LIKE_PHOTO")) {
	        return context.getResources().getString(R.string.activity_list_item_like_photo, activity.getUser().getFirstName(), activity.getActionTrip().getUser().getFirstName(), activity.getPlace().getName());
	    } 
	    
	    else if (activity.getActionType().equalsIgnoreCase("PHOTO_COMMENT")) {
	        return context.getResources().getString(R.string.activity_list_item_comment_photo, activity.getActionTrip().getUser().getFirstName());
	    } 
	    else if (activity.getActionType().equalsIgnoreCase("LIKE_PHOTO_COMMENT")) {
	        return context.getResources().getString(R.string.activity_list_item_like_photo_comment, activity.getUser().getFirstName(),activity.getUser().getFirstName(),activity.getPlace().getName());
	    } 
	    
	    else if (activity.getActionType().equalsIgnoreCase("COMMENT")) {
	        return context.getResources().getString(R.string.activity_list_item_comment, activity.getUser().getFirstName());
	    } 
	    else if (activity.getActionType().equalsIgnoreCase("TIP")) {
	        return context.getResources().getString(R.string.activity_list_item_comment);
	    } 
	    
	    else if (activity.getActionType().equalsIgnoreCase("LIKE_COMMENT")) {
	        return context.getResources().getString(R.string.activity_list_item_like_comment, activity.getUser().getFirstName(),activity.getUser().getFirstName(), activity.getPlace().getName());
	    } 
	    
	    else {
	        
	        
	        return new String("Line 1: "+ activity.getActionGroup());
	    }
	}
}
