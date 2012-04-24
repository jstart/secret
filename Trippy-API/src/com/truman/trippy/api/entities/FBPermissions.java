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
 * Class representing FBPermissions entity
 * 
 * @author Christopher Truman
 */
public class FBPermissions implements TrippyEntity {

  private static final long serialVersionUID = -5003261541413796774L;

  /**
   * Returns string of permissions to request from FB.
   * 
   * @return string of permissions to request from FB.
   */
  public String getPermissions() {
    return fbPermissions;
  }
  
  private String fbPermissions;
}
