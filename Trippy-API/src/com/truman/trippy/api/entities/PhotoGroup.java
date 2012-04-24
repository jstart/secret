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

/**
 * Group of Photos
 * 
 * @author Christopher Truman
 */
public class PhotoGroup extends Group<Photo> {

  private static final long serialVersionUID = -7698755278771196812L;

  @Override
  public Photo[] getItems() {
    return items;
  }
  
  private Photo[] items;
}
