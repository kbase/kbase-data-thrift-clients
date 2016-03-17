/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
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
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-3-15")
public class TypeException extends TException implements org.apache.thrift.TBase<TypeException, TypeException._Fields>, java.io.Serializable, Cloneable, Comparable<TypeException> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TypeException");

  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField STACKTRACE_FIELD_DESC = new org.apache.thrift.protocol.TField("stacktrace", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField VALID_TYPES_FIELD_DESC = new org.apache.thrift.protocol.TField("valid_types", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TypeExceptionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TypeExceptionTupleSchemeFactory());
  }

  public String message; // required
  public String stacktrace; // optional
  public List<String> valid_types; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MESSAGE((short)1, "message"),
    STACKTRACE((short)2, "stacktrace"),
    VALID_TYPES((short)3, "valid_types");

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
        case 1: // MESSAGE
          return MESSAGE;
        case 2: // STACKTRACE
          return STACKTRACE;
        case 3: // VALID_TYPES
          return VALID_TYPES;
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
  private static final _Fields optionals[] = {_Fields.STACKTRACE,_Fields.VALID_TYPES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STACKTRACE, new org.apache.thrift.meta_data.FieldMetaData("stacktrace", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALID_TYPES, new org.apache.thrift.meta_data.FieldMetaData("valid_types", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TypeException.class, metaDataMap);
  }

  public TypeException() {
  }

  public TypeException(
    String message)
  {
    this();
    this.message = message;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TypeException(TypeException other) {
    if (other.isSetMessage()) {
      this.message = other.message;
    }
    if (other.isSetStacktrace()) {
      this.stacktrace = other.stacktrace;
    }
    if (other.isSetValid_types()) {
      List<String> __this__valid_types = new ArrayList<String>(other.valid_types);
      this.valid_types = __this__valid_types;
    }
  }

  public TypeException deepCopy() {
    return new TypeException(this);
  }

  @Override
  public void clear() {
    this.message = null;
    this.stacktrace = null;
    this.valid_types = null;
  }

  public String getMessage() {
    return this.message;
  }

  public TypeException setMessage(String message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public String getStacktrace() {
    return this.stacktrace;
  }

  public TypeException setStacktrace(String stacktrace) {
    this.stacktrace = stacktrace;
    return this;
  }

  public void unsetStacktrace() {
    this.stacktrace = null;
  }

  /** Returns true if field stacktrace is set (has been assigned a value) and false otherwise */
  public boolean isSetStacktrace() {
    return this.stacktrace != null;
  }

  public void setStacktraceIsSet(boolean value) {
    if (!value) {
      this.stacktrace = null;
    }
  }

  public int getValid_typesSize() {
    return (this.valid_types == null) ? 0 : this.valid_types.size();
  }

  public java.util.Iterator<String> getValid_typesIterator() {
    return (this.valid_types == null) ? null : this.valid_types.iterator();
  }

  public void addToValid_types(String elem) {
    if (this.valid_types == null) {
      this.valid_types = new ArrayList<String>();
    }
    this.valid_types.add(elem);
  }

  public List<String> getValid_types() {
    return this.valid_types;
  }

  public TypeException setValid_types(List<String> valid_types) {
    this.valid_types = valid_types;
    return this;
  }

  public void unsetValid_types() {
    this.valid_types = null;
  }

  /** Returns true if field valid_types is set (has been assigned a value) and false otherwise */
  public boolean isSetValid_types() {
    return this.valid_types != null;
  }

  public void setValid_typesIsSet(boolean value) {
    if (!value) {
      this.valid_types = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((String)value);
      }
      break;

    case STACKTRACE:
      if (value == null) {
        unsetStacktrace();
      } else {
        setStacktrace((String)value);
      }
      break;

    case VALID_TYPES:
      if (value == null) {
        unsetValid_types();
      } else {
        setValid_types((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MESSAGE:
      return getMessage();

    case STACKTRACE:
      return getStacktrace();

    case VALID_TYPES:
      return getValid_types();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MESSAGE:
      return isSetMessage();
    case STACKTRACE:
      return isSetStacktrace();
    case VALID_TYPES:
      return isSetValid_types();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TypeException)
      return this.equals((TypeException)that);
    return false;
  }

  public boolean equals(TypeException that) {
    if (that == null)
      return false;

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    boolean this_present_stacktrace = true && this.isSetStacktrace();
    boolean that_present_stacktrace = true && that.isSetStacktrace();
    if (this_present_stacktrace || that_present_stacktrace) {
      if (!(this_present_stacktrace && that_present_stacktrace))
        return false;
      if (!this.stacktrace.equals(that.stacktrace))
        return false;
    }

    boolean this_present_valid_types = true && this.isSetValid_types();
    boolean that_present_valid_types = true && that.isSetValid_types();
    if (this_present_valid_types || that_present_valid_types) {
      if (!(this_present_valid_types && that_present_valid_types))
        return false;
      if (!this.valid_types.equals(that.valid_types))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_message = true && (isSetMessage());
    list.add(present_message);
    if (present_message)
      list.add(message);

    boolean present_stacktrace = true && (isSetStacktrace());
    list.add(present_stacktrace);
    if (present_stacktrace)
      list.add(stacktrace);

    boolean present_valid_types = true && (isSetValid_types());
    list.add(present_valid_types);
    if (present_valid_types)
      list.add(valid_types);

    return list.hashCode();
  }

  @Override
  public int compareTo(TypeException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStacktrace()).compareTo(other.isSetStacktrace());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStacktrace()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stacktrace, other.stacktrace);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValid_types()).compareTo(other.isSetValid_types());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValid_types()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.valid_types, other.valid_types);
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
    StringBuilder sb = new StringBuilder("TypeException(");
    boolean first = true;

    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      sb.append(this.message);
    }
    first = false;
    if (isSetStacktrace()) {
      if (!first) sb.append(", ");
      sb.append("stacktrace:");
      if (this.stacktrace == null) {
        sb.append("null");
      } else {
        sb.append(this.stacktrace);
      }
      first = false;
    }
    if (isSetValid_types()) {
      if (!first) sb.append(", ");
      sb.append("valid_types:");
      if (this.valid_types == null) {
        sb.append("null");
      } else {
        sb.append(this.valid_types);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (message == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'message' was not present! Struct: " + toString());
    }
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

  private static class TypeExceptionStandardSchemeFactory implements SchemeFactory {
    public TypeExceptionStandardScheme getScheme() {
      return new TypeExceptionStandardScheme();
    }
  }

  private static class TypeExceptionStandardScheme extends StandardScheme<TypeException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TypeException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.message = iprot.readString();
              struct.setMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STACKTRACE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stacktrace = iprot.readString();
              struct.setStacktraceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VALID_TYPES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list68 = iprot.readListBegin();
                struct.valid_types = new ArrayList<String>(_list68.size);
                String _elem69;
                for (int _i70 = 0; _i70 < _list68.size; ++_i70)
                {
                  _elem69 = iprot.readString();
                  struct.valid_types.add(_elem69);
                }
                iprot.readListEnd();
              }
              struct.setValid_typesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TypeException struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.message != null) {
        oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
        oprot.writeString(struct.message);
        oprot.writeFieldEnd();
      }
      if (struct.stacktrace != null) {
        if (struct.isSetStacktrace()) {
          oprot.writeFieldBegin(STACKTRACE_FIELD_DESC);
          oprot.writeString(struct.stacktrace);
          oprot.writeFieldEnd();
        }
      }
      if (struct.valid_types != null) {
        if (struct.isSetValid_types()) {
          oprot.writeFieldBegin(VALID_TYPES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.valid_types.size()));
            for (String _iter71 : struct.valid_types)
            {
              oprot.writeString(_iter71);
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

  private static class TypeExceptionTupleSchemeFactory implements SchemeFactory {
    public TypeExceptionTupleScheme getScheme() {
      return new TypeExceptionTupleScheme();
    }
  }

  private static class TypeExceptionTupleScheme extends TupleScheme<TypeException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TypeException struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.message);
      BitSet optionals = new BitSet();
      if (struct.isSetStacktrace()) {
        optionals.set(0);
      }
      if (struct.isSetValid_types()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetStacktrace()) {
        oprot.writeString(struct.stacktrace);
      }
      if (struct.isSetValid_types()) {
        {
          oprot.writeI32(struct.valid_types.size());
          for (String _iter72 : struct.valid_types)
          {
            oprot.writeString(_iter72);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TypeException struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.message = iprot.readString();
      struct.setMessageIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.stacktrace = iprot.readString();
        struct.setStacktraceIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list73 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.valid_types = new ArrayList<String>(_list73.size);
          String _elem74;
          for (int _i75 = 0; _i75 < _list73.size; ++_i75)
          {
            _elem74 = iprot.readString();
            struct.valid_types.add(_elem74);
          }
        }
        struct.setValid_typesIsSet(true);
      }
    }
  }

}

