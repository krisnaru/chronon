/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ai.chronon.api;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2024-12-29")
public enum Operation implements org.apache.thrift.TEnum {
  MIN(0),
  MAX(1),
  FIRST(2),
  LAST(3),
  UNIQUE_COUNT(4),
  APPROX_UNIQUE_COUNT(5),
  COUNT(6),
  SUM(7),
  AVERAGE(8),
  VARIANCE(9),
  SKEW(10),
  KURTOSIS(11),
  APPROX_PERCENTILE(12),
  LAST_K(13),
  FIRST_K(14),
  TOP_K(15),
  BOTTOM_K(16),
  HISTOGRAM(17),
  APPROX_HISTOGRAM_K(18);

  private final int value;

  private Operation(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static Operation findByValue(int value) { 
    switch (value) {
      case 0:
        return MIN;
      case 1:
        return MAX;
      case 2:
        return FIRST;
      case 3:
        return LAST;
      case 4:
        return UNIQUE_COUNT;
      case 5:
        return APPROX_UNIQUE_COUNT;
      case 6:
        return COUNT;
      case 7:
        return SUM;
      case 8:
        return AVERAGE;
      case 9:
        return VARIANCE;
      case 10:
        return SKEW;
      case 11:
        return KURTOSIS;
      case 12:
        return APPROX_PERCENTILE;
      case 13:
        return LAST_K;
      case 14:
        return FIRST_K;
      case 15:
        return TOP_K;
      case 16:
        return BOTTOM_K;
      case 17:
        return HISTOGRAM;
      case 18:
        return APPROX_HISTOGRAM_K;
      default:
        return null;
    }
  }
}