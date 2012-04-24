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
import com.truman.trippy.api.entities.LeaderboardItem;
import com.truman.trippy.api.entities.LeaderboardScore;

/**
 * Entity representing "Leaderboard" notification
 * 
 * @author Christopher Truman
 */
public class LeaderboardNotification implements TrippyEntity {

  private static final long serialVersionUID = 8919261709842197077L;

  /**
   * Returns array of LeaderboardItem entities
   * 
   * @return array of LeaderboardItem entities
   */
  public LeaderboardItem[] getLeaderboard() {
    return leaderboard;
  }
  
  /**
   * Returns message
   * 
   * @return message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Returns array of LeaderboardScore entities
   * 
   * @return array of LeaderboardScore entities
   */
  public LeaderboardScore[] getScores() {
    return scores;
  }
  
  /**
   * Returns total
   * 
   * @return total
   */
  public Long getTotal() {
    return total;
  }
  
  private LeaderboardItem[] leaderboard;
  private String message;
  private LeaderboardScore[] scores;
  private Long total;
} 