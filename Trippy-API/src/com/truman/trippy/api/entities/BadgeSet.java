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
 * Class representing BadgeSet
 * 
 * @author Christopher Truman
 */
public class BadgeSet implements TrippyEntity {

  private static final long serialVersionUID = 6647018689695570878L;

  /**
   * Returns badge set type
   * 
   * @return badge set type
   */
  public String getType() {
    return type;
  }
  
  /**
   * Returns badge set name
   * 
   * @return badge set name
   */
  public String getName() {
    return name;
  }
  
  /**
   * Returns badge image
   * 
   * @return badge image
   */
  public Activities getImage() {
    return image;
  }
  
  /**
   * Returns badge's items as string array
   * 
   * @return badge's items as string array
   */
  public String[] getItems() {
    return items;
  }
  
  /**
   * Returns badge groups
   * 
   * @return badge groups
   */
  public BadgeSet[] getGroups() {
    return groups;
  }
  
  private String type;
  private String name;
  private Activities image;
  private String[] items;
  private BadgeSet[] groups;
}