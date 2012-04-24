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
 * Class representing Mayor entity
 * 
 * @author Christopher Truman
 */
public class Mayor extends Count {

  private static final long serialVersionUID = -6838261267509832567L;

  /**
   * Returns user
   * 
   * @return user
   */
  public User getUser() {
    return user;
  }
  
  private User user;
}
