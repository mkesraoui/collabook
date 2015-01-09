package fr.upem.m2.collabook.workpackages.interfaces;

/**
 * The Lockable interface, which every object susceptible of being locked must
 * implement.
 *
 * @author Mathieu ABOU-AICHI (mathieu.abouaichi@gmail.com)
 */
public interface Lockable {
  /**
   * Locks the current object.
   */
  public void lock();
}
