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

import com.truman.trippy.api.TrippyEntity;

/**
 * Class representing LeaderboardItem entity
 * 
 * @author Christopher Truman
 */
public class LeaderboardItem implements TrippyEntity {

  private static final long serialVersionUID = -7651776711570131592L;

  /**
   * Returns user who's leaderboard item this is
   * 
   * @return user who's leaderboard item this is
   */
  public User getUser() {
    return user;
  }

  /**
   * Returns rank of user
   * 
   * @return rank of user
   */
  public Integer getRank() {
    return rank;
  }

  /**
   * Returns user's scores
   * 
   * @return user's scores
   */
  public Scores getScores() {
    return scores;
  }

  private User user;
  private Scores scores;
  private Integer rank;
}