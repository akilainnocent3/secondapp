package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class pbm {
    public static final zrz a;
    public static final xrz b;
    public static final wmp c;
    public static final pmp d;

    static {
        sl5 sl5VarB = hrh0.b("type.googleapis.com/google.crypto.tink.HmacKey");
        a = new zrz(mbm.class);
        b = new xrz(sl5VarB);
        c = new wmp(hbm.class);
        d = new pmp(sl5VarB, new obm());
    }

    public static mbm.b a(sel selVar) throws GeneralSecurityException {
        int iOrdinal = selVar.ordinal();
        if (iOrdinal == 1) {
            return mbm.b.b;
        }
        if (iOrdinal == 2) {
            return mbm.b.e;
        }
        if (iOrdinal == 3) {
            return mbm.b.d;
        }
        if (iOrdinal == 4) {
            return mbm.b.f;
        }
        if (iOrdinal == 5) {
            return mbm.b.c;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + selVar.getNumber());
    }

    public static mbm.c b(uaz uazVar) throws GeneralSecurityException {
        int iOrdinal = uazVar.ordinal();
        if (iOrdinal == 1) {
            return mbm.c.b;
        }
        if (iOrdinal == 2) {
            return mbm.c.d;
        }
        if (iOrdinal == 3) {
            return mbm.c.e;
        }
        if (iOrdinal == 4) {
            return mbm.c.c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + uazVar.getNumber());
    }
}
