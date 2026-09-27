package yads;

import android.content.Context;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class f43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jn f148972a;

    public /* synthetic */ f43() {
        this(new jn());
    }

    public final String a(Context context, String str) {
        gm0 gm0Var;
        byte[] bArrA;
        Object obj = dw2.f148384j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA == null || (gm0Var = nt2VarA.X) == null) {
            gm0Var = gm0.f149685c;
        }
        String str2 = gm0Var.f149686a;
        it1 it1Var = new it1(gm0Var.f149687b, str2);
        byte[] bytes = str.getBytes(cv.g.f77202b);
        kotlin.jvm.internal.m0.o(bytes, "getBytes(...)");
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            if (bArrDecode != null) {
                SecureRandom secureRandom = new SecureRandom();
                byte[] bArr = new byte[16];
                byte[] bArr2 = new byte[16];
                secureRandom.nextBytes(bArr2);
                secureRandom.nextBytes(bArr);
                bArrA = it1Var.a(bytes, bArr2, bArr, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode)));
            } else {
                bArrA = null;
            }
        } catch (Throwable unused) {
            boolean z10 = ad1.f146762a;
        }
        if (bArrA == null) {
            return null;
        }
        this.f148972a.getClass();
        return jn.a(bArrA);
    }

    public f43(jn jnVar) {
        this.f148972a = jnVar;
    }
}
