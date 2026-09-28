package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class i8k0 extends gnp<e8k0> {

    public class a extends gnp.a<g8k0, e8k0> {
        @Override // gnp.a
        public final wnv a(wnv wnvVar) {
            e8k0.a aVarY = e8k0.y();
            aVarY.e();
            ((e8k0) aVarY.b).B();
            byte[] bArrA = kx30.a(32);
            ql5.f fVarC = ql5.c(bArrA, 0, bArrA.length);
            aVarY.e();
            ((e8k0) aVarY.b).A(fVarC);
            return aVarY.b();
        }

        @Override // gnp.a
        public final Map<String, gnp.a.C0605a<g8k0>> b() {
            HashMap map = new HashMap();
            map.put("XCHACHA20_POLY1305", new gnp.a.C0605a(g8k0.v(), anp.a.a));
            map.put("XCHACHA20_POLY1305_RAW", new gnp.a.C0605a(g8k0.v(), anp.a.b));
            return Collections.unmodifiableMap(map);
        }

        @Override // gnp.a
        public final wnv c(ql5 ql5Var) {
            return g8k0.w(ql5Var, r3h.a());
        }

        @Override // gnp.a
        public final void d(wnv wnvVar) {
        }
    }

    @Override // defpackage.gnp
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // defpackage.gnp
    public final gnp.a<g8k0, e8k0> c() {
        return new a(g8k0.class);
    }

    @Override // defpackage.gnp
    public final bmp.b d() {
        return bmp.b.SYMMETRIC;
    }

    @Override // defpackage.gnp
    public final wnv e(ql5 ql5Var) {
        return e8k0.z(ql5Var, r3h.a());
    }

    @Override // defpackage.gnp
    public final void f(wnv wnvVar) throws GeneralSecurityException {
        e8k0 e8k0Var = (e8k0) wnvVar;
        quh0.c(e8k0Var.x());
        if (e8k0Var.w().size() == 32) {
            return;
        }
        opp.a("invalid XChaCha20Poly1305Key: incorrect key length");
    }
}
