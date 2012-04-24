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
 * Group of CompactTips
 * 
 * @author Christopher Truman
 */
public class TipGroup extends Group<CompactTip> {

  private static final long serialVersionUID = -9176732625588094423L;

  @Override
  public CompleteTip[] getItems() {
    return items;
  }
  
  private CompleteTip[] items;
}
