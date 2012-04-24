package com.truman.trippy.api.entities;

import com.truman.trippy.api.TrippyEntity;

/**
 * MiniVenues are for responses from the autoComplete service
 * https://developer.foursquare.com/docs/venues/suggestcompletion
 * 
 * @author rmangi
 * 
 */
public class MiniVenue implements TrippyEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7279890086931237254L;

	private String id;
	
	private String name;
	
	private Activity activity;
	
	private Category[] categories;

	/**
	 * get the id
	 * @return id
	 */
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * name of the venue
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * location of the venue
	 * @return Location object
	 */
	public Activity getLocation() {
		return activity;
	}
	
	public void setLocation(Activity activity) {
		this.activity = activity;
	}
	
	/**
	 * categories for the venue
	 * @return array of Category objects
	 */
	public Category[] getCategories() {
		return categories;
	}
	
	public void setCategories(Category[] categories) {
		this.categories = categories;
	}

}
