package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class jbm extends n1k<jbm, a> implements ynv {
    private static final jbm DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile qsz<jbm> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private nbm params_;
    private int version_;

    public static final class a extends n1k.a<jbm, a> implements ynv {
        public a() {
            super(jbm.DEFAULT_INSTANCE);
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
        jbm jbmVar = new jbm();
        DEFAULT_INSTANCE = jbmVar;
        n1k.t(jbm.class, jbmVar);
    }

    public static jbm A(ql5 ql5Var, r3h r3hVar) {
        return (jbm) n1k.r(DEFAULT_INSTANCE, ql5Var, r3hVar);
    }

    public static jbm w() {
        return DEFAULT_INSTANCE;
    }

    public static a z() {
        return DEFAULT_INSTANCE.h();
    }

    public final void B(int i) {
        this.keySize_ = i;
    }

    public final void C(nbm nbmVar) {
        this.params_ = nbmVar;
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
                return new s040(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new jbm();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<jbm> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (jbm.class) {
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

    public final int x() {
        return this.keySize_;
    }

    public final nbm y() {
        nbm nbmVar = this.params_;
        return nbmVar == null ? nbm.w() : nbmVar;
    }
}
