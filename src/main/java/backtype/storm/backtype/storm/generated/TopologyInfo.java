/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.backtype.storm.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TopologyInfo implements org.apache.thrift.TBase<TopologyInfo, TopologyInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TopologyInfo");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField UPTIME_SECS_FIELD_DESC = new org.apache.thrift.protocol.TField("uptime_secs", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField EXECUTORS_FIELD_DESC = new org.apache.thrift.protocol.TField("executors", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField ERRORS_FIELD_DESC = new org.apache.thrift.protocol.TField("errors", org.apache.thrift.protocol.TType.MAP, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TopologyInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TopologyInfoTupleSchemeFactory());
  }

  public String id; // required
  public String name; // required
  public int uptime_secs; // required
  public List<ExecutorSummary> executors; // required
  public String status; // required
  public Map<String,List<ErrorInfo>> errors; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    NAME((short)2, "name"),
    UPTIME_SECS((short)3, "uptime_secs"),
    EXECUTORS((short)4, "executors"),
    STATUS((short)5, "status"),
    ERRORS((short)6, "errors");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // NAME
          return NAME;
        case 3: // UPTIME_SECS
          return UPTIME_SECS;
        case 4: // EXECUTORS
          return EXECUTORS;
        case 5: // STATUS
          return STATUS;
        case 6: // ERRORS
          return ERRORS;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __UPTIME_SECS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UPTIME_SECS, new org.apache.thrift.meta_data.FieldMetaData("uptime_secs", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.EXECUTORS, new org.apache.thrift.meta_data.FieldMetaData("executors", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ExecutorSummary.class))));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ERRORS, new org.apache.thrift.meta_data.FieldMetaData("errors", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ErrorInfo.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TopologyInfo.class, metaDataMap);
  }

  public TopologyInfo() {
  }

  public TopologyInfo(
    String id,
    String name,
    int uptime_secs,
    List<ExecutorSummary> executors,
    String status,
    Map<String,List<ErrorInfo>> errors)
  {
    this();
    this.id = id;
    this.name = name;
    this.uptime_secs = uptime_secs;
    setUptime_secsIsSet(true);
    this.executors = executors;
    this.status = status;
    this.errors = errors;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TopologyInfo(TopologyInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.uptime_secs = other.uptime_secs;
    if (other.isSetExecutors()) {
      List<ExecutorSummary> __this__executors = new ArrayList<ExecutorSummary>();
      for (ExecutorSummary other_element : other.executors) {
        __this__executors.add(new ExecutorSummary(other_element));
      }
      this.executors = __this__executors;
    }
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    if (other.isSetErrors()) {
      Map<String,List<ErrorInfo>> __this__errors = new HashMap<String,List<ErrorInfo>>();
      for (Map.Entry<String, List<ErrorInfo>> other_element : other.errors.entrySet()) {

        String other_element_key = other_element.getKey();
        List<ErrorInfo> other_element_value = other_element.getValue();

        String __this__errors_copy_key = other_element_key;

        List<ErrorInfo> __this__errors_copy_value = new ArrayList<ErrorInfo>();
        for (ErrorInfo other_element_value_element : other_element_value) {
          __this__errors_copy_value.add(new ErrorInfo(other_element_value_element));
        }

        __this__errors.put(__this__errors_copy_key, __this__errors_copy_value);
      }
      this.errors = __this__errors;
    }
  }

  public TopologyInfo deepCopy() {
    return new TopologyInfo(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.name = null;
    setUptime_secsIsSet(false);
    this.uptime_secs = 0;
    this.executors = null;
    this.status = null;
    this.errors = null;
  }

  public String getId() {
    return this.id;
  }

  public TopologyInfo setId(String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public TopologyInfo setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int getUptime_secs() {
    return this.uptime_secs;
  }

  public TopologyInfo setUptime_secs(int uptime_secs) {
    this.uptime_secs = uptime_secs;
    setUptime_secsIsSet(true);
    return this;
  }

  public void unsetUptime_secs() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UPTIME_SECS_ISSET_ID);
  }

  /** Returns true if field uptime_secs is set (has been assigned a value) and false otherwise */
  public boolean isSetUptime_secs() {
    return EncodingUtils.testBit(__isset_bitfield, __UPTIME_SECS_ISSET_ID);
  }

  public void setUptime_secsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UPTIME_SECS_ISSET_ID, value);
  }

  public int getExecutorsSize() {
    return (this.executors == null) ? 0 : this.executors.size();
  }

  public java.util.Iterator<ExecutorSummary> getExecutorsIterator() {
    return (this.executors == null) ? null : this.executors.iterator();
  }

  public void addToExecutors(ExecutorSummary elem) {
    if (this.executors == null) {
      this.executors = new ArrayList<ExecutorSummary>();
    }
    this.executors.add(elem);
  }

  public List<ExecutorSummary> getExecutors() {
    return this.executors;
  }

  public TopologyInfo setExecutors(List<ExecutorSummary> executors) {
    this.executors = executors;
    return this;
  }

  public void unsetExecutors() {
    this.executors = null;
  }

  /** Returns true if field executors is set (has been assigned a value) and false otherwise */
  public boolean isSetExecutors() {
    return this.executors != null;
  }

  public void setExecutorsIsSet(boolean value) {
    if (!value) {
      this.executors = null;
    }
  }

  public String getStatus() {
    return this.status;
  }

  public TopologyInfo setStatus(String status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public int getErrorsSize() {
    return (this.errors == null) ? 0 : this.errors.size();
  }

  public void putToErrors(String key, List<ErrorInfo> val) {
    if (this.errors == null) {
      this.errors = new HashMap<String,List<ErrorInfo>>();
    }
    this.errors.put(key, val);
  }

  public Map<String,List<ErrorInfo>> getErrors() {
    return this.errors;
  }

  public TopologyInfo setErrors(Map<String,List<ErrorInfo>> errors) {
    this.errors = errors;
    return this;
  }

  public void unsetErrors() {
    this.errors = null;
  }

  /** Returns true if field errors is set (has been assigned a value) and false otherwise */
  public boolean isSetErrors() {
    return this.errors != null;
  }

  public void setErrorsIsSet(boolean value) {
    if (!value) {
      this.errors = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case UPTIME_SECS:
      if (value == null) {
        unsetUptime_secs();
      } else {
        setUptime_secs((Integer)value);
      }
      break;

    case EXECUTORS:
      if (value == null) {
        unsetExecutors();
      } else {
        setExecutors((List<ExecutorSummary>)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((String)value);
      }
      break;

    case ERRORS:
      if (value == null) {
        unsetErrors();
      } else {
        setErrors((Map<String,List<ErrorInfo>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case NAME:
      return getName();

    case UPTIME_SECS:
      return Integer.valueOf(getUptime_secs());

    case EXECUTORS:
      return getExecutors();

    case STATUS:
      return getStatus();

    case ERRORS:
      return getErrors();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case NAME:
      return isSetName();
    case UPTIME_SECS:
      return isSetUptime_secs();
    case EXECUTORS:
      return isSetExecutors();
    case STATUS:
      return isSetStatus();
    case ERRORS:
      return isSetErrors();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TopologyInfo)
      return this.equals((TopologyInfo)that);
    return false;
  }

  public boolean equals(TopologyInfo that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_uptime_secs = true;
    boolean that_present_uptime_secs = true;
    if (this_present_uptime_secs || that_present_uptime_secs) {
      if (!(this_present_uptime_secs && that_present_uptime_secs))
        return false;
      if (this.uptime_secs != that.uptime_secs)
        return false;
    }

    boolean this_present_executors = true && this.isSetExecutors();
    boolean that_present_executors = true && that.isSetExecutors();
    if (this_present_executors || that_present_executors) {
      if (!(this_present_executors && that_present_executors))
        return false;
      if (!this.executors.equals(that.executors))
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_errors = true && this.isSetErrors();
    boolean that_present_errors = true && that.isSetErrors();
    if (this_present_errors || that_present_errors) {
      if (!(this_present_errors && that_present_errors))
        return false;
      if (!this.errors.equals(that.errors))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TopologyInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TopologyInfo typedOther = (TopologyInfo)other;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUptime_secs()).compareTo(typedOther.isSetUptime_secs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUptime_secs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uptime_secs, typedOther.uptime_secs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExecutors()).compareTo(typedOther.isSetExecutors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExecutors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.executors, typedOther.executors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(typedOther.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, typedOther.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetErrors()).compareTo(typedOther.isSetErrors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errors, typedOther.errors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TopologyInfo(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("uptime_secs:");
    sb.append(this.uptime_secs);
    first = false;
    if (!first) sb.append(", ");
    sb.append("executors:");
    if (this.executors == null) {
      sb.append("null");
    } else {
      sb.append(this.executors);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("errors:");
    if (this.errors == null) {
      sb.append("null");
    } else {
      sb.append(this.errors);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (id == null) {
      throw new TProtocolException("Required field 'id' was not present! Struct: " + toString());
    }
    if (name == null) {
      throw new TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'uptime_secs' because it's a primitive and you chose the non-beans generator.
    if (executors == null) {
      throw new TProtocolException("Required field 'executors' was not present! Struct: " + toString());
    }
    if (status == null) {
      throw new TProtocolException("Required field 'status' was not present! Struct: " + toString());
    }
    if (errors == null) {
      throw new TProtocolException("Required field 'errors' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TopologyInfoStandardSchemeFactory implements SchemeFactory {
    public TopologyInfoStandardScheme getScheme() {
      return new TopologyInfoStandardScheme();
    }
  }

  private static class TopologyInfoStandardScheme extends StandardScheme<TopologyInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TopologyInfo struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UPTIME_SECS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.uptime_secs = iprot.readI32();
              struct.setUptime_secsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EXECUTORS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list290 = iprot.readListBegin();
                struct.executors = new ArrayList<ExecutorSummary>(_list290.size);
                for (int _i291 = 0; _i291 < _list290.size; ++_i291)
                {
                  ExecutorSummary _elem292; // required
                  _elem292 = new ExecutorSummary();
                  _elem292.read(iprot);
                  struct.executors.add(_elem292);
                }
                iprot.readListEnd();
              }
              struct.setExecutorsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.status = iprot.readString();
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ERRORS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map293 = iprot.readMapBegin();
                struct.errors = new HashMap<String,List<ErrorInfo>>(2*_map293.size);
                for (int _i294 = 0; _i294 < _map293.size; ++_i294)
                {
                  String _key295; // required
                  List<ErrorInfo> _val296; // required
                  _key295 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TList _list297 = iprot.readListBegin();
                    _val296 = new ArrayList<ErrorInfo>(_list297.size);
                    for (int _i298 = 0; _i298 < _list297.size; ++_i298)
                    {
                      ErrorInfo _elem299; // required
                      _elem299 = new ErrorInfo();
                      _elem299.read(iprot);
                      _val296.add(_elem299);
                    }
                    iprot.readListEnd();
                  }
                  struct.errors.put(_key295, _val296);
                }
                iprot.readMapEnd();
              }
              struct.setErrorsIsSet(true);
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
      if (!struct.isSetUptime_secs()) {
        throw new TProtocolException("Required field 'uptime_secs' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TopologyInfo struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(UPTIME_SECS_FIELD_DESC);
      oprot.writeI32(struct.uptime_secs);
      oprot.writeFieldEnd();
      if (struct.executors != null) {
        oprot.writeFieldBegin(EXECUTORS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.executors.size()));
          for (ExecutorSummary _iter300 : struct.executors)
          {
            _iter300.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeString(struct.status);
        oprot.writeFieldEnd();
      }
      if (struct.errors != null) {
        oprot.writeFieldBegin(ERRORS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, struct.errors.size()));
          for (Map.Entry<String, List<ErrorInfo>> _iter301 : struct.errors.entrySet())
          {
            oprot.writeString(_iter301.getKey());
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter301.getValue().size()));
              for (ErrorInfo _iter302 : _iter301.getValue())
              {
                _iter302.write(oprot);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TopologyInfoTupleSchemeFactory implements SchemeFactory {
    public TopologyInfoTupleScheme getScheme() {
      return new TopologyInfoTupleScheme();
    }
  }

  private static class TopologyInfoTupleScheme extends TupleScheme<TopologyInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TopologyInfo struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.id);
      oprot.writeString(struct.name);
      oprot.writeI32(struct.uptime_secs);
      {
        oprot.writeI32(struct.executors.size());
        for (ExecutorSummary _iter303 : struct.executors)
        {
          _iter303.write(oprot);
        }
      }
      oprot.writeString(struct.status);
      {
        oprot.writeI32(struct.errors.size());
        for (Map.Entry<String, List<ErrorInfo>> _iter304 : struct.errors.entrySet())
        {
          oprot.writeString(_iter304.getKey());
          {
            oprot.writeI32(_iter304.getValue().size());
            for (ErrorInfo _iter305 : _iter304.getValue())
            {
              _iter305.write(oprot);
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TopologyInfo struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.id = iprot.readString();
      struct.setIdIsSet(true);
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      struct.uptime_secs = iprot.readI32();
      struct.setUptime_secsIsSet(true);
      {
        org.apache.thrift.protocol.TList _list306 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.executors = new ArrayList<ExecutorSummary>(_list306.size);
        for (int _i307 = 0; _i307 < _list306.size; ++_i307)
        {
          ExecutorSummary _elem308; // required
          _elem308 = new ExecutorSummary();
          _elem308.read(iprot);
          struct.executors.add(_elem308);
        }
      }
      struct.setExecutorsIsSet(true);
      struct.status = iprot.readString();
      struct.setStatusIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map309 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, iprot.readI32());
        struct.errors = new HashMap<String,List<ErrorInfo>>(2*_map309.size);
        for (int _i310 = 0; _i310 < _map309.size; ++_i310)
        {
          String _key311; // required
          List<ErrorInfo> _val312; // required
          _key311 = iprot.readString();
          {
            org.apache.thrift.protocol.TList _list313 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
            _val312 = new ArrayList<ErrorInfo>(_list313.size);
            for (int _i314 = 0; _i314 < _list313.size; ++_i314)
            {
              ErrorInfo _elem315; // required
              _elem315 = new ErrorInfo();
              _elem315.read(iprot);
              _val312.add(_elem315);
            }
          }
          struct.errors.put(_key311, _val312);
        }
      }
      struct.setErrorsIsSet(true);
    }
  }

}

