package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ko extends gnp<ho> {

    public class a extends gnp.a<io, ho> {
        @Override // gnp.a
        public final wnv a(wnv wnvVar) {
            ho.a aVarY = ho.y();
            byte[] bArrA = kx30.a(((io) wnvVar).w());
            ql5.f fVarC = ql5.c(bArrA, 0, bArrA.length);
            aVarY.e();
            ((ho) aVarY.b).A(fVarC);
            aVarY.e();
            ((ho) aVarY.b).B();
            return aVarY.b();
        }

        @Override // gnp.a
        public final Map<String, gnp.a.C0605a<io>> b() {
            HashMap map = new HashMap();
            anp.a aVar = anp.a.a;
            map.put("AES128_GCM", ko.g(16, aVar));
            anp.a aVar2 = anp.a.b;
            map.put("AES128_GCM_RAW", ko.g(16, aVar2));
            map.put("AES256_GCM", ko.g(32, aVar));
            map.put("AES256_GCM_RAW", ko.g(32, aVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // gnp.a
        public final wnv c(ql5 ql5Var) {
            return io.y(ql5Var, r3h.a());
        }

        @Override // gnp.a
        public final void d(wnv wnvVar) throws InvalidAlgorithmParameterException {
            quh0.a(((io) wnvVar).w());
        }
    }

    public static gnp.a.C0605a<io> g(int i, anp.a aVar) {
        io.a aVarX = io.x();
        aVarX.e();
        ((io) aVarX.b).z(i);
        return new gnp.a.C0605a<>(aVarX.b(), aVar);
    }

    @Override // defpackage.gnp
    public final byf0.a a() {
        return byf0.a.b;
    }

    @Override // defpackage.gnp
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // defpackage.gnp
    public final gnp.a<io, ho> c() {
        return new a(io.class);
    }

    @Override // defpackage.gnp
    public final bmp.b d() {
        return bmp.b.SYMMETRIC;
    }

    @Override // defpackage.gnp
    public final wnv e(ql5 ql5Var) {
        return ho.z(ql5Var, r3h.a());
    }

    @Override // defpackage.gnp
    public final void f(wnv wnvVar) throws GeneralSecurityException {
        ho hoVar = (ho) wnvVar;
        quh0.c(hoVar.x());
        quh0.a(hoVar.w().size());
    }
}
