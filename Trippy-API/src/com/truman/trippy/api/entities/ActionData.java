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
 * Class representing Action Data entity
 * 
 * @author Christopher Truman
 */
public class ActionData implements TrippyEntity {

  private static final long serialVersionUID = -1700328878776397998L;

  /**
   * Returns id
   * 
   * @return id
   */
  public String getId() {
    return id;
  }
  
  /**
   * Return badge id
   * 
   * @return badge id
   */
  public String getContent() {
    return content;
  }
  
  /**
   * Returns string representation of creation date.
   * 
   * @return string representation of creation date.
   */
  public String getCreatedAt() {
    return createdAt;
  }
  
  public Integer getLikeCount() {
    return likeCount;
  }
  
  public Boolean getLoggedInUserLike() {
	return loggedInUserLike;
  }
  
  private String id;
  private String content;
  private String createdAt;
  private Integer likeCount;
  private Boolean loggedInUserLike;
}
