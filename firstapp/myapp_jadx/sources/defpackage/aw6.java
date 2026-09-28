package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aw6 implements qmp.a {
    @Override // qmp.a
    public b3 a(be80 be80Var) throws GeneralSecurityException {
        zv6.a aVar;
        n630 n630Var = (n630) be80Var;
        if (!n630Var.a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            hb5.a("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
            return null;
        }
        try {
            uv6 uv6VarZ = uv6.z(n630Var.c, r3h.a());
            if (uv6VarZ.x() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            uaz uazVar = n630Var.e;
            int iOrdinal = uazVar.ordinal();
            if (iOrdinal == 1) {
                aVar = zv6.a.b;
            } else if (iOrdinal == 2) {
                aVar = zv6.a.c;
            } else if (iOrdinal == 3) {
                aVar = zv6.a.d;
            } else {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + uazVar.getNumber());
                }
                aVar = zv6.a.c;
            }
            return vv6.X(aVar, new z280(sl5.a(uv6VarZ.w().k())), n630Var.f);
        } catch (f0p unused) {
            opp.a("Parsing ChaCha20Poly1305Key failed");
            return null;
        }
    }
}
