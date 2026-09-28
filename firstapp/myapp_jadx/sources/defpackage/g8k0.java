package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class g8k0 extends n1k<g8k0, a> implements ynv {
    private static final g8k0 DEFAULT_INSTANCE;
    private static volatile qsz<g8k0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;

    public static final class a extends n1k.a<g8k0, a> implements ynv {
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
        g8k0 g8k0Var = new g8k0();
        DEFAULT_INSTANCE = g8k0Var;
        n1k.t(g8k0.class, g8k0Var);
    }

    public static g8k0 v() {
        return DEFAULT_INSTANCE;
    }

    public static g8k0 w(ql5 ql5Var, r3h r3hVar) {
        return (g8k0) n1k.r(DEFAULT_INSTANCE, ql5Var, r3hVar);
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
                return new s040(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
            case 3:
                return new g8k0();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<g8k0> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (g8k0.class) {
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
}
