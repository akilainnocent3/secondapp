package defpackage;

import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class m4g extends n1k<m4g, a> implements ynv {
    private static final m4g DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile qsz<m4g> PARSER;
    private ql5 encryptedKeyset_ = ql5.b;
    private qpp keysetInfo_;

    public static final class a extends n1k.a<m4g, a> implements ynv {
        public a() {
            super(m4g.DEFAULT_INSTANCE);
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
        m4g m4gVar = new m4g();
        DEFAULT_INSTANCE = m4gVar;
        n1k.t(m4g.class, m4gVar);
    }

    public static a x() {
        return DEFAULT_INSTANCE.h();
    }

    public static m4g y(ByteArrayInputStream byteArrayInputStream, r3h r3hVar) throws f0p {
        n1k n1kVarS = n1k.s(DEFAULT_INSTANCE, new m08.b(byteArrayInputStream), r3hVar);
        n1k.g(n1kVarS);
        return (m4g) n1kVarS;
    }

    public final void A(qpp qppVar) {
        this.keysetInfo_ = qppVar;
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
                return new s040(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new m4g();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qsz<m4g> qszVar = PARSER;
                if (qszVar != null) {
                    return qszVar;
                }
                synchronized (m4g.class) {
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
        return this.encryptedKeyset_;
    }

    public final void z(ql5.f fVar) {
        this.encryptedKeyset_ = fVar;
    }
}
