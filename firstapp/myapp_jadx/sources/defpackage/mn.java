package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class mn extends n1k<mn, a> implements ynv {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final mn DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile qsz<mn> PARSER;
    private rn aesCtrKeyFormat_;
    private jbm hmacKeyFormat_;

    public static final class a extends n1k.a<mn, a> implements ynv {
        public a() {
            super(mn.DEFAULT_INSTANCE);
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
        mn mnVar = new mn();
        DEFAULT_INSTANCE = mnVar;
        n1k.t(mn.class, mnVar);
    }

    public static a y() {
        return DEFAULT_INSTANCE.h();
    }

    public static mn z(ql5 ql5Var, r3h r3hVar) {
        return (mn) n1k.r(DEFAULT_INSTANCE, ql5Var, r3hVar);
    }

    public final void A(rn rnVar) {
        this.aesCtrKeyFormat_ = rnVar;
    }

    public final void B(jbm jbmVar) {
        this.hmacKeyFormat_ = jbmVar;
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
                return new s040(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new mn();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<mn> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (mn.class) {
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

    public final rn w() {
        rn rnVar = this.aesCtrKeyFormat_;
        return rnVar == null ? rn.w() : rnVar;
    }

    public final jbm x() {
        jbm jbmVar = this.hmacKeyFormat_;
        return jbmVar == null ? jbm.w() : jbmVar;
    }
}
