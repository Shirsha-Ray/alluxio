/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package alluxio.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class RegisterMasterTOptions implements org.apache.thrift.TBase<RegisterMasterTOptions, RegisterMasterTOptions._Fields>, java.io.Serializable, Cloneable, Comparable<RegisterMasterTOptions> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RegisterMasterTOptions");

  private static final org.apache.thrift.protocol.TField CONFIG_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("configList", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RegisterMasterTOptionsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RegisterMasterTOptionsTupleSchemeFactory());
  }

  private List<alluxio.thrift.ConfigProperty> configList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CONFIG_LIST((short)1, "configList");

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
        case 1: // CONFIG_LIST
          return CONFIG_LIST;
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
    tmpMap.put(_Fields.CONFIG_LIST, new org.apache.thrift.meta_data.FieldMetaData("configList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, alluxio.thrift.ConfigProperty.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RegisterMasterTOptions.class, metaDataMap);
  }

  public RegisterMasterTOptions() {
  }

  public RegisterMasterTOptions(
    List<alluxio.thrift.ConfigProperty> configList)
  {
    this();
    this.configList = configList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RegisterMasterTOptions(RegisterMasterTOptions other) {
    if (other.isSetConfigList()) {
      List<alluxio.thrift.ConfigProperty> __this__configList = new ArrayList<alluxio.thrift.ConfigProperty>(other.configList.size());
      for (alluxio.thrift.ConfigProperty other_element : other.configList) {
        __this__configList.add(new alluxio.thrift.ConfigProperty(other_element));
      }
      this.configList = __this__configList;
    }
  }

  public RegisterMasterTOptions deepCopy() {
    return new RegisterMasterTOptions(this);
  }

  @Override
  public void clear() {
    this.configList = null;
  }

  public int getConfigListSize() {
    return (this.configList == null) ? 0 : this.configList.size();
  }

  public java.util.Iterator<alluxio.thrift.ConfigProperty> getConfigListIterator() {
    return (this.configList == null) ? null : this.configList.iterator();
  }

  public void addToConfigList(alluxio.thrift.ConfigProperty elem) {
    if (this.configList == null) {
      this.configList = new ArrayList<alluxio.thrift.ConfigProperty>();
    }
    this.configList.add(elem);
  }

  public List<alluxio.thrift.ConfigProperty> getConfigList() {
    return this.configList;
  }

  public RegisterMasterTOptions setConfigList(List<alluxio.thrift.ConfigProperty> configList) {
    this.configList = configList;
    return this;
  }

  public void unsetConfigList() {
    this.configList = null;
  }

  /** Returns true if field configList is set (has been assigned a value) and false otherwise */
  public boolean isSetConfigList() {
    return this.configList != null;
  }

  public void setConfigListIsSet(boolean value) {
    if (!value) {
      this.configList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CONFIG_LIST:
      if (value == null) {
        unsetConfigList();
      } else {
        setConfigList((List<alluxio.thrift.ConfigProperty>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CONFIG_LIST:
      return getConfigList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CONFIG_LIST:
      return isSetConfigList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RegisterMasterTOptions)
      return this.equals((RegisterMasterTOptions)that);
    return false;
  }

  public boolean equals(RegisterMasterTOptions that) {
    if (that == null)
      return false;

    boolean this_present_configList = true && this.isSetConfigList();
    boolean that_present_configList = true && that.isSetConfigList();
    if (this_present_configList || that_present_configList) {
      if (!(this_present_configList && that_present_configList))
        return false;
      if (!this.configList.equals(that.configList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_configList = true && (isSetConfigList());
    list.add(present_configList);
    if (present_configList)
      list.add(configList);

    return list.hashCode();
  }

  @Override
  public int compareTo(RegisterMasterTOptions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetConfigList()).compareTo(other.isSetConfigList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConfigList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.configList, other.configList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RegisterMasterTOptions(");
    boolean first = true;

    sb.append("configList:");
    if (this.configList == null) {
      sb.append("null");
    } else {
      sb.append(this.configList);
    }
    first = false;
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RegisterMasterTOptionsStandardSchemeFactory implements SchemeFactory {
    public RegisterMasterTOptionsStandardScheme getScheme() {
      return new RegisterMasterTOptionsStandardScheme();
    }
  }

  private static class RegisterMasterTOptionsStandardScheme extends StandardScheme<RegisterMasterTOptions> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RegisterMasterTOptions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONFIG_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list50 = iprot.readListBegin();
                struct.configList = new ArrayList<alluxio.thrift.ConfigProperty>(_list50.size);
                alluxio.thrift.ConfigProperty _elem51;
                for (int _i52 = 0; _i52 < _list50.size; ++_i52)
                {
                  _elem51 = new alluxio.thrift.ConfigProperty();
                  _elem51.read(iprot);
                  struct.configList.add(_elem51);
                }
                iprot.readListEnd();
              }
              struct.setConfigListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RegisterMasterTOptions struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.configList != null) {
        oprot.writeFieldBegin(CONFIG_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.configList.size()));
          for (alluxio.thrift.ConfigProperty _iter53 : struct.configList)
          {
            _iter53.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RegisterMasterTOptionsTupleSchemeFactory implements SchemeFactory {
    public RegisterMasterTOptionsTupleScheme getScheme() {
      return new RegisterMasterTOptionsTupleScheme();
    }
  }

  private static class RegisterMasterTOptionsTupleScheme extends TupleScheme<RegisterMasterTOptions> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RegisterMasterTOptions struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetConfigList()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetConfigList()) {
        {
          oprot.writeI32(struct.configList.size());
          for (alluxio.thrift.ConfigProperty _iter54 : struct.configList)
          {
            _iter54.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RegisterMasterTOptions struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list55 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.configList = new ArrayList<alluxio.thrift.ConfigProperty>(_list55.size);
          alluxio.thrift.ConfigProperty _elem56;
          for (int _i57 = 0; _i57 < _list55.size; ++_i57)
          {
            _elem56 = new alluxio.thrift.ConfigProperty();
            _elem56.read(iprot);
            struct.configList.add(_elem56);
          }
        }
        struct.setConfigListIsSet(true);
      }
    }
  }

}

