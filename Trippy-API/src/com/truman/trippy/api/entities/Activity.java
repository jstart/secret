/*
 * TrippyAPI - Trippy API for Java

 *  
 * 
 * License: 
 * 
 * Licensed under GNU Lesser General Public License Version 3 or later (the "LGPL")
 * http://www.gnu.org/licenses/lgpl.html
 */

package com.truman.trippy.api.entities;

import com.truman.trippy.api.TrippyEntity;

/**
 * Class representing Activity entity
 * 
 * @author Christopher Truman
 */
public class Activity implements TrippyEntity {

	private static final long serialVersionUID = -76729758415926344L;

	/**
	 * Returns city
	 * 
	 * @return city
	 */
	public String getId() {
		return id;
	}

	/**
	 * Returns name
	 * 
	 * @return name
	 */
	public ActionData getActionData() {
		return actionData;
	}

	/**
	 * Returns latitude
	 * 
	 * @return latitude
	 */
	public ActionTrip getActionTrip() {
		return actionTrip;
	}

	/**
	 * Returns longitude
	 * 
	 * @return longitude
	 */
	public String getActionType() {
		return actionType;
	}

	/**
	 * Returns longitude
	 * 
	 * @return longitude
	 */
	public Place getPlace() {
		return place;
	}

	/**
	 * Returns longitude
	 * 
	 * @return longitude
	 */
	public String getActionGroup() {
		return actionGroup;
	}

	/**
	 * Returns longitude
	 * 
	 * @return longitude
	 */
	public User getUser() {
		return user;
	}

	private String id;
	private ActionData actionData;
	private ActionTrip actionTrip;
	private String actionType;
	private Place place;
	private String actionGroup;
	private User user;
}
