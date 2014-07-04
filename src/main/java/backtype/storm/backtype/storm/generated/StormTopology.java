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

public class StormTopology implements org.apache.thrift.TBase<StormTopology, StormTopology._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StormTopology");

  private static final org.apache.thrift.protocol.TField SPOUTS_FIELD_DESC = new org.apache.thrift.protocol.TField("spouts", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField BOLTS_FIELD_DESC = new org.apache.thrift.protocol.TField("bolts", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField STATE_SPOUTS_FIELD_DESC = new org.apache.thrift.protocol.TField("state_spouts", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StormTopologyStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StormTopologyTupleSchemeFactory());
  }

  public Map<String,SpoutSpec> spouts; // required
  public Map<String,Bolt> bolts; // required
  public Map<String,StateSpoutSpec> state_spouts; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SPOUTS((short)1, "spouts"),
    BOLTS((short)2, "bolts"),
    STATE_SPOUTS((short)3, "state_spouts");

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
        case 1: // SPOUTS
          return SPOUTS;
        case 2: // BOLTS
          return BOLTS;
        case 3: // STATE_SPOUTS
          return STATE_SPOUTS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SPOUTS, new org.apache.thrift.meta_data.FieldMetaData("spouts", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SpoutSpec.class))));
    tmpMap.put(_Fields.BOLTS, new org.apache.thrift.meta_data.FieldMetaData("bolts", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Bolt.class))));
    tmpMap.put(_Fields.STATE_SPOUTS, new org.apache.thrift.meta_data.FieldMetaData("state_spouts", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StateSpoutSpec.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StormTopology.class, metaDataMap);
  }

  public StormTopology() {
  }

  public StormTopology(
    Map<String,SpoutSpec> spouts,
    Map<String,Bolt> bolts,
    Map<String,StateSpoutSpec> state_spouts)
  {
    this();
    this.spouts = spouts;
    this.bolts = bolts;
    this.state_spouts = state_spouts;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StormTopology(StormTopology other) {
    if (other.isSetSpouts()) {
      Map<String,SpoutSpec> __this__spouts = new HashMap<String,SpoutSpec>();
      for (Map.Entry<String, SpoutSpec> other_element : other.spouts.entrySet()) {

        String other_element_key = other_element.getKey();
        SpoutSpec other_element_value = other_element.getValue();

        String __this__spouts_copy_key = other_element_key;

        SpoutSpec __this__spouts_copy_value = new SpoutSpec(other_element_value);

        __this__spouts.put(__this__spouts_copy_key, __this__spouts_copy_value);
      }
      this.spouts = __this__spouts;
    }
    if (other.isSetBolts()) {
      Map<String,Bolt> __this__bolts = new HashMap<String,Bolt>();
      for (Map.Entry<String, Bolt> other_element : other.bolts.entrySet()) {

        String other_element_key = other_element.getKey();
        Bolt other_element_value = other_element.getValue();

        String __this__bolts_copy_key = other_element_key;

        Bolt __this__bolts_copy_value = new Bolt(other_element_value);

        __this__bolts.put(__this__bolts_copy_key, __this__bolts_copy_value);
      }
      this.bolts = __this__bolts;
    }
    if (other.isSetState_spouts()) {
      Map<String,StateSpoutSpec> __this__state_spouts = new HashMap<String,StateSpoutSpec>();
      for (Map.Entry<String, StateSpoutSpec> other_element : other.state_spouts.entrySet()) {

        String other_element_key = other_element.getKey();
        StateSpoutSpec other_element_value = other_element.getValue();

        String __this__state_spouts_copy_key = other_element_key;

        StateSpoutSpec __this__state_spouts_copy_value = new StateSpoutSpec(other_element_value);

        __this__state_spouts.put(__this__state_spouts_copy_key, __this__state_spouts_copy_value);
      }
      this.state_spouts = __this__state_spouts;
    }
  }

  public StormTopology deepCopy() {
    return new StormTopology(this);
  }

  @Override
  public void clear() {
    this.spouts = null;
    this.bolts = null;
    this.state_spouts = null;
  }

  public int getSpoutsSize() {
    return (this.spouts == null) ? 0 : this.spouts.size();
  }

  public void putToSpouts(String key, SpoutSpec val) {
    if (this.spouts == null) {
      this.spouts = new HashMap<String,SpoutSpec>();
    }
    this.spouts.put(key, val);
  }

  public Map<String,SpoutSpec> getSpouts() {
    return this.spouts;
  }

  public StormTopology setSpouts(Map<String,SpoutSpec> spouts) {
    this.spouts = spouts;
    return this;
  }

  public void unsetSpouts() {
    this.spouts = null;
  }

  /** Returns true if field spouts is set (has been assigned a value) and false otherwise */
  public boolean isSetSpouts() {
    return this.spouts != null;
  }

  public void setSpoutsIsSet(boolean value) {
    if (!value) {
      this.spouts = null;
    }
  }

  public int getBoltsSize() {
    return (this.bolts == null) ? 0 : this.bolts.size();
  }

  public void putToBolts(String key, Bolt val) {
    if (this.bolts == null) {
      this.bolts = new HashMap<String,Bolt>();
    }
    this.bolts.put(key, val);
  }

  public Map<String,Bolt> getBolts() {
    return this.bolts;
  }

  public StormTopology setBolts(Map<String,Bolt> bolts) {
    this.bolts = bolts;
    return this;
  }

  public void unsetBolts() {
    this.bolts = null;
  }

  /** Returns true if field bolts is set (has been assigned a value) and false otherwise */
  public boolean isSetBolts() {
    return this.bolts != null;
  }

  public void setBoltsIsSet(boolean value) {
    if (!value) {
      this.bolts = null;
    }
  }

  public int getState_spoutsSize() {
    return (this.state_spouts == null) ? 0 : this.state_spouts.size();
  }

  public void putToState_spouts(String key, StateSpoutSpec val) {
    if (this.state_spouts == null) {
      this.state_spouts = new HashMap<String,StateSpoutSpec>();
    }
    this.state_spouts.put(key, val);
  }

  public Map<String,StateSpoutSpec> getState_spouts() {
    return this.state_spouts;
  }

  public StormTopology setState_spouts(Map<String,StateSpoutSpec> state_spouts) {
    this.state_spouts = state_spouts;
    return this;
  }

  public void unsetState_spouts() {
    this.state_spouts = null;
  }

  /** Returns true if field state_spouts is set (has been assigned a value) and false otherwise */
  public boolean isSetState_spouts() {
    return this.state_spouts != null;
  }

  public void setState_spoutsIsSet(boolean value) {
    if (!value) {
      this.state_spouts = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SPOUTS:
      if (value == null) {
        unsetSpouts();
      } else {
        setSpouts((Map<String,SpoutSpec>)value);
      }
      break;

    case BOLTS:
      if (value == null) {
        unsetBolts();
      } else {
        setBolts((Map<String,Bolt>)value);
      }
      break;

    case STATE_SPOUTS:
      if (value == null) {
        unsetState_spouts();
      } else {
        setState_spouts((Map<String,StateSpoutSpec>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SPOUTS:
      return getSpouts();

    case BOLTS:
      return getBolts();

    case STATE_SPOUTS:
      return getState_spouts();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SPOUTS:
      return isSetSpouts();
    case BOLTS:
      return isSetBolts();
    case STATE_SPOUTS:
      return isSetState_spouts();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StormTopology)
      return this.equals((StormTopology)that);
    return false;
  }

  public boolean equals(StormTopology that) {
    if (that == null)
      return false;

    boolean this_present_spouts = true && this.isSetSpouts();
    boolean that_present_spouts = true && that.isSetSpouts();
    if (this_present_spouts || that_present_spouts) {
      if (!(this_present_spouts && that_present_spouts))
        return false;
      if (!this.spouts.equals(that.spouts))
        return false;
    }

    boolean this_present_bolts = true && this.isSetBolts();
    boolean that_present_bolts = true && that.isSetBolts();
    if (this_present_bolts || that_present_bolts) {
      if (!(this_present_bolts && that_present_bolts))
        return false;
      if (!this.bolts.equals(that.bolts))
        return false;
    }

    boolean this_present_state_spouts = true && this.isSetState_spouts();
    boolean that_present_state_spouts = true && that.isSetState_spouts();
    if (this_present_state_spouts || that_present_state_spouts) {
      if (!(this_present_state_spouts && that_present_state_spouts))
        return false;
      if (!this.state_spouts.equals(that.state_spouts))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(StormTopology other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    StormTopology typedOther = (StormTopology)other;

    lastComparison = Boolean.valueOf(isSetSpouts()).compareTo(typedOther.isSetSpouts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpouts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.spouts, typedOther.spouts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBolts()).compareTo(typedOther.isSetBolts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBolts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bolts, typedOther.bolts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetState_spouts()).compareTo(typedOther.isSetState_spouts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState_spouts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state_spouts, typedOther.state_spouts);
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
    StringBuilder sb = new StringBuilder("StormTopology(");
    boolean first = true;

    sb.append("spouts:");
    if (this.spouts == null) {
      sb.append("null");
    } else {
      sb.append(this.spouts);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("bolts:");
    if (this.bolts == null) {
      sb.append("null");
    } else {
      sb.append(this.bolts);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("state_spouts:");
    if (this.state_spouts == null) {
      sb.append("null");
    } else {
      sb.append(this.state_spouts);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (spouts == null) {
      throw new TProtocolException("Required field 'spouts' was not present! Struct: " + toString());
    }
    if (bolts == null) {
      throw new TProtocolException("Required field 'bolts' was not present! Struct: " + toString());
    }
    if (state_spouts == null) {
      throw new TProtocolException("Required field 'state_spouts' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StormTopologyStandardSchemeFactory implements SchemeFactory {
    public StormTopologyStandardScheme getScheme() {
      return new StormTopologyStandardScheme();
    }
  }

  private static class StormTopologyStandardScheme extends StandardScheme<StormTopology> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StormTopology struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SPOUTS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map44 = iprot.readMapBegin();
                struct.spouts = new HashMap<String,SpoutSpec>(2*_map44.size);
                for (int _i45 = 0; _i45 < _map44.size; ++_i45)
                {
                  String _key46; // required
                  SpoutSpec _val47; // required
                  _key46 = iprot.readString();
                  _val47 = new SpoutSpec();
                  _val47.read(iprot);
                  struct.spouts.put(_key46, _val47);
                }
                iprot.readMapEnd();
              }
              struct.setSpoutsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BOLTS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map48 = iprot.readMapBegin();
                struct.bolts = new HashMap<String,Bolt>(2*_map48.size);
                for (int _i49 = 0; _i49 < _map48.size; ++_i49)
                {
                  String _key50; // required
                  Bolt _val51; // required
                  _key50 = iprot.readString();
                  _val51 = new Bolt();
                  _val51.read(iprot);
                  struct.bolts.put(_key50, _val51);
                }
                iprot.readMapEnd();
              }
              struct.setBoltsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STATE_SPOUTS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map52 = iprot.readMapBegin();
                struct.state_spouts = new HashMap<String,StateSpoutSpec>(2*_map52.size);
                for (int _i53 = 0; _i53 < _map52.size; ++_i53)
                {
                  String _key54; // required
                  StateSpoutSpec _val55; // required
                  _key54 = iprot.readString();
                  _val55 = new StateSpoutSpec();
                  _val55.read(iprot);
                  struct.state_spouts.put(_key54, _val55);
                }
                iprot.readMapEnd();
              }
              struct.setState_spoutsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, StormTopology struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.spouts != null) {
        oprot.writeFieldBegin(SPOUTS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.spouts.size()));
          for (Map.Entry<String, SpoutSpec> _iter56 : struct.spouts.entrySet())
          {
            oprot.writeString(_iter56.getKey());
            _iter56.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.bolts != null) {
        oprot.writeFieldBegin(BOLTS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.bolts.size()));
          for (Map.Entry<String, Bolt> _iter57 : struct.bolts.entrySet())
          {
            oprot.writeString(_iter57.getKey());
            _iter57.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.state_spouts != null) {
        oprot.writeFieldBegin(STATE_SPOUTS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.state_spouts.size()));
          for (Map.Entry<String, StateSpoutSpec> _iter58 : struct.state_spouts.entrySet())
          {
            oprot.writeString(_iter58.getKey());
            _iter58.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StormTopologyTupleSchemeFactory implements SchemeFactory {
    public StormTopologyTupleScheme getScheme() {
      return new StormTopologyTupleScheme();
    }
  }

  private static class StormTopologyTupleScheme extends TupleScheme<StormTopology> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StormTopology struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.spouts.size());
        for (Map.Entry<String, SpoutSpec> _iter59 : struct.spouts.entrySet())
        {
          oprot.writeString(_iter59.getKey());
          _iter59.getValue().write(oprot);
        }
      }
      {
        oprot.writeI32(struct.bolts.size());
        for (Map.Entry<String, Bolt> _iter60 : struct.bolts.entrySet())
        {
          oprot.writeString(_iter60.getKey());
          _iter60.getValue().write(oprot);
        }
      }
      {
        oprot.writeI32(struct.state_spouts.size());
        for (Map.Entry<String, StateSpoutSpec> _iter61 : struct.state_spouts.entrySet())
        {
          oprot.writeString(_iter61.getKey());
          _iter61.getValue().write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StormTopology struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map62 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.spouts = new HashMap<String,SpoutSpec>(2*_map62.size);
        for (int _i63 = 0; _i63 < _map62.size; ++_i63)
        {
          String _key64; // required
          SpoutSpec _val65; // required
          _key64 = iprot.readString();
          _val65 = new SpoutSpec();
          _val65.read(iprot);
          struct.spouts.put(_key64, _val65);
        }
      }
      struct.setSpoutsIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map66 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.bolts = new HashMap<String,Bolt>(2*_map66.size);
        for (int _i67 = 0; _i67 < _map66.size; ++_i67)
        {
          String _key68; // required
          Bolt _val69; // required
          _key68 = iprot.readString();
          _val69 = new Bolt();
          _val69.read(iprot);
          struct.bolts.put(_key68, _val69);
        }
      }
      struct.setBoltsIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map70 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.state_spouts = new HashMap<String,StateSpoutSpec>(2*_map70.size);
        for (int _i71 = 0; _i71 < _map70.size; ++_i71)
        {
          String _key72; // required
          StateSpoutSpec _val73; // required
          _key72 = iprot.readString();
          _val73 = new StateSpoutSpec();
          _val73.read(iprot);
          struct.state_spouts.put(_key72, _val73);
        }
      }
      struct.setState_spoutsIsSet(true);
    }
  }

}

