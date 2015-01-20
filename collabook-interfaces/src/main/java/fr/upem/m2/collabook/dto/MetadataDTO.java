package fr.upem.m2.collabook.dto;

import java.util.Calendar;

/**
 * The Metadata DTO.
 *
 * @author Mathieu ABOU-AICHI (mathieu.abouaichi@gmail.com)
 */
public class MetadataDTO implements DTO {
  
  /**
   * Serial version UID.
   */
  private static final long serialVersionUID = -519098045228688296L;
  private String title;
  private Calendar creationDate;
  private Calendar endDate;
  private String comment;
  private Float completion;
  private Long ownerId;

  /**
   * Getter for title.
   * 
   * @return the title.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the new title.
   * 
   * @param title the new title.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Getter for creationDate.
   * 
   * @return the creationDate.
   */
  public Calendar getCreationDate() {
    return creationDate;
  }

  /**
   * Sets the new creationDate.
   * 
   * @param creationDate the new creationDate.
   */
  public void setCreationDate(Calendar creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for endDate.
   * 
   * @return the endDate.
   */
  public Calendar getEndDate() {
    return endDate;
  }

  /**
   * Sets the new endDate.
   * 
   * @param endDate the new endDate.
   */
  public void setEndDate(Calendar endDate) {
    this.endDate = endDate;
  }

  /**
   * Getter for comment.
   * 
   * @return the comment.
   */
  public String getComment() {
    return comment;
  }

  /**
   * Sets the new comment.
   * 
   * @param comment the new comment.
   */
  public void setComment(String comment) {
    this.comment = comment;
  }

  /**
   * Getter for completion.
   * 
   * @return the completion.
   */
  public Float getCompletion() {
    return completion;
  }

  /**
   * Sets the new completion.
   * 
   * @param completion the new completion.
   */
  public void setCompletion(Float completion) {
    this.completion = completion;
  }

  /**
   * Getter for ownerId.
   * 
   * @return the ownerId.
   */
  public Long getOwnerId() {
    return ownerId;
  }

  /**
   * Sets the new ownerId.
   * 
   * @param ownerId the new ownerId.
   */
  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

}
