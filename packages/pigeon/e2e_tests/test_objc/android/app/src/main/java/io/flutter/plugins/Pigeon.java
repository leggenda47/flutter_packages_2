// Copyright 2013 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.
//
// Autogenerated from Pigeon (v4.0.2), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package dev.flutter.aaclarke.pigeon;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression"})
public class MessagePigeon {

  public enum MessageRequestState {
    PENDING(0),
    SUCCESS(1),
    FAILURE(2);

    private int index;

    private MessageRequestState(final int index) {
      this.index = index;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class MessageSearchRequest {
    private @Nullable String query;

    public @Nullable String getQuery() {
      return query;
    }

    public void setQuery(@Nullable String setterArg) {
      this.query = setterArg;
    }

    private @Nullable Long anInt;

    public @Nullable Long getAnInt() {
      return anInt;
    }

    public void setAnInt(@Nullable Long setterArg) {
      this.anInt = setterArg;
    }

    private @Nullable Boolean aBool;

    public @Nullable Boolean getABool() {
      return aBool;
    }

    public void setABool(@Nullable Boolean setterArg) {
      this.aBool = setterArg;
    }

    public static final class Builder {
      private @Nullable String query;

      public @NonNull Builder setQuery(@Nullable String setterArg) {
        this.query = setterArg;
        return this;
      }

      private @Nullable Long anInt;

      public @NonNull Builder setAnInt(@Nullable Long setterArg) {
        this.anInt = setterArg;
        return this;
      }

      private @Nullable Boolean aBool;

      public @NonNull Builder setABool(@Nullable Boolean setterArg) {
        this.aBool = setterArg;
        return this;
      }

      public @NonNull MessageSearchRequest build() {
        MessageSearchRequest pigeonReturn = new MessageSearchRequest();
        pigeonReturn.setQuery(query);
        pigeonReturn.setAnInt(anInt);
        pigeonReturn.setABool(aBool);
        return pigeonReturn;
      }
    }

    @NonNull
    Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("query", query);
      toMapResult.put("anInt", anInt);
      toMapResult.put("aBool", aBool);
      return toMapResult;
    }

    static @NonNull MessageSearchRequest fromMap(@NonNull Map<String, Object> map) {
      MessageSearchRequest pigeonResult = new MessageSearchRequest();
      Object query = map.get("query");
      pigeonResult.setQuery((String) query);
      Object anInt = map.get("anInt");
      pigeonResult.setAnInt(
          (anInt == null) ? null : ((anInt instanceof Integer) ? (Integer) anInt : (Long) anInt));
      Object aBool = map.get("aBool");
      pigeonResult.setABool((Boolean) aBool);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class MessageSearchReply {
    private @Nullable String result;

    public @Nullable String getResult() {
      return result;
    }

    public void setResult(@Nullable String setterArg) {
      this.result = setterArg;
    }

    private @Nullable String error;

    public @Nullable String getError() {
      return error;
    }

    public void setError(@Nullable String setterArg) {
      this.error = setterArg;
    }

    private @Nullable MessageRequestState state;

    public @Nullable MessageRequestState getState() {
      return state;
    }

    public void setState(@Nullable MessageRequestState setterArg) {
      this.state = setterArg;
    }

    public static final class Builder {
      private @Nullable String result;

      public @NonNull Builder setResult(@Nullable String setterArg) {
        this.result = setterArg;
        return this;
      }

      private @Nullable String error;

      public @NonNull Builder setError(@Nullable String setterArg) {
        this.error = setterArg;
        return this;
      }

      private @Nullable MessageRequestState state;

      public @NonNull Builder setState(@Nullable MessageRequestState setterArg) {
        this.state = setterArg;
        return this;
      }

      public @NonNull MessageSearchReply build() {
        MessageSearchReply pigeonReturn = new MessageSearchReply();
        pigeonReturn.setResult(result);
        pigeonReturn.setError(error);
        pigeonReturn.setState(state);
        return pigeonReturn;
      }
    }

    @NonNull
    Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("result", result);
      toMapResult.put("error", error);
      toMapResult.put("state", state == null ? null : state.index);
      return toMapResult;
    }

    static @NonNull MessageSearchReply fromMap(@NonNull Map<String, Object> map) {
      MessageSearchReply pigeonResult = new MessageSearchReply();
      Object result = map.get("result");
      pigeonResult.setResult((String) result);
      Object error = map.get("error");
      pigeonResult.setError((String) error);
      Object state = map.get("state");
      pigeonResult.setState(state == null ? null : MessageRequestState.values()[(int) state]);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class MessageNested {
    private @Nullable MessageSearchRequest request;

    public @Nullable MessageSearchRequest getRequest() {
      return request;
    }

    public void setRequest(@Nullable MessageSearchRequest setterArg) {
      this.request = setterArg;
    }

    public static final class Builder {
      private @Nullable MessageSearchRequest request;

      public @NonNull Builder setRequest(@Nullable MessageSearchRequest setterArg) {
        this.request = setterArg;
        return this;
      }

      public @NonNull MessageNested build() {
        MessageNested pigeonReturn = new MessageNested();
        pigeonReturn.setRequest(request);
        return pigeonReturn;
      }
    }

    @NonNull
    Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("request", (request == null) ? null : request.toMap());
      return toMapResult;
    }

    static @NonNull MessageNested fromMap(@NonNull Map<String, Object> map) {
      MessageNested pigeonResult = new MessageNested();
      Object request = map.get("request");
      pigeonResult.setRequest(
          (request == null) ? null : MessageSearchRequest.fromMap((Map) request));
      return pigeonResult;
    }
  }

  private static class MessageApiCodec extends StandardMessageCodec {
    public static final MessageApiCodec INSTANCE = new MessageApiCodec();

    private MessageApiCodec() {}

    @Override
    protected Object readValueOfType(byte type, ByteBuffer buffer) {
      switch (type) {
        case (byte) 128:
          return MessageSearchReply.fromMap((Map<String, Object>) readValue(buffer));

        case (byte) 129:
          return MessageSearchRequest.fromMap((Map<String, Object>) readValue(buffer));

        default:
          return super.readValueOfType(type, buffer);
      }
    }

    @Override
    protected void writeValue(ByteArrayOutputStream stream, Object value) {
      if (value instanceof MessageSearchReply) {
        stream.write(128);
        writeValue(stream, ((MessageSearchReply) value).toMap());
      } else if (value instanceof MessageSearchRequest) {
        stream.write(129);
        writeValue(stream, ((MessageSearchRequest) value).toMap());
      } else {
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter. */
  public interface MessageApi {
    void initialize();

    @NonNull
    MessageSearchReply search(@NonNull MessageSearchRequest request);

    /** The codec used by MessageApi. */
    static MessageCodec<Object> getCodec() {
      return MessageApiCodec.INSTANCE;
    }

    /** Sets up an instance of `MessageApi` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, MessageApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.MessageApi.initialize", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                Map<String, Object> wrapped = new HashMap<>();
                try {
                  api.initialize();
                  wrapped.put("result", null);
                } catch (Error | RuntimeException exception) {
                  wrapped.put("error", wrapError(exception));
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.MessageApi.search", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                Map<String, Object> wrapped = new HashMap<>();
                try {
                  ArrayList<Object> args = (ArrayList<Object>) message;
                  MessageSearchRequest requestArg = (MessageSearchRequest) args.get(0);
                  if (requestArg == null) {
                    throw new NullPointerException("requestArg unexpectedly null.");
                  }
                  MessageSearchReply output = api.search(requestArg);
                  wrapped.put("result", output);
                } catch (Error | RuntimeException exception) {
                  wrapped.put("error", wrapError(exception));
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }

  private static class MessageNestedApiCodec extends StandardMessageCodec {
    public static final MessageNestedApiCodec INSTANCE = new MessageNestedApiCodec();

    private MessageNestedApiCodec() {}

    @Override
    protected Object readValueOfType(byte type, ByteBuffer buffer) {
      switch (type) {
        case (byte) 128:
          return MessageNested.fromMap((Map<String, Object>) readValue(buffer));

        case (byte) 129:
          return MessageSearchReply.fromMap((Map<String, Object>) readValue(buffer));

        case (byte) 130:
          return MessageSearchRequest.fromMap((Map<String, Object>) readValue(buffer));

        default:
          return super.readValueOfType(type, buffer);
      }
    }

    @Override
    protected void writeValue(ByteArrayOutputStream stream, Object value) {
      if (value instanceof MessageNested) {
        stream.write(128);
        writeValue(stream, ((MessageNested) value).toMap());
      } else if (value instanceof MessageSearchReply) {
        stream.write(129);
        writeValue(stream, ((MessageSearchReply) value).toMap());
      } else if (value instanceof MessageSearchRequest) {
        stream.write(130);
        writeValue(stream, ((MessageSearchRequest) value).toMap());
      } else {
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter. */
  public interface MessageNestedApi {
    @NonNull
    MessageSearchReply search(@NonNull MessageNested nested);

    /** The codec used by MessageNestedApi. */
    static MessageCodec<Object> getCodec() {
      return MessageNestedApiCodec.INSTANCE;
    }

    /**
     * Sets up an instance of `MessageNestedApi` to handle messages through the `binaryMessenger`.
     */
    static void setup(BinaryMessenger binaryMessenger, MessageNestedApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.MessageNestedApi.search", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                Map<String, Object> wrapped = new HashMap<>();
                try {
                  ArrayList<Object> args = (ArrayList<Object>) message;
                  MessageNested nestedArg = (MessageNested) args.get(0);
                  if (nestedArg == null) {
                    throw new NullPointerException("nestedArg unexpectedly null.");
                  }
                  MessageSearchReply output = api.search(nestedArg);
                  wrapped.put("result", output);
                } catch (Error | RuntimeException exception) {
                  wrapped.put("error", wrapError(exception));
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }

  private static class MessageFlutterSearchApiCodec extends StandardMessageCodec {
    public static final MessageFlutterSearchApiCodec INSTANCE = new MessageFlutterSearchApiCodec();

    private MessageFlutterSearchApiCodec() {}

    @Override
    protected Object readValueOfType(byte type, ByteBuffer buffer) {
      switch (type) {
        case (byte) 128:
          return MessageSearchReply.fromMap((Map<String, Object>) readValue(buffer));

        case (byte) 129:
          return MessageSearchRequest.fromMap((Map<String, Object>) readValue(buffer));

        default:
          return super.readValueOfType(type, buffer);
      }
    }

    @Override
    protected void writeValue(ByteArrayOutputStream stream, Object value) {
      if (value instanceof MessageSearchReply) {
        stream.write(128);
        writeValue(stream, ((MessageSearchReply) value).toMap());
      } else if (value instanceof MessageSearchRequest) {
        stream.write(129);
        writeValue(stream, ((MessageSearchRequest) value).toMap());
      } else {
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated class from Pigeon that represents Flutter messages that can be called from Java. */
  public static class MessageFlutterSearchApi {
    private final BinaryMessenger binaryMessenger;

    public MessageFlutterSearchApi(BinaryMessenger argBinaryMessenger) {
      this.binaryMessenger = argBinaryMessenger;
    }

    public interface Reply<T> {
      void reply(T reply);
    }

    static MessageCodec<Object> getCodec() {
      return MessageFlutterSearchApiCodec.INSTANCE;
    }

    public void search(
        @NonNull MessageSearchRequest requestArg, Reply<MessageSearchReply> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(
              binaryMessenger, "dev.flutter.pigeon.MessageFlutterSearchApi.search", getCodec());
      channel.send(
          new ArrayList<Object>(Arrays.asList(requestArg)),
          channelReply -> {
            @SuppressWarnings("ConstantConditions")
            MessageSearchReply output = (MessageSearchReply) channelReply;
            callback.reply(output);
          });
    }
  }

  private static Map<String, Object> wrapError(Throwable exception) {
    Map<String, Object> errorMap = new HashMap<>();
    errorMap.put("message", exception.toString());
    errorMap.put("code", exception.getClass().getSimpleName());
    errorMap.put(
        "details",
        "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    return errorMap;
  }
}
