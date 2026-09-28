package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class dn extends n1k<dn, a> implements ynv {
    private static final dn DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile qsz<dn> PARSER;
    private int keySize_;
    private in params_;

    public static final class a extends n1k.a<dn, a> implements ynv {
        public a() {
            super(dn.DEFAULT_INSTANCE);
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
        dn dnVar = new dn();
        DEFAULT_INSTANCE = dnVar;
        n1k.t(dn.class, dnVar);
    }

    public static a y() {
        return DEFAULT_INSTANCE.h();
    }

    public static dn z(ql5 ql5Var, r3h r3hVar) {
        return (dn) n1k.r(DEFAULT_INSTANCE, ql5Var, r3hVar);
    }

    public final void A() {
        this.keySize_ = 32;
    }

    public final void B(in inVar) {
        this.params_ = inVar;
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
                return new s040(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new dn();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<dn> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (dn.class) {
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

    public final int w() {
        return this.keySize_;
    }

    public final in x() {
        in inVar = this.params_;
        return inVar == null ? in.w() : inVar;
    }
}
