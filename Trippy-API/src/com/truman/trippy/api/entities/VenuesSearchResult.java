package com.truman.trippy.api.entities;

import com.truman.trippy.api.TrippyEntity;

/**
 * Result object for venues/search request
 * 
 * In version 20110615 Foursquare changes venues/search request to return 
 * array of venues instead of venue groups what request used to result, 
 * with an exception that sometimes request might still return groups. 
 * For example, on election days, foursquare may choose to temporarily 
 * add a pollingplaces group, which your application should handle gracefully.
 * 
 * @author Christopher Truman
 */
public class VenuesSearchResult implements TrippyEntity {

  private static final long serialVersionUID = -4811474739114637413L;
  
  /**
   * Constructor
   * 
   * @param venues array of resulted venues
   * @param groups array of resulted groups 
   */
  public VenuesSearchResult(ActionTrip[] venues, VenueGroup[] groups) {
    this.venues = venues;
    this.groups = groups;
  }
  
  /**
   * Returns resulted venues
   * 
   * @return resulted venues
   */
  public ActionTrip[] getVenues() {
    return venues;
  }
  
  /**
   * Returns resulted venue groups
   * 
   * @return resulted venue groups
   */
  public VenueGroup[] getGroups() {
    return groups;
  }
  
  private ActionTrip[] venues;
  private VenueGroup[] groups;
}
