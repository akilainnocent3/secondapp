package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class sqp extends n1k<sqp, a> implements ynv {
    private static final sqp DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile qsz<sqp> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private tqp params_;
    private int version_;

    public static final class a extends n1k.a<sqp, a> implements ynv {
        public a() {
            super(sqp.DEFAULT_INSTANCE);
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
        sqp sqpVar = new sqp();
        DEFAULT_INSTANCE = sqpVar;
        n1k.t(sqp.class, sqpVar);
    }

    public static a y() {
        return DEFAULT_INSTANCE.h();
    }

    public static sqp z(ql5 ql5Var, r3h r3hVar) {
        return (sqp) n1k.r(DEFAULT_INSTANCE, ql5Var, r3hVar);
    }

    public final void A(tqp tqpVar) {
        tqpVar.getClass();
        this.params_ = tqpVar;
    }

    public final void B() {
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
                return new s040(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new sqp();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<sqp> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (sqp.class) {
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

    public final tqp w() {
        tqp tqpVar = this.params_;
        return tqpVar == null ? tqp.v() : tqpVar;
    }

    public final int x() {
        return this.version_;
    }
}
