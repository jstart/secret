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
 * Class representing BadgeSets
 * 
 * @see <a href="" target="_blank"></a>
 * 
 * @author Christopher Truman
 */
public class BadgeSets implements TrippyEntity {

  private static final long serialVersionUID = -538891009716828719L;

  /**
   * Returns groups
   * 
   * @return groups
   */
  public BadgeSet[] getGroups() {
    return groups;
  }
  
  private BadgeSet[] groups;
}
