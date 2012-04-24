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
 * Group of Checkin entities
 * 
 * @author Christopher Truman
 */
public class CheckinGroup extends Group<Checkin> {

  private static final long serialVersionUID = -6971992363107984905L;

  @Override
  public Checkin[] getItems() {
    return items;
  }
  
  private Checkin[] items;
}
