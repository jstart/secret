package com.truman.trippy.api.entities;

/**
 * Group of Reasons
 * 
 * @author Christopher Truman
 */
public class ReasonGroup extends Group<Reason> {

  private static final long serialVersionUID = 8674537442804669148L;

  @Override
  public Reason[] getItems() {
    return items;
  }
  
  private Reason[] items;
}
