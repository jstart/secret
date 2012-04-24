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
 * Class representing Keyword entity
 * 
 * @author Christopher Truman
 */
public class Keyword implements TrippyEntity {

  private static final long serialVersionUID = -3697725825647022962L;

  /**
   * Returns display name
   * 
   * @return display name
   */
  public String getDisplayName() {
    return displayName;
  }
  
  /**
   * Returns keyword
   * 
   * @return keyword
   */
  public String getKeyword() {
    return keyword;
  }
  
  private String displayName;
  private String keyword;
}