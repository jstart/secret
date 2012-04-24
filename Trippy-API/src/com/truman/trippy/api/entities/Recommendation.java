package com.truman.trippy.api.entities;

import com.truman.trippy.api.TrippyEntity;

/**
 * Class representing Recommendation entity
 * 
 * @author Christopher Truman
 */
public class Recommendation implements TrippyEntity {

  private static final long serialVersionUID = -1033058777540900197L;

  /**
   * Returns reasons for recommendation
   * 
   * @return reasons for recommendation
   */
  public ReasonGroup getReasons() {
    return reasons;
  }
  
  /**
   * Returns recommended venues
   * 
   * @return recommended venues
   */
  public ActionTrip getVenue() {
    return venue;
  }
  
  /**
   * Returns array of recommended tips
   * 
   * @return array of recommended tips
   */
  public CompleteTip[] getTips() {
    return tips;
  }
  
  private ReasonGroup reasons;
  private ActionTrip venue;
  private CompleteTip[] tips;
}
