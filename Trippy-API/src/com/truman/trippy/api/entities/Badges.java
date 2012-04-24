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
 * Class representing Badges
 * 
 * @author Christopher Truman
 */
public class Badges implements TrippyEntity {

  private static final long serialVersionUID = 4610940737520258516L;

  /**
   * Constructor
   * 
   * @param sets badge sets
   * @param badges array of badges
   * @param defaultSetType default badge set type
   */
  public Badges(BadgeSets sets, ActionData[] badges, String defaultSetType) {
    this.sets = sets;
    this.actionDatas = badges;
    this.defaultSetType = defaultSetType;
  }

  /**
   * Returns badge sets
   * 
   * @return badge sets
   */
  public BadgeSets getSets() {
    return sets;
  }
  
  /**
   * Returns array of badges
   * 
   * @return array of badges
   */
  public ActionData[] getBadges() {
    return actionDatas;
  }
  
  /**
   * Returns default badge set type
   *  
   * @return default badge set type
   */
  public String getDefaultSetType() {
    return defaultSetType;
  }
  
  private BadgeSets sets;
  private ActionData[] actionDatas;
  private String defaultSetType;
}
