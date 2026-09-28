package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class l8 implements iob0 {
    public final ysm a;
    public final str<xxz> b;
    public final t5g c;

    public l8(ysm ysmVar, str<xxz> strVar, t5g t5gVar) {
        ysmVar.getClass();
        strVar.getClass();
        this.a = ysmVar;
        this.b = strVar;
        this.c = t5gVar;
    }

    public final void b() throws IOException {
        xdp xdpVar;
        bi50<BaseResponse<xdp>> bi50VarExecute = this.b.get().E1(this.a.a().a).execute();
        BaseResponse<xdp> baseResponse = bi50VarExecute.b;
        if (!bi50VarExecute.a.getIsSuccessful() || baseResponse == null || !baseResponse.isSuccessful() || (xdpVar = baseResponse.data) == null) {
            i08.a("Please check your internet connection and try again.");
            return;
        }
        String strB = lal.b(xdpVar, "password");
        xdp xdpVar2 = baseResponse.data;
        xdpVar2.getClass();
        String strB2 = lal.b(xdpVar2, "ursId");
        String strE = e();
        t5g t5gVarD = d();
        strB.getClass();
        t5gVarD.b().edit().putString(strE, strB).commit();
        if (vn20.d("com.sportybet.key_encrypted", strE, null) != null && t5gVarD.c != null) {
            vn20.a("com.sportybet.key_encrypted").edit().remove(strE).commit();
        }
        t5g t5gVarD2 = d();
        strB2.getClass();
        t5gVarD2.b().edit().putString("com.sportybet.ursid", strB2).commit();
        if (vn20.d("com.sportybet.key_encrypted", "com.sportybet.ursid", null) == null || t5gVarD2.c == null) {
            return;
        }
        vn20.a("com.sportybet.key_encrypted").edit().remove("com.sportybet.ursid").commit();
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
        return iob0.a() ? "com.sportybet.aes.gcm.key" : "com.sportybet.aeskey";
    }
}
