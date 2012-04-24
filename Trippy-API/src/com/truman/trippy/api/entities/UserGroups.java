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
 * Group of UserGroups
 * 
 * @author Christopher Truman
 */
public class UserGroups extends Count {

  private static final long serialVersionUID = -7444569523527922004L;

  /**
   * Returns user groups
   * 
   * @return user groups
   */
  public UserGroup[] getGroups() {
    return groups;
  }
  
  private UserGroup[] groups;
}
