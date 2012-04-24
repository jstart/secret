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
 * Class representing Stats entity
 * 
 * @author Christopher Truman
 */
public class Stats implements TrippyEntity {

  private static final long serialVersionUID = 1191621361079941540L;

  /**
   * Returns checkins count
   * 
   * @return checkins count
   */
  public Integer getCheckinsCount() {
    return checkinsCount;
  }
  
  /**
   * Returns users count
   * 
   * @return users count
   */
  public Integer getUsersCount() {
    return usersCount;
  }
  
  private Integer checkinsCount;
  private Integer usersCount;
}
