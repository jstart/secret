/*
 * TrippyAPI - Trippy API for Java

 *  
 * 
 * License: 
 * 
 * Licensed under GNU Lesser General Public License Version 3 or later (the "LGPL")
 * http://www.gnu.org/licenses/lgpl.html
 */

package com.truman.trippy.api.entities.notifications;

import com.truman.trippy.api.TrippyEntity;
import com.truman.trippy.api.entities.LeaderboardScore;

/**
 * Entity representing "Score" notification
 * 
 * @author Christopher Truman
 */
public class ScoreNotification implements TrippyEntity {

  private static final long serialVersionUID = -5334783390151137440L;

  /**
   * Returns array of LeaderboardScore entities
   * 
   * @return array of LeaderboardScore entities
   */
  public LeaderboardScore[] getScores() {
    return scores;
  }
  
  /**
   * Returns total points
   * 
   * @return total points
   */
  public Long getTotal() {
    return total;
  }
  
  private LeaderboardScore[] scores;
  private Long total;
}
