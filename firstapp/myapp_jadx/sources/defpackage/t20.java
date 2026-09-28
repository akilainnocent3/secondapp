package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes4.dex */
public final class t20 extends GeneratedMessageLite<t20, b> implements MessageLiteOrBuilder {
    private static final t20 DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile Parser<t20> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

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

    public static final class b extends GeneratedMessageLite.Builder<t20, b> implements MessageLiteOrBuilder {
        public b() {
            super(t20.DEFAULT_INSTANCE);
        }

        public final void g(String str) {
            copyOnWrite();
            t20 t20Var = (t20) this.instance;
            int i = t20.PACKAGE_NAME_FIELD_NUMBER;
            t20Var.l(str);
        }

        public final void h() {
            copyOnWrite();
            t20 t20Var = (t20) this.instance;
            int i = t20.PACKAGE_NAME_FIELD_NUMBER;
            t20Var.m();
        }

        public final void i(String str) {
            copyOnWrite();
            t20 t20Var = (t20) this.instance;
            int i = t20.PACKAGE_NAME_FIELD_NUMBER;
            t20Var.n(str);
        }
    }

    static {
        t20 t20Var = new t20();
        DEFAULT_INSTANCE = t20Var;
        GeneratedMessageLite.registerDefaultInstance(t20.class, t20Var);
    }

    public static t20 h() {
        return DEFAULT_INSTANCE;
    }

    public static b k() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new t20();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<t20> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (t20.class) {
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

    public final boolean i() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean j() {
        return (this.bitField0_ & 2) != 0;
    }

    public final void l(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    public final void m() {
        this.bitField0_ |= 2;
        this.sdkVersion_ = "22.0.1";
    }

    public final void n(String str) {
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }
}
