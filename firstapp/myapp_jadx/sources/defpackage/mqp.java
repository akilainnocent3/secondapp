package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class mqp extends n1k<mqp, a> implements ynv {
    private static final mqp DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile qsz<mqp> PARSER;
    private String keyUri_ = "";

    public static final class a extends n1k.a<mqp, a> implements ynv {
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
        mqp mqpVar = new mqp();
        DEFAULT_INSTANCE = mqpVar;
        n1k.t(mqp.class, mqpVar);
    }

    public static mqp v() {
        return DEFAULT_INSTANCE;
    }

    public static mqp x(ql5 ql5Var, r3h r3hVar) {
        return (mqp) n1k.r(DEFAULT_INSTANCE, ql5Var, r3hVar);
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
                return new s040(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 3:
                return new mqp();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<mqp> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (mqp.class) {
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

    public final String w() {
        return this.keyUri_;
    }
}
