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
 * Group of Comments
 * 
 * @author Christopher Truman
 */
public class CommentGroup extends Group<Comment> {

  private static final long serialVersionUID = 7117134064654710100L;

  @Override
  public Comment[] getItems() {
    return items;
  }
  
  private Comment[] items;
}
