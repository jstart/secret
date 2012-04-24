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
 * Base class for all groups
 * 
 * @param <T> type of entities group contains
 * 
 * @author Christopher Truman
 */
public abstract class Group<T extends TrippyEntity> extends Count {

  private static final long serialVersionUID = -3156890964170514232L;

  /**
   * Returns type
   * 
   * @return type
   */
  public String getType() {
    return type;
  }

  /**
   * Returns name
   * 
   * @return name
   */
  public String getName() {
    return name;
  }
  
  /**
   * Returns group items
   *  
   * @return group items
   */
  public abstract T[] getItems();

  private String type;
  private String name;
}
