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
 * Group of Specials
 * 
 * @author Christopher Truman
 */
public class SpecialGroup extends Group<CompleteSpecial> {

  private static final long serialVersionUID = 7724731185025537356L;

  @Override
  public CompleteSpecial[] getItems() {
    return items;
  }
  
  private CompleteSpecial[] items;
}
