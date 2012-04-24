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
 * Class representing CompleteTip entity
 * 
 * @see <a href="https://developer.foursquare.com/docs/responses/tip.html" target="_blank">https://developer.foursquare.com/docs/responses/tip.html</a>
 * 
 * @author Christopher Truman
 */
public class CompleteTip extends CompactTip {
  
  private static final long serialVersionUID = 5606985476553828335L;
  
  /**
   * Returns todos for this tip
   * 
   * @return todos for this tip
   */
  public UserGroups getTodo() {
    return todo;
  }
  
  /**
   * Returns dones for this tip
   * 
   * @return dones for this tip
   */
  public UserGroups getDone() {
    return done;
  }
  
  private UserGroups todo;
  private UserGroups done;
}
