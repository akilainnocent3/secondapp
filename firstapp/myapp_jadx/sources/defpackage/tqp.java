package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class tqp extends n1k<tqp, a> implements ynv {
    private static final tqp DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile qsz<tqp> PARSER;
    private bnp dekTemplate_;
    private String kekUri_ = "";

    public static final class a extends n1k.a<tqp, a> implements ynv {
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
        tqp tqpVar = new tqp();
        DEFAULT_INSTANCE = tqpVar;
        n1k.t(tqp.class, tqpVar);
    }

    public static tqp v() {
        return DEFAULT_INSTANCE;
    }

    public static tqp z(ql5 ql5Var, r3h r3hVar) {
        return (tqp) n1k.r(DEFAULT_INSTANCE, ql5Var, r3hVar);
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
                return new s040(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new tqp();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<tqp> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (tqp.class) {
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

    public final bnp w() {
        bnp bnpVar = this.dekTemplate_;
        return bnpVar == null ? bnp.w() : bnpVar;
    }

    public final String x() {
        return this.kekUri_;
    }

    public final boolean y() {
        return this.dekTemplate_ != null;
    }
}
