package fr.upem.m2.collabook.workpackages.interfaces;

import fr.upem.m2.collabook.dto.MetadataDTO;

/**
 * This interface must be implemented by classes that possess
 * metadata.
 *
 * @author Mathieu ABOU-AICHI (mathieu.abouaichi@gmail.com)
 */
public interface MetadataHolder {
  /**
   * Gets the {@link MetadataDTO} from the holder.
   * @return the {@link MetadataDTO}.
   */
  public MetadataDTO getMetadata();
}
