/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ai.chronon.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2024-12-31")
public class LabelPart implements org.apache.thrift.TBase<LabelPart, LabelPart._Fields>, java.io.Serializable, Cloneable, Comparable<LabelPart> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LabelPart");

  private static final org.apache.thrift.protocol.TField LABELS_FIELD_DESC = new org.apache.thrift.protocol.TField("labels", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField LEFT_START_OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("leftStartOffset", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField LEFT_END_OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("leftEndOffset", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField META_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("metaData", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new LabelPartStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new LabelPartTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<JoinPart> labels; // optional
  public int leftStartOffset; // optional
  public int leftEndOffset; // optional
  public @org.apache.thrift.annotation.Nullable MetaData metaData; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LABELS((short)1, "labels"),
    LEFT_START_OFFSET((short)2, "leftStartOffset"),
    LEFT_END_OFFSET((short)3, "leftEndOffset"),
    META_DATA((short)4, "metaData");

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
        case 1: // LABELS
          return LABELS;
        case 2: // LEFT_START_OFFSET
          return LEFT_START_OFFSET;
        case 3: // LEFT_END_OFFSET
          return LEFT_END_OFFSET;
        case 4: // META_DATA
          return META_DATA;
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
  private static final int __LEFTSTARTOFFSET_ISSET_ID = 0;
  private static final int __LEFTENDOFFSET_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.LABELS,_Fields.LEFT_START_OFFSET,_Fields.LEFT_END_OFFSET,_Fields.META_DATA};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LABELS, new org.apache.thrift.meta_data.FieldMetaData("labels", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, JoinPart.class))));
    tmpMap.put(_Fields.LEFT_START_OFFSET, new org.apache.thrift.meta_data.FieldMetaData("leftStartOffset", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LEFT_END_OFFSET, new org.apache.thrift.meta_data.FieldMetaData("leftEndOffset", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.META_DATA, new org.apache.thrift.meta_data.FieldMetaData("metaData", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MetaData.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LabelPart.class, metaDataMap);
  }

  public LabelPart() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LabelPart(LabelPart other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetLabels()) {
      java.util.List<JoinPart> __this__labels = new java.util.ArrayList<JoinPart>(other.labels.size());
      for (JoinPart other_element : other.labels) {
        __this__labels.add(new JoinPart(other_element));
      }
      this.labels = __this__labels;
    }
    this.leftStartOffset = other.leftStartOffset;
    this.leftEndOffset = other.leftEndOffset;
    if (other.isSetMetaData()) {
      this.metaData = new MetaData(other.metaData);
    }
  }

  public LabelPart deepCopy() {
    return new LabelPart(this);
  }

  @Override
  public void clear() {
    this.labels = null;
    setLeftStartOffsetIsSet(false);
    this.leftStartOffset = 0;
    setLeftEndOffsetIsSet(false);
    this.leftEndOffset = 0;
    this.metaData = null;
  }

  public int getLabelsSize() {
    return (this.labels == null) ? 0 : this.labels.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<JoinPart> getLabelsIterator() {
    return (this.labels == null) ? null : this.labels.iterator();
  }

  public void addToLabels(JoinPart elem) {
    if (this.labels == null) {
      this.labels = new java.util.ArrayList<JoinPart>();
    }
    this.labels.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<JoinPart> getLabels() {
    return this.labels;
  }

  public LabelPart setLabels(@org.apache.thrift.annotation.Nullable java.util.List<JoinPart> labels) {
    this.labels = labels;
    return this;
  }

  public void unsetLabels() {
    this.labels = null;
  }

  /** Returns true if field labels is set (has been assigned a value) and false otherwise */
  public boolean isSetLabels() {
    return this.labels != null;
  }

  public void setLabelsIsSet(boolean value) {
    if (!value) {
      this.labels = null;
    }
  }

  public int getLeftStartOffset() {
    return this.leftStartOffset;
  }

  public LabelPart setLeftStartOffset(int leftStartOffset) {
    this.leftStartOffset = leftStartOffset;
    setLeftStartOffsetIsSet(true);
    return this;
  }

  public void unsetLeftStartOffset() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LEFTSTARTOFFSET_ISSET_ID);
  }

  /** Returns true if field leftStartOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetLeftStartOffset() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LEFTSTARTOFFSET_ISSET_ID);
  }

  public void setLeftStartOffsetIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LEFTSTARTOFFSET_ISSET_ID, value);
  }

  public int getLeftEndOffset() {
    return this.leftEndOffset;
  }

  public LabelPart setLeftEndOffset(int leftEndOffset) {
    this.leftEndOffset = leftEndOffset;
    setLeftEndOffsetIsSet(true);
    return this;
  }

  public void unsetLeftEndOffset() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LEFTENDOFFSET_ISSET_ID);
  }

  /** Returns true if field leftEndOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetLeftEndOffset() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LEFTENDOFFSET_ISSET_ID);
  }

  public void setLeftEndOffsetIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LEFTENDOFFSET_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public MetaData getMetaData() {
    return this.metaData;
  }

  public LabelPart setMetaData(@org.apache.thrift.annotation.Nullable MetaData metaData) {
    this.metaData = metaData;
    return this;
  }

  public void unsetMetaData() {
    this.metaData = null;
  }

  /** Returns true if field metaData is set (has been assigned a value) and false otherwise */
  public boolean isSetMetaData() {
    return this.metaData != null;
  }

  public void setMetaDataIsSet(boolean value) {
    if (!value) {
      this.metaData = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case LABELS:
      if (value == null) {
        unsetLabels();
      } else {
        setLabels((java.util.List<JoinPart>)value);
      }
      break;

    case LEFT_START_OFFSET:
      if (value == null) {
        unsetLeftStartOffset();
      } else {
        setLeftStartOffset((java.lang.Integer)value);
      }
      break;

    case LEFT_END_OFFSET:
      if (value == null) {
        unsetLeftEndOffset();
      } else {
        setLeftEndOffset((java.lang.Integer)value);
      }
      break;

    case META_DATA:
      if (value == null) {
        unsetMetaData();
      } else {
        setMetaData((MetaData)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case LABELS:
      return getLabels();

    case LEFT_START_OFFSET:
      return getLeftStartOffset();

    case LEFT_END_OFFSET:
      return getLeftEndOffset();

    case META_DATA:
      return getMetaData();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case LABELS:
      return isSetLabels();
    case LEFT_START_OFFSET:
      return isSetLeftStartOffset();
    case LEFT_END_OFFSET:
      return isSetLeftEndOffset();
    case META_DATA:
      return isSetMetaData();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof LabelPart)
      return this.equals((LabelPart)that);
    return false;
  }

  public boolean equals(LabelPart that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_labels = true && this.isSetLabels();
    boolean that_present_labels = true && that.isSetLabels();
    if (this_present_labels || that_present_labels) {
      if (!(this_present_labels && that_present_labels))
        return false;
      if (!this.labels.equals(that.labels))
        return false;
    }

    boolean this_present_leftStartOffset = true && this.isSetLeftStartOffset();
    boolean that_present_leftStartOffset = true && that.isSetLeftStartOffset();
    if (this_present_leftStartOffset || that_present_leftStartOffset) {
      if (!(this_present_leftStartOffset && that_present_leftStartOffset))
        return false;
      if (this.leftStartOffset != that.leftStartOffset)
        return false;
    }

    boolean this_present_leftEndOffset = true && this.isSetLeftEndOffset();
    boolean that_present_leftEndOffset = true && that.isSetLeftEndOffset();
    if (this_present_leftEndOffset || that_present_leftEndOffset) {
      if (!(this_present_leftEndOffset && that_present_leftEndOffset))
        return false;
      if (this.leftEndOffset != that.leftEndOffset)
        return false;
    }

    boolean this_present_metaData = true && this.isSetMetaData();
    boolean that_present_metaData = true && that.isSetMetaData();
    if (this_present_metaData || that_present_metaData) {
      if (!(this_present_metaData && that_present_metaData))
        return false;
      if (!this.metaData.equals(that.metaData))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetLabels()) ? 131071 : 524287);
    if (isSetLabels())
      hashCode = hashCode * 8191 + labels.hashCode();

    hashCode = hashCode * 8191 + ((isSetLeftStartOffset()) ? 131071 : 524287);
    if (isSetLeftStartOffset())
      hashCode = hashCode * 8191 + leftStartOffset;

    hashCode = hashCode * 8191 + ((isSetLeftEndOffset()) ? 131071 : 524287);
    if (isSetLeftEndOffset())
      hashCode = hashCode * 8191 + leftEndOffset;

    hashCode = hashCode * 8191 + ((isSetMetaData()) ? 131071 : 524287);
    if (isSetMetaData())
      hashCode = hashCode * 8191 + metaData.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(LabelPart other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetLabels()).compareTo(other.isSetLabels());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLabels()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.labels, other.labels);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLeftStartOffset()).compareTo(other.isSetLeftStartOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLeftStartOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.leftStartOffset, other.leftStartOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLeftEndOffset()).compareTo(other.isSetLeftEndOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLeftEndOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.leftEndOffset, other.leftEndOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMetaData()).compareTo(other.isSetMetaData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetaData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metaData, other.metaData);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("LabelPart(");
    boolean first = true;

    if (isSetLabels()) {
      sb.append("labels:");
      if (this.labels == null) {
        sb.append("null");
      } else {
        sb.append(this.labels);
      }
      first = false;
    }
    if (isSetLeftStartOffset()) {
      if (!first) sb.append(", ");
      sb.append("leftStartOffset:");
      sb.append(this.leftStartOffset);
      first = false;
    }
    if (isSetLeftEndOffset()) {
      if (!first) sb.append(", ");
      sb.append("leftEndOffset:");
      sb.append(this.leftEndOffset);
      first = false;
    }
    if (isSetMetaData()) {
      if (!first) sb.append(", ");
      sb.append("metaData:");
      if (this.metaData == null) {
        sb.append("null");
      } else {
        sb.append(this.metaData);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (metaData != null) {
      metaData.validate();
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

  private static class LabelPartStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LabelPartStandardScheme getScheme() {
      return new LabelPartStandardScheme();
    }
  }

  private static class LabelPartStandardScheme extends org.apache.thrift.scheme.StandardScheme<LabelPart> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LabelPart struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LABELS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list226 = iprot.readListBegin();
                struct.labels = new java.util.ArrayList<JoinPart>(_list226.size);
                @org.apache.thrift.annotation.Nullable JoinPart _elem227;
                for (int _i228 = 0; _i228 < _list226.size; ++_i228)
                {
                  _elem227 = new JoinPart();
                  _elem227.read(iprot);
                  struct.labels.add(_elem227);
                }
                iprot.readListEnd();
              }
              struct.setLabelsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LEFT_START_OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.leftStartOffset = iprot.readI32();
              struct.setLeftStartOffsetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LEFT_END_OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.leftEndOffset = iprot.readI32();
              struct.setLeftEndOffsetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // META_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.metaData = new MetaData();
              struct.metaData.read(iprot);
              struct.setMetaDataIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, LabelPart struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.labels != null) {
        if (struct.isSetLabels()) {
          oprot.writeFieldBegin(LABELS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.labels.size()));
            for (JoinPart _iter229 : struct.labels)
            {
              _iter229.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetLeftStartOffset()) {
        oprot.writeFieldBegin(LEFT_START_OFFSET_FIELD_DESC);
        oprot.writeI32(struct.leftStartOffset);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLeftEndOffset()) {
        oprot.writeFieldBegin(LEFT_END_OFFSET_FIELD_DESC);
        oprot.writeI32(struct.leftEndOffset);
        oprot.writeFieldEnd();
      }
      if (struct.metaData != null) {
        if (struct.isSetMetaData()) {
          oprot.writeFieldBegin(META_DATA_FIELD_DESC);
          struct.metaData.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LabelPartTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LabelPartTupleScheme getScheme() {
      return new LabelPartTupleScheme();
    }
  }

  private static class LabelPartTupleScheme extends org.apache.thrift.scheme.TupleScheme<LabelPart> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LabelPart struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetLabels()) {
        optionals.set(0);
      }
      if (struct.isSetLeftStartOffset()) {
        optionals.set(1);
      }
      if (struct.isSetLeftEndOffset()) {
        optionals.set(2);
      }
      if (struct.isSetMetaData()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetLabels()) {
        {
          oprot.writeI32(struct.labels.size());
          for (JoinPart _iter230 : struct.labels)
          {
            _iter230.write(oprot);
          }
        }
      }
      if (struct.isSetLeftStartOffset()) {
        oprot.writeI32(struct.leftStartOffset);
      }
      if (struct.isSetLeftEndOffset()) {
        oprot.writeI32(struct.leftEndOffset);
      }
      if (struct.isSetMetaData()) {
        struct.metaData.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LabelPart struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list231 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.labels = new java.util.ArrayList<JoinPart>(_list231.size);
          @org.apache.thrift.annotation.Nullable JoinPart _elem232;
          for (int _i233 = 0; _i233 < _list231.size; ++_i233)
          {
            _elem232 = new JoinPart();
            _elem232.read(iprot);
            struct.labels.add(_elem232);
          }
        }
        struct.setLabelsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.leftStartOffset = iprot.readI32();
        struct.setLeftStartOffsetIsSet(true);
      }
      if (incoming.get(2)) {
        struct.leftEndOffset = iprot.readI32();
        struct.setLeftEndOffsetIsSet(true);
      }
      if (incoming.get(3)) {
        struct.metaData = new MetaData();
        struct.metaData.read(iprot);
        struct.setMetaDataIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
