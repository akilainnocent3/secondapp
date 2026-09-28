package defpackage;

import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class gn extends gnp<cn> {
    public static final yv20 d = new yv20(bn.class, new en());

    public class a extends gnp.a<dn, cn> {
        @Override // gnp.a
        public final wnv a(wnv wnvVar) {
            dn dnVar = (dn) wnvVar;
            cn.a aVarZ = cn.z();
            aVarZ.e();
            ((cn) aVarZ.b).D();
            byte[] bArrA = kx30.a(dnVar.w());
            ql5.f fVarC = ql5.c(bArrA, 0, bArrA.length);
            aVarZ.e();
            ((cn) aVarZ.b).B(fVarC);
            in inVarX = dnVar.x();
            aVarZ.e();
            ((cn) aVarZ.b).C(inVarX);
            return aVarZ.b();
        }

        @Override // gnp.a
        public final Map<String, gnp.a.C0605a<dn>> b() {
            HashMap map = new HashMap();
            dn.a aVarY = dn.y();
            aVarY.e();
            ((dn) aVarY.b).A();
            in.a aVarY2 = in.y();
            aVarY2.e();
            ((in) aVarY2.b).z();
            in inVarB = aVarY2.b();
            aVarY.e();
            ((dn) aVarY.b).B(inVarB);
            dn dnVarB = aVarY.b();
            anp.a aVar = anp.a.a;
            map.put("AES_CMAC", new gnp.a.C0605a(dnVarB, aVar));
            dn.a aVarY3 = dn.y();
            aVarY3.e();
            ((dn) aVarY3.b).A();
            in.a aVarY4 = in.y();
            aVarY4.e();
            ((in) aVarY4.b).z();
            in inVarB2 = aVarY4.b();
            aVarY3.e();
            ((dn) aVarY3.b).B(inVarB2);
            map.put("AES256_CMAC", new gnp.a.C0605a(aVarY3.b(), aVar));
            dn.a aVarY5 = dn.y();
            aVarY5.e();
            ((dn) aVarY5.b).A();
            in.a aVarY6 = in.y();
            aVarY6.e();
            ((in) aVarY6.b).z();
            in inVarB3 = aVarY6.b();
            aVarY5.e();
            ((dn) aVarY5.b).B(inVarB3);
            map.put("AES256_CMAC_RAW", new gnp.a.C0605a(aVarY5.b(), anp.a.b));
            return Collections.unmodifiableMap(map);
        }

        @Override // gnp.a
        public final wnv c(ql5 ql5Var) {
            return dn.z(ql5Var, r3h.a());
        }

        @Override // gnp.a
        public final void d(wnv wnvVar) throws GeneralSecurityException {
            dn dnVar = (dn) wnvVar;
            gn.g(dnVar.x());
            if (dnVar.w() == 32) {
                return;
            }
            opp.a(siPCzPFw.YZHtEox);
        }
    }

    public static void g(in inVar) throws GeneralSecurityException {
        if (inVar.x() < 10) {
            opp.a("tag size too short");
        } else {
            if (inVar.x() <= 16) {
                return;
            }
            opp.a("tag size too long");
        }
    }

    @Override // defpackage.gnp
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // defpackage.gnp
    public final gnp.a<dn, cn> c() {
        return new a(dn.class);
    }

    @Override // defpackage.gnp
    public final bmp.b d() {
        return bmp.b.SYMMETRIC;
    }

    @Override // defpackage.gnp
    public final wnv e(ql5 ql5Var) {
        return cn.A(ql5Var, r3h.a());
    }

    @Override // defpackage.gnp
    public final void f(wnv wnvVar) throws GeneralSecurityException {
        cn cnVar = (cn) wnvVar;
        quh0.c(cnVar.y());
        if (cnVar.w().size() == 32) {
            g(cnVar.x());
        } else {
            opp.a("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
