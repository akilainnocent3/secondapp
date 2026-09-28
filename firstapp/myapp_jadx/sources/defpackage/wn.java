package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wn extends n1k<wn, a> implements ynv {
    private static final wn DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile qsz<wn> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ql5 keyValue_ = ql5.b;
    private bo params_;
    private int version_;

    public static final class a extends n1k.a<wn, a> implements ynv {
        public a() {
            super(wn.DEFAULT_INSTANCE);
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
        wn wnVar = new wn();
        DEFAULT_INSTANCE = wnVar;
        n1k.t(wn.class, wnVar);
    }

    public static wn A(ql5 ql5Var, r3h r3hVar) {
        return (wn) n1k.r(DEFAULT_INSTANCE, ql5Var, r3hVar);
    }

    public static a z() {
        return DEFAULT_INSTANCE.h();
    }

    public final void B(ql5.f fVar) {
        this.keyValue_ = fVar;
    }

    public final void C(bo boVar) {
        boVar.getClass();
        this.params_ = boVar;
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
                return new s040(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new wn();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<wn> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (wn.class) {
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

    public final bo x() {
        bo boVar = this.params_;
        return boVar == null ? bo.w() : boVar;
    }

    public final int y() {
        return this.version_;
    }
}
