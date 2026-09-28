package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes4.dex */
public final class n8b extends GeneratedMessageLite<n8b, b> implements MessageLiteOrBuilder {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final n8b DEFAULT_INSTANCE;
    private static volatile Parser<n8b> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

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

    public static final class b extends GeneratedMessageLite.Builder<n8b, b> implements MessageLiteOrBuilder {
        public b() {
            super(n8b.DEFAULT_INSTANCE);
        }

        public final void g(long j) {
            copyOnWrite();
            n8b n8bVar = (n8b) this.instance;
            int i = n8b.CLIENT_TIME_US_FIELD_NUMBER;
            n8bVar.i(j);
        }

        public final void h(long j) {
            copyOnWrite();
            n8b n8bVar = (n8b) this.instance;
            int i = n8b.CLIENT_TIME_US_FIELD_NUMBER;
            n8bVar.j(j);
        }

        public final void i(long j) {
            copyOnWrite();
            n8b n8bVar = (n8b) this.instance;
            int i = n8b.CLIENT_TIME_US_FIELD_NUMBER;
            n8bVar.k(j);
        }
    }

    static {
        n8b n8bVar = new n8b();
        DEFAULT_INSTANCE = n8bVar;
        GeneratedMessageLite.registerDefaultInstance(n8b.class, n8bVar);
    }

    public static b h() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new n8b();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<n8b> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (n8b.class) {
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

    public final void i(long j) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j;
    }

    public final void j(long j) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j;
    }

    public final void k(long j) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j;
    }
}
