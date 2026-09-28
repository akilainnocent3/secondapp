package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zn extends gnp<wn> {

    public class a extends gnp.a<xn, wn> {
        @Override // gnp.a
        public final wnv a(wnv wnvVar) {
            xn xnVar = (xn) wnvVar;
            wn.a aVarZ = wn.z();
            byte[] bArrA = kx30.a(xnVar.w());
            ql5.f fVarC = ql5.c(bArrA, 0, bArrA.length);
            aVarZ.e();
            ((wn) aVarZ.b).B(fVarC);
            bo boVarX = xnVar.x();
            aVarZ.e();
            ((wn) aVarZ.b).C(boVarX);
            aVarZ.e();
            ((wn) aVarZ.b).D();
            return aVarZ.b();
        }

        @Override // gnp.a
        public final Map<String, gnp.a.C0605a<xn>> b() {
            HashMap map = new HashMap();
            anp.a aVar = anp.a.a;
            map.put("AES128_EAX", zn.g(16, aVar));
            anp.a aVar2 = anp.a.b;
            map.put("AES128_EAX_RAW", zn.g(16, aVar2));
            map.put("AES256_EAX", zn.g(32, aVar));
            map.put("AES256_EAX_RAW", zn.g(32, aVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // gnp.a
        public final wnv c(ql5 ql5Var) {
            return xn.z(ql5Var, r3h.a());
        }

        @Override // gnp.a
        public final void d(wnv wnvVar) throws GeneralSecurityException {
            xn xnVar = (xn) wnvVar;
            quh0.a(xnVar.w());
            if (xnVar.x().x() == 12 || xnVar.x().x() == 16) {
                return;
            }
            opp.a("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    public static gnp.a.C0605a g(int i, anp.a aVar) {
        xn.a aVarY = xn.y();
        aVarY.e();
        ((xn) aVarY.b).A(i);
        bo.a aVarY2 = bo.y();
        aVarY2.e();
        ((bo) aVarY2.b).z();
        bo boVarB = aVarY2.b();
        aVarY.e();
        ((xn) aVarY.b).B(boVarB);
        return new gnp.a.C0605a(aVarY.b(), aVar);
    }

    @Override // defpackage.gnp
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // defpackage.gnp
    public final gnp.a<xn, wn> c() {
        return new a(xn.class);
    }

    @Override // defpackage.gnp
    public final bmp.b d() {
        return bmp.b.SYMMETRIC;
    }

    @Override // defpackage.gnp
    public final wnv e(ql5 ql5Var) {
        return wn.A(ql5Var, r3h.a());
    }

    @Override // defpackage.gnp
    public final void f(wnv wnvVar) throws GeneralSecurityException {
        wn wnVar = (wn) wnvVar;
        quh0.c(wnVar.y());
        quh0.a(wnVar.w().size());
        if (wnVar.x().x() == 12 || wnVar.x().x() == 16) {
            return;
        }
        opp.a("invalid IV size; acceptable values have 12 or 16 bytes");
    }
}
