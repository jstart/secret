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
 * Group of Sizes
 * 
 * @author Christopher Truman
 */
public class SizeGroup extends Group<Size> {

  private static final long serialVersionUID = 8028153409437582383L;

  @Override
  public Size[] getItems() {
    return sizes;
  }
  
  private Size[] sizes;
}
