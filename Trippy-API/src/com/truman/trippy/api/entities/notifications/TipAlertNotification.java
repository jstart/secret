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
 * Entity representing "TipAlert" notification
 * 
 * @author Christopher Truman
 */
public class TipAlertNotification implements TrippyEntity {

  private static final long serialVersionUID = -2491430362788377600L;

  /**
   * Returns tip entity itself
   * 
   * @return tip entity itself
   */
  public CompleteTip getTip() {
    return tip;
  }

  private CompleteTip tip;
}
