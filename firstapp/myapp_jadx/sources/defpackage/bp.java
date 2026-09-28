package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class bp extends gnp<yo> {

    public class a extends gnp.a<zo, yo> {
        @Override // gnp.a
        public final wnv a(wnv wnvVar) {
            yo.a aVarY = yo.y();
            byte[] bArrA = kx30.a(((zo) wnvVar).w());
            ql5.f fVarC = ql5.c(bArrA, 0, bArrA.length);
            aVarY.e();
            ((yo) aVarY.b).A(fVarC);
            aVarY.e();
            ((yo) aVarY.b).B();
            return aVarY.b();
        }

        @Override // gnp.a
        public final Map<String, gnp.a.C0605a<zo>> b() {
            HashMap map = new HashMap();
            zo.a aVarX = zo.x();
            aVarX.e();
            ((zo) aVarX.b).z();
            map.put("AES256_SIV", new gnp.a.C0605a(aVarX.b(), anp.a.a));
            zo.a aVarX2 = zo.x();
            aVarX2.e();
            ((zo) aVarX2.b).z();
            map.put("AES256_SIV_RAW", new gnp.a.C0605a(aVarX2.b(), anp.a.b));
            return Collections.unmodifiableMap(map);
        }

        @Override // gnp.a
        public final wnv c(ql5 ql5Var) {
            return zo.y(ql5Var, r3h.a());
        }

        @Override // gnp.a
        public final void d(wnv wnvVar) throws InvalidAlgorithmParameterException {
            zo zoVar = (zo) wnvVar;
            if (zoVar.w() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + zoVar.w() + ". Valid keys must have 64 bytes.");
        }
    }

    @Override // defpackage.gnp
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // defpackage.gnp
    public final gnp.a<zo, yo> c() {
        return new a(zo.class);
    }

    @Override // defpackage.gnp
    public final bmp.b d() {
        return bmp.b.SYMMETRIC;
    }

    @Override // defpackage.gnp
    public final wnv e(ql5 ql5Var) {
        return yo.z(ql5Var, r3h.a());
    }

    @Override // defpackage.gnp
    public final void f(wnv wnvVar) throws GeneralSecurityException {
        yo yoVar = (yo) wnvVar;
        quh0.c(yoVar.x());
        if (yoVar.w().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + yoVar.w().size() + ". Valid keys must have 64 bytes.");
    }
}
