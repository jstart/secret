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
 * Class representing Badges
 * 
 * @author Christopher Truman
 */
public class Trips implements TrippyEntity {

  private static final long serialVersionUID = 4610940737520258516L;

  /**
   * Returns badge sets
   * 
   * @return badge sets
   */
  public Integer getCount() {
    return count;
  }
  
  /**
   * Returns array of badges
   * 
   * @return array of badges
   */
  public Trip[] getTrips() {
    return items;
  }
  
  private Integer count;
  private Trip[] items;
}
