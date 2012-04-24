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

/**
 * Group of PhotoGroups
 * 
 * @author Christopher Truman
 */
public class Photos extends Count {
  
  private static final long serialVersionUID = 1974338391344968466L;

  /**
   * Returns array of PhotoGroups
   *  
   * @return array of PhotoGroups
   */
  public PhotoGroup[] getGroups() {
    return groups;
  }
  
  private PhotoGroup[] groups;
}
