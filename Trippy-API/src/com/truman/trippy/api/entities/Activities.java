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
 * Class representing Activities entity
 * 
 * @author Christopher Truman
 */
public class Activities implements TrippyEntity {

  private static final long serialVersionUID = 3839275051310645747L;

  /**
   * Returns activity count
   * 
   * @return activity count
   */
  public Integer getCount() {
    return count;
  }
  
  /**
   * Returns array of Activities
   * 
   * @return array of Activities
   */
  public Activity[] getActivities() {
    return items;
  }
  
  private Integer count;
  private Activity[] items;
}
