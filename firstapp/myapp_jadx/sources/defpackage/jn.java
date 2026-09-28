package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jn implements qmp.a {
    @Override // qmp.a
    public final b3 a(be80 be80Var) throws GeneralSecurityException {
        n630 n630Var = (n630) be80Var;
        if (!n630Var.a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            hb5.a("Wrong type URL in call to AesCmacParameters.parseParameters");
            return null;
        }
        try {
            cn cnVarA = cn.A(n630Var.c, r3h.a());
            if (cnVarA.y() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            hn.a aVar = new hn.a();
            aVar.a = null;
            aVar.b = null;
            aVar.c = hn.b.e;
            aVar.b(cnVarA.w().size());
            int iX = cnVarA.x().x();
            if (iX < 10 || 16 < iX) {
                throw new GeneralSecurityException(hce0.a(iX, "Invalid tag size for AesCmacParameters: "));
            }
            aVar.b = Integer.valueOf(iX);
            aVar.c = kn.a(n630Var.e);
            hn hnVarA = aVar.a();
            bn.a aVar2 = new bn.a();
            aVar2.b = null;
            aVar2.c = null;
            aVar2.a = hnVarA;
            aVar2.b = new z280(sl5.a(cnVarA.w().k()));
            aVar2.c = n630Var.f;
            return aVar2.a();
        } catch (f0p | IllegalArgumentException unused) {
            opp.a("Parsing AesCmacKey failed");
            return null;
        }
    }
}
