package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class kn {
    public static final zrz a;
    public static final xrz b;
    public static final wmp c;
    public static final pmp d;

    static {
        sl5 sl5VarB = hrh0.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        a = new zrz(hn.class);
        b = new xrz(sl5VarB);
        c = new wmp(bn.class);
        d = new pmp(sl5VarB, new jn());
    }

    public static hn.b a(uaz uazVar) throws GeneralSecurityException {
        int iOrdinal = uazVar.ordinal();
        if (iOrdinal == 1) {
            return hn.b.b;
        }
        if (iOrdinal == 2) {
            return hn.b.d;
        }
        if (iOrdinal == 3) {
            return hn.b.e;
        }
        if (iOrdinal == 4) {
            return hn.b.c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + uazVar.getNumber());
    }
}
