package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class bnp extends n1k<bnp, a> implements ynv {
    private static final bnp DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile qsz<bnp> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private ql5 value_ = ql5.b;

    public static final class a extends n1k.a<bnp, a> implements ynv {
        public a() {
            super(bnp.DEFAULT_INSTANCE);
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
        bnp bnpVar = new bnp();
        DEFAULT_INSTANCE = bnpVar;
        n1k.t(bnp.class, bnpVar);
    }

    public static a A() {
        return DEFAULT_INSTANCE.h();
    }

    public static bnp w() {
        return DEFAULT_INSTANCE;
    }

    public final void B(uaz uazVar) {
        this.outputPrefixType_ = uazVar.getNumber();
    }

    public final void C(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    public final void D(ql5.f fVar) {
        this.value_ = fVar;
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
                return new s040(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new bnp();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<bnp> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (bnp.class) {
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

    public final uaz x() {
        uaz uazVarA = uaz.a(this.outputPrefixType_);
        return uazVarA == null ? uaz.i : uazVarA;
    }

    public final String y() {
        return this.typeUrl_;
    }

    public final ql5 z() {
        return this.value_;
    }
}
