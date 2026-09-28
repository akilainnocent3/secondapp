package defpackage;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class xig0 extends GeneratedMessageLite<xig0, b> implements MessageLiteOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final xig0 DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<xig0> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private MapFieldLite<String, Long> counters_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.emptyMapField();
    private String name_ = "";
    private Internal.ProtobufList<xig0> subtraces_ = GeneratedMessageLite.emptyProtobufList();
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

    public static final class b extends GeneratedMessageLite.Builder<xig0, b> implements MessageLiteOrBuilder {
        public b() {
            super(xig0.DEFAULT_INSTANCE);
        }

        public final void g(List list) {
            copyOnWrite();
            xig0 xig0Var = (xig0) this.instance;
            int i = xig0.NAME_FIELD_NUMBER;
            xig0Var.h(list);
        }

        public final void h(ArrayList arrayList) {
            copyOnWrite();
            xig0 xig0Var = (xig0) this.instance;
            int i = xig0.NAME_FIELD_NUMBER;
            xig0Var.i(arrayList);
        }

        public final void i(qd00 qd00Var) {
            copyOnWrite();
            xig0 xig0Var = (xig0) this.instance;
            int i = xig0.NAME_FIELD_NUMBER;
            xig0Var.j(qd00Var);
        }

        public final void j(xig0 xig0Var) {
            copyOnWrite();
            xig0 xig0Var2 = (xig0) this.instance;
            int i = xig0.NAME_FIELD_NUMBER;
            xig0Var2.k(xig0Var);
        }

        public final void k(HashMap map) {
            copyOnWrite();
            xig0 xig0Var = (xig0) this.instance;
            int i = xig0.NAME_FIELD_NUMBER;
            xig0Var.u().putAll(map);
        }

        public final void l(Map map) {
            copyOnWrite();
            xig0 xig0Var = (xig0) this.instance;
            int i = xig0.NAME_FIELD_NUMBER;
            xig0Var.v().putAll(map);
        }

        public final void m(long j, String str) {
            str.getClass();
            copyOnWrite();
            xig0 xig0Var = (xig0) this.instance;
            int i = xig0.NAME_FIELD_NUMBER;
            xig0Var.u().put(str, Long.valueOf(j));
        }

        public final void n(String str) {
            copyOnWrite();
            xig0 xig0Var = (xig0) this.instance;
            int i = xig0.NAME_FIELD_NUMBER;
            xig0Var.v().put("systemDeterminedForeground", str);
        }

        public final void o(long j) {
            copyOnWrite();
            xig0 xig0Var = (xig0) this.instance;
            int i = xig0.NAME_FIELD_NUMBER;
            xig0Var.x(j);
        }

        public final void p(long j) {
            copyOnWrite();
            xig0 xig0Var = (xig0) this.instance;
            int i = xig0.NAME_FIELD_NUMBER;
            xig0Var.y(j);
        }

        public final void q(String str) {
            copyOnWrite();
            xig0 xig0Var = (xig0) this.instance;
            int i = xig0.NAME_FIELD_NUMBER;
            xig0Var.setName(str);
        }
    }

    public static final class c {
        public static final MapEntryLite<String, Long> a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);
    }

    public static final class d {
        public static final MapEntryLite<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    static {
        xig0 xig0Var = new xig0();
        DEFAULT_INSTANCE = xig0Var;
        GeneratedMessageLite.registerDefaultInstance(xig0.class, xig0Var);
    }

    public static xig0 p() {
        return DEFAULT_INSTANCE;
    }

    public static b w() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new xig0();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", c.a, "subtraces_", xig0.class, "customAttributes_", d.a, "perfSessions_", qd00.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<xig0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (xig0.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final void h(Iterable<? extends qd00> iterable) {
        Internal.ProtobufList<qd00> protobufList = this.perfSessions_;
        if (!protobufList.isModifiable()) {
            this.perfSessions_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll(iterable, this.perfSessions_);
    }

    public final void i(ArrayList arrayList) {
        Internal.ProtobufList<xig0> protobufList = this.subtraces_;
        if (!protobufList.isModifiable()) {
            this.subtraces_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll(arrayList, this.subtraces_);
    }

    public final void j(qd00 qd00Var) {
        qd00Var.getClass();
        Internal.ProtobufList<qd00> protobufList = this.perfSessions_;
        if (!protobufList.isModifiable()) {
            this.perfSessions_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        this.perfSessions_.add(qd00Var);
    }

    public final void k(xig0 xig0Var) {
        xig0Var.getClass();
        Internal.ProtobufList<xig0> protobufList = this.subtraces_;
        if (!protobufList.isModifiable()) {
            this.subtraces_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        this.subtraces_.add(xig0Var);
    }

    public final boolean l() {
        return this.customAttributes_.containsKey("Hosting_activity");
    }

    public final int m() {
        return this.counters_.size();
    }

    public final Map<String, Long> n() {
        return Collections.unmodifiableMap(this.counters_);
    }

    public final Map<String, String> o() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }

    public final long q() {
        return this.durationUs_;
    }

    public final Internal.ProtobufList r() {
        return this.perfSessions_;
    }

    public final Internal.ProtobufList s() {
        return this.subtraces_;
    }

    public final void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    public final boolean t() {
        return (this.bitField0_ & 4) != 0;
    }

    public final MapFieldLite<String, Long> u() {
        if (!this.counters_.isMutable()) {
            this.counters_ = this.counters_.mutableCopy();
        }
        return this.counters_;
    }

    public final MapFieldLite<String, String> v() {
        if (!this.customAttributes_.isMutable()) {
            this.customAttributes_ = this.customAttributes_.mutableCopy();
        }
        return this.customAttributes_;
    }

    public final void x(long j) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j;
    }

    public final void y(long j) {
        this.bitField0_ |= 8;
        this.durationUs_ = j;
    }
}
