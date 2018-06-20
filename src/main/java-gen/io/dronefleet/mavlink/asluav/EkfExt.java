package io.dronefleet.mavlink.asluav;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;

/**
 * Extended EKF state estimates for ASLUAVs 
 */
@MavlinkMessageInfo(
    id = 206,
    crc = 64
)
public final class EkfExt {
  /**
   * Time since system start 
   */
  private final BigInteger timestamp;

  /**
   * Magnitude of wind velocity (in lateral inertial plane) 
   */
  private final float windspeed;

  /**
   * Wind heading angle from North 
   */
  private final float winddir;

  /**
   * Z (Down) component of inertial wind velocity 
   */
  private final float windz;

  /**
   * Magnitude of air velocity 
   */
  private final float airspeed;

  /**
   * Sideslip angle 
   */
  private final float beta;

  /**
   * Angle of attack 
   */
  private final float alpha;

  private EkfExt(BigInteger timestamp, float windspeed, float winddir, float windz, float airspeed,
      float beta, float alpha) {
    this.timestamp = timestamp;
    this.windspeed = windspeed;
    this.winddir = winddir;
    this.windz = windz;
    this.airspeed = airspeed;
    this.beta = beta;
    this.alpha = alpha;
  }

  @MavlinkMessageBuilder
  public static Builder builder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "EkfExt{timestamp=" + timestamp
         + ", windspeed=" + windspeed
         + ", winddir=" + winddir
         + ", windz=" + windz
         + ", airspeed=" + airspeed
         + ", beta=" + beta
         + ", alpha=" + alpha + "}";
  }

  /**
   * Time since system start 
   */
  @MavlinkFieldInfo(
      position = 1,
      unitSize = 8
  )
  public final BigInteger timestamp() {
    return timestamp;
  }

  /**
   * Magnitude of wind velocity (in lateral inertial plane) 
   */
  @MavlinkFieldInfo(
      position = 2,
      unitSize = 4
  )
  public final float windspeed() {
    return windspeed;
  }

  /**
   * Wind heading angle from North 
   */
  @MavlinkFieldInfo(
      position = 3,
      unitSize = 4
  )
  public final float winddir() {
    return winddir;
  }

  /**
   * Z (Down) component of inertial wind velocity 
   */
  @MavlinkFieldInfo(
      position = 4,
      unitSize = 4
  )
  public final float windz() {
    return windz;
  }

  /**
   * Magnitude of air velocity 
   */
  @MavlinkFieldInfo(
      position = 5,
      unitSize = 4
  )
  public final float airspeed() {
    return airspeed;
  }

  /**
   * Sideslip angle 
   */
  @MavlinkFieldInfo(
      position = 6,
      unitSize = 4
  )
  public final float beta() {
    return beta;
  }

  /**
   * Angle of attack 
   */
  @MavlinkFieldInfo(
      position = 7,
      unitSize = 4
  )
  public final float alpha() {
    return alpha;
  }

  public static class Builder {
    private BigInteger timestamp;

    private float windspeed;

    private float winddir;

    private float windz;

    private float airspeed;

    private float beta;

    private float alpha;

    private Builder() {
    }

    /**
     * Time since system start 
     */
    @MavlinkFieldInfo(
        position = 1,
        unitSize = 8
    )
    public final Builder timestamp(BigInteger timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    /**
     * Magnitude of wind velocity (in lateral inertial plane) 
     */
    @MavlinkFieldInfo(
        position = 2,
        unitSize = 4
    )
    public final Builder windspeed(float windspeed) {
      this.windspeed = windspeed;
      return this;
    }

    /**
     * Wind heading angle from North 
     */
    @MavlinkFieldInfo(
        position = 3,
        unitSize = 4
    )
    public final Builder winddir(float winddir) {
      this.winddir = winddir;
      return this;
    }

    /**
     * Z (Down) component of inertial wind velocity 
     */
    @MavlinkFieldInfo(
        position = 4,
        unitSize = 4
    )
    public final Builder windz(float windz) {
      this.windz = windz;
      return this;
    }

    /**
     * Magnitude of air velocity 
     */
    @MavlinkFieldInfo(
        position = 5,
        unitSize = 4
    )
    public final Builder airspeed(float airspeed) {
      this.airspeed = airspeed;
      return this;
    }

    /**
     * Sideslip angle 
     */
    @MavlinkFieldInfo(
        position = 6,
        unitSize = 4
    )
    public final Builder beta(float beta) {
      this.beta = beta;
      return this;
    }

    /**
     * Angle of attack 
     */
    @MavlinkFieldInfo(
        position = 7,
        unitSize = 4
    )
    public final Builder alpha(float alpha) {
      this.alpha = alpha;
      return this;
    }

    public final EkfExt build() {
      return new EkfExt(timestamp, windspeed, winddir, windz, airspeed, beta, alpha);
    }
  }
}