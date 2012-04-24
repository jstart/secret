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
import com.truman.trippy.api.entities.ActionData;

/**
 * Entity representing "Badge" notification
 * 
 * @author Christopher Truman
 */
public class BadgeNotification implements TrippyEntity {

  private static final long serialVersionUID = 2152749838200069020L;

  /**
   * Returns Badge entity
   * 
   * @return Badge entity
   */
  public ActionData getBadge() {
    return actionData;
  }
  
  private ActionData actionData;
}
