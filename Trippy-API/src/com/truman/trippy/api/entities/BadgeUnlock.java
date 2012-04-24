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
 * Class representing BadgeUnlock entity
 * 
 * @author Christopher Truman
 */
public class BadgeUnlock implements TrippyEntity {

  private static final long serialVersionUID = -1266578502619350500L;

  /**
   * Returns array of checkins
   * 
   * @return array of checkins
   */
  public Checkin[] getCheckins() {
    return checkins;
  }

  private Checkin[] checkins;
}
