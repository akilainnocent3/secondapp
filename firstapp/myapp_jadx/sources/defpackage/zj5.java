package defpackage;

import android.util.Base64;
import com.sporty.android.common.network.data.BaseResponse;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes4.dex */
public final class zj5 implements iob0 {
    public final ysm a;
    public final str<oo0> b;
    public final t5g c;

    public zj5(ysm ysmVar, str<oo0> strVar, t5g t5gVar) {
        ysmVar.getClass();
        strVar.getClass();
        this.a = ysmVar;
        this.b = strVar;
        this.c = t5gVar;
    }

    public final void b() throws NoSuchAlgorithmException, IOException {
        xdp xdpVar;
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128, new SecureRandom());
        String strEncodeToString = Base64.encodeToString(keyGenerator.generateKey().getEncoded(), 2);
        String strE = e();
        t5g t5gVarD = d();
        strEncodeToString.getClass();
        t5gVarD.b().edit().putString(strE, strEncodeToString).commit();
        if (vn20.d("com.sportybet.key_encrypted", strE, null) != null && t5gVarD.c != null) {
            vn20.a("com.sportybet.key_encrypted").edit().remove(strE).commit();
        }
        bi50<BaseResponse<xdp>> bi50VarExecute = this.b.get().a(this.a.a().a, vn20.e(d(), e())).execute();
        BaseResponse<xdp> baseResponse = bi50VarExecute.b;
        if (!bi50VarExecute.a.getIsSuccessful() || baseResponse == null || !baseResponse.isSuccessful() || (xdpVar = baseResponse.data) == null) {
            i08.a("Business key failed");
            return;
        }
        String strB = lal.b(xdpVar, "transId");
        t5g t5gVarD2 = d();
        strB.getClass();
        t5gVarD2.b().edit().putString("com.sportybet.transId", strB).commit();
        if (vn20.d("com.sportybet.key_encrypted", "com.sportybet.transId", null) == null || t5gVarD2.c == null) {
            return;
        }
        vn20.a("com.sportybet.key_encrypted").edit().remove("com.sportybet.transId").commit();
    }

    public final o c() {
        boolean zA = iob0.a();
        t5g t5gVar = this.c;
        return zA ? new n(t5gVar, e()) : new m(t5gVar, e());
    }

    public final t5g d() {
        return this.c;
    }

    public final String e() {
        return iob0.a() ? "com.sportbey.custom.aesgcm.key" : "com.sportbey.custom.aeskey";
    }
}
