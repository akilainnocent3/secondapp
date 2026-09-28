package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mo implements qmp.a {
    @Override // qmp.a
    public final b3 a(be80 be80Var) throws GeneralSecurityException {
        n630 n630Var = (n630) be80Var;
        if (!n630Var.a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            hb5.a("Wrong type URL in call to AesGcmParameters.parseParameters");
            return null;
        }
        try {
            ho hoVarZ = ho.z(n630Var.c, r3h.a());
            if (hoVarZ.x() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            lo.a aVar = lo.a.d;
            int size = hoVarZ.w().size();
            if (size != 16 && size != 24 && size != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
            }
            uaz uazVar = n630Var.e;
            int iOrdinal = uazVar.ordinal();
            if (iOrdinal == 1) {
                aVar = lo.a.b;
            } else if (iOrdinal == 2) {
                aVar = lo.a.c;
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + uazVar.getNumber());
                }
                aVar = lo.a.c;
            }
            lo loVar = new lo(size, 12, 16, aVar);
            go.a aVar2 = new go.a();
            aVar2.b = null;
            aVar2.c = null;
            aVar2.a = loVar;
            aVar2.b = new z280(sl5.a(hoVarZ.w().k()));
            aVar2.c = n630Var.f;
            return aVar2.a();
        } catch (f0p unused) {
            opp.a("Parsing AesGcmKey failed");
            return null;
        }
    }
}
