package fr.upem.m2.collabook.roles.interfaces;

import fr.upem.m2.collabook.workpackages.interfaces.Document;

/**
 * The DocumentCreator interface, this has the required methods a
 * DocumentCreator must implement in order to create {@link Document}s.
 *
 * @author Mathieu ABOU-AICHI (mathieu.abouaichi@gmail.com)
 * @param <T>
 */
public interface DocumentCreator<T> {
  /**
   * Creates and returns a new {@link Document}.
   * @return the newly created {@link Document}.
   */
  public T createDocument();
}
