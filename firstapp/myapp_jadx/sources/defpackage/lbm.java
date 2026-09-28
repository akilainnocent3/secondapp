package defpackage;

import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class lbm extends gnp<ibm> {
    public static final yv20 d = new yv20(hbm.class, new kbm());

    public final class a extends aw20<uhu, ibm> {
        @Override // defpackage.aw20
        public final uhu a(wnv wnvVar) throws GeneralSecurityException {
            ibm ibmVar = (ibm) wnvVar;
            sel selVarX = ibmVar.y().x();
            SecretKeySpec secretKeySpec = new SecretKeySpec(ibmVar.x().k(), "HMAC");
            int iY = ibmVar.y().y();
            int iOrdinal = selVarX.ordinal();
            if (iOrdinal == 1) {
                return new br20(new ar20("HMACSHA1", secretKeySpec), iY);
            }
            if (iOrdinal == 2) {
                return new br20(new ar20("HMACSHA384", secretKeySpec), iY);
            }
            if (iOrdinal == 3) {
                return new br20(new ar20("HMACSHA256", secretKeySpec), iY);
            }
            if (iOrdinal == 4) {
                return new br20(new ar20("HMACSHA512", secretKeySpec), iY);
            }
            if (iOrdinal == 5) {
                return new br20(new ar20("HMACSHA224", secretKeySpec), iY);
            }
            opp.a("unknown hash");
            return null;
        }
    }

    public class b extends gnp.a<jbm, ibm> {
        @Override // gnp.a
        public final wnv a(wnv wnvVar) {
            jbm jbmVar = (jbm) wnvVar;
            ibm.a aVarA = ibm.A();
            aVarA.e();
            ((ibm) aVarA.b).E();
            nbm nbmVarY = jbmVar.y();
            aVarA.e();
            ((ibm) aVarA.b).D(nbmVarY);
            byte[] bArrA = kx30.a(jbmVar.x());
            ql5.f fVarC = ql5.c(bArrA, 0, bArrA.length);
            aVarA.e();
            ((ibm) aVarA.b).C(fVarC);
            return aVarA.b();
        }

        @Override // gnp.a
        public final Map<String, gnp.a.C0605a<jbm>> b() {
            HashMap map = new HashMap();
            sel selVar = sel.SHA256;
            anp.a aVar = anp.a.a;
            map.put("HMAC_SHA256_128BITTAG", lbm.g(32, 16, selVar, aVar));
            anp.a aVar2 = anp.a.b;
            map.put("HMAC_SHA256_128BITTAG_RAW", lbm.g(32, 16, selVar, aVar2));
            map.put("HMAC_SHA256_256BITTAG", lbm.g(32, 32, selVar, aVar));
            map.put("HMAC_SHA256_256BITTAG_RAW", lbm.g(32, 32, selVar, aVar2));
            sel selVar2 = sel.SHA512;
            map.put("HMAC_SHA512_128BITTAG", lbm.g(64, 16, selVar2, aVar));
            map.put("HMAC_SHA512_128BITTAG_RAW", lbm.g(64, 16, selVar2, aVar2));
            map.put("HMAC_SHA512_256BITTAG", lbm.g(64, 32, selVar2, aVar));
            map.put("HMAC_SHA512_256BITTAG_RAW", lbm.g(64, 32, selVar2, aVar2));
            map.put("HMAC_SHA512_512BITTAG", lbm.g(64, 64, selVar2, aVar));
            map.put("HMAC_SHA512_512BITTAG_RAW", lbm.g(64, 64, selVar2, aVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // gnp.a
        public final wnv c(ql5 ql5Var) {
            return jbm.A(ql5Var, r3h.a());
        }

        @Override // gnp.a
        public final void d(wnv wnvVar) throws GeneralSecurityException {
            jbm jbmVar = (jbm) wnvVar;
            if (jbmVar.x() >= 16) {
                lbm.h(jbmVar.y());
            } else {
                opp.a("key too short");
            }
        }
    }

    public static gnp.a.C0605a<jbm> g(int i, int i2, sel selVar, anp.a aVar) {
        jbm.a aVarZ = jbm.z();
        nbm.a aVarZ2 = nbm.z();
        aVarZ2.e();
        ((nbm) aVarZ2.b).A(selVar);
        aVarZ2.e();
        ((nbm) aVarZ2.b).B(i2);
        nbm nbmVarB = aVarZ2.b();
        aVarZ.e();
        ((jbm) aVarZ.b).C(nbmVarB);
        aVarZ.e();
        ((jbm) aVarZ.b).B(i);
        return new gnp.a.C0605a<>(aVarZ.b(), aVar);
    }

    @Override // defpackage.gnp
    public final byf0.a a() {
        return byf0.a.b;
    }

    @Override // defpackage.gnp
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // defpackage.gnp
    public final gnp.a<jbm, ibm> c() {
        return new b(jbm.class);
    }

    @Override // defpackage.gnp
    public final bmp.b d() {
        return bmp.b.SYMMETRIC;
    }

    @Override // defpackage.gnp
    public final wnv e(ql5 ql5Var) {
        return ibm.B(ql5Var, r3h.a());
    }

    @Override // defpackage.gnp
    public final void f(wnv wnvVar) throws GeneralSecurityException {
        ibm ibmVar = (ibm) wnvVar;
        quh0.c(ibmVar.z());
        if (ibmVar.x().size() >= 16) {
            h(ibmVar.y());
        } else {
            opp.a("key too short");
        }
    }

    public static void h(nbm nbmVar) throws GeneralSecurityException {
        if (nbmVar.y() >= 10) {
            int iOrdinal = nbmVar.x().ordinal();
            String str = LGxrN.XeGkXUvcvRJRmz;
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            if (iOrdinal == 5) {
                                if (nbmVar.y() > 28) {
                                    opp.a(str);
                                    return;
                                }
                                return;
                            }
                            opp.a("unknown hash type");
                            return;
                        }
                        if (nbmVar.y() > 64) {
                            opp.a(str);
                            return;
                        }
                        return;
                    }
                    if (nbmVar.y() > 32) {
                        opp.a(str);
                        return;
                    }
                    return;
                }
                if (nbmVar.y() > 48) {
                    opp.a(str);
                    return;
                }
                return;
            }
            if (nbmVar.y() <= 20) {
                return;
            }
            opp.a(str);
            return;
        }
        opp.a("tag size too small");
    }
}
