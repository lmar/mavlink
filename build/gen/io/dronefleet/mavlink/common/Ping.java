package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkMessage;
import io.dronefleet.mavlink.annotations.MavlinkMessageField;
import java.math.BigInteger;

/**
 * A ping message either requesting or responding to a ping. This allows to measure the system 
 * latencies, including serial port, radio modem and UDP connections. 
 */
@MavlinkMessage(
    id = 4,
    crc = 237
)
public final class Ping {
  private final BigInteger timeUsec;

  private final long seq;

  private final int targetSystem;

  private final int targetComponent;

  private Ping(BigInteger timeUsec, long seq, int targetSystem, int targetComponent) {
    this.timeUsec = timeUsec;
    this.seq = seq;
    this.targetSystem = targetSystem;
    this.targetComponent = targetComponent;
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Unix timestamp in microseconds or since system boot if smaller than MAVLink epoch (1.1.2009) 
   */
  @MavlinkMessageField(
      position = 1,
      length = 8
  )
  public final BigInteger timeUsec() {
    return timeUsec;
  }

  /**
   * PING sequence 
   */
  @MavlinkMessageField(
      position = 2,
      length = 4
  )
  public final long seq() {
    return seq;
  }

  /**
   * 0: request ping from all receiving systems, if greater than 0: message is a ping response and 
   * number is the system id of the requesting system 
   */
  @MavlinkMessageField(
      position = 3,
      length = 1
  )
  public final int targetSystem() {
    return targetSystem;
  }

  /**
   * 0: request ping from all receiving components, if greater than 0: message is a ping response and 
   * number is the system id of the requesting system 
   */
  @MavlinkMessageField(
      position = 4,
      length = 1
  )
  public final int targetComponent() {
    return targetComponent;
  }

  public class Builder {
    private BigInteger timeUsec;

    private long seq;

    private int targetSystem;

    private int targetComponent;

    private Builder() {
    }

    /**
     * Unix timestamp in microseconds or since system boot if smaller than MAVLink epoch (1.1.2009) 
     */
    @MavlinkMessageField(
        position = 1,
        length = 8
    )
    public final Builder timeUsec(BigInteger timeUsec) {
      this.timeUsec = timeUsec;
      return this;
    }

    /**
     * PING sequence 
     */
    @MavlinkMessageField(
        position = 2,
        length = 4
    )
    public final Builder seq(long seq) {
      this.seq = seq;
      return this;
    }

    /**
     * 0: request ping from all receiving systems, if greater than 0: message is a ping response and 
     * number is the system id of the requesting system 
     */
    @MavlinkMessageField(
        position = 3,
        length = 1
    )
    public final Builder targetSystem(int targetSystem) {
      this.targetSystem = targetSystem;
      return this;
    }

    /**
     * 0: request ping from all receiving components, if greater than 0: message is a ping response and 
     * number is the system id of the requesting system 
     */
    @MavlinkMessageField(
        position = 4,
        length = 1
    )
    public final Builder targetComponent(int targetComponent) {
      this.targetComponent = targetComponent;
      return this;
    }

    public final Ping build() {
      return new Ping(timeUsec, seq, targetSystem, targetComponent);
    }
  }
}