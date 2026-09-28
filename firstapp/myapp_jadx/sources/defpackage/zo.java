package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zo extends n1k<zo, a> implements ynv {
    private static final zo DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile qsz<zo> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int keySize_;
    private int version_;

    public static final class a extends n1k.a<zo, a> implements ynv {
        public a() {
            super(zo.DEFAULT_INSTANCE);
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
        zo zoVar = new zo();
        DEFAULT_INSTANCE = zoVar;
        n1k.t(zo.class, zoVar);
    }

    public static a x() {
        return DEFAULT_INSTANCE.h();
    }

    public static zo y(ql5 ql5Var, r3h r3hVar) {
        return (zo) n1k.r(DEFAULT_INSTANCE, ql5Var, r3hVar);
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
                return new s040(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"keySize_", "version_"});
            case 3:
                return new zo();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<zo> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (zo.class) {
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

    public final void z() {
        this.keySize_ = 64;
    }
}
