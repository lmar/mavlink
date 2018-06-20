package io.dronefleet.mavlink.slugs;

import io.dronefleet.mavlink.annotations.MavlinkMessage;
import io.dronefleet.mavlink.annotations.MavlinkMessageField;

/**
 * The boot message indicates that a system is starting. The onboard software version allows to 
 * keep track of onboard soft/firmware revisions. This message allows the sensor and control 
 * MCUs to communicate version numbers on startup. 
 */
@MavlinkMessage(
    id = 197,
    crc = 39
)
public final class Boot {
  private final long version;

  private Boot(long version) {
    this.version = version;
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * The onboard software version 
   */
  @MavlinkMessageField(
      position = 1,
      length = 4
  )
  public final long version() {
    return version;
  }

  public class Builder {
    private long version;

    private Builder() {
    }

    /**
     * The onboard software version 
     */
    @MavlinkMessageField(
        position = 1,
        length = 4
    )
    public final Builder version(long version) {
      this.version = version;
      return this;
    }

    public final Boot build() {
      return new Boot(version);
    }
  }
}