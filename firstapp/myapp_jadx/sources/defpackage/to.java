package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class to extends gnp<qo> {

    public class a extends gnp.a<ro, qo> {
        @Override // gnp.a
        public final wnv a(wnv wnvVar) {
            qo.a aVarY = qo.y();
            byte[] bArrA = kx30.a(((ro) wnvVar).w());
            ql5.f fVarC = ql5.c(bArrA, 0, bArrA.length);
            aVarY.e();
            ((qo) aVarY.b).A(fVarC);
            aVarY.e();
            ((qo) aVarY.b).B();
            return aVarY.b();
        }

        @Override // gnp.a
        public final Map<String, gnp.a.C0605a<ro>> b() {
            HashMap map = new HashMap();
            anp.a aVar = anp.a.a;
            map.put("AES128_GCM_SIV", to.g(16, aVar));
            anp.a aVar2 = anp.a.b;
            map.put("AES128_GCM_SIV_RAW", to.g(16, aVar2));
            map.put("AES256_GCM_SIV", to.g(32, aVar));
            map.put("AES256_GCM_SIV_RAW", to.g(32, aVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // gnp.a
        public final wnv c(ql5 ql5Var) {
            return ro.y(ql5Var, r3h.a());
        }

        @Override // gnp.a
        public final void d(wnv wnvVar) throws InvalidAlgorithmParameterException {
            quh0.a(((ro) wnvVar).w());
        }
    }

    public static gnp.a.C0605a<ro> g(int i, anp.a aVar) {
        ro.a aVarX = ro.x();
        aVarX.e();
        ((ro) aVarX.b).z(i);
        return new gnp.a.C0605a<>(aVarX.b(), aVar);
    }

    @Override // defpackage.gnp
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // defpackage.gnp
    public final gnp.a<ro, qo> c() {
        return new a(ro.class);
    }

    @Override // defpackage.gnp
    public final bmp.b d() {
        return bmp.b.SYMMETRIC;
    }

    @Override // defpackage.gnp
    public final wnv e(ql5 ql5Var) {
        return qo.z(ql5Var, r3h.a());
    }

    @Override // defpackage.gnp
    public final void f(wnv wnvVar) throws GeneralSecurityException {
        qo qoVar = (qo) wnvVar;
        quh0.c(qoVar.x());
        quh0.a(qoVar.w().size());
    }
}
