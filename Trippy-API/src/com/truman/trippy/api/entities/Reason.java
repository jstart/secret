package com.truman.trippy.api.entities;

import com.truman.trippy.api.TrippyEntity;

/**
 * Class representing Reason entity
 * 
 * @author Christopher Truman
 */
public class Reason implements TrippyEntity {

  private static final long serialVersionUID = -6388056927086935959L;

  /**
   * Returns type
   * 
   * @return type
   */
  public String getType() {
    return type;
  }
  
  /**
   * Returns message
   * 
   * @return message
   */
  public String getMessage() {
    return message;
  }
  
  private String type;
  private String message;
}