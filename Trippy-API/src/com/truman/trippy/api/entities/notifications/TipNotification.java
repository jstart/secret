/*
 * TrippyAPI - Trippy API for Java

 *  
 * 
 * License: 
 * 
 * Licensed under GNU Lesser General Public License Version 3 or later (the "LGPL")
 * http://www.gnu.org/licenses/lgpl.html
 */

package com.truman.trippy.api.entities.notifications;

import com.truman.trippy.api.TrippyEntity;
import com.truman.trippy.api.entities.CompleteTip;

/**
 * Entity representing "Tip" notification
 * 
 * @author Christopher Truman
 *
 */
public class TipNotification implements TrippyEntity {

  private static final long serialVersionUID = -4625637368235280260L;

  /**
   * Returns name
   * 
   * @return name
   */
  public String getName() {
    return name;
  }
  
  /**
   * Returns tip entity itself
   * 
   * @return tip entity itself
   */
  public CompleteTip getTip() {
    return tip;
  }

  private String name;
  private CompleteTip tip;
}
