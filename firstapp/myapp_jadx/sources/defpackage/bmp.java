package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class bmp extends n1k<bmp, a> implements ynv {
    private static final bmp DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile qsz<bmp> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private ql5 value_ = ql5.b;

    public static final class a extends n1k.a<bmp, a> implements ynv {
        public a() {
            super(bmp.DEFAULT_INSTANCE);
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

    public enum b implements gyo.a {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        public final int a;

        b(int i) {
            this.a = i;
        }

        @Override // gyo.a
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.a;
            }
            hb5.a("Can't get the number of an unknown enum value.");
            return 0;
        }
    }

    static {
        bmp bmpVar = new bmp();
        DEFAULT_INSTANCE = bmpVar;
        n1k.t(bmp.class, bmpVar);
    }

    public static a A() {
        return DEFAULT_INSTANCE.h();
    }

    public static bmp w() {
        return DEFAULT_INSTANCE;
    }

    public final void B(b bVar) {
        this.keyMaterialType_ = bVar.getNumber();
    }

    public final void C(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    public final void D(ql5 ql5Var) {
        ql5Var.getClass();
        this.value_ = ql5Var;
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
                return new s040(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new bmp();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<bmp> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (bmp.class) {
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

    public final b x() {
        b bVar;
        int i = this.keyMaterialType_;
        if (i == 0) {
            bVar = b.UNKNOWN_KEYMATERIAL;
        } else if (i == 1) {
            bVar = b.SYMMETRIC;
        } else if (i == 2) {
            bVar = b.ASYMMETRIC_PRIVATE;
        } else if (i != 3) {
            bVar = i != 4 ? null : b.REMOTE;
        } else {
            bVar = b.ASYMMETRIC_PUBLIC;
        }
        return bVar == null ? b.UNRECOGNIZED : bVar;
    }

    public final String y() {
        return this.typeUrl_;
    }

    public final ql5 z() {
        return this.value_;
    }
}
