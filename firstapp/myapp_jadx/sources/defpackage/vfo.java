package defpackage;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class vfo implements Interceptor {
    public final mgb0 a;
    public final psm b;
    public final ysm c;
    public final yi5 d;

    public vfo(mgb0 mgb0Var, psm psmVar, ysm ysmVar, yi5 yi5Var) {
        this.a = mgb0Var;
        this.b = psmVar;
        this.c = ysmVar;
        this.d = yi5Var;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        String languageCode = this.a.getLanguageCode();
        if (languageCode.length() <= 0) {
            languageCode = null;
        }
        if (languageCode != null) {
            builderNewBuilder.addHeader("accept-language", languageCode);
        }
        yi5 yi5Var = this.d;
        String strA = yi5Var.b().a();
        builderNewBuilder.addHeader("app-version", strA);
        builderNewBuilder.addHeader("AppVersion", strA);
        psm psmVar = this.b;
        builderNewBuilder.addHeader("country-code", psmVar.getCountryCode().getCode());
        builderNewBuilder.addHeader("currency", psmVar.B());
        builderNewBuilder.addHeader("DeviceId", this.c.a().a);
        builderNewBuilder.addHeader("download-source", yi5Var.b().l());
        builderNewBuilder.addHeader("iv-api-level", "16");
        builderNewBuilder.addHeader("Platform", "android");
        builderNewBuilder.addHeader("user-country", psmVar.getCountryCode().getCode());
        builderNewBuilder.addHeader("version-code", String.valueOf(yi5Var.b().getVersionCode()));
        return chain.proceed(builderNewBuilder.build());
    }
}
