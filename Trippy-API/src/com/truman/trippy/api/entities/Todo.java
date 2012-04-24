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
 * Class representing Todo entity
 * 
 * @see <a href="https://developer.foursquare.com/docs/responses/todo.html" target="_blank">https://developer.foursquare.com/docs/responses/todo.html</a>
 * 
 * @author Christopher Truman
 */
public class Todo implements TrippyEntity {

  private static final long serialVersionUID = 8713217262629234118L;

  /**
   * Returns to-do's id
   * 
   * @return to-do's id
   */
  public Long getCreatedAt() {
    return createdAt;
  }
  
  /**
   * Returns seconds since epoch when this to-do was created.
   * 
   * @return seconds since epoch when this to-do was created. 
   */
  public String getId() {
    return id;
  }
  
  /**
   * Returns the tip which is to-do 
   * 
   * @return the tip which is to-do 
   */
  public CompleteTip getTip() {
    return tip;
  }
  
  private String id;
  private Long createdAt;
  private CompleteTip tip;
}
