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
 * Base class for all "count" entities
 * 
 * @author Christopher Truman
 */
public class Count implements TrippyEntity {

  private static final long serialVersionUID = -471761138324979612L;

  /**
   * Returns count
   * 
   * @return count
   */
  public Long getCount() {
    return count;
  }
  
  private Long count;
}
