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

/**
 * Entity representing "Message" notification
 * 
 * @author Christopher Truman
 */
public class MessageNotification implements TrippyEntity {

  private static final long serialVersionUID = 1341444447020549517L;

  /**
   * Returns message
   * 
   * @return message
   */
  public String getMessage() {
    return message;
  }

  private String message;
}
