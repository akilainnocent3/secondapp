package defpackage;

import android.os.Build;
import android.text.TextUtils;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class ra20 implements Interceptor {
    public final uqm a;
    public final psm b;
    public final aoh0 c;
    public final ysm d;
    public final yi5 e;
    public final cbg f;

    public ra20(uqm uqmVar, psm psmVar, aoh0 aoh0Var, ysm ysmVar, yi5 yi5Var, cbg cbgVar) {
        this.a = uqmVar;
        this.b = psmVar;
        this.c = aoh0Var;
        this.d = ysmVar;
        this.e = yi5Var;
        this.f = cbgVar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Request.Builder builderHeader = chain.request().newBuilder().header("ClientId", "app");
        try {
            builderHeader.header("PhoneModel", Build.MODEL);
        } catch (Exception unused) {
        }
        String lastAccessToken = this.a.getLastAccessToken();
        if (!TextUtils.isEmpty(lastAccessToken)) {
            builderHeader.header("Authorization", lastAccessToken);
        }
        String str = this.f.b().h;
        Request.Builder builderHeader2 = builderHeader.header("Device-Id", this.d.a().a).header("App-Version", this.e.b().a()).header("Platform", "android");
        StringBuilder sb = new StringBuilder();
        psm psmVar = this.b;
        sb.append(psmVar.getCountryCode());
        if (str == null) {
            str = "";
        }
        sb.append(str);
        builderHeader2.header("countryCode", sb.toString()).header("Channel", "sportybet").header("ApiLevel", String.valueOf(13)).header("OperId", psmVar.k()).header("OSVersion", Build.VERSION.RELEASE);
        String str2 = (String) this.c.d.getValue();
        if (!TextUtils.isEmpty(str2)) {
            builderHeader.header("User-Agent", str2);
        }
        return chain.proceed(builderHeader.build());
    }
}
