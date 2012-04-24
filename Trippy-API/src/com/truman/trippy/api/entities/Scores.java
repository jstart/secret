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
 * Class representing Scores entity
 * 
 * @author Christopher Truman
 */
public class Scores implements TrippyEntity {

  private static final long serialVersionUID = -6977397860701200711L;

  /**
   * Returns recent
   * 
   * @return recent
   */
  public Long getRecent() {
    return recent;
  }
  
  /**
   * Returns max
   * 
   * @return max
   */
  public Long getMax() {
    return max;
  }
  
  /**
   * Returns goal
   * 
   * @return goal
   */
  public Long getGoal() {
    return goal;
  }
  
  /**
   * Returns checkins count
   * 
   * @return checkins count
   */
  public Long getCheckinsCount() {
    return checkinsCount;
  }
  
  private Long recent;
  private Long max;
  private Long goal;
  private Long checkinsCount;
}
