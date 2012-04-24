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
 * Class representing Size entity
 * 
 * @author Christopher Truman
 */
public class Size implements TrippyEntity {

  private static final long serialVersionUID = 4506057169243630084L;

  /**
   * Returns height
   * 
   * @return height
   */
  public Integer getHeight() {
    return height;
  }
  
  /**
   * Returns URL to image
   * 
   * @return URL to image
   */
  public String getUrl() {
    return url;
  }
  
  /**
   * Returns width
   * 
   * @return width
   */
  public Integer getWidth() {
    return width;
  }
  
  /**
   * Returns width
   * 
   * @return width
   */
  public String getType() {
    return type;
  }
  
  private String url;
  private Integer width;
  private Integer height;
  private String type;
}
