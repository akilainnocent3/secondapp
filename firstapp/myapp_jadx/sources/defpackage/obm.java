package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class obm implements qmp.a {
    @Override // qmp.a
    public final b3 a(be80 be80Var) throws GeneralSecurityException {
        n630 n630Var = (n630) be80Var;
        if (!n630Var.a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            hb5.a("Wrong type URL in call to HmacProtoSerialization.parseKey");
            return null;
        }
        try {
            ibm ibmVarB = ibm.B(n630Var.c, r3h.a());
            if (ibmVarB.z() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            mbm.a aVar = new mbm.a();
            aVar.a = null;
            aVar.b = null;
            aVar.c = null;
            aVar.d = mbm.c.e;
            aVar.a = Integer.valueOf(ibmVarB.x().size());
            aVar.b = Integer.valueOf(ibmVarB.y().y());
            aVar.c = pbm.a(ibmVarB.y().x());
            aVar.d = pbm.b(n630Var.e);
            mbm mbmVarA = aVar.a();
            hbm.a aVar2 = new hbm.a();
            aVar2.b = null;
            aVar2.c = null;
            aVar2.a = mbmVarA;
            aVar2.b = new z280(sl5.a(ibmVarB.x().k()));
            aVar2.c = n630Var.f;
            return aVar2.a();
        } catch (f0p | IllegalArgumentException unused) {
            opp.a("Parsing HmacKey failed");
            return null;
        }
    }
}
