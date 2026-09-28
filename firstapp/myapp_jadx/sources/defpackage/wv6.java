package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wv6 extends n1k<wv6, a> implements ynv {
    private static final wv6 DEFAULT_INSTANCE;
    private static volatile qsz<wv6> PARSER;

    public static final class a extends n1k.a<wv6, a> implements ynv {
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
        wv6 wv6Var = new wv6();
        DEFAULT_INSTANCE = wv6Var;
        n1k.t(wv6.class, wv6Var);
    }

    public static wv6 v() {
        return DEFAULT_INSTANCE;
    }

    public static wv6 w(ql5 ql5Var, r3h r3hVar) {
        return (wv6) n1k.r(DEFAULT_INSTANCE, ql5Var, r3hVar);
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
                return new s040(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new wv6();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<wv6> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (wv6.class) {
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
