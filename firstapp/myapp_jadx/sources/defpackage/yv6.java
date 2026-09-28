package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class yv6 extends gnp<uv6> {

    public class a extends gnp.a<wv6, uv6> {
        @Override // gnp.a
        public final wnv a(wnv wnvVar) {
            uv6.a aVarY = uv6.y();
            aVarY.e();
            ((uv6) aVarY.b).B();
            byte[] bArrA = kx30.a(32);
            ql5.f fVarC = ql5.c(bArrA, 0, bArrA.length);
            aVarY.e();
            ((uv6) aVarY.b).A(fVarC);
            return aVarY.b();
        }

        @Override // gnp.a
        public final Map<String, gnp.a.C0605a<wv6>> b() {
            HashMap map = new HashMap();
            map.put("CHACHA20_POLY1305", new gnp.a.C0605a(wv6.v(), anp.a.a));
            map.put("CHACHA20_POLY1305_RAW", new gnp.a.C0605a(wv6.v(), anp.a.b));
            return Collections.unmodifiableMap(map);
        }

        @Override // gnp.a
        public final wnv c(ql5 ql5Var) {
            return wv6.w(ql5Var, r3h.a());
        }

        @Override // gnp.a
        public final void d(wnv wnvVar) {
        }
    }

    @Override // defpackage.gnp
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // defpackage.gnp
    public final gnp.a<wv6, uv6> c() {
        return new a(wv6.class);
    }

    @Override // defpackage.gnp
    public final bmp.b d() {
        return bmp.b.SYMMETRIC;
    }

    @Override // defpackage.gnp
    public final wnv e(ql5 ql5Var) {
        return uv6.z(ql5Var, r3h.a());
    }

    @Override // defpackage.gnp
    public final void f(wnv wnvVar) throws GeneralSecurityException {
        uv6 uv6Var = (uv6) wnvVar;
        quh0.c(uv6Var.x());
        if (uv6Var.w().size() == 32) {
            return;
        }
        opp.a("invalid ChaCha20Poly1305Key: incorrect key length");
    }
}
