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
 * Class representing Source entity
 * 
 * @author Christopher Truman
 */
public class Source implements TrippyEntity {

  private static final long serialVersionUID = -1503607114357562300L;

  /**
   * Returns source's (application's) name
   * 
   * @return source's name
   */
  public String getName() {
    return name;
  }
  
  /**
   * Returns source's (application's) url
   * @return source's url
   */
  public String getUrl() {
    return url;
  }
  
  private String name;
  private String url;
}
