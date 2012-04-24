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
import com.truman.trippy.api.*;
/**
 * Class representing CompleteVenue entity
 * 
 * @see <a href="https://developer.foursquare.com/docs/responses/venue.html" target="_blank">https://developer.foursquare.com/docs/responses/venue.html</a>
 * 
 * @author Christopher Truman
 */
public class Place implements TrippyEntity {

  private static final long serialVersionUID = -3318179465794411655L;
  /**
   * Returns id. 
   * 
   * @return id. 
   */
  public String getId() {
    return id;
  }
  
  /**
   * Returns name of location provider. 
   * 
   * @return name of location provider. 
   */
  public String getProvider() {
    return provider;
  }

  /**
   * Returns city
   * 
   * @return city
   */
  public String getCity() {
    return city;
  }
  
  /**
   * Returns featured status.
   * 
   * @return featured status.
   */
  public Boolean getFeatured(){
	  return featured;
  }
  
  /**
   * Returns name
   * 
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Returns latitude
   * 
   * @return latitude
   */
  public Double getLat() {
    return lat;
  }

  /**
   * Returns longitude
   * 
   * @return longitude
   */
  public Double getLng() {
    return lng;
  }
  
  private String id;
  private String city;
  private Boolean featured;
  private String name;
  private Double lat;
  private Double lng;
  private String provider;
}
