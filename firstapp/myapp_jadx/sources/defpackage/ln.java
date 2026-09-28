package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ln extends n1k<ln, a> implements ynv {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final ln DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile qsz<ln> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private qn aesCtrKey_;
    private ibm hmacKey_;
    private int version_;

    public static final class a extends n1k.a<ln, a> implements ynv {
        public a() {
            super(ln.DEFAULT_INSTANCE);
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
        ln lnVar = new ln();
        DEFAULT_INSTANCE = lnVar;
        n1k.t(ln.class, lnVar);
    }

    public static ln A(ql5 ql5Var, r3h r3hVar) {
        return (ln) n1k.r(DEFAULT_INSTANCE, ql5Var, r3hVar);
    }

    public static a z() {
        return DEFAULT_INSTANCE.h();
    }

    public final void B(qn qnVar) {
        qnVar.getClass();
        this.aesCtrKey_ = qnVar;
    }

    public final void C(ibm ibmVar) {
        ibmVar.getClass();
        this.hmacKey_ = ibmVar;
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
                return new s040(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new ln();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<ln> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (ln.class) {
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

    public final qn w() {
        qn qnVar = this.aesCtrKey_;
        return qnVar == null ? qn.w() : qnVar;
    }

    public final ibm x() {
        ibm ibmVar = this.hmacKey_;
        return ibmVar == null ? ibm.w() : ibmVar;
    }

    public final int y() {
        return this.version_;
    }
}
