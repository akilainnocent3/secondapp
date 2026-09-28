package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes4.dex */
public final class qd00 extends GeneratedMessageLite<qd00, c> implements MessageLiteOrBuilder {
    private static final qd00 DEFAULT_INSTANCE;
    private static volatile Parser<qd00> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final Internal.ListAdapter.Converter<Integer, dh80> sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private Internal.IntList sessionVerbosity_ = GeneratedMessageLite.emptyIntList();

    public class a implements Internal.ListAdapter.Converter<Integer, dh80> {
        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        public final dh80 convert(Integer num) {
            dh80 dh80VarA = dh80.a(num.intValue());
            return dh80VarA == null ? dh80.SESSION_VERBOSITY_NONE : dh80VarA;
        }
    }

    public static /* synthetic */ class b {
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

    public static final class c extends GeneratedMessageLite.Builder<qd00, c> implements MessageLiteOrBuilder {
        public c() {
            super(qd00.DEFAULT_INSTANCE);
        }

        public final void g() {
            copyOnWrite();
            qd00 qd00Var = (qd00) this.instance;
            int i = qd00.SESSION_ID_FIELD_NUMBER;
            qd00Var.h();
        }

        public final void h(String str) {
            copyOnWrite();
            qd00 qd00Var = (qd00) this.instance;
            int i = qd00.SESSION_ID_FIELD_NUMBER;
            qd00Var.l(str);
        }
    }

    static {
        qd00 qd00Var = new qd00();
        DEFAULT_INSTANCE = qd00Var;
        GeneratedMessageLite.registerDefaultInstance(qd00.class, qd00Var);
    }

    public static c k() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (b.a[methodToInvoke.ordinal()]) {
            case 1:
                return new qd00();
            case 2:
                return new c();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", dh80.a.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<qd00> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (qd00.class) {
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

    public final void h() {
        Internal.IntList intList = this.sessionVerbosity_;
        if (!intList.isModifiable()) {
            this.sessionVerbosity_ = GeneratedMessageLite.mutableCopy(intList);
        }
        this.sessionVerbosity_.addInt(1);
    }

    public final dh80 i() {
        dh80 dh80VarA = dh80.a(this.sessionVerbosity_.getInt(0));
        return dh80VarA == null ? dh80.SESSION_VERBOSITY_NONE : dh80VarA;
    }

    public final int j() {
        return this.sessionVerbosity_.size();
    }

    public final void l(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }
}
