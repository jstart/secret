package com.truman.trippy.api.entities;

import com.truman.trippy.api.TrippyEntity;

/**
 * Results from a call to "SuggestCompletions"
 * https://developer.foursquare.com/docs/venues/suggestcompletion
 * @author rmangi
 *
 */
public class VenuesAutocompleteResult implements TrippyEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8992505908890134652L;
	
	/**
	 * the venues in the result
	 */
	private MiniVenue[] venues;

	
	/**
	 * Constructor requires an array of MiniVenues
	 * @param venues
	 */
	public VenuesAutocompleteResult(MiniVenue[] venues) {
		super();
		this.venues = venues;
	}


	/**
	 * get the minivenues
	 * @return Array of MiniVenue objects
	 */
	public MiniVenue[] getVenues() {
		return venues;
	}
	
	
	
}
