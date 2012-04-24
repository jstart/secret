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
 * Class representing CompactVenue entity
 * 
 * @see <a href="https://developer.foursquare.com/docs/responses/venue.html" target="_blank">https://developer.foursquare.com/docs/responses/venue.html</a>
 * 
 * @author Christopher Truman
 */
public class ActionTrip implements TrippyEntity {
  
  private static final long serialVersionUID = -7714811839778109046L;
  /**
   * Returns placeCount
   * 
   * @return place count
   */
  public Integer getPlaceCount() {
    return placeCount;
  }
  
  /**
   * Returns id of the venue
   * 
   * @return id of the venue
   */
  public String getId() {
    return id;
  }

  /**
   * Returns string representation of creation date.
   * 
   * @return string representation of creation date.
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Returns true if this venue has been verified
   * 
   * @return true if this venue has been verified
   */
  public Place getPlace() {
    return place;
  }

  /**
   * Returns user that created action.
   * 
   * @return user that created action
   */
  public User getUser() {
    return user;
  }
  /**
   * Returns id of the venue
   * 
   * @return id of the venue
   */
  public Integer getRecCount() {
    return recCount;
  }
  /**
   * Returns id of the venue
   * 
   * @return id of the venue
   */
  public Integer getTipCount() {
    return tipCount;
  }
  private Integer placeCount;
  private String id;
  private String createdAt;
  private Place place;
  private User user;
  private Integer recCount;
  private Integer tipCount;
}
