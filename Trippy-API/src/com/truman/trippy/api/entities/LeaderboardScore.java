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
 * Class representing LeaderboardScore entity
 * 
 * @author Christopher Truman
 */
public class LeaderboardScore implements TrippyEntity {

  private static final long serialVersionUID = -8569003387365797941L;

  /**
   * Returns points 
   *   
   * @return points 
   */
  public Integer getPoints() {
    return points;
  }
  
  /**
   * Returns icon
   * 
   * @return icon
   */
  public String getIcon() {
    return icon;
  }
  
  /**
   * Returns a message
   * 
   * @return message
   */
  public String getMessage() {
    return message;
  }
  
  private Integer points;
  private String icon;
  private String message;
}