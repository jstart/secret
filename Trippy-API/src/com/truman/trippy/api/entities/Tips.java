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
 * Group of TipGroups
 * 
 * @author Christopher Truman
 */
public class Tips extends Count {
  
  private static final long serialVersionUID = 6598277929123957554L;

  /**
   * Returns tip groups
   * 
   * @return tip groups
   */
  public TipGroup[] getGroups() {
    return groups;
  }
  
  private TipGroup[] groups;
}
