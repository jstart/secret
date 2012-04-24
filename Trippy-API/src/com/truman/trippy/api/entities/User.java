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
 * Class representing User entity
 * 
 * @see <a href="https://developer.foursquare.com/docs/responses/user.html" target="_blank">https://developer.foursquare.com/docs/responses/user.html</a>
 * 
 * @author Christopher Truman
 */
public class User implements TrippyEntity {

  private static final long serialVersionUID = 477096997911461087L;

  /**
   * Returns user's id
   * 
   * @return user's id
   */
  public String getId() {
    return id;
  }
  
  /**
   * Returns user's first name
   * 
   * @return user's first name
   */
  public String getFirstName() {
    return firstName;
  }
  
  /**
   * Returns user's last name
   * 
   * @return user's last name
   */
  public String getLastName() {
    return lastName;
  }
  
  /**
   * Returns user's username
   * 
   * @return user's username
   */
  public String getUsername() {
    return username;
  }
  
  /**
   * Returns URL of a profile picture for this user.
   * 
   * @return URL of a profile picture for this user.
   */
  public String getImageSource() {
    return imageSource;
  }
  
  /**
   * Returns male or female
   * 
   * @return male or female
   */
  public String getGender() {
    return gender;
  }
  
  private String id;
  private String firstName;
  private String lastName;
  private String username;
  private String imageSource;
  private String gender;
}
