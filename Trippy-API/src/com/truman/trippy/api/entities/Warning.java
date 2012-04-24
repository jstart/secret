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
 * Class representing Warning entity
 *
 * @author Christopher Truman
 */
public class Warning implements TrippyEntity {
  
  private static final long serialVersionUID = 7167332454422034014L;

  /**
   * Returns warning text
   * 
   * @return warning text
   */
  public String getText() {
    return text;
  }
  
  private String text;
}
