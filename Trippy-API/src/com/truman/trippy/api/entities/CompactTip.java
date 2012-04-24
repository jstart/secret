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
 * Class representing CompactTip entity
 * 
 * @see <a href="https://developer.foursquare.com/docs/responses/tip.html" target="_blank">https://developer.foursquare.com/docs/responses/tip.html</a>
 * 
 * @author Christopher Truman
 */
public class CompactTip implements TrippyEntity {

  private static final long serialVersionUID = 5912726139848171570L;
  
  /**
   * Returns the id of the tip
   * 
   * @return the id of the tip
   */
  public String getId() {
    return id;
  }
  
  /**
   * Returns the text of the tip
   * 
   * @return the text of the tip
   */
  public String getText() {
    return text;
  }
  
  /**
   * Returns when this tip was created (epoch)
   * 
   * @return when this tip was created
   */
  public Long getCreatedAt() {
    return createdAt;
  }
  
  /**
   * Returns status of the tip (either todo or done)
   * 
   * @return status of the tip
   */
  public String getStatus() {
    return status;
  }
  
  /**
   * Returns photo of the tip
   * 
   * @return photo of the tip
   */
  public Photo getPhoto() {
    return photo;
  }
  
  /**
   * Returns URL to the photo
   * 
   * @return URL to the photo
   */
  public String getPhotoURL() {
    return photourl;
  }
  
  /**
   * Returns user that left the tip
   * 
   * @return user that left the tip
   */
  public User getUser() {
    return user;
  }
  
  /**
   * Returns venue (if any) for the tip
   * 
   * @return venue for the tip
   */
  public ActionTrip getVenue() {
    return venue;
  }
  
  /**
   * Returns URL for more information. 
   * 
   * @return URL for more information. 
   */
  public String getUrl() {
    return url;
  }
  
  private String id;
  private String text;
  private Long createdAt;
  private String status;
  private Photo photo;
  private String photourl;
  private String url;
  private User user;
  private ActionTrip venue;
}
