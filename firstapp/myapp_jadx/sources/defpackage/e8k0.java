package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class e8k0 extends n1k<e8k0, a> implements ynv {
    private static final e8k0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile qsz<e8k0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ql5 keyValue_ = ql5.b;
    private int version_;

    public static final class a extends n1k.a<e8k0, a> implements ynv {
        public a() {
            super(e8k0.DEFAULT_INSTANCE);
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
        e8k0 e8k0Var = new e8k0();
        DEFAULT_INSTANCE = e8k0Var;
        n1k.t(e8k0.class, e8k0Var);
    }

    public static a y() {
        return DEFAULT_INSTANCE.h();
    }

    public static e8k0 z(ql5 ql5Var, r3h r3hVar) {
        return (e8k0) n1k.r(DEFAULT_INSTANCE, ql5Var, r3hVar);
    }

    public final void A(ql5.f fVar) {
        this.keyValue_ = fVar;
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
                return new s040(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new e8k0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<e8k0> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (e8k0.class) {
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

    public final int x() {
        return this.version_;
    }
}
