package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class co implements qmp.a {
    @Override // qmp.a
    public final b3 a(be80 be80Var) throws GeneralSecurityException {
        n630 n630Var = (n630) be80Var;
        if (!n630Var.a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            hb5.a("Wrong type URL in call to AesEaxParameters.parseParameters");
            return null;
        }
        try {
            wn wnVarA = wn.A(n630Var.c, r3h.a());
            if (wnVarA.y() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ao.a aVar = ao.a.d;
            int size = wnVarA.w().size();
            if (size != 16 && size != 24 && size != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
            }
            int iX = wnVarA.x().x();
            if (iX != 12 && iX != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(iX)));
            }
            uaz uazVar = n630Var.e;
            int iOrdinal = uazVar.ordinal();
            if (iOrdinal == 1) {
                aVar = ao.a.b;
            } else if (iOrdinal == 2) {
                aVar = ao.a.c;
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + uazVar.getNumber());
                }
                aVar = ao.a.c;
            }
            ao aoVar = new ao(size, iX, 16, aVar);
            vn.a aVar2 = new vn.a();
            aVar2.b = null;
            aVar2.c = null;
            aVar2.a = aoVar;
            aVar2.b = new z280(sl5.a(wnVarA.w().k()));
            aVar2.c = n630Var.f;
            return aVar2.a();
        } catch (f0p unused) {
            opp.a("Parsing AesEaxcKey failed");
            return null;
        }
    }
}
