package com.sportybet.ntespm.socket.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.bl0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class SocketMessage {

    /* JADX INFO: renamed from: com.sportybet.ntespm.socket.protobuf.SocketMessage$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public interface HeartBeatOrBuilder extends MessageLiteOrBuilder {
        boolean getAck();

        long getMessageId();

        int getRequestId();

        boolean hasAck();

        boolean hasMessageId();

        boolean hasRequestId();
    }

    public interface RegDevOrBuilder extends MessageLiteOrBuilder {
        DevType getDevType();

        String getDeviceId();

        ByteString getDeviceIdBytes();

        int getProductCode();

        int getRequestId();

        String getToken();

        ByteString getTokenBytes();

        boolean hasDevType();

        boolean hasDeviceId();

        boolean hasProductCode();

        boolean hasRequestId();

        boolean hasToken();
    }

    public interface ResponseOrBuilder extends MessageLiteOrBuilder {
        boolean getAck();

        String getExtra();

        ByteString getExtraBytes();

        long getMessageId();

        int getRequestId();

        RetCode getRetCode();

        String getRightHost();

        ByteString getRightHostBytes();

        int getSendNum();

        boolean hasAck();

        boolean hasExtra();

        boolean hasMessageId();

        boolean hasRequestId();

        boolean hasRetCode();

        boolean hasRightHost();

        boolean hasSendNum();
    }

    public interface RetMsgOrBuilder extends MessageLiteOrBuilder {
        boolean getAck();

        ByteString getBody();

        long getMessageId();

        PushType getPushType();

        String getTopic();

        ByteString getTopicBytes();

        boolean hasAck();

        boolean hasBody();

        boolean hasMessageId();

        boolean hasPushType();

        boolean hasTopic();
    }

    public interface SubscribeOrBuilder extends MessageLiteOrBuilder {
        String getAccountId();

        ByteString getAccountIdBytes();

        PushType getPushType();

        int getRequestId();

        SubType getSubType();

        String getTopic();

        ByteString getTopicBytes();

        boolean hasAccountId();

        boolean hasPushType();

        boolean hasRequestId();

        boolean hasSubType();

        boolean hasTopic();
    }

    private SocketMessage() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static final class HeartBeat extends GeneratedMessageLite<HeartBeat, Builder> implements HeartBeatOrBuilder {
        public static final int ACK_FIELD_NUMBER = 3;
        private static final HeartBeat DEFAULT_INSTANCE;
        public static final int MESSAGEID_FIELD_NUMBER = 2;
        private static volatile Parser<HeartBeat> PARSER = null;
        public static final int REQUESTID_FIELD_NUMBER = 1;
        private boolean ack_;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private long messageId_;
        private int requestId_;

        static {
            HeartBeat heartBeat = new HeartBeat();
            DEFAULT_INSTANCE = heartBeat;
            GeneratedMessageLite.registerDefaultInstance(HeartBeat.class, heartBeat);
        }

        private HeartBeat() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAck() {
            this.bitField0_ &= -5;
            this.ack_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessageId() {
            this.bitField0_ &= -3;
            this.messageId_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequestId() {
            this.bitField0_ &= -2;
            this.requestId_ = 0;
        }

        public static HeartBeat getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static HeartBeat parseDelimitedFrom(InputStream inputStream) {
            return (HeartBeat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartBeat parseFrom(ByteBuffer byteBuffer) {
            return (HeartBeat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<HeartBeat> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAck(boolean z) {
            this.bitField0_ |= 4;
            this.ack_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageId(long j) {
            this.bitField0_ |= 2;
            this.messageId_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestId(int i) {
            this.bitField0_ |= 1;
            this.requestId_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new HeartBeat();
                case 2:
                    return new Builder(i);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔄ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "requestId_", "messageId_", "ack_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<HeartBeat> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (HeartBeat.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                default:
                    bl0.a();
                    return null;
            }
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.HeartBeatOrBuilder
        public boolean getAck() {
            return this.ack_;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.HeartBeatOrBuilder
        public long getMessageId() {
            return this.messageId_;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.HeartBeatOrBuilder
        public int getRequestId() {
            return this.requestId_;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.HeartBeatOrBuilder
        public boolean hasAck() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.HeartBeatOrBuilder
        public boolean hasMessageId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.HeartBeatOrBuilder
        public boolean hasRequestId() {
            return (this.bitField0_ & 1) != 0;
        }

        public static final class Builder extends GeneratedMessageLite.Builder<HeartBeat, Builder> implements HeartBeatOrBuilder {
            private Builder() {
                super(HeartBeat.DEFAULT_INSTANCE);
            }

            public Builder clearAck() {
                copyOnWrite();
                ((HeartBeat) this.instance).clearAck();
                return this;
            }

            public Builder clearMessageId() {
                copyOnWrite();
                ((HeartBeat) this.instance).clearMessageId();
                return this;
            }

            public Builder clearRequestId() {
                copyOnWrite();
                ((HeartBeat) this.instance).clearRequestId();
                return this;
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.HeartBeatOrBuilder
            public boolean getAck() {
                return ((HeartBeat) this.instance).getAck();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.HeartBeatOrBuilder
            public long getMessageId() {
                return ((HeartBeat) this.instance).getMessageId();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.HeartBeatOrBuilder
            public int getRequestId() {
                return ((HeartBeat) this.instance).getRequestId();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.HeartBeatOrBuilder
            public boolean hasAck() {
                return ((HeartBeat) this.instance).hasAck();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.HeartBeatOrBuilder
            public boolean hasMessageId() {
                return ((HeartBeat) this.instance).hasMessageId();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.HeartBeatOrBuilder
            public boolean hasRequestId() {
                return ((HeartBeat) this.instance).hasRequestId();
            }

            public Builder setAck(boolean z) {
                copyOnWrite();
                ((HeartBeat) this.instance).setAck(z);
                return this;
            }

            public Builder setMessageId(long j) {
                copyOnWrite();
                ((HeartBeat) this.instance).setMessageId(j);
                return this;
            }

            public Builder setRequestId(int i) {
                copyOnWrite();
                ((HeartBeat) this.instance).setRequestId(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(HeartBeat heartBeat) {
            return DEFAULT_INSTANCE.createBuilder(heartBeat);
        }

        public static HeartBeat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartBeat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeartBeat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartBeat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HeartBeat parseFrom(ByteString byteString) {
            return (HeartBeat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HeartBeat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartBeat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HeartBeat parseFrom(byte[] bArr) {
            return (HeartBeat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HeartBeat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartBeat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HeartBeat parseFrom(InputStream inputStream) {
            return (HeartBeat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeartBeat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartBeat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeartBeat parseFrom(CodedInputStream codedInputStream) {
            return (HeartBeat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HeartBeat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartBeat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RegDev extends GeneratedMessageLite<RegDev, Builder> implements RegDevOrBuilder {
        private static final RegDev DEFAULT_INSTANCE;
        public static final int DEVICEID_FIELD_NUMBER = 3;
        public static final int DEVTYPE_FIELD_NUMBER = 4;
        private static volatile Parser<RegDev> PARSER = null;
        public static final int PRODUCTCODE_FIELD_NUMBER = 2;
        public static final int REQUESTID_FIELD_NUMBER = 1;
        public static final int TOKEN_FIELD_NUMBER = 5;
        private int bitField0_;
        private int productCode_;
        private int requestId_;
        private byte memoizedIsInitialized = 2;
        private String deviceId_ = "";
        private int devType_ = 1;
        private String token_ = "";

        static {
            RegDev regDev = new RegDev();
            DEFAULT_INSTANCE = regDev;
            GeneratedMessageLite.registerDefaultInstance(RegDev.class, regDev);
        }

        private RegDev() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDevType() {
            this.bitField0_ &= -9;
            this.devType_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.bitField0_ &= -5;
            this.deviceId_ = getDefaultInstance().getDeviceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProductCode() {
            this.bitField0_ &= -3;
            this.productCode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequestId() {
            this.bitField0_ &= -2;
            this.requestId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToken() {
            this.bitField0_ &= -17;
            this.token_ = getDefaultInstance().getToken();
        }

        public static RegDev getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RegDev parseDelimitedFrom(InputStream inputStream) {
            return (RegDev) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RegDev parseFrom(ByteBuffer byteBuffer) {
            return (RegDev) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RegDev> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDevType(DevType devType) {
            this.devType_ = devType.getNumber();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceId(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.deviceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceIdBytes(ByteString byteString) {
            this.deviceId_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProductCode(int i) {
            this.bitField0_ |= 2;
            this.productCode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestId(int i) {
            this.bitField0_ |= 1;
            this.requestId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToken(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.token_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTokenBytes(ByteString byteString) {
            this.token_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RegDev();
                case 2:
                    return new Builder(i);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔈ\u0002\u0004ᴌ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "requestId_", "productCode_", "deviceId_", "devType_", DevType.internalGetVerifier(), "token_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RegDev> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (RegDev.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                default:
                    bl0.a();
                    return null;
            }
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
        public DevType getDevType() {
            DevType devTypeForNumber = DevType.forNumber(this.devType_);
            return devTypeForNumber == null ? DevType.IOS : devTypeForNumber;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
        public String getDeviceId() {
            return this.deviceId_;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
        public ByteString getDeviceIdBytes() {
            return ByteString.copyFromUtf8(this.deviceId_);
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
        public int getProductCode() {
            return this.productCode_;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
        public int getRequestId() {
            return this.requestId_;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
        public String getToken() {
            return this.token_;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
        public ByteString getTokenBytes() {
            return ByteString.copyFromUtf8(this.token_);
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
        public boolean hasDevType() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
        public boolean hasDeviceId() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
        public boolean hasProductCode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
        public boolean hasRequestId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
        public boolean hasToken() {
            return (this.bitField0_ & 16) != 0;
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RegDev, Builder> implements RegDevOrBuilder {
            private Builder() {
                super(RegDev.DEFAULT_INSTANCE);
            }

            public Builder clearDevType() {
                copyOnWrite();
                ((RegDev) this.instance).clearDevType();
                return this;
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((RegDev) this.instance).clearDeviceId();
                return this;
            }

            public Builder clearProductCode() {
                copyOnWrite();
                ((RegDev) this.instance).clearProductCode();
                return this;
            }

            public Builder clearRequestId() {
                copyOnWrite();
                ((RegDev) this.instance).clearRequestId();
                return this;
            }

            public Builder clearToken() {
                copyOnWrite();
                ((RegDev) this.instance).clearToken();
                return this;
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
            public DevType getDevType() {
                return ((RegDev) this.instance).getDevType();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
            public String getDeviceId() {
                return ((RegDev) this.instance).getDeviceId();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
            public ByteString getDeviceIdBytes() {
                return ((RegDev) this.instance).getDeviceIdBytes();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
            public int getProductCode() {
                return ((RegDev) this.instance).getProductCode();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
            public int getRequestId() {
                return ((RegDev) this.instance).getRequestId();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
            public String getToken() {
                return ((RegDev) this.instance).getToken();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
            public ByteString getTokenBytes() {
                return ((RegDev) this.instance).getTokenBytes();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
            public boolean hasDevType() {
                return ((RegDev) this.instance).hasDevType();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
            public boolean hasDeviceId() {
                return ((RegDev) this.instance).hasDeviceId();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
            public boolean hasProductCode() {
                return ((RegDev) this.instance).hasProductCode();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
            public boolean hasRequestId() {
                return ((RegDev) this.instance).hasRequestId();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RegDevOrBuilder
            public boolean hasToken() {
                return ((RegDev) this.instance).hasToken();
            }

            public Builder setDevType(DevType devType) {
                copyOnWrite();
                ((RegDev) this.instance).setDevType(devType);
                return this;
            }

            public Builder setDeviceId(String str) {
                copyOnWrite();
                ((RegDev) this.instance).setDeviceId(str);
                return this;
            }

            public Builder setDeviceIdBytes(ByteString byteString) {
                copyOnWrite();
                ((RegDev) this.instance).setDeviceIdBytes(byteString);
                return this;
            }

            public Builder setProductCode(int i) {
                copyOnWrite();
                ((RegDev) this.instance).setProductCode(i);
                return this;
            }

            public Builder setRequestId(int i) {
                copyOnWrite();
                ((RegDev) this.instance).setRequestId(i);
                return this;
            }

            public Builder setToken(String str) {
                copyOnWrite();
                ((RegDev) this.instance).setToken(str);
                return this;
            }

            public Builder setTokenBytes(ByteString byteString) {
                copyOnWrite();
                ((RegDev) this.instance).setTokenBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(RegDev regDev) {
            return DEFAULT_INSTANCE.createBuilder(regDev);
        }

        public static RegDev parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RegDev) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RegDev parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RegDev) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RegDev parseFrom(ByteString byteString) {
            return (RegDev) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RegDev parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RegDev) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RegDev parseFrom(byte[] bArr) {
            return (RegDev) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RegDev parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RegDev) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RegDev parseFrom(InputStream inputStream) {
            return (RegDev) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RegDev parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RegDev) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RegDev parseFrom(CodedInputStream codedInputStream) {
            return (RegDev) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RegDev parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RegDev) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Response extends GeneratedMessageLite<Response, Builder> implements ResponseOrBuilder {
        public static final int ACK_FIELD_NUMBER = 6;
        private static final Response DEFAULT_INSTANCE;
        public static final int EXTRA_FIELD_NUMBER = 7;
        public static final int MESSAGEID_FIELD_NUMBER = 5;
        private static volatile Parser<Response> PARSER = null;
        public static final int REQUESTID_FIELD_NUMBER = 1;
        public static final int RETCODE_FIELD_NUMBER = 2;
        public static final int RIGHTHOST_FIELD_NUMBER = 3;
        public static final int SENDNUM_FIELD_NUMBER = 4;
        private boolean ack_;
        private int bitField0_;
        private long messageId_;
        private int requestId_;
        private int sendNum_;
        private byte memoizedIsInitialized = 2;
        private int retCode_ = 1;
        private String rightHost_ = "";
        private String extra_ = "";

        static {
            Response response = new Response();
            DEFAULT_INSTANCE = response;
            GeneratedMessageLite.registerDefaultInstance(Response.class, response);
        }

        private Response() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAck() {
            this.bitField0_ &= -33;
            this.ack_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtra() {
            this.bitField0_ &= -65;
            this.extra_ = getDefaultInstance().getExtra();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessageId() {
            this.bitField0_ &= -17;
            this.messageId_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequestId() {
            this.bitField0_ &= -2;
            this.requestId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetCode() {
            this.bitField0_ &= -3;
            this.retCode_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRightHost() {
            this.bitField0_ &= -5;
            this.rightHost_ = getDefaultInstance().getRightHost();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSendNum() {
            this.bitField0_ &= -9;
            this.sendNum_ = 0;
        }

        public static Response getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Response parseDelimitedFrom(InputStream inputStream) {
            return (Response) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Response parseFrom(ByteBuffer byteBuffer) {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Response> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAck(boolean z) {
            this.bitField0_ |= 32;
            this.ack_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtra(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.extra_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtraBytes(ByteString byteString) {
            this.extra_ = byteString.toStringUtf8();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageId(long j) {
            this.bitField0_ |= 16;
            this.messageId_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestId(int i) {
            this.bitField0_ |= 1;
            this.requestId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetCode(RetCode retCode) {
            this.retCode_ = retCode.getNumber();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRightHost(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.rightHost_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRightHostBytes(ByteString byteString) {
            this.rightHost_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSendNum(int i) {
            this.bitField0_ |= 8;
            this.sendNum_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Response();
                case 2:
                    return new Builder(i);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᴌ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဂ\u0004\u0006ဇ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "requestId_", "retCode_", RetCode.internalGetVerifier(), "rightHost_", "sendNum_", "messageId_", "ack_", "extra_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Response> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Response.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                default:
                    bl0.a();
                    return null;
            }
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
        public boolean getAck() {
            return this.ack_;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
        public String getExtra() {
            return this.extra_;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
        public ByteString getExtraBytes() {
            return ByteString.copyFromUtf8(this.extra_);
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
        public long getMessageId() {
            return this.messageId_;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
        public int getRequestId() {
            return this.requestId_;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
        public RetCode getRetCode() {
            RetCode retCodeForNumber = RetCode.forNumber(this.retCode_);
            return retCodeForNumber == null ? RetCode.SUCCESS : retCodeForNumber;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
        public String getRightHost() {
            return this.rightHost_;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
        public ByteString getRightHostBytes() {
            return ByteString.copyFromUtf8(this.rightHost_);
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
        public int getSendNum() {
            return this.sendNum_;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
        public boolean hasAck() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
        public boolean hasExtra() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
        public boolean hasMessageId() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
        public boolean hasRequestId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
        public boolean hasRetCode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
        public boolean hasRightHost() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
        public boolean hasSendNum() {
            return (this.bitField0_ & 8) != 0;
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Response, Builder> implements ResponseOrBuilder {
            private Builder() {
                super(Response.DEFAULT_INSTANCE);
            }

            public Builder clearAck() {
                copyOnWrite();
                ((Response) this.instance).clearAck();
                return this;
            }

            public Builder clearExtra() {
                copyOnWrite();
                ((Response) this.instance).clearExtra();
                return this;
            }

            public Builder clearMessageId() {
                copyOnWrite();
                ((Response) this.instance).clearMessageId();
                return this;
            }

            public Builder clearRequestId() {
                copyOnWrite();
                ((Response) this.instance).clearRequestId();
                return this;
            }

            public Builder clearRetCode() {
                copyOnWrite();
                ((Response) this.instance).clearRetCode();
                return this;
            }

            public Builder clearRightHost() {
                copyOnWrite();
                ((Response) this.instance).clearRightHost();
                return this;
            }

            public Builder clearSendNum() {
                copyOnWrite();
                ((Response) this.instance).clearSendNum();
                return this;
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
            public boolean getAck() {
                return ((Response) this.instance).getAck();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
            public String getExtra() {
                return ((Response) this.instance).getExtra();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
            public ByteString getExtraBytes() {
                return ((Response) this.instance).getExtraBytes();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
            public long getMessageId() {
                return ((Response) this.instance).getMessageId();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
            public int getRequestId() {
                return ((Response) this.instance).getRequestId();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
            public RetCode getRetCode() {
                return ((Response) this.instance).getRetCode();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
            public String getRightHost() {
                return ((Response) this.instance).getRightHost();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
            public ByteString getRightHostBytes() {
                return ((Response) this.instance).getRightHostBytes();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
            public int getSendNum() {
                return ((Response) this.instance).getSendNum();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
            public boolean hasAck() {
                return ((Response) this.instance).hasAck();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
            public boolean hasExtra() {
                return ((Response) this.instance).hasExtra();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
            public boolean hasMessageId() {
                return ((Response) this.instance).hasMessageId();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
            public boolean hasRequestId() {
                return ((Response) this.instance).hasRequestId();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
            public boolean hasRetCode() {
                return ((Response) this.instance).hasRetCode();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
            public boolean hasRightHost() {
                return ((Response) this.instance).hasRightHost();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.ResponseOrBuilder
            public boolean hasSendNum() {
                return ((Response) this.instance).hasSendNum();
            }

            public Builder setAck(boolean z) {
                copyOnWrite();
                ((Response) this.instance).setAck(z);
                return this;
            }

            public Builder setExtra(String str) {
                copyOnWrite();
                ((Response) this.instance).setExtra(str);
                return this;
            }

            public Builder setExtraBytes(ByteString byteString) {
                copyOnWrite();
                ((Response) this.instance).setExtraBytes(byteString);
                return this;
            }

            public Builder setMessageId(long j) {
                copyOnWrite();
                ((Response) this.instance).setMessageId(j);
                return this;
            }

            public Builder setRequestId(int i) {
                copyOnWrite();
                ((Response) this.instance).setRequestId(i);
                return this;
            }

            public Builder setRetCode(RetCode retCode) {
                copyOnWrite();
                ((Response) this.instance).setRetCode(retCode);
                return this;
            }

            public Builder setRightHost(String str) {
                copyOnWrite();
                ((Response) this.instance).setRightHost(str);
                return this;
            }

            public Builder setRightHostBytes(ByteString byteString) {
                copyOnWrite();
                ((Response) this.instance).setRightHostBytes(byteString);
                return this;
            }

            public Builder setSendNum(int i) {
                copyOnWrite();
                ((Response) this.instance).setSendNum(i);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(Response response) {
            return DEFAULT_INSTANCE.createBuilder(response);
        }

        public static Response parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Response) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Response parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Response parseFrom(ByteString byteString) {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Response parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Response parseFrom(byte[] bArr) {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Response parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Response parseFrom(InputStream inputStream) {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Response parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Response parseFrom(CodedInputStream codedInputStream) {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Response parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RetMsg extends GeneratedMessageLite<RetMsg, Builder> implements RetMsgOrBuilder {
        public static final int ACK_FIELD_NUMBER = 5;
        public static final int BODY_FIELD_NUMBER = 1;
        private static final RetMsg DEFAULT_INSTANCE;
        public static final int MESSAGEID_FIELD_NUMBER = 4;
        private static volatile Parser<RetMsg> PARSER = null;
        public static final int PUSHTYPE_FIELD_NUMBER = 3;
        public static final int TOPIC_FIELD_NUMBER = 2;
        private boolean ack_;
        private int bitField0_;
        private long messageId_;
        private byte memoizedIsInitialized = 2;
        private ByteString body_ = ByteString.EMPTY;
        private String topic_ = "";
        private int pushType_ = 1;

        static {
            RetMsg retMsg = new RetMsg();
            DEFAULT_INSTANCE = retMsg;
            GeneratedMessageLite.registerDefaultInstance(RetMsg.class, retMsg);
        }

        private RetMsg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAck() {
            this.bitField0_ &= -17;
            this.ack_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBody() {
            this.bitField0_ &= -2;
            this.body_ = getDefaultInstance().getBody();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessageId() {
            this.bitField0_ &= -9;
            this.messageId_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPushType() {
            this.bitField0_ &= -5;
            this.pushType_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTopic() {
            this.bitField0_ &= -3;
            this.topic_ = getDefaultInstance().getTopic();
        }

        public static RetMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RetMsg parseDelimitedFrom(InputStream inputStream) {
            return (RetMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RetMsg parseFrom(ByteBuffer byteBuffer) {
            return (RetMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RetMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAck(boolean z) {
            this.bitField0_ |= 16;
            this.ack_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBody(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 1;
            this.body_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageId(long j) {
            this.bitField0_ |= 8;
            this.messageId_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPushType(PushType pushType) {
            this.pushType_ = pushType.getNumber();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopic(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.topic_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopicBytes(ByteString byteString) {
            this.topic_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new RetMsg();
                case 2:
                    return new Builder(i);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "body_", "topic_", "pushType_", PushType.internalGetVerifier(), "messageId_", "ack_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RetMsg> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (RetMsg.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                default:
                    bl0.a();
                    return null;
            }
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
        public boolean getAck() {
            return this.ack_;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
        public ByteString getBody() {
            return this.body_;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
        public long getMessageId() {
            return this.messageId_;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
        public PushType getPushType() {
            PushType pushTypeForNumber = PushType.forNumber(this.pushType_);
            return pushTypeForNumber == null ? PushType.GROUP : pushTypeForNumber;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
        public String getTopic() {
            return this.topic_;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
        public ByteString getTopicBytes() {
            return ByteString.copyFromUtf8(this.topic_);
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
        public boolean hasAck() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
        public boolean hasBody() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
        public boolean hasMessageId() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
        public boolean hasPushType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
        public boolean hasTopic() {
            return (this.bitField0_ & 2) != 0;
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RetMsg, Builder> implements RetMsgOrBuilder {
            private Builder() {
                super(RetMsg.DEFAULT_INSTANCE);
            }

            public Builder clearAck() {
                copyOnWrite();
                ((RetMsg) this.instance).clearAck();
                return this;
            }

            public Builder clearBody() {
                copyOnWrite();
                ((RetMsg) this.instance).clearBody();
                return this;
            }

            public Builder clearMessageId() {
                copyOnWrite();
                ((RetMsg) this.instance).clearMessageId();
                return this;
            }

            public Builder clearPushType() {
                copyOnWrite();
                ((RetMsg) this.instance).clearPushType();
                return this;
            }

            public Builder clearTopic() {
                copyOnWrite();
                ((RetMsg) this.instance).clearTopic();
                return this;
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
            public boolean getAck() {
                return ((RetMsg) this.instance).getAck();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
            public ByteString getBody() {
                return ((RetMsg) this.instance).getBody();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
            public long getMessageId() {
                return ((RetMsg) this.instance).getMessageId();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
            public PushType getPushType() {
                return ((RetMsg) this.instance).getPushType();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
            public String getTopic() {
                return ((RetMsg) this.instance).getTopic();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
            public ByteString getTopicBytes() {
                return ((RetMsg) this.instance).getTopicBytes();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
            public boolean hasAck() {
                return ((RetMsg) this.instance).hasAck();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
            public boolean hasBody() {
                return ((RetMsg) this.instance).hasBody();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
            public boolean hasMessageId() {
                return ((RetMsg) this.instance).hasMessageId();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
            public boolean hasPushType() {
                return ((RetMsg) this.instance).hasPushType();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.RetMsgOrBuilder
            public boolean hasTopic() {
                return ((RetMsg) this.instance).hasTopic();
            }

            public Builder setAck(boolean z) {
                copyOnWrite();
                ((RetMsg) this.instance).setAck(z);
                return this;
            }

            public Builder setBody(ByteString byteString) {
                copyOnWrite();
                ((RetMsg) this.instance).setBody(byteString);
                return this;
            }

            public Builder setMessageId(long j) {
                copyOnWrite();
                ((RetMsg) this.instance).setMessageId(j);
                return this;
            }

            public Builder setPushType(PushType pushType) {
                copyOnWrite();
                ((RetMsg) this.instance).setPushType(pushType);
                return this;
            }

            public Builder setTopic(String str) {
                copyOnWrite();
                ((RetMsg) this.instance).setTopic(str);
                return this;
            }

            public Builder setTopicBytes(ByteString byteString) {
                copyOnWrite();
                ((RetMsg) this.instance).setTopicBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(RetMsg retMsg) {
            return DEFAULT_INSTANCE.createBuilder(retMsg);
        }

        public static RetMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RetMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RetMsg parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RetMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RetMsg parseFrom(ByteString byteString) {
            return (RetMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RetMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RetMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RetMsg parseFrom(byte[] bArr) {
            return (RetMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RetMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RetMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RetMsg parseFrom(InputStream inputStream) {
            return (RetMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RetMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RetMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RetMsg parseFrom(CodedInputStream codedInputStream) {
            return (RetMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RetMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RetMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Subscribe extends GeneratedMessageLite<Subscribe, Builder> implements SubscribeOrBuilder {
        public static final int ACCOUNTID_FIELD_NUMBER = 4;
        private static final Subscribe DEFAULT_INSTANCE;
        private static volatile Parser<Subscribe> PARSER = null;
        public static final int PUSHTYPE_FIELD_NUMBER = 6;
        public static final int REQUESTID_FIELD_NUMBER = 1;
        public static final int SUBTYPE_FIELD_NUMBER = 3;
        public static final int TOPIC_FIELD_NUMBER = 2;
        private int bitField0_;
        private int requestId_;
        private byte memoizedIsInitialized = 2;
        private String topic_ = "";
        private int subType_ = 1;
        private int pushType_ = 1;
        private String accountId_ = "";

        static {
            Subscribe subscribe = new Subscribe();
            DEFAULT_INSTANCE = subscribe;
            GeneratedMessageLite.registerDefaultInstance(Subscribe.class, subscribe);
        }

        private Subscribe() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAccountId() {
            this.bitField0_ &= -17;
            this.accountId_ = getDefaultInstance().getAccountId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPushType() {
            this.bitField0_ &= -9;
            this.pushType_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequestId() {
            this.bitField0_ &= -2;
            this.requestId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubType() {
            this.bitField0_ &= -5;
            this.subType_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTopic() {
            this.bitField0_ &= -3;
            this.topic_ = getDefaultInstance().getTopic();
        }

        public static Subscribe getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Subscribe parseDelimitedFrom(InputStream inputStream) {
            return (Subscribe) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Subscribe parseFrom(ByteBuffer byteBuffer) {
            return (Subscribe) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Subscribe> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccountId(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.accountId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccountIdBytes(ByteString byteString) {
            this.accountId_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPushType(PushType pushType) {
            this.pushType_ = pushType.getNumber();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestId(int i) {
            this.bitField0_ |= 1;
            this.requestId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubType(SubType subType) {
            this.subType_ = subType.getNumber();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopic(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.topic_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopicBytes(ByteString byteString) {
            this.topic_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            int i = 0;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Subscribe();
                case 2:
                    return new Builder(i);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔈ\u0001\u0003ᴌ\u0002\u0004ဈ\u0004\u0006᠌\u0003", new Object[]{"bitField0_", "requestId_", "topic_", "subType_", SubType.internalGetVerifier(), "accountId_", "pushType_", PushType.internalGetVerifier()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Subscribe> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Subscribe.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                    return null;
                default:
                    bl0.a();
                    return null;
            }
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
        public String getAccountId() {
            return this.accountId_;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
        public ByteString getAccountIdBytes() {
            return ByteString.copyFromUtf8(this.accountId_);
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
        public PushType getPushType() {
            PushType pushTypeForNumber = PushType.forNumber(this.pushType_);
            return pushTypeForNumber == null ? PushType.GROUP : pushTypeForNumber;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
        public int getRequestId() {
            return this.requestId_;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
        public SubType getSubType() {
            SubType subTypeForNumber = SubType.forNumber(this.subType_);
            return subTypeForNumber == null ? SubType.SUB : subTypeForNumber;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
        public String getTopic() {
            return this.topic_;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
        public ByteString getTopicBytes() {
            return ByteString.copyFromUtf8(this.topic_);
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
        public boolean hasAccountId() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
        public boolean hasPushType() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
        public boolean hasRequestId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
        public boolean hasSubType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
        public boolean hasTopic() {
            return (this.bitField0_ & 2) != 0;
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Subscribe, Builder> implements SubscribeOrBuilder {
            private Builder() {
                super(Subscribe.DEFAULT_INSTANCE);
            }

            public Builder clearAccountId() {
                copyOnWrite();
                ((Subscribe) this.instance).clearAccountId();
                return this;
            }

            public Builder clearPushType() {
                copyOnWrite();
                ((Subscribe) this.instance).clearPushType();
                return this;
            }

            public Builder clearRequestId() {
                copyOnWrite();
                ((Subscribe) this.instance).clearRequestId();
                return this;
            }

            public Builder clearSubType() {
                copyOnWrite();
                ((Subscribe) this.instance).clearSubType();
                return this;
            }

            public Builder clearTopic() {
                copyOnWrite();
                ((Subscribe) this.instance).clearTopic();
                return this;
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
            public String getAccountId() {
                return ((Subscribe) this.instance).getAccountId();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
            public ByteString getAccountIdBytes() {
                return ((Subscribe) this.instance).getAccountIdBytes();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
            public PushType getPushType() {
                return ((Subscribe) this.instance).getPushType();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
            public int getRequestId() {
                return ((Subscribe) this.instance).getRequestId();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
            public SubType getSubType() {
                return ((Subscribe) this.instance).getSubType();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
            public String getTopic() {
                return ((Subscribe) this.instance).getTopic();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
            public ByteString getTopicBytes() {
                return ((Subscribe) this.instance).getTopicBytes();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
            public boolean hasAccountId() {
                return ((Subscribe) this.instance).hasAccountId();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
            public boolean hasPushType() {
                return ((Subscribe) this.instance).hasPushType();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
            public boolean hasRequestId() {
                return ((Subscribe) this.instance).hasRequestId();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
            public boolean hasSubType() {
                return ((Subscribe) this.instance).hasSubType();
            }

            @Override // com.sportybet.ntespm.socket.protobuf.SocketMessage.SubscribeOrBuilder
            public boolean hasTopic() {
                return ((Subscribe) this.instance).hasTopic();
            }

            public Builder setAccountId(String str) {
                copyOnWrite();
                ((Subscribe) this.instance).setAccountId(str);
                return this;
            }

            public Builder setAccountIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Subscribe) this.instance).setAccountIdBytes(byteString);
                return this;
            }

            public Builder setPushType(PushType pushType) {
                copyOnWrite();
                ((Subscribe) this.instance).setPushType(pushType);
                return this;
            }

            public Builder setRequestId(int i) {
                copyOnWrite();
                ((Subscribe) this.instance).setRequestId(i);
                return this;
            }

            public Builder setSubType(SubType subType) {
                copyOnWrite();
                ((Subscribe) this.instance).setSubType(subType);
                return this;
            }

            public Builder setTopic(String str) {
                copyOnWrite();
                ((Subscribe) this.instance).setTopic(str);
                return this;
            }

            public Builder setTopicBytes(ByteString byteString) {
                copyOnWrite();
                ((Subscribe) this.instance).setTopicBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(Subscribe subscribe) {
            return DEFAULT_INSTANCE.createBuilder(subscribe);
        }

        public static Subscribe parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Subscribe) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Subscribe parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Subscribe) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Subscribe parseFrom(ByteString byteString) {
            return (Subscribe) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Subscribe parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Subscribe) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Subscribe parseFrom(byte[] bArr) {
            return (Subscribe) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Subscribe parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Subscribe) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Subscribe parseFrom(InputStream inputStream) {
            return (Subscribe) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Subscribe parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Subscribe) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Subscribe parseFrom(CodedInputStream codedInputStream) {
            return (Subscribe) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Subscribe parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Subscribe) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public enum DevType implements Internal.EnumLite {
        IOS(1),
        ANDROID(2),
        WP(3),
        WEB(4);

        public static final int ANDROID_VALUE = 2;
        public static final int IOS_VALUE = 1;
        public static final int WEB_VALUE = 4;
        public static final int WP_VALUE = 3;
        private static final Internal.EnumLiteMap<DevType> internalValueMap = new Internal.EnumLiteMap<DevType>() { // from class: com.sportybet.ntespm.socket.protobuf.SocketMessage.DevType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public DevType findValueByNumber(int i) {
                return DevType.forNumber(i);
            }
        };
        private final int value;

        public static final class DevTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new DevTypeVerifier();

            private DevTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return DevType.forNumber(i) != null;
            }
        }

        DevType(int i) {
            this.value = i;
        }

        public static DevType forNumber(int i) {
            if (i == 1) {
                return IOS;
            }
            if (i == 2) {
                return ANDROID;
            }
            if (i == 3) {
                return WP;
            }
            if (i != 4) {
                return null;
            }
            return WEB;
        }

        public static Internal.EnumLiteMap<DevType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return DevTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static DevType valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum PushType implements Internal.EnumLite {
        GROUP(1),
        SPECIAL(2),
        MULTI(3);

        public static final int GROUP_VALUE = 1;
        public static final int MULTI_VALUE = 3;
        public static final int SPECIAL_VALUE = 2;
        private static final Internal.EnumLiteMap<PushType> internalValueMap = new Internal.EnumLiteMap<PushType>() { // from class: com.sportybet.ntespm.socket.protobuf.SocketMessage.PushType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public PushType findValueByNumber(int i) {
                return PushType.forNumber(i);
            }
        };
        private final int value;

        public static final class PushTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new PushTypeVerifier();

            private PushTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return PushType.forNumber(i) != null;
            }
        }

        PushType(int i) {
            this.value = i;
        }

        public static PushType forNumber(int i) {
            if (i == 1) {
                return GROUP;
            }
            if (i == 2) {
                return SPECIAL;
            }
            if (i != 3) {
                return null;
            }
            return MULTI;
        }

        public static Internal.EnumLiteMap<PushType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return PushTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PushType valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum RetCode implements Internal.EnumLite {
        SUCCESS(1),
        FAIL(2),
        CACHED(3),
        PARAM_ERR(4),
        NO_AUTH(5);

        public static final int CACHED_VALUE = 3;
        public static final int FAIL_VALUE = 2;
        public static final int NO_AUTH_VALUE = 5;
        public static final int PARAM_ERR_VALUE = 4;
        public static final int SUCCESS_VALUE = 1;
        private static final Internal.EnumLiteMap<RetCode> internalValueMap = new Internal.EnumLiteMap<RetCode>() { // from class: com.sportybet.ntespm.socket.protobuf.SocketMessage.RetCode.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public RetCode findValueByNumber(int i) {
                return RetCode.forNumber(i);
            }
        };
        private final int value;

        public static final class RetCodeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new RetCodeVerifier();

            private RetCodeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return RetCode.forNumber(i) != null;
            }
        }

        RetCode(int i) {
            this.value = i;
        }

        public static RetCode forNumber(int i) {
            if (i == 1) {
                return SUCCESS;
            }
            if (i == 2) {
                return FAIL;
            }
            if (i == 3) {
                return CACHED;
            }
            if (i == 4) {
                return PARAM_ERR;
            }
            if (i != 5) {
                return null;
            }
            return NO_AUTH;
        }

        public static Internal.EnumLiteMap<RetCode> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return RetCodeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static RetCode valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum SubType implements Internal.EnumLite {
        SUB(1),
        UNSUB(2);

        public static final int SUB_VALUE = 1;
        public static final int UNSUB_VALUE = 2;
        private static final Internal.EnumLiteMap<SubType> internalValueMap = new Internal.EnumLiteMap<SubType>() { // from class: com.sportybet.ntespm.socket.protobuf.SocketMessage.SubType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SubType findValueByNumber(int i) {
                return SubType.forNumber(i);
            }
        };
        private final int value;

        public static final class SubTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new SubTypeVerifier();

            private SubTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return SubType.forNumber(i) != null;
            }
        }

        SubType(int i) {
            this.value = i;
        }

        public static SubType forNumber(int i) {
            if (i == 1) {
                return SUB;
            }
            if (i != 2) {
                return null;
            }
            return UNSUB;
        }

        public static Internal.EnumLiteMap<SubType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return SubTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static SubType valueOf(int i) {
            return forNumber(i);
        }
    }
}
