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
 * Class representing Photo entity
 * 
 * @see <a href="https://developer.foursquare.com/docs/responses/photo.html" target="_blank">https://developer.foursquare.com/docs/responses/photo.html</a>
 * 
 * @author Christopher Truman
 */
public class Photo implements TrippyEntity {

  private static final long serialVersionUID = -6641038454071667700L;

  /**
   * Returns photo's id
   * 
   * @return photo's id
   */
  public String getId() {
    return id;
  }
  
  /**
   * Returns image sizes
   * 
   * @return image sizes
   */
  public Size[] getSizes() {
    return sizes;
  }
  
  private String id;
  private Size[] sizes;
}
