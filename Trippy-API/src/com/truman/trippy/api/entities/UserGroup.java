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
 * Group of Users
 * 
 * @author Christopher Truman
 */
public class UserGroup extends Group<User> {

  private static final long serialVersionUID = 3181702805520905399L;
  
  @Override
  public User[] getItems() {
    return items;
  }

  private User[] items;
}
