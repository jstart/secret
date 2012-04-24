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
 * Group of Keyword entities
 * 
 * @author Christopher Truman
 */
public class KeywordGroup extends Group<Keyword> {

  private static final long serialVersionUID = 8269600369584702559L;

  @Override
  public Keyword[] getItems() {
    return items;
  }
  
  private Keyword[] items;
}
