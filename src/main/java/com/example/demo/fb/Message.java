package com.example.demo.fb;// automatically generated by the FlatBuffers compiler, do not modify

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Message extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static Message getRootAsMessage(ByteBuffer _bb) { return getRootAsMessage(_bb, new Message()); }
  public static Message getRootAsMessage(ByteBuffer _bb, Message obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Message __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public byte payloadType() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public Table payload(Table obj) { int o = __offset(6); return o != 0 ? __union(obj, o + bb_pos) : null; }

  public static int createMessage(FlatBufferBuilder builder,
      byte payload_type,
      int payloadOffset) {
    builder.startTable(2);
    Message.addPayload(builder, payloadOffset);
    Message.addPayloadType(builder, payload_type);
    return Message.endMessage(builder);
  }

  public static void startMessage(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addPayloadType(FlatBufferBuilder builder, byte payloadType) { builder.addByte(0, payloadType, 0); }
  public static void addPayload(FlatBufferBuilder builder, int payloadOffset) { builder.addOffset(1, payloadOffset, 0); }
  public static int endMessage(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishMessageBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedMessageBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Message get(int j) { return get(new Message(), j); }
    public Message get(Message obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
