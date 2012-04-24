package com.truman.trippy.api.entities;

import com.truman.trippy.api.TrippyEntity;

/**
 * Class representing VenueHistory entity
 * 
 * @author Christopher Truman
 */
public class VenueHistory implements TrippyEntity {

  private static final long serialVersionUID = 427279593882572350L;

  /**
   * Returns number of times user has been in this venue
   * 
   * @return number of times user has been in this venue
   */
  public Integer getBeenHere() {
    return beenHere;
  }
  
  /**
   * Returns venue
   * 
   * @return venue
   */
  public ActionTrip getVenue() {
    return venue;
  }
  
  private Integer beenHere;
  private ActionTrip venue;
}
