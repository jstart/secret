/*
 * TrippyAPI - Trippy API for Java
 *  
 * 
 * License: 
 * 
 * Licensed under GNU Lesser General Public License Version 3 or later (the "LGPL")
 * http://www.gnu.org/licenses/lgpl.html
 */

package com.truman.trippy.api;

/**
 * TrippyAPI exception
 * 
 * @author Christopher Truman
 */
public class TrippyApiException extends Exception {

  private static final long serialVersionUID = -4581357612541474483L;

  /**
   * Constructor
   * 
   * @param message message
   */
  public TrippyApiException(String message) {
    super(message);
  }
  
  /**
   * Constructor
   * 
   * @param t throwable
   */
  public TrippyApiException(Throwable t) {
    super(t);
  }
}
