package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class qpp extends n1k<qpp, a> implements ynv {
    private static final qpp DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile qsz<qpp> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private gyo.c<b> keyInfo_ = x630.d;
    private int primaryKeyId_;

    public static final class a extends n1k.a<qpp, a> implements ynv {
        public a() {
            super(qpp.DEFAULT_INSTANCE);
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

    public static final class b extends n1k<b, a> implements ynv {
        private static final b DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile qsz<b> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        public static final class a extends n1k.a<b, a> implements ynv {
            public a() {
                super(b.DEFAULT_INSTANCE);
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
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            n1k.t(b.class, bVar);
        }

        public static a x() {
            return DEFAULT_INSTANCE.h();
        }

        public final void A(zmp zmpVar) {
            this.status_ = zmpVar.getNumber();
        }

        public final void B(String str) {
            str.getClass();
            this.typeUrl_ = str;
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
                    return new s040(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 3:
                    return new b();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qsz<b> qszVar = PARSER;
                    if (qszVar != null) {
                        return qszVar;
                    }
                    synchronized (b.class) {
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
            return this.keyId_;
        }

        public final void y(int i) {
            this.keyId_ = i;
        }

        public final void z(uaz uazVar) {
            this.outputPrefixType_ = uazVar.getNumber();
        }
    }

    static {
        qpp qppVar = new qpp();
        DEFAULT_INSTANCE = qppVar;
        n1k.t(qpp.class, qppVar);
    }

    public static a y() {
        return DEFAULT_INSTANCE.h();
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
                return new s040(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", b.class});
            case 3:
                return new qpp();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<qpp> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (qpp.class) {
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

    public final void w(b bVar) {
        gyo.c<b> cVar = this.keyInfo_;
        if (!cVar.isModifiable()) {
            int size = cVar.size();
            this.keyInfo_ = cVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        this.keyInfo_.add(bVar);
    }

    public final b x() {
        return this.keyInfo_.get(0);
    }

    public final void z(int i) {
        this.primaryKeyId_ = i;
    }
}
