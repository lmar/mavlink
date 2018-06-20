package io.dronefleet.mavlink.matrixpilot;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.List;

/**
 * Acknowldge sucess or failure of a flexifunction command 
 */
@MavlinkMessageInfo(
    id = 155,
    crc = 12
)
public final class FlexifunctionDirectory {
  /**
   * System ID 
   */
  private final int targetSystem;

  /**
   * Component ID 
   */
  private final int targetComponent;

  /**
   * 0=inputs, 1=outputs 
   */
  private final int directoryType;

  /**
   * index of first directory entry to write 
   */
  private final int startIndex;

  /**
   * count of directory entries to write 
   */
  private final int count;

  /**
   * Settings data 
   */
  private final List<Integer> directoryData;

  private FlexifunctionDirectory(int targetSystem, int targetComponent, int directoryType,
      int startIndex, int count, List<Integer> directoryData) {
    this.targetSystem = targetSystem;
    this.targetComponent = targetComponent;
    this.directoryType = directoryType;
    this.startIndex = startIndex;
    this.count = count;
    this.directoryData = directoryData;
  }

  @MavlinkMessageBuilder
  public static Builder builder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "FlexifunctionDirectory{targetSystem=" + targetSystem
         + ", targetComponent=" + targetComponent
         + ", directoryType=" + directoryType
         + ", startIndex=" + startIndex
         + ", count=" + count
         + ", directoryData=" + directoryData + "}";
  }

  /**
   * System ID 
   */
  @MavlinkFieldInfo(
      position = 1,
      unitSize = 1
  )
  public final int targetSystem() {
    return targetSystem;
  }

  /**
   * Component ID 
   */
  @MavlinkFieldInfo(
      position = 2,
      unitSize = 1
  )
  public final int targetComponent() {
    return targetComponent;
  }

  /**
   * 0=inputs, 1=outputs 
   */
  @MavlinkFieldInfo(
      position = 3,
      unitSize = 1
  )
  public final int directoryType() {
    return directoryType;
  }

  /**
   * index of first directory entry to write 
   */
  @MavlinkFieldInfo(
      position = 4,
      unitSize = 1
  )
  public final int startIndex() {
    return startIndex;
  }

  /**
   * count of directory entries to write 
   */
  @MavlinkFieldInfo(
      position = 5,
      unitSize = 1
  )
  public final int count() {
    return count;
  }

  /**
   * Settings data 
   */
  @MavlinkFieldInfo(
      position = 6,
      unitSize = 1,
      arraySize = 48
  )
  public final List<Integer> directoryData() {
    return directoryData;
  }

  public static class Builder {
    private int targetSystem;

    private int targetComponent;

    private int directoryType;

    private int startIndex;

    private int count;

    private List<Integer> directoryData;

    private Builder() {
    }

    /**
     * System ID 
     */
    @MavlinkFieldInfo(
        position = 1,
        unitSize = 1
    )
    public final Builder targetSystem(int targetSystem) {
      this.targetSystem = targetSystem;
      return this;
    }

    /**
     * Component ID 
     */
    @MavlinkFieldInfo(
        position = 2,
        unitSize = 1
    )
    public final Builder targetComponent(int targetComponent) {
      this.targetComponent = targetComponent;
      return this;
    }

    /**
     * 0=inputs, 1=outputs 
     */
    @MavlinkFieldInfo(
        position = 3,
        unitSize = 1
    )
    public final Builder directoryType(int directoryType) {
      this.directoryType = directoryType;
      return this;
    }

    /**
     * index of first directory entry to write 
     */
    @MavlinkFieldInfo(
        position = 4,
        unitSize = 1
    )
    public final Builder startIndex(int startIndex) {
      this.startIndex = startIndex;
      return this;
    }

    /**
     * count of directory entries to write 
     */
    @MavlinkFieldInfo(
        position = 5,
        unitSize = 1
    )
    public final Builder count(int count) {
      this.count = count;
      return this;
    }

    /**
     * Settings data 
     */
    @MavlinkFieldInfo(
        position = 6,
        unitSize = 1,
        arraySize = 48
    )
    public final Builder directoryData(List<Integer> directoryData) {
      this.directoryData = directoryData;
      return this;
    }

    public final FlexifunctionDirectory build() {
      return new FlexifunctionDirectory(targetSystem, targetComponent, directoryType, startIndex, count, directoryData);
    }
  }
}