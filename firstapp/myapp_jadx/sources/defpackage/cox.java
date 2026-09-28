package defpackage;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class cox extends GeneratedMessageLite<cox, b> implements MessageLiteOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final cox DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile Parser<cox> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.emptyMapField();
    private String url_ = "";
    private String responseContentType_ = "";
    private Internal.ProtobufList<qd00> perfSessions_ = GeneratedMessageLite.emptyProtobufList();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends GeneratedMessageLite.Builder<cox, b> implements MessageLiteOrBuilder {
        public b() {
            super(cox.DEFAULT_INSTANCE);
        }

        public final void g(List list) {
            copyOnWrite();
            cox coxVar = (cox) this.instance;
            int i = cox.URL_FIELD_NUMBER;
            coxVar.h(list);
        }

        public final void h() {
            copyOnWrite();
            cox coxVar = (cox) this.instance;
            int i = cox.URL_FIELD_NUMBER;
            coxVar.i();
        }

        public final long i() {
            return ((cox) this.instance).s();
        }

        public final boolean j() {
            return ((cox) this.instance).u();
        }

        public final boolean k() {
            return ((cox) this.instance).w();
        }

        public final boolean l() {
            return ((cox) this.instance).A();
        }

        public final void m(long j) {
            copyOnWrite();
            cox coxVar = (cox) this.instance;
            int i = cox.URL_FIELD_NUMBER;
            coxVar.D(j);
        }

        public final void n(d dVar) {
            copyOnWrite();
            cox coxVar = (cox) this.instance;
            int i = cox.URL_FIELD_NUMBER;
            coxVar.E(dVar);
        }

        public final void o(int i) {
            copyOnWrite();
            cox coxVar = (cox) this.instance;
            int i2 = cox.URL_FIELD_NUMBER;
            coxVar.F(i);
        }

        public final void p() {
            copyOnWrite();
            cox coxVar = (cox) this.instance;
            int i = cox.URL_FIELD_NUMBER;
            coxVar.G();
        }

        public final void q(long j) {
            copyOnWrite();
            cox coxVar = (cox) this.instance;
            int i = cox.URL_FIELD_NUMBER;
            coxVar.H(j);
        }

        public final void r(String str) {
            copyOnWrite();
            cox coxVar = (cox) this.instance;
            int i = cox.URL_FIELD_NUMBER;
            coxVar.I(str);
        }

        public final void s(long j) {
            copyOnWrite();
            cox coxVar = (cox) this.instance;
            int i = cox.URL_FIELD_NUMBER;
            coxVar.J(j);
        }

        public final void t(long j) {
            copyOnWrite();
            cox coxVar = (cox) this.instance;
            int i = cox.URL_FIELD_NUMBER;
            coxVar.K(j);
        }

        public final void u(long j) {
            copyOnWrite();
            cox coxVar = (cox) this.instance;
            int i = cox.URL_FIELD_NUMBER;
            coxVar.L(j);
        }

        public final void v(long j) {
            copyOnWrite();
            cox coxVar = (cox) this.instance;
            int i = cox.URL_FIELD_NUMBER;
            coxVar.M(j);
        }

        public final void w(String str) {
            copyOnWrite();
            cox coxVar = (cox) this.instance;
            int i = cox.URL_FIELD_NUMBER;
            coxVar.N(str);
        }
    }

    public static final class c {
        public static final MapEntryLite<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    public enum d implements Internal.EnumLite {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);

        public final int a;

        public static final class a implements Internal.EnumVerifier {
            public static final a a = new a();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return d.a(i) != null;
            }
        }

        d(int i) {
            this.a = i;
        }

        public static d a(int i) {
            switch (i) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.a;
        }
    }

    public enum e implements Internal.EnumLite {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);

        public final int a;

        public static final class a implements Internal.EnumVerifier {
            public static final a a = new a();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                e eVar;
                if (i != 0) {
                    eVar = i != 1 ? null : e.GENERIC_CLIENT_ERROR;
                } else {
                    eVar = e.NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
                }
                return eVar != null;
            }
        }

        e(int i) {
            this.a = i;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.a;
        }
    }

    static {
        cox coxVar = new cox();
        DEFAULT_INSTANCE = coxVar;
        GeneratedMessageLite.registerDefaultInstance(cox.class, coxVar);
    }

    public static b C() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static cox k() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return (this.bitField0_ & 1024) != 0;
    }

    public final boolean B() {
        return (this.bitField0_ & 512) != 0;
    }

    public final void D(long j) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j;
    }

    public final void E(d dVar) {
        this.httpMethod_ = dVar.a;
        this.bitField0_ |= 2;
    }

    public final void F(int i) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i;
    }

    public final void G() {
        this.networkClientErrorReason_ = 1;
        this.bitField0_ |= 16;
    }

    public final void H(long j) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j;
    }

    public final void I(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    public final void J(long j) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j;
    }

    public final void K(long j) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j;
    }

    public final void L(long j) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j;
    }

    public final void M(long j) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j;
    }

    public final void N(String str) {
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new cox();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", d.a.a, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", e.a.a, "customAttributes_", c.a, "perfSessions_", qd00.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<cox> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (cox.class) {
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
                return (byte) 1;
            default:
                bl0.a();
            case 7:
                return null;
        }
    }

    public final void h(Iterable<? extends qd00> iterable) {
        Internal.ProtobufList<qd00> protobufList = this.perfSessions_;
        if (!protobufList.isModifiable()) {
            this.perfSessions_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll(iterable, this.perfSessions_);
    }

    public final void i() {
        this.bitField0_ &= -65;
        this.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    public final long j() {
        return this.clientStartTimeUs_;
    }

    public final d l() {
        d dVarA = d.a(this.httpMethod_);
        return dVarA == null ? d.HTTP_METHOD_UNKNOWN : dVarA;
    }

    public final int m() {
        return this.httpResponseCode_;
    }

    public final Internal.ProtobufList n() {
        return this.perfSessions_;
    }

    public final long o() {
        return this.requestPayloadBytes_;
    }

    public final long p() {
        return this.responsePayloadBytes_;
    }

    public final long q() {
        return this.timeToRequestCompletedUs_;
    }

    public final long r() {
        return this.timeToResponseCompletedUs_;
    }

    public final long s() {
        return this.timeToResponseInitiatedUs_;
    }

    public final String t() {
        return this.url_;
    }

    public final boolean u() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean x() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean y() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean z() {
        return (this.bitField0_ & 256) != 0;
    }
}
