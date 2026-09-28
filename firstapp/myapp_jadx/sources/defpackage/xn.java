package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xn extends n1k<xn, a> implements ynv {
    private static final xn DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile qsz<xn> PARSER;
    private int keySize_;
    private bo params_;

    public static final class a extends n1k.a<xn, a> implements ynv {
        public a() {
            super(xn.DEFAULT_INSTANCE);
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
        xn xnVar = new xn();
        DEFAULT_INSTANCE = xnVar;
        n1k.t(xn.class, xnVar);
    }

    public static a y() {
        return DEFAULT_INSTANCE.h();
    }

    public static xn z(ql5 ql5Var, r3h r3hVar) {
        return (xn) n1k.r(DEFAULT_INSTANCE, ql5Var, r3hVar);
    }

    public final void A(int i) {
        this.keySize_ = i;
    }

    public final void B(bo boVar) {
        this.params_ = boVar;
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
                return new s040(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new xn();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<xn> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (xn.class) {
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

    public final bo x() {
        bo boVar = this.params_;
        return boVar == null ? bo.w() : boVar;
    }
}
