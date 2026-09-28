package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class qn extends n1k<qn, a> implements ynv {
    private static final qn DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile qsz<qn> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ql5 keyValue_ = ql5.b;
    private tn params_;
    private int version_;

    public static final class a extends n1k.a<qn, a> implements ynv {
        public a() {
            super(qn.DEFAULT_INSTANCE);
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
        qn qnVar = new qn();
        DEFAULT_INSTANCE = qnVar;
        n1k.t(qn.class, qnVar);
    }

    public static a A() {
        return DEFAULT_INSTANCE.h();
    }

    public static qn w() {
        return DEFAULT_INSTANCE;
    }

    public final void B(ql5.f fVar) {
        this.keyValue_ = fVar;
    }

    public final void C(tn tnVar) {
        tnVar.getClass();
        this.params_ = tnVar;
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
                return new qn();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<qn> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (qn.class) {
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

    public final tn y() {
        tn tnVar = this.params_;
        return tnVar == null ? tn.w() : tnVar;
    }

    public final int z() {
        return this.version_;
    }
}
