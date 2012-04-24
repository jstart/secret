package com.truman.trippy.api.entities;

/**
 * Group of Link entities
 * 
 * @author Christopher Truman
 */
public class LinkGroup extends Group<Link> {

  private static final long serialVersionUID = 9117692748314735095L;

  @Override
  public Link[] getItems() {
    return items;
  }

  private Link[] items;
}
