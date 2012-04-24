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
 * Class representing Comment entity
 * 
 * @author Christopher Truman
 */
public class Comment implements TrippyEntity {

  private static final long serialVersionUID = 6671734583007572548L;

  /**
   * Returns comment's id
   * 
   * @return comment's id
   */
  public String getId() {
    return id;
  }
  
  /**
   * Returns when this comment was created (epoch)
   * 
   * @return when this comment was created
   */
  public Long getCreatedAt() {
    return createdAt;
  }
  
  /**
   * Returns user that left the comment
   * 
   * @return user that left the comment
   */
  public User getUser() {
    return user;
  }
  
  /**
   * Returns comment's text
   * 
   * @return comment's text
   */
  public String getText() {
    return text;
  }
  
  private String id;
  private Long createdAt;
  private User user;
  private String text;
}
