package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class on extends gnp<ln> {

    public class a extends gnp.a<mn, ln> {
        @Override // gnp.a
        public final wnv a(wnv wnvVar) {
            mn mnVar = (mn) wnvVar;
            aw20[] aw20VarArr = {new sn(xen.class)};
            HashMap map = new HashMap();
            for (aw20 aw20Var : aw20VarArr) {
                boolean zContainsKey = map.containsKey(aw20Var.a);
                Class<PrimitiveT> cls = aw20Var.a;
                if (zContainsKey) {
                    hb5.a(kv50.a(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    return null;
                }
                map.put(cls, aw20Var);
            }
            if (aw20VarArr.length > 0) {
                GenericDeclaration genericDeclaration = aw20VarArr[0].a;
            }
            Collections.unmodifiableMap(map);
            rn rnVarW = mnVar.w();
            qn.a aVarA = qn.A();
            tn tnVarY = rnVarW.y();
            aVarA.e();
            ((qn) aVarA.b).C(tnVarY);
            byte[] bArrA = kx30.a(rnVarW.x());
            ql5.f fVarC = ql5.c(bArrA, 0, bArrA.length);
            aVarA.e();
            ((qn) aVarA.b).B(fVarC);
            aVarA.e();
            ((qn) aVarA.b).D();
            qn qnVarB = aVarA.b();
            aw20[] aw20VarArr2 = {new lbm.a(uhu.class)};
            HashMap map2 = new HashMap();
            for (aw20 aw20Var2 : aw20VarArr2) {
                boolean zContainsKey2 = map2.containsKey(aw20Var2.a);
                Class<PrimitiveT> cls2 = aw20Var2.a;
                if (zContainsKey2) {
                    hb5.a(kv50.a(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    return null;
                }
                map2.put(cls2, aw20Var2);
            }
            if (aw20VarArr2.length > 0) {
                GenericDeclaration genericDeclaration2 = aw20VarArr2[0].a;
            }
            Collections.unmodifiableMap(map2);
            jbm jbmVarX = mnVar.x();
            ibm.a aVarA2 = ibm.A();
            aVarA2.e();
            ((ibm) aVarA2.b).E();
            nbm nbmVarY = jbmVarX.y();
            aVarA2.e();
            ((ibm) aVarA2.b).D(nbmVarY);
            byte[] bArrA2 = kx30.a(jbmVarX.x());
            ql5.f fVarC2 = ql5.c(bArrA2, 0, bArrA2.length);
            aVarA2.e();
            ((ibm) aVarA2.b).C(fVarC2);
            ibm ibmVarB = aVarA2.b();
            ln.a aVarZ = ln.z();
            aVarZ.e();
            ((ln) aVarZ.b).B(qnVarB);
            aVarZ.e();
            ((ln) aVarZ.b).C(ibmVarB);
            aVarZ.e();
            ((ln) aVarZ.b).D();
            return aVarZ.b();
        }

        @Override // gnp.a
        public final Map<String, gnp.a.C0605a<mn>> b() {
            HashMap map = new HashMap();
            anp.a aVar = anp.a.a;
            map.put("AES128_CTR_HMAC_SHA256", on.g(16, 16, aVar));
            anp.a aVar2 = anp.a.b;
            map.put("AES128_CTR_HMAC_SHA256_RAW", on.g(16, 16, aVar2));
            map.put("AES256_CTR_HMAC_SHA256", on.g(32, 32, aVar));
            map.put("AES256_CTR_HMAC_SHA256_RAW", on.g(32, 32, aVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // gnp.a
        public final wnv c(ql5 ql5Var) {
            return mn.z(ql5Var, r3h.a());
        }

        @Override // gnp.a
        public final void d(wnv wnvVar) throws GeneralSecurityException {
            mn mnVar = (mn) wnvVar;
            aw20[] aw20VarArr = {new sn(xen.class)};
            HashMap map = new HashMap();
            for (aw20 aw20Var : aw20VarArr) {
                boolean zContainsKey = map.containsKey(aw20Var.a);
                Class<PrimitiveT> cls = aw20Var.a;
                if (zContainsKey) {
                    hb5.a(kv50.a(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    return;
                }
                map.put(cls, aw20Var);
            }
            if (aw20VarArr.length > 0) {
                GenericDeclaration genericDeclaration = aw20VarArr[0].a;
            }
            Collections.unmodifiableMap(map);
            rn rnVarW = mnVar.w();
            quh0.a(rnVarW.x());
            tn tnVarY = rnVarW.y();
            if (tnVarY.x() < 12 || tnVarY.x() > 16) {
                opp.a("invalid IV size");
                return;
            }
            aw20[] aw20VarArr2 = {new lbm.a(uhu.class)};
            HashMap map2 = new HashMap();
            for (aw20 aw20Var2 : aw20VarArr2) {
                boolean zContainsKey2 = map2.containsKey(aw20Var2.a);
                Class<PrimitiveT> cls2 = aw20Var2.a;
                if (zContainsKey2) {
                    hb5.a(kv50.a(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    return;
                }
                map2.put(cls2, aw20Var2);
            }
            if (aw20VarArr2.length > 0) {
                GenericDeclaration genericDeclaration2 = aw20VarArr2[0].a;
            }
            Collections.unmodifiableMap(map2);
            jbm jbmVarX = mnVar.x();
            if (jbmVarX.x() < 16) {
                opp.a("key too short");
            } else {
                lbm.h(jbmVarX.y());
                quh0.a(mnVar.w().x());
            }
        }
    }

    public static gnp.a.C0605a g(int i, int i2, anp.a aVar) {
        rn.a aVarZ = rn.z();
        tn.a aVarY = tn.y();
        aVarY.e();
        ((tn) aVarY.b).z();
        tn tnVarB = aVarY.b();
        aVarZ.e();
        ((rn) aVarZ.b).B(tnVarB);
        aVarZ.e();
        ((rn) aVarZ.b).A(i);
        rn rnVarB = aVarZ.b();
        jbm.a aVarZ2 = jbm.z();
        nbm.a aVarZ3 = nbm.z();
        aVarZ3.e();
        ((nbm) aVarZ3.b).A(sel.SHA256);
        aVarZ3.e();
        ((nbm) aVarZ3.b).B(i2);
        nbm nbmVarB = aVarZ3.b();
        aVarZ2.e();
        ((jbm) aVarZ2.b).C(nbmVarB);
        aVarZ2.e();
        ((jbm) aVarZ2.b).B(32);
        jbm jbmVarB = aVarZ2.b();
        mn.a aVarY2 = mn.y();
        aVarY2.e();
        ((mn) aVarY2.b).A(rnVarB);
        aVarY2.e();
        ((mn) aVarY2.b).B(jbmVarB);
        return new gnp.a.C0605a(aVarY2.b(), aVar);
    }

    @Override // defpackage.gnp
    public final byf0.a a() {
        return byf0.a.b;
    }

    @Override // defpackage.gnp
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // defpackage.gnp
    public final gnp.a<mn, ln> c() {
        return new a(mn.class);
    }

    @Override // defpackage.gnp
    public final bmp.b d() {
        return bmp.b.SYMMETRIC;
    }

    @Override // defpackage.gnp
    public final wnv e(ql5 ql5Var) {
        return ln.A(ql5Var, r3h.a());
    }

    @Override // defpackage.gnp
    public final void f(wnv wnvVar) throws GeneralSecurityException {
        ln lnVar = (ln) wnvVar;
        quh0.c(lnVar.y());
        aw20[] aw20VarArr = {new sn(xen.class)};
        HashMap map = new HashMap();
        aw20 aw20Var = aw20VarArr[0];
        boolean zContainsKey = map.containsKey(aw20Var.a);
        Class<PrimitiveT> cls = aw20Var.a;
        if (zContainsKey) {
            hb5.a(kv50.a(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map.put(cls, aw20Var);
        GenericDeclaration genericDeclaration = aw20VarArr[0].a;
        Collections.unmodifiableMap(map);
        qn qnVarW = lnVar.w();
        quh0.c(qnVarW.z());
        quh0.a(qnVarW.x().size());
        tn tnVarY = qnVarW.y();
        if (tnVarY.x() < 12 || tnVarY.x() > 16) {
            opp.a("invalid IV size");
            return;
        }
        aw20[] aw20VarArr2 = {new lbm.a(uhu.class)};
        HashMap map2 = new HashMap();
        aw20 aw20Var2 = aw20VarArr2[0];
        boolean zContainsKey2 = map2.containsKey(aw20Var2.a);
        Class<PrimitiveT> cls2 = aw20Var2.a;
        if (zContainsKey2) {
            hb5.a(kv50.a(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map2.put(cls2, aw20Var2);
        GenericDeclaration genericDeclaration2 = aw20VarArr2[0].a;
        Collections.unmodifiableMap(map2);
        ibm ibmVarX = lnVar.x();
        quh0.c(ibmVarX.z());
        if (ibmVarX.x().size() >= 16) {
            lbm.h(ibmVarX.y());
        } else {
            opp.a("key too short");
        }
    }
}
