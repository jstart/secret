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

/**
 * Class that represents single notification
 * 
 * @author Christopher Truman
 *
 * @param <T> type of notification entity
 */
public class Notification<T> {
  
  /**
   * Constructor
   * 
   * @param type type of notification
   * @param item notification entity
   */
  public Notification(NotificationType type, T item) {
    this.type = type;
    this.item = item;
  }
  
  /**
   * Returns notification type
   * 
   * @return notification type
   */
  public NotificationType getType() {
    return type;
  }
  
  /**
   * Returns notification entity
   * 
   * @return notification entity
   */
  public T getItem() {
    return item;
  }
  
  private NotificationType type;
  private T item;
}
