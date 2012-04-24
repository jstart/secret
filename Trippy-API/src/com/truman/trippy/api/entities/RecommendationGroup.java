package com.truman.trippy.api.entities;

/**
 * Group of Recommendations
 * 
 * @author Christopher Truman
 */
public class RecommendationGroup extends Group<Recommendation> {

  private static final long serialVersionUID = 3681102718014046764L;

  @Override
  public Recommendation[] getItems() {
    return items;
  }
  
  private Recommendation[] items;
}
