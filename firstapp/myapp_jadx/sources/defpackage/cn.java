package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class cn extends n1k<cn, a> implements ynv {
    private static final cn DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile qsz<cn> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ql5 keyValue_ = ql5.b;
    private in params_;
    private int version_;

    public static final class a extends n1k.a<cn, a> implements ynv {
        public a() {
            super(cn.DEFAULT_INSTANCE);
        }

        @Override // n1k.a, wnv.a
        public final /* bridge */ /* synthetic */ n1k buildPartial() {
            return buildPartial();
        }

        @Override // n1k.a
        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // n1k.a, defpackage.ynv
        public final n1k getDefaultInstanceForType() {
            return this.a;
        }
    }

    static {
        cn cnVar = new cn();
        DEFAULT_INSTANCE = cnVar;
        n1k.t(cn.class, cnVar);
    }

    public static cn A(ql5 ql5Var, r3h r3hVar) {
        return (cn) n1k.r(DEFAULT_INSTANCE, ql5Var, r3hVar);
    }

    public static a z() {
        return DEFAULT_INSTANCE.h();
    }

    public final void B(ql5.f fVar) {
        this.keyValue_ = fVar;
    }

    public final void C(in inVar) {
        inVar.getClass();
        this.params_ = inVar;
    }

    public final void D() {
        this.version_ = 0;
    }

    @Override // defpackage.n1k, defpackage.ynv
    public final /* bridge */ /* synthetic */ n1k getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // defpackage.n1k
    public final Object i(n1k.f fVar) {
        qsz bVar;
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new s040(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new cn();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<cn> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (cn.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new n1k.b();
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            default:
                bl0.a();
                return null;
        }
    }

    @Override // defpackage.n1k, defpackage.wnv
    public final /* bridge */ /* synthetic */ n1k.a newBuilderForType() {
        return newBuilderForType();
    }

    public final ql5 w() {
        return this.keyValue_;
    }

    public final in x() {
        in inVar = this.params_;
        return inVar == null ? in.w() : inVar;
    }

    public final int y() {
        return this.version_;
    }
}
