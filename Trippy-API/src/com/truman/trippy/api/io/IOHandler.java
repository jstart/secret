/*
 * TrippyAPI - Trippy API for Java

 *  
 * 
 * License: 
 * 
 * Licensed under GNU Lesser General Public License Version 3 or later (the "LGPL")
 * http://www.gnu.org/licenses/lgpl.html
 */

package com.truman.trippy.api.io;

/**
 * Abstract class representing IOHandler
 * 
 * @author Christopher Truman
 *
 */
public abstract class IOHandler {

  /**
   * Method used in API queries
   * 
   * @param url URL of the query
   * @param method method used
   * @return Response
   */
  public abstract Response fetchData(String url, Method method);
  
  /**
   * Method used in multipart/mime API queries
   * 
   * @param url URL of the query
   * @param params multipart parameters
   * @return Response
   */
  public abstract Response fetchDataMultipartMime(String url, MultipartParameter... params);
}
