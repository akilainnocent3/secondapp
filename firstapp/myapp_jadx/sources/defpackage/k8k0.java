package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k8k0 implements qmp.a {
    @Override // qmp.a
    public final b3 a(be80 be80Var) throws GeneralSecurityException {
        j8k0.a aVar;
        n630 n630Var = (n630) be80Var;
        if (!n630Var.a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            hb5.a("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
            return null;
        }
        try {
            e8k0 e8k0VarZ = e8k0.z(n630Var.c, r3h.a());
            if (e8k0VarZ.x() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            uaz uazVar = n630Var.e;
            int iOrdinal = uazVar.ordinal();
            if (iOrdinal == 1) {
                aVar = j8k0.a.b;
            } else if (iOrdinal == 2) {
                aVar = j8k0.a.c;
            } else if (iOrdinal == 3) {
                aVar = j8k0.a.d;
            } else {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + uazVar.getNumber());
                }
                aVar = j8k0.a.c;
            }
            return f8k0.X(aVar, new z280(sl5.a(e8k0VarZ.w().k())), n630Var.f);
        } catch (f0p unused) {
            opp.a("Parsing XChaCha20Poly1305Key failed");
            return null;
        }
    }
}
