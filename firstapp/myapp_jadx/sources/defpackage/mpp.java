package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class mpp extends n1k<mpp, a> implements ynv {
    private static final mpp DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile qsz<mpp> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private gyo.c<b> key_ = x630.d;
    private int primaryKeyId_;

    public static final class a extends n1k.a<mpp, a> implements ynv {
        public a() {
            super(mpp.DEFAULT_INSTANCE);
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
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile qsz<b> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private bmp keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

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

        public static a B() {
            return DEFAULT_INSTANCE.h();
        }

        public final boolean A() {
            return this.keyData_ != null;
        }

        public final void C(bmp bmpVar) {
            this.keyData_ = bmpVar;
        }

        public final void D(int i) {
            this.keyId_ = i;
        }

        public final void E(uaz uazVar) {
            this.outputPrefixType_ = uazVar.getNumber();
        }

        public final void F() {
            this.status_ = zmp.ENABLED.getNumber();
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
                    return new s040(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
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

        public final bmp w() {
            bmp bmpVar = this.keyData_;
            return bmpVar == null ? bmp.w() : bmpVar;
        }

        public final int x() {
            return this.keyId_;
        }

        public final uaz y() {
            uaz uazVarA = uaz.a(this.outputPrefixType_);
            return uazVarA == null ? uaz.i : uazVarA;
        }

        public final zmp z() {
            zmp zmpVar;
            int i = this.status_;
            if (i == 0) {
                zmpVar = zmp.UNKNOWN_STATUS;
            } else if (i == 1) {
                zmpVar = zmp.ENABLED;
            } else if (i != 2) {
                zmpVar = i != 3 ? null : zmp.DESTROYED;
            } else {
                zmpVar = zmp.DISABLED;
            }
            return zmpVar == null ? zmp.UNRECOGNIZED : zmpVar;
        }
    }

    static {
        mpp mppVar = new mpp();
        DEFAULT_INSTANCE = mppVar;
        n1k.t(mpp.class, mppVar);
    }

    public static a B() {
        return DEFAULT_INSTANCE.h();
    }

    public static mpp C(ByteArrayInputStream byteArrayInputStream, r3h r3hVar) throws f0p {
        n1k n1kVarS = n1k.s(DEFAULT_INSTANCE, new m08.b(byteArrayInputStream), r3hVar);
        n1k.g(n1kVarS);
        return (mpp) n1kVarS;
    }

    public static mpp D(byte[] bArr, r3h r3hVar) throws f0p {
        mpp mppVar = DEFAULT_INSTANCE;
        int length = bArr.length;
        mpp mppVarQ = mppVar.q();
        try {
            u630 u630Var = u630.c;
            u630Var.getClass();
            an70 an70VarA = u630Var.a(mppVarQ.getClass());
            an70VarA.f(mppVarQ, bArr, 0, length, new fx0.a(r3hVar));
            an70VarA.makeImmutable(mppVarQ);
            n1k.g(mppVarQ);
            return mppVarQ;
        } catch (f0p e) {
            if (e.a) {
                throw new f0p(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof f0p) {
                throw ((f0p) e2.getCause());
            }
            throw new f0p(e2.getMessage(), e2);
        } catch (IndexOutOfBoundsException unused) {
            throw f0p.g();
        } catch (vdh0 e3) {
            throw new f0p(e3.getMessage());
        }
    }

    public final int A() {
        return this.primaryKeyId_;
    }

    public final void E(int i) {
        this.primaryKeyId_ = i;
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
                return new s040(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", b.class});
            case 3:
                return new mpp();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<mpp> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (mpp.class) {
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
        gyo.c<b> cVar = this.key_;
        if (!cVar.isModifiable()) {
            int size = cVar.size();
            this.key_ = cVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        this.key_.add(bVar);
    }

    public final b x(int i) {
        return this.key_.get(i);
    }

    public final int y() {
        return this.key_.size();
    }

    public final List<b> z() {
        return this.key_;
    }
}
