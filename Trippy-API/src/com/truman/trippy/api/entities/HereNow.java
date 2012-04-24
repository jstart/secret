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

/**
 * Class representing HereNow entity
 * 
 * @author Christopher Truman
 */
public class HereNow extends Count {
  
  private static final long serialVersionUID = -39143307292834176L;

  /**
   * Returns array of checkin groups
   * 
   * @return array of checkin groups
   */
  public CheckinGroup[] getGroups() {
    return groups;
  }
  
  private CheckinGroup[] groups;
}
