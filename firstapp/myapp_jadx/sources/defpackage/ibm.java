package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ibm extends n1k<ibm, a> implements ynv {
    private static final ibm DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile qsz<ibm> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ql5 keyValue_ = ql5.b;
    private nbm params_;
    private int version_;

    public static final class a extends n1k.a<ibm, a> implements ynv {
        public a() {
            super(ibm.DEFAULT_INSTANCE);
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
        ibm ibmVar = new ibm();
        DEFAULT_INSTANCE = ibmVar;
        n1k.t(ibm.class, ibmVar);
    }

    public static a A() {
        return DEFAULT_INSTANCE.h();
    }

    public static ibm B(ql5 ql5Var, r3h r3hVar) {
        return (ibm) n1k.r(DEFAULT_INSTANCE, ql5Var, r3hVar);
    }

    public static ibm w() {
        return DEFAULT_INSTANCE;
    }

    public final void C(ql5.f fVar) {
        this.keyValue_ = fVar;
    }

    public final void D(nbm nbmVar) {
        nbmVar.getClass();
        this.params_ = nbmVar;
    }

    public final void E() {
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
                return new s040(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new ibm();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<ibm> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (ibm.class) {
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

    public final ql5 x() {
        return this.keyValue_;
    }

    public final nbm y() {
        nbm nbmVar = this.params_;
        return nbmVar == null ? nbm.w() : nbmVar;
    }

    public final int z() {
        return this.version_;
    }
}
