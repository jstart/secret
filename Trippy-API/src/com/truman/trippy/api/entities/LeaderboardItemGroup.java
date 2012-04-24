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
 * Group of LeaderboardItems
 * 
 * @author Christopher Truman
 */
public class LeaderboardItemGroup extends Group<LeaderboardItem> {

  private static final long serialVersionUID = 4074401404859223744L;

  @Override
  public LeaderboardItem[] getItems() {
    return items;
  }
  
  private LeaderboardItem[] items;
}
