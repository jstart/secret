package com.truman.trippy.api.entities;

import com.truman.trippy.api.TrippyEntity;

/**
 * Class representing Link entity
 * 
 * @see <a href="https://developer.foursquare.com/docs/responses/link.html" target="_blank">https://developer.foursquare.com/docs/responses/link.html</a>
 * 
 * @author Christopher Truman
 */
public class Trip implements TrippyEntity {

  private static final long serialVersionUID = -3591269038202708130L;
  
  /**
   * Returns id
   * 
   * @return id
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
   * Returns string representation of creation date.
   * 
   * @return string representation of creation date.
   */
  public String getDescription() {
    return description;
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
  
  /**
   * Returns id of the venue
   * 
   * @return id of the venue
   */
  public Integer getPlaceCount() {
    return placeCount;
  }
  
  /**
   * Returns id of the venue
   * 
   * @return id of the venue
   */
  public Place getPlace() {
    return place;
  }
  
  /**
   * Returns string representation of creation date.
   * 
   * @return string representation of creation date.
   */
  public String getStartDate() {
    return startDate;
  }
  
  /**
   * Returns string representation of creation date.
   * 
   * @return string representation of creation date.
   */
  public String getEndDate() {
    return endDate;
  }
  
  /**
   * Returns string representation of creation date.
   * 
   * @return string representation of creation date.
   */
  public User getUser() {
    return user;
  }
  
  private String id;
  private String createdAt;
  private String description;
  private Integer recCount;
  private Integer tipCount;
  private Integer placeCount;
  private Place place;
  private String startDate;
  private String endDate;
  private User user;
}
