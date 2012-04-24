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
 * Class representing LinkProvider entity
 * 
 * @author Christopher Truman
 */
public class LinkProvider implements TrippyEntity {

  private static final long serialVersionUID = -5806669698522916299L;

  /**
   * Returns id of this provider
   * 
   * @return id of this provider
   */
  public String getId() {
    return id;
  }
  
  private String id;
}
