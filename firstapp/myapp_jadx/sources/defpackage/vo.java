package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vo implements qmp.a {
    @Override // qmp.a
    public final b3 a(be80 be80Var) throws GeneralSecurityException {
        n630 n630Var = (n630) be80Var;
        if (!n630Var.a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            hb5.a("Wrong type URL in call to AesGcmSivParameters.parseParameters");
            return null;
        }
        try {
            qo qoVarZ = qo.z(n630Var.c, r3h.a());
            if (qoVarZ.x() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            uo.a aVar = uo.a.d;
            int size = qoVarZ.w().size();
            if (size != 16 && size != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
            }
            uaz uazVar = n630Var.e;
            int iOrdinal = uazVar.ordinal();
            if (iOrdinal == 1) {
                aVar = uo.a.b;
            } else if (iOrdinal == 2) {
                aVar = uo.a.c;
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + uazVar.getNumber());
                }
                aVar = uo.a.c;
            }
            uo uoVar = new uo(size, aVar);
            po.a aVar2 = new po.a();
            aVar2.b = null;
            aVar2.c = null;
            aVar2.a = uoVar;
            aVar2.b = new z280(sl5.a(qoVarZ.w().k()));
            aVar2.c = n630Var.f;
            return aVar2.a();
        } catch (f0p unused) {
            opp.a("Parsing AesGcmSivKey failed");
            return null;
        }
    }
}
