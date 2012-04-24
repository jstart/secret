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
 * Group of Venues
 * 
 * @author Christopher Truman
 */
public class VenueGroup extends Group<ActionTrip> {

  private static final long serialVersionUID = -996401659508844800L;

  @Override
  public ActionTrip[] getItems() {
    return items;
  }
  
  private ActionTrip[] items;
}
