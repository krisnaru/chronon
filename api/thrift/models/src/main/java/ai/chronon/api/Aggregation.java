/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ai.chronon.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * Chronon provides a powerful aggregations primitive - that takes the familiar aggregation operation, via groupBy in
 * SQL and extends it with three things - windowing, bucketing and auto-explode.
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2024-12-31")
public class Aggregation implements org.apache.thrift.TBase<Aggregation, Aggregation._Fields>, java.io.Serializable, Cloneable, Comparable<Aggregation> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Aggregation");

  private static final org.apache.thrift.protocol.TField INPUT_COLUMN_FIELD_DESC = new org.apache.thrift.protocol.TField("inputColumn", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField OPERATION_FIELD_DESC = new org.apache.thrift.protocol.TField("operation", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField ARG_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("argMap", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField WINDOWS_FIELD_DESC = new org.apache.thrift.protocol.TField("windows", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField BUCKETS_FIELD_DESC = new org.apache.thrift.protocol.TField("buckets", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AggregationStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AggregationTupleSchemeFactory();

  /**
   * The column as specified in source.query.selects - on which we need to aggregate with.
   * 
   */
  public @org.apache.thrift.annotation.Nullable java.lang.String inputColumn; // optional
  /**
   * The type of aggregation that needs to be performed on the inputColumn.
   * 
   * 
   * @see Operation
   */
  public @org.apache.thrift.annotation.Nullable Operation operation; // optional
  /**
   * Extra arguments that needs to be passed to some of the operations like LAST_K, APPROX_PERCENTILE.
   * 
   */
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> argMap; // optional
  /**
   * For TEMPORAL case, windows are sawtooth. Meaning head slides ahead continuously in time, whereas, the tail only hops ahead, at discrete points in time. Hop is determined by the window size automatically. The maximum hop size is 1/12 of window size. You can specify multiple such windows at once.
   *   - Window > 12 days  -> Hop Size = 1 day
   *   - Window > 12 hours -> Hop Size = 1 hr
   *   - Window > 1hr      -> Hop Size = 5 minutes
   */
  public @org.apache.thrift.annotation.Nullable java.util.List<Window> windows; // optional
  /**
   * This is an additional layer of aggregation. You can key a group_by by user, and bucket a “item_view” count by “item_category”. This will produce one row per user, with column containing map of “item_category” to “view_count”. You can specify multiple such buckets at once
   */
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> buckets; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * The column as specified in source.query.selects - on which we need to aggregate with.
     * 
     */
    INPUT_COLUMN((short)1, "inputColumn"),
    /**
     * The type of aggregation that needs to be performed on the inputColumn.
     * 
     * 
     * @see Operation
     */
    OPERATION((short)2, "operation"),
    /**
     * Extra arguments that needs to be passed to some of the operations like LAST_K, APPROX_PERCENTILE.
     * 
     */
    ARG_MAP((short)3, "argMap"),
    /**
     * For TEMPORAL case, windows are sawtooth. Meaning head slides ahead continuously in time, whereas, the tail only hops ahead, at discrete points in time. Hop is determined by the window size automatically. The maximum hop size is 1/12 of window size. You can specify multiple such windows at once.
     *   - Window > 12 days  -> Hop Size = 1 day
     *   - Window > 12 hours -> Hop Size = 1 hr
     *   - Window > 1hr      -> Hop Size = 5 minutes
     */
    WINDOWS((short)4, "windows"),
    /**
     * This is an additional layer of aggregation. You can key a group_by by user, and bucket a “item_view” count by “item_category”. This will produce one row per user, with column containing map of “item_category” to “view_count”. You can specify multiple such buckets at once
     */
    BUCKETS((short)5, "buckets");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // INPUT_COLUMN
          return INPUT_COLUMN;
        case 2: // OPERATION
          return OPERATION;
        case 3: // ARG_MAP
          return ARG_MAP;
        case 4: // WINDOWS
          return WINDOWS;
        case 5: // BUCKETS
          return BUCKETS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.INPUT_COLUMN,_Fields.OPERATION,_Fields.ARG_MAP,_Fields.WINDOWS,_Fields.BUCKETS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INPUT_COLUMN, new org.apache.thrift.meta_data.FieldMetaData("inputColumn", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OPERATION, new org.apache.thrift.meta_data.FieldMetaData("operation", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Operation.class)));
    tmpMap.put(_Fields.ARG_MAP, new org.apache.thrift.meta_data.FieldMetaData("argMap", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.WINDOWS, new org.apache.thrift.meta_data.FieldMetaData("windows", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Window.class))));
    tmpMap.put(_Fields.BUCKETS, new org.apache.thrift.meta_data.FieldMetaData("buckets", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Aggregation.class, metaDataMap);
  }

  public Aggregation() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Aggregation(Aggregation other) {
    if (other.isSetInputColumn()) {
      this.inputColumn = other.inputColumn;
    }
    if (other.isSetOperation()) {
      this.operation = other.operation;
    }
    if (other.isSetArgMap()) {
      java.util.Map<java.lang.String,java.lang.String> __this__argMap = new java.util.HashMap<java.lang.String,java.lang.String>(other.argMap);
      this.argMap = __this__argMap;
    }
    if (other.isSetWindows()) {
      java.util.List<Window> __this__windows = new java.util.ArrayList<Window>(other.windows.size());
      for (Window other_element : other.windows) {
        __this__windows.add(new Window(other_element));
      }
      this.windows = __this__windows;
    }
    if (other.isSetBuckets()) {
      java.util.List<java.lang.String> __this__buckets = new java.util.ArrayList<java.lang.String>(other.buckets);
      this.buckets = __this__buckets;
    }
  }

  public Aggregation deepCopy() {
    return new Aggregation(this);
  }

  @Override
  public void clear() {
    this.inputColumn = null;
    this.operation = null;
    this.argMap = null;
    this.windows = null;
    this.buckets = null;
  }

  /**
   * The column as specified in source.query.selects - on which we need to aggregate with.
   * 
   */
  @org.apache.thrift.annotation.Nullable
  public java.lang.String getInputColumn() {
    return this.inputColumn;
  }

  /**
   * The column as specified in source.query.selects - on which we need to aggregate with.
   * 
   */
  public Aggregation setInputColumn(@org.apache.thrift.annotation.Nullable java.lang.String inputColumn) {
    this.inputColumn = inputColumn;
    return this;
  }

  public void unsetInputColumn() {
    this.inputColumn = null;
  }

  /** Returns true if field inputColumn is set (has been assigned a value) and false otherwise */
  public boolean isSetInputColumn() {
    return this.inputColumn != null;
  }

  public void setInputColumnIsSet(boolean value) {
    if (!value) {
      this.inputColumn = null;
    }
  }

  /**
   * The type of aggregation that needs to be performed on the inputColumn.
   * 
   * 
   * @see Operation
   */
  @org.apache.thrift.annotation.Nullable
  public Operation getOperation() {
    return this.operation;
  }

  /**
   * The type of aggregation that needs to be performed on the inputColumn.
   * 
   * 
   * @see Operation
   */
  public Aggregation setOperation(@org.apache.thrift.annotation.Nullable Operation operation) {
    this.operation = operation;
    return this;
  }

  public void unsetOperation() {
    this.operation = null;
  }

  /** Returns true if field operation is set (has been assigned a value) and false otherwise */
  public boolean isSetOperation() {
    return this.operation != null;
  }

  public void setOperationIsSet(boolean value) {
    if (!value) {
      this.operation = null;
    }
  }

  public int getArgMapSize() {
    return (this.argMap == null) ? 0 : this.argMap.size();
  }

  public void putToArgMap(java.lang.String key, java.lang.String val) {
    if (this.argMap == null) {
      this.argMap = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.argMap.put(key, val);
  }

  /**
   * Extra arguments that needs to be passed to some of the operations like LAST_K, APPROX_PERCENTILE.
   * 
   */
  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.lang.String> getArgMap() {
    return this.argMap;
  }

  /**
   * Extra arguments that needs to be passed to some of the operations like LAST_K, APPROX_PERCENTILE.
   * 
   */
  public Aggregation setArgMap(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> argMap) {
    this.argMap = argMap;
    return this;
  }

  public void unsetArgMap() {
    this.argMap = null;
  }

  /** Returns true if field argMap is set (has been assigned a value) and false otherwise */
  public boolean isSetArgMap() {
    return this.argMap != null;
  }

  public void setArgMapIsSet(boolean value) {
    if (!value) {
      this.argMap = null;
    }
  }

  public int getWindowsSize() {
    return (this.windows == null) ? 0 : this.windows.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<Window> getWindowsIterator() {
    return (this.windows == null) ? null : this.windows.iterator();
  }

  public void addToWindows(Window elem) {
    if (this.windows == null) {
      this.windows = new java.util.ArrayList<Window>();
    }
    this.windows.add(elem);
  }

  /**
   * For TEMPORAL case, windows are sawtooth. Meaning head slides ahead continuously in time, whereas, the tail only hops ahead, at discrete points in time. Hop is determined by the window size automatically. The maximum hop size is 1/12 of window size. You can specify multiple such windows at once.
   *   - Window > 12 days  -> Hop Size = 1 day
   *   - Window > 12 hours -> Hop Size = 1 hr
   *   - Window > 1hr      -> Hop Size = 5 minutes
   */
  @org.apache.thrift.annotation.Nullable
  public java.util.List<Window> getWindows() {
    return this.windows;
  }

  /**
   * For TEMPORAL case, windows are sawtooth. Meaning head slides ahead continuously in time, whereas, the tail only hops ahead, at discrete points in time. Hop is determined by the window size automatically. The maximum hop size is 1/12 of window size. You can specify multiple such windows at once.
   *   - Window > 12 days  -> Hop Size = 1 day
   *   - Window > 12 hours -> Hop Size = 1 hr
   *   - Window > 1hr      -> Hop Size = 5 minutes
   */
  public Aggregation setWindows(@org.apache.thrift.annotation.Nullable java.util.List<Window> windows) {
    this.windows = windows;
    return this;
  }

  public void unsetWindows() {
    this.windows = null;
  }

  /** Returns true if field windows is set (has been assigned a value) and false otherwise */
  public boolean isSetWindows() {
    return this.windows != null;
  }

  public void setWindowsIsSet(boolean value) {
    if (!value) {
      this.windows = null;
    }
  }

  public int getBucketsSize() {
    return (this.buckets == null) ? 0 : this.buckets.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getBucketsIterator() {
    return (this.buckets == null) ? null : this.buckets.iterator();
  }

  public void addToBuckets(java.lang.String elem) {
    if (this.buckets == null) {
      this.buckets = new java.util.ArrayList<java.lang.String>();
    }
    this.buckets.add(elem);
  }

  /**
   * This is an additional layer of aggregation. You can key a group_by by user, and bucket a “item_view” count by “item_category”. This will produce one row per user, with column containing map of “item_category” to “view_count”. You can specify multiple such buckets at once
   */
  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getBuckets() {
    return this.buckets;
  }

  /**
   * This is an additional layer of aggregation. You can key a group_by by user, and bucket a “item_view” count by “item_category”. This will produce one row per user, with column containing map of “item_category” to “view_count”. You can specify multiple such buckets at once
   */
  public Aggregation setBuckets(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> buckets) {
    this.buckets = buckets;
    return this;
  }

  public void unsetBuckets() {
    this.buckets = null;
  }

  /** Returns true if field buckets is set (has been assigned a value) and false otherwise */
  public boolean isSetBuckets() {
    return this.buckets != null;
  }

  public void setBucketsIsSet(boolean value) {
    if (!value) {
      this.buckets = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case INPUT_COLUMN:
      if (value == null) {
        unsetInputColumn();
      } else {
        setInputColumn((java.lang.String)value);
      }
      break;

    case OPERATION:
      if (value == null) {
        unsetOperation();
      } else {
        setOperation((Operation)value);
      }
      break;

    case ARG_MAP:
      if (value == null) {
        unsetArgMap();
      } else {
        setArgMap((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    case WINDOWS:
      if (value == null) {
        unsetWindows();
      } else {
        setWindows((java.util.List<Window>)value);
      }
      break;

    case BUCKETS:
      if (value == null) {
        unsetBuckets();
      } else {
        setBuckets((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case INPUT_COLUMN:
      return getInputColumn();

    case OPERATION:
      return getOperation();

    case ARG_MAP:
      return getArgMap();

    case WINDOWS:
      return getWindows();

    case BUCKETS:
      return getBuckets();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case INPUT_COLUMN:
      return isSetInputColumn();
    case OPERATION:
      return isSetOperation();
    case ARG_MAP:
      return isSetArgMap();
    case WINDOWS:
      return isSetWindows();
    case BUCKETS:
      return isSetBuckets();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Aggregation)
      return this.equals((Aggregation)that);
    return false;
  }

  public boolean equals(Aggregation that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_inputColumn = true && this.isSetInputColumn();
    boolean that_present_inputColumn = true && that.isSetInputColumn();
    if (this_present_inputColumn || that_present_inputColumn) {
      if (!(this_present_inputColumn && that_present_inputColumn))
        return false;
      if (!this.inputColumn.equals(that.inputColumn))
        return false;
    }

    boolean this_present_operation = true && this.isSetOperation();
    boolean that_present_operation = true && that.isSetOperation();
    if (this_present_operation || that_present_operation) {
      if (!(this_present_operation && that_present_operation))
        return false;
      if (!this.operation.equals(that.operation))
        return false;
    }

    boolean this_present_argMap = true && this.isSetArgMap();
    boolean that_present_argMap = true && that.isSetArgMap();
    if (this_present_argMap || that_present_argMap) {
      if (!(this_present_argMap && that_present_argMap))
        return false;
      if (!this.argMap.equals(that.argMap))
        return false;
    }

    boolean this_present_windows = true && this.isSetWindows();
    boolean that_present_windows = true && that.isSetWindows();
    if (this_present_windows || that_present_windows) {
      if (!(this_present_windows && that_present_windows))
        return false;
      if (!this.windows.equals(that.windows))
        return false;
    }

    boolean this_present_buckets = true && this.isSetBuckets();
    boolean that_present_buckets = true && that.isSetBuckets();
    if (this_present_buckets || that_present_buckets) {
      if (!(this_present_buckets && that_present_buckets))
        return false;
      if (!this.buckets.equals(that.buckets))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetInputColumn()) ? 131071 : 524287);
    if (isSetInputColumn())
      hashCode = hashCode * 8191 + inputColumn.hashCode();

    hashCode = hashCode * 8191 + ((isSetOperation()) ? 131071 : 524287);
    if (isSetOperation())
      hashCode = hashCode * 8191 + operation.getValue();

    hashCode = hashCode * 8191 + ((isSetArgMap()) ? 131071 : 524287);
    if (isSetArgMap())
      hashCode = hashCode * 8191 + argMap.hashCode();

    hashCode = hashCode * 8191 + ((isSetWindows()) ? 131071 : 524287);
    if (isSetWindows())
      hashCode = hashCode * 8191 + windows.hashCode();

    hashCode = hashCode * 8191 + ((isSetBuckets()) ? 131071 : 524287);
    if (isSetBuckets())
      hashCode = hashCode * 8191 + buckets.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Aggregation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetInputColumn()).compareTo(other.isSetInputColumn());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInputColumn()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inputColumn, other.inputColumn);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOperation()).compareTo(other.isSetOperation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operation, other.operation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetArgMap()).compareTo(other.isSetArgMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArgMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.argMap, other.argMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetWindows()).compareTo(other.isSetWindows());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWindows()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.windows, other.windows);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBuckets()).compareTo(other.isSetBuckets());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuckets()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buckets, other.buckets);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Aggregation(");
    boolean first = true;

    if (isSetInputColumn()) {
      sb.append("inputColumn:");
      if (this.inputColumn == null) {
        sb.append("null");
      } else {
        sb.append(this.inputColumn);
      }
      first = false;
    }
    if (isSetOperation()) {
      if (!first) sb.append(", ");
      sb.append("operation:");
      if (this.operation == null) {
        sb.append("null");
      } else {
        sb.append(this.operation);
      }
      first = false;
    }
    if (isSetArgMap()) {
      if (!first) sb.append(", ");
      sb.append("argMap:");
      if (this.argMap == null) {
        sb.append("null");
      } else {
        sb.append(this.argMap);
      }
      first = false;
    }
    if (isSetWindows()) {
      if (!first) sb.append(", ");
      sb.append("windows:");
      if (this.windows == null) {
        sb.append("null");
      } else {
        sb.append(this.windows);
      }
      first = false;
    }
    if (isSetBuckets()) {
      if (!first) sb.append(", ");
      sb.append("buckets:");
      if (this.buckets == null) {
        sb.append("null");
      } else {
        sb.append(this.buckets);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AggregationStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AggregationStandardScheme getScheme() {
      return new AggregationStandardScheme();
    }
  }

  private static class AggregationStandardScheme extends org.apache.thrift.scheme.StandardScheme<Aggregation> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Aggregation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INPUT_COLUMN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.inputColumn = iprot.readString();
              struct.setInputColumnIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OPERATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.operation = ai.chronon.api.Operation.findByValue(iprot.readI32());
              struct.setOperationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ARG_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map34 = iprot.readMapBegin();
                struct.argMap = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map34.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key35;
                @org.apache.thrift.annotation.Nullable java.lang.String _val36;
                for (int _i37 = 0; _i37 < _map34.size; ++_i37)
                {
                  _key35 = iprot.readString();
                  _val36 = iprot.readString();
                  struct.argMap.put(_key35, _val36);
                }
                iprot.readMapEnd();
              }
              struct.setArgMapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // WINDOWS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list38 = iprot.readListBegin();
                struct.windows = new java.util.ArrayList<Window>(_list38.size);
                @org.apache.thrift.annotation.Nullable Window _elem39;
                for (int _i40 = 0; _i40 < _list38.size; ++_i40)
                {
                  _elem39 = new Window();
                  _elem39.read(iprot);
                  struct.windows.add(_elem39);
                }
                iprot.readListEnd();
              }
              struct.setWindowsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // BUCKETS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list41 = iprot.readListBegin();
                struct.buckets = new java.util.ArrayList<java.lang.String>(_list41.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem42;
                for (int _i43 = 0; _i43 < _list41.size; ++_i43)
                {
                  _elem42 = iprot.readString();
                  struct.buckets.add(_elem42);
                }
                iprot.readListEnd();
              }
              struct.setBucketsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Aggregation struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.inputColumn != null) {
        if (struct.isSetInputColumn()) {
          oprot.writeFieldBegin(INPUT_COLUMN_FIELD_DESC);
          oprot.writeString(struct.inputColumn);
          oprot.writeFieldEnd();
        }
      }
      if (struct.operation != null) {
        if (struct.isSetOperation()) {
          oprot.writeFieldBegin(OPERATION_FIELD_DESC);
          oprot.writeI32(struct.operation.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.argMap != null) {
        if (struct.isSetArgMap()) {
          oprot.writeFieldBegin(ARG_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.argMap.size()));
            for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter44 : struct.argMap.entrySet())
            {
              oprot.writeString(_iter44.getKey());
              oprot.writeString(_iter44.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.windows != null) {
        if (struct.isSetWindows()) {
          oprot.writeFieldBegin(WINDOWS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.windows.size()));
            for (Window _iter45 : struct.windows)
            {
              _iter45.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.buckets != null) {
        if (struct.isSetBuckets()) {
          oprot.writeFieldBegin(BUCKETS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.buckets.size()));
            for (java.lang.String _iter46 : struct.buckets)
            {
              oprot.writeString(_iter46);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AggregationTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AggregationTupleScheme getScheme() {
      return new AggregationTupleScheme();
    }
  }

  private static class AggregationTupleScheme extends org.apache.thrift.scheme.TupleScheme<Aggregation> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Aggregation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetInputColumn()) {
        optionals.set(0);
      }
      if (struct.isSetOperation()) {
        optionals.set(1);
      }
      if (struct.isSetArgMap()) {
        optionals.set(2);
      }
      if (struct.isSetWindows()) {
        optionals.set(3);
      }
      if (struct.isSetBuckets()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetInputColumn()) {
        oprot.writeString(struct.inputColumn);
      }
      if (struct.isSetOperation()) {
        oprot.writeI32(struct.operation.getValue());
      }
      if (struct.isSetArgMap()) {
        {
          oprot.writeI32(struct.argMap.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter47 : struct.argMap.entrySet())
          {
            oprot.writeString(_iter47.getKey());
            oprot.writeString(_iter47.getValue());
          }
        }
      }
      if (struct.isSetWindows()) {
        {
          oprot.writeI32(struct.windows.size());
          for (Window _iter48 : struct.windows)
          {
            _iter48.write(oprot);
          }
        }
      }
      if (struct.isSetBuckets()) {
        {
          oprot.writeI32(struct.buckets.size());
          for (java.lang.String _iter49 : struct.buckets)
          {
            oprot.writeString(_iter49);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Aggregation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.inputColumn = iprot.readString();
        struct.setInputColumnIsSet(true);
      }
      if (incoming.get(1)) {
        struct.operation = ai.chronon.api.Operation.findByValue(iprot.readI32());
        struct.setOperationIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map50 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.argMap = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map50.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _key51;
          @org.apache.thrift.annotation.Nullable java.lang.String _val52;
          for (int _i53 = 0; _i53 < _map50.size; ++_i53)
          {
            _key51 = iprot.readString();
            _val52 = iprot.readString();
            struct.argMap.put(_key51, _val52);
          }
        }
        struct.setArgMapIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list54 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.windows = new java.util.ArrayList<Window>(_list54.size);
          @org.apache.thrift.annotation.Nullable Window _elem55;
          for (int _i56 = 0; _i56 < _list54.size; ++_i56)
          {
            _elem55 = new Window();
            _elem55.read(iprot);
            struct.windows.add(_elem55);
          }
        }
        struct.setWindowsIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list57 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.buckets = new java.util.ArrayList<java.lang.String>(_list57.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem58;
          for (int _i59 = 0; _i59 < _list57.size; ++_i59)
          {
            _elem58 = iprot.readString();
            struct.buckets.add(_elem58);
          }
        }
        struct.setBucketsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
