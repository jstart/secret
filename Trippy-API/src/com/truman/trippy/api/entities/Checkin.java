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
 * Class representing Checkin entity
 * 
 * @see <a href="https://developer.foursquare.com/docs/responses/checkin.html" target="_blank">https://developer.foursquare.com/docs/responses/checkin.html</a>
 * 
 * @author Christopher Truman
 */
public class Checkin implements TrippyEntity {

  private static final long serialVersionUID = 4805612286360679516L;

  /**
   * Returns checkin id
   * 
   * @return checkin id
   */
  public String getId() {
    return id;
  }

  /**
   * Returns checkin type (checkin, shout, or venueless)
   * 
   * @return checkin type
   */
  public String getType() {
    return type;
  }
  
  /**
   * Returns is this a private checkin
   * 
   * @return is this a private checkin
   */
  public Boolean isPrivate() {
    return isPrivate;
  }
  
  /**
   * Returns user who checked in 
   * 
   * @return user who checked in 
   */
  public User getUser() {
    return user;
  }
  
  /**
   * Returns is the checked user mayor
   * 
   * @return is the checked user mayor
   */
  public Boolean getIsMayor() {
    return isMayor;
  }
  
  /**
   * Returns timezone of the checkin
   * 
   * @return timezone of the checkin
   */
  public String getTimeZone() {
    return timeZone;
  }
  
  /**
   * Returns venue if any
   * 
   * @return venue if any
   */
  public Place getVenue() {
    return venue;
  }
  
  /**
   * Returns Location of the checkin. Field may be present if the type of this checkin is shout or venueless.
   * 
   * @return Location of the checkin
   */
  public Activity getLocation() {
    return activity;
  }
  
  /**
   * Returns shout text
   * 
   * @return shout text
   */
  public String getShout() {
    return shout;
  }
  
  /**
   * Returns when this checkin was created (epoch)
   * 
   * @return when this checkin was created
   */
  public Long getCreatedAt() {
    return createdAt;
  }
  
  /**
   * Returns photos of the checkin
   * 
   * @return photos of the checkin
   */
  public PhotoGroup getPhotos() {
    return photos;
  }
  
  /**
   * Returns comments for checkin
   * 
   * @return comments for checkin
   */
  public CommentGroup getComments() {
    return comments;
  }
  
  /**
   * Returns Source object containing application name and url that created this checkin
   * 
   * @return Checkin source
   */
  public Source getSource() {
    return source;
  }
  
  /**
   * Returns checkins from friends checked into the same venue around the same time.
   * 
   * @return Overlapping checkins
   */
  public CheckinGroup getOverlaps() {
    return overlaps;
  }
  
  /**
   * Setter method for "private" field. 
   * 
   * Method is needed because "private" is reserved word and thus normal field access can not be used to set field value
   * 
   * @param isPrivate field value
   */
  @SuppressWarnings("unused")
  private void setPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }
  
  private String id;
  private String type;
  private Boolean isPrivate;
  private User user;
  private Boolean isMayor;
  private String timeZone;
  private Place venue;
  private Activity activity;
  private String shout;
  private Long createdAt;
  private Source source;
  private PhotoGroup photos;
  private CommentGroup comments;
  private CheckinGroup overlaps;
}
