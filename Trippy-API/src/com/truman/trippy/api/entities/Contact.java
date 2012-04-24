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
 * Class representing Contact entity
 * 
 * @author Christopher Truman
 */
public class Contact implements TrippyEntity {
  
  private static final long serialVersionUID = -7810041187718129997L;
  
  /**
   * Returns phone number
   * 
   * @return phone number
   */
  public String getPhone() {
    return phone;
  }
  
  /**
   * Returns twitter id
   * 
   * @return twitter id
   */
  public String getTwitter() {
    return twitter;
  }
  
  /**
   * Returns user's email
   * 
   * @return user's email
   */
  public String getEmail() {
    return email;
  }
  
  /**
   * Returns user's facebook id
   * 
   * @return user's facebook id
   */
  public String getFacebook() {
    return facebook;
  }
  
  private String email;
  private String facebook;
  private String twitter;
  private String phone;
}
