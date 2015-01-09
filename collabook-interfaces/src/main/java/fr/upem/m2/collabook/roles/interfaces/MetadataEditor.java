package fr.upem.m2.collabook.roles.interfaces;

import com.sun.xml.internal.ws.api.addressing.WSEndpointReference.Metadata;

import fr.upem.m2.collabook.dto.MetadataDTO;
import fr.upem.m2.collabook.workpackages.interfaces.MetadataHolder;

/**
 * This interface must be implemented by every class that edits
 * {@link Metadata} objects.
 *
 * @author Mathieu ABOU-AICHI (mathieu.abouaichi@gmail.com)
 */
public interface MetadataEditor {
  /**
   * Edits the {@link MetadataDTO} from the {@link MetadataHolder}.
   * @param metadataHolder
   */
  public void editMetadata(MetadataHolder metadataHolder);
}
