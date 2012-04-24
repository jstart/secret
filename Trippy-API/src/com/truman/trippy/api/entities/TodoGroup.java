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
 * Group of Todos
 * 
 * @author Christopher Truman
 */
public class TodoGroup extends Group<Todo> {

  private static final long serialVersionUID = -8645153668638867533L;

  @Override
  public Todo[] getItems() {
    return items;
  }
  
  private Todo[] items;
}
