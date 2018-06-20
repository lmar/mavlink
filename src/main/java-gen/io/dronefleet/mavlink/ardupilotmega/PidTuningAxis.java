package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkEntryInfo;
import io.dronefleet.mavlink.annotations.MavlinkEnum;

/**
 * null
 */
@MavlinkEnum
public enum PidTuningAxis {
  /**
   * null
   */
  @MavlinkEntryInfo(1)
  PID_TUNING_ROLL,

  /**
   * null
   */
  @MavlinkEntryInfo(2)
  PID_TUNING_PITCH,

  /**
   * null
   */
  @MavlinkEntryInfo(3)
  PID_TUNING_YAW,

  /**
   * null
   */
  @MavlinkEntryInfo(4)
  PID_TUNING_ACCZ,

  /**
   * null
   */
  @MavlinkEntryInfo(5)
  PID_TUNING_STEER,

  /**
   * null
   */
  @MavlinkEntryInfo(6)
  PID_TUNING_LANDING
}