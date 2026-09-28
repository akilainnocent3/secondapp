package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class nbm extends n1k<nbm, a> implements ynv {
    private static final nbm DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile qsz<nbm> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    public static final class a extends n1k.a<nbm, a> implements ynv {
        public a() {
            super(nbm.DEFAULT_INSTANCE);
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
        nbm nbmVar = new nbm();
        DEFAULT_INSTANCE = nbmVar;
        n1k.t(nbm.class, nbmVar);
    }

    public static nbm w() {
        return DEFAULT_INSTANCE;
    }

    public static a z() {
        return DEFAULT_INSTANCE.h();
    }

    public final void A(sel selVar) {
        this.hash_ = selVar.getNumber();
    }

    public final void B(int i) {
        this.tagSize_ = i;
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
                return new s040(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 3:
                return new nbm();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<nbm> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (nbm.class) {
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

    public final sel x() {
        sel selVar;
        int i = this.hash_;
        if (i == 0) {
            selVar = sel.UNKNOWN_HASH;
        } else if (i == 1) {
            selVar = sel.SHA1;
        } else if (i == 2) {
            selVar = sel.SHA384;
        } else if (i == 3) {
            selVar = sel.SHA256;
        } else if (i != 4) {
            selVar = i != 5 ? null : sel.SHA224;
        } else {
            selVar = sel.SHA512;
        }
        return selVar == null ? sel.UNRECOGNIZED : selVar;
    }

    public final int y() {
        return this.tagSize_;
    }
}
