package com.truman.trippy.api.entities;

/**
 * Group of Link entities
 * 
 * @author Christopher Truman
 */
public class LinkGroup extends Group<Trip> {

  private static final long serialVersionUID = 9117692748314735095L;

  @Override
  public Trip[] getItems() {
    return items;
  }

  private Trip[] items;
}
