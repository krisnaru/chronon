/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ai.chronon.api;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2024-12-31")
public enum DataKind implements org.apache.thrift.TEnum {
  BOOLEAN(0),
  BYTE(1),
  SHORT(2),
  INT(3),
  LONG(4),
  FLOAT(5),
  DOUBLE(6),
  STRING(7),
  BINARY(8),
  DATE(9),
  TIMESTAMP(10),
  MAP(11),
  LIST(12),
  STRUCT(13);

  private final int value;

  private DataKind(int value) {
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
  public static DataKind findByValue(int value) { 
    switch (value) {
      case 0:
        return BOOLEAN;
      case 1:
        return BYTE;
      case 2:
        return SHORT;
      case 3:
        return INT;
      case 4:
        return LONG;
      case 5:
        return FLOAT;
      case 6:
        return DOUBLE;
      case 7:
        return STRING;
      case 8:
        return BINARY;
      case 9:
        return DATE;
      case 10:
        return TIMESTAMP;
      case 11:
        return MAP;
      case 12:
        return LIST;
      case 13:
        return STRUCT;
      default:
        return null;
    }
  }
}