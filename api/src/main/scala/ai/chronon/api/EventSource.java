/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ai.chronon.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2024-12-29")
public class EventSource implements org.apache.thrift.TBase<EventSource, EventSource._Fields>, java.io.Serializable, Cloneable, Comparable<EventSource> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EventSource");

  private static final org.apache.thrift.protocol.TField TABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("table", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TOPIC_FIELD_DESC = new org.apache.thrift.protocol.TField("topic", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField QUERY_FIELD_DESC = new org.apache.thrift.protocol.TField("query", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField IS_CUMULATIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("isCumulative", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new EventSourceStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new EventSourceTupleSchemeFactory();

  /**
   * Table currently needs to be a 'ds' (date string - yyyy-MM-dd) partitioned hive table. Table names can contain subpartition specs, example db.table/system=mobile/currency=USD
   * 
   */
  public @org.apache.thrift.annotation.Nullable java.lang.String table; // optional
  /**
   * Topic is a kafka table. The table contains all the events that historically came through this topic.
   * 
   */
  public @org.apache.thrift.annotation.Nullable java.lang.String topic; // optional
  /**
   * The logic used to scan both the table and the topic. Contains row level transformations and filtering expressed as Spark SQL statements.
   * 
   */
  public @org.apache.thrift.annotation.Nullable Query query; // optional
  /**
   * If each new hive partition contains not just the current day's events but the entire set of events since the begininng. The key property is that the events are not mutated across partitions.
   * 
   */
  public boolean isCumulative; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Table currently needs to be a 'ds' (date string - yyyy-MM-dd) partitioned hive table. Table names can contain subpartition specs, example db.table/system=mobile/currency=USD
     * 
     */
    TABLE((short)1, "table"),
    /**
     * Topic is a kafka table. The table contains all the events that historically came through this topic.
     * 
     */
    TOPIC((short)2, "topic"),
    /**
     * The logic used to scan both the table and the topic. Contains row level transformations and filtering expressed as Spark SQL statements.
     * 
     */
    QUERY((short)3, "query"),
    /**
     * If each new hive partition contains not just the current day's events but the entire set of events since the begininng. The key property is that the events are not mutated across partitions.
     * 
     */
    IS_CUMULATIVE((short)4, "isCumulative");

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
        case 1: // TABLE
          return TABLE;
        case 2: // TOPIC
          return TOPIC;
        case 3: // QUERY
          return QUERY;
        case 4: // IS_CUMULATIVE
          return IS_CUMULATIVE;
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
  private static final int __ISCUMULATIVE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TABLE,_Fields.TOPIC,_Fields.QUERY,_Fields.IS_CUMULATIVE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE, new org.apache.thrift.meta_data.FieldMetaData("table", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TOPIC, new org.apache.thrift.meta_data.FieldMetaData("topic", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.QUERY, new org.apache.thrift.meta_data.FieldMetaData("query", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Query.class)));
    tmpMap.put(_Fields.IS_CUMULATIVE, new org.apache.thrift.meta_data.FieldMetaData("isCumulative", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EventSource.class, metaDataMap);
  }

  public EventSource() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EventSource(EventSource other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTable()) {
      this.table = other.table;
    }
    if (other.isSetTopic()) {
      this.topic = other.topic;
    }
    if (other.isSetQuery()) {
      this.query = new Query(other.query);
    }
    this.isCumulative = other.isCumulative;
  }

  public EventSource deepCopy() {
    return new EventSource(this);
  }

  @Override
  public void clear() {
    this.table = null;
    this.topic = null;
    this.query = null;
    setIsCumulativeIsSet(false);
    this.isCumulative = false;
  }

  /**
   * Table currently needs to be a 'ds' (date string - yyyy-MM-dd) partitioned hive table. Table names can contain subpartition specs, example db.table/system=mobile/currency=USD
   * 
   */
  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTable() {
    return this.table;
  }

  /**
   * Table currently needs to be a 'ds' (date string - yyyy-MM-dd) partitioned hive table. Table names can contain subpartition specs, example db.table/system=mobile/currency=USD
   * 
   */
  public EventSource setTable(@org.apache.thrift.annotation.Nullable java.lang.String table) {
    this.table = table;
    return this;
  }

  public void unsetTable() {
    this.table = null;
  }

  /** Returns true if field table is set (has been assigned a value) and false otherwise */
  public boolean isSetTable() {
    return this.table != null;
  }

  public void setTableIsSet(boolean value) {
    if (!value) {
      this.table = null;
    }
  }

  /**
   * Topic is a kafka table. The table contains all the events that historically came through this topic.
   * 
   */
  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTopic() {
    return this.topic;
  }

  /**
   * Topic is a kafka table. The table contains all the events that historically came through this topic.
   * 
   */
  public EventSource setTopic(@org.apache.thrift.annotation.Nullable java.lang.String topic) {
    this.topic = topic;
    return this;
  }

  public void unsetTopic() {
    this.topic = null;
  }

  /** Returns true if field topic is set (has been assigned a value) and false otherwise */
  public boolean isSetTopic() {
    return this.topic != null;
  }

  public void setTopicIsSet(boolean value) {
    if (!value) {
      this.topic = null;
    }
  }

  /**
   * The logic used to scan both the table and the topic. Contains row level transformations and filtering expressed as Spark SQL statements.
   * 
   */
  @org.apache.thrift.annotation.Nullable
  public Query getQuery() {
    return this.query;
  }

  /**
   * The logic used to scan both the table and the topic. Contains row level transformations and filtering expressed as Spark SQL statements.
   * 
   */
  public EventSource setQuery(@org.apache.thrift.annotation.Nullable Query query) {
    this.query = query;
    return this;
  }

  public void unsetQuery() {
    this.query = null;
  }

  /** Returns true if field query is set (has been assigned a value) and false otherwise */
  public boolean isSetQuery() {
    return this.query != null;
  }

  public void setQueryIsSet(boolean value) {
    if (!value) {
      this.query = null;
    }
  }

  /**
   * If each new hive partition contains not just the current day's events but the entire set of events since the begininng. The key property is that the events are not mutated across partitions.
   * 
   */
  public boolean isIsCumulative() {
    return this.isCumulative;
  }

  /**
   * If each new hive partition contains not just the current day's events but the entire set of events since the begininng. The key property is that the events are not mutated across partitions.
   * 
   */
  public EventSource setIsCumulative(boolean isCumulative) {
    this.isCumulative = isCumulative;
    setIsCumulativeIsSet(true);
    return this;
  }

  public void unsetIsCumulative() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISCUMULATIVE_ISSET_ID);
  }

  /** Returns true if field isCumulative is set (has been assigned a value) and false otherwise */
  public boolean isSetIsCumulative() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISCUMULATIVE_ISSET_ID);
  }

  public void setIsCumulativeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISCUMULATIVE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TABLE:
      if (value == null) {
        unsetTable();
      } else {
        setTable((java.lang.String)value);
      }
      break;

    case TOPIC:
      if (value == null) {
        unsetTopic();
      } else {
        setTopic((java.lang.String)value);
      }
      break;

    case QUERY:
      if (value == null) {
        unsetQuery();
      } else {
        setQuery((Query)value);
      }
      break;

    case IS_CUMULATIVE:
      if (value == null) {
        unsetIsCumulative();
      } else {
        setIsCumulative((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE:
      return getTable();

    case TOPIC:
      return getTopic();

    case QUERY:
      return getQuery();

    case IS_CUMULATIVE:
      return isIsCumulative();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TABLE:
      return isSetTable();
    case TOPIC:
      return isSetTopic();
    case QUERY:
      return isSetQuery();
    case IS_CUMULATIVE:
      return isSetIsCumulative();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof EventSource)
      return this.equals((EventSource)that);
    return false;
  }

  public boolean equals(EventSource that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_table = true && this.isSetTable();
    boolean that_present_table = true && that.isSetTable();
    if (this_present_table || that_present_table) {
      if (!(this_present_table && that_present_table))
        return false;
      if (!this.table.equals(that.table))
        return false;
    }

    boolean this_present_topic = true && this.isSetTopic();
    boolean that_present_topic = true && that.isSetTopic();
    if (this_present_topic || that_present_topic) {
      if (!(this_present_topic && that_present_topic))
        return false;
      if (!this.topic.equals(that.topic))
        return false;
    }

    boolean this_present_query = true && this.isSetQuery();
    boolean that_present_query = true && that.isSetQuery();
    if (this_present_query || that_present_query) {
      if (!(this_present_query && that_present_query))
        return false;
      if (!this.query.equals(that.query))
        return false;
    }

    boolean this_present_isCumulative = true && this.isSetIsCumulative();
    boolean that_present_isCumulative = true && that.isSetIsCumulative();
    if (this_present_isCumulative || that_present_isCumulative) {
      if (!(this_present_isCumulative && that_present_isCumulative))
        return false;
      if (this.isCumulative != that.isCumulative)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTable()) ? 131071 : 524287);
    if (isSetTable())
      hashCode = hashCode * 8191 + table.hashCode();

    hashCode = hashCode * 8191 + ((isSetTopic()) ? 131071 : 524287);
    if (isSetTopic())
      hashCode = hashCode * 8191 + topic.hashCode();

    hashCode = hashCode * 8191 + ((isSetQuery()) ? 131071 : 524287);
    if (isSetQuery())
      hashCode = hashCode * 8191 + query.hashCode();

    hashCode = hashCode * 8191 + ((isSetIsCumulative()) ? 131071 : 524287);
    if (isSetIsCumulative())
      hashCode = hashCode * 8191 + ((isCumulative) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(EventSource other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTable()).compareTo(other.isSetTable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table, other.table);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTopic()).compareTo(other.isSetTopic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopic()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.topic, other.topic);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetQuery()).compareTo(other.isSetQuery());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuery()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.query, other.query);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIsCumulative()).compareTo(other.isSetIsCumulative());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsCumulative()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isCumulative, other.isCumulative);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("EventSource(");
    boolean first = true;

    if (isSetTable()) {
      sb.append("table:");
      if (this.table == null) {
        sb.append("null");
      } else {
        sb.append(this.table);
      }
      first = false;
    }
    if (isSetTopic()) {
      if (!first) sb.append(", ");
      sb.append("topic:");
      if (this.topic == null) {
        sb.append("null");
      } else {
        sb.append(this.topic);
      }
      first = false;
    }
    if (isSetQuery()) {
      if (!first) sb.append(", ");
      sb.append("query:");
      if (this.query == null) {
        sb.append("null");
      } else {
        sb.append(this.query);
      }
      first = false;
    }
    if (isSetIsCumulative()) {
      if (!first) sb.append(", ");
      sb.append("isCumulative:");
      sb.append(this.isCumulative);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (query != null) {
      query.validate();
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EventSourceStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public EventSourceStandardScheme getScheme() {
      return new EventSourceStandardScheme();
    }
  }

  private static class EventSourceStandardScheme extends org.apache.thrift.scheme.StandardScheme<EventSource> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EventSource struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.table = iprot.readString();
              struct.setTableIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOPIC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.topic = iprot.readString();
              struct.setTopicIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // QUERY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.query = new Query();
              struct.query.read(iprot);
              struct.setQueryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IS_CUMULATIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isCumulative = iprot.readBool();
              struct.setIsCumulativeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, EventSource struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.table != null) {
        if (struct.isSetTable()) {
          oprot.writeFieldBegin(TABLE_FIELD_DESC);
          oprot.writeString(struct.table);
          oprot.writeFieldEnd();
        }
      }
      if (struct.topic != null) {
        if (struct.isSetTopic()) {
          oprot.writeFieldBegin(TOPIC_FIELD_DESC);
          oprot.writeString(struct.topic);
          oprot.writeFieldEnd();
        }
      }
      if (struct.query != null) {
        if (struct.isSetQuery()) {
          oprot.writeFieldBegin(QUERY_FIELD_DESC);
          struct.query.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetIsCumulative()) {
        oprot.writeFieldBegin(IS_CUMULATIVE_FIELD_DESC);
        oprot.writeBool(struct.isCumulative);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EventSourceTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public EventSourceTupleScheme getScheme() {
      return new EventSourceTupleScheme();
    }
  }

  private static class EventSourceTupleScheme extends org.apache.thrift.scheme.TupleScheme<EventSource> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EventSource struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTable()) {
        optionals.set(0);
      }
      if (struct.isSetTopic()) {
        optionals.set(1);
      }
      if (struct.isSetQuery()) {
        optionals.set(2);
      }
      if (struct.isSetIsCumulative()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTable()) {
        oprot.writeString(struct.table);
      }
      if (struct.isSetTopic()) {
        oprot.writeString(struct.topic);
      }
      if (struct.isSetQuery()) {
        struct.query.write(oprot);
      }
      if (struct.isSetIsCumulative()) {
        oprot.writeBool(struct.isCumulative);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EventSource struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.table = iprot.readString();
        struct.setTableIsSet(true);
      }
      if (incoming.get(1)) {
        struct.topic = iprot.readString();
        struct.setTopicIsSet(true);
      }
      if (incoming.get(2)) {
        struct.query = new Query();
        struct.query.read(iprot);
        struct.setQueryIsSet(true);
      }
      if (incoming.get(3)) {
        struct.isCumulative = iprot.readBool();
        struct.setIsCumulativeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
