/*
 * TrippyAPI - Trippy API for Java

 *  
 * 
 * License: 
 * 
 * Licensed under GNU Lesser General Public License Version 3 or later (the "LGPL")
 * http://www.gnu.org/licenses/lgpl.html
 */

package com.truman.trippy.api.entities.notifications;

import com.truman.trippy.api.TrippyEntity;
import com.truman.trippy.api.entities.User;

/**
 * Entity representing "Mayorship" notification
 * 
 * @author Christopher Truman
 */
public class MayorshipNotification implements TrippyEntity {

  private static final long serialVersionUID = 5504414040235439757L;

  /**
   * Returns type 
   * 
   * @return type
   */
  public String getType() {
    return type;
  }
  
  /**
   * Returns checkins count
   * 
   * @return checkins count
   */
  public Long getCheckins() {
    return checkins;
  }
  
  /**
   * Returns number of days user is behind current mayor
   * 
   * @return number of days user is behind current mayor
   */
  public Long getDaysBehind() {
    return daysBehind;
  }
  
  /**
   * Returns user
   * 
   * @return user
   */
  public User getUser() {
    return user;
  }
  
  /**
   * Returns message
   * 
   * @return message
   */
  public String getMessage() {
    return message;
  }
  
  /**
   * Returns image
   * 
   * @return image
   */
  public String getImage() {
    return image;
  }

  private String type;
  private Long checkins;
  private Long daysBehind;
  private User user;
  private String message;
  private String image;
}