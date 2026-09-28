package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes4.dex */
public final class nd00 extends GeneratedMessageLite<nd00, b> implements od00 {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final nd00 DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile Parser<nd00> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private wu0 applicationInfo_;
    private int bitField0_;
    private pyj gaugeMetric_;
    private cox networkRequestMetric_;
    private xig0 traceMetric_;
    private sug0 transportInfo_;

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

    public static final class b extends GeneratedMessageLite.Builder<nd00, b> implements od00 {
        public b() {
            super(nd00.DEFAULT_INSTANCE);
        }

        @Override // defpackage.od00
        public final boolean a() {
            return ((nd00) this.instance).a();
        }

        @Override // defpackage.od00
        public final boolean b() {
            return ((nd00) this.instance).b();
        }

        @Override // defpackage.od00
        public final cox c() {
            return ((nd00) this.instance).c();
        }

        @Override // defpackage.od00
        public final boolean d() {
            return ((nd00) this.instance).d();
        }

        @Override // defpackage.od00
        public final xig0 e() {
            return ((nd00) this.instance).e();
        }

        @Override // defpackage.od00
        public final pyj f() {
            return ((nd00) this.instance).f();
        }

        public final void g(wu0.b bVar) {
            copyOnWrite();
            nd00 nd00Var = (nd00) this.instance;
            wu0 wu0VarBuild = bVar.build();
            int i = nd00.APPLICATION_INFO_FIELD_NUMBER;
            nd00Var.k(wu0VarBuild);
        }

        public final void h(pyj pyjVar) {
            copyOnWrite();
            nd00 nd00Var = (nd00) this.instance;
            int i = nd00.APPLICATION_INFO_FIELD_NUMBER;
            nd00Var.l(pyjVar);
        }

        public final void i(cox coxVar) {
            copyOnWrite();
            nd00 nd00Var = (nd00) this.instance;
            int i = nd00.APPLICATION_INFO_FIELD_NUMBER;
            nd00Var.m(coxVar);
        }

        public final void j(xig0 xig0Var) {
            copyOnWrite();
            nd00 nd00Var = (nd00) this.instance;
            int i = nd00.APPLICATION_INFO_FIELD_NUMBER;
            nd00Var.n(xig0Var);
        }
    }

    static {
        nd00 nd00Var = new nd00();
        DEFAULT_INSTANCE = nd00Var;
        GeneratedMessageLite.registerDefaultInstance(nd00.class, nd00Var);
    }

    public static b j() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.od00
    public final boolean a() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // defpackage.od00
    public final boolean b() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // defpackage.od00
    public final cox c() {
        cox coxVar = this.networkRequestMetric_;
        return coxVar == null ? cox.k() : coxVar;
    }

    @Override // defpackage.od00
    public final boolean d() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new nd00();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<nd00> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (nd00.class) {
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

    @Override // defpackage.od00
    public final xig0 e() {
        xig0 xig0Var = this.traceMetric_;
        return xig0Var == null ? xig0.p() : xig0Var;
    }

    @Override // defpackage.od00
    public final pyj f() {
        pyj pyjVar = this.gaugeMetric_;
        return pyjVar == null ? pyj.l() : pyjVar;
    }

    public final wu0 h() {
        wu0 wu0Var = this.applicationInfo_;
        return wu0Var == null ? wu0.i() : wu0Var;
    }

    public final boolean i() {
        return (this.bitField0_ & 1) != 0;
    }

    public final void k(wu0 wu0Var) {
        wu0Var.getClass();
        this.applicationInfo_ = wu0Var;
        this.bitField0_ |= 1;
    }

    public final void l(pyj pyjVar) {
        pyjVar.getClass();
        this.gaugeMetric_ = pyjVar;
        this.bitField0_ |= 8;
    }

    public final void m(cox coxVar) {
        coxVar.getClass();
        this.networkRequestMetric_ = coxVar;
        this.bitField0_ |= 4;
    }

    public final void n(xig0 xig0Var) {
        xig0Var.getClass();
        this.traceMetric_ = xig0Var;
        this.bitField0_ |= 2;
    }
}
