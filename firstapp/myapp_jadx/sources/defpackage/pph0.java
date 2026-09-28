package defpackage;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class pph0 implements Interceptor {
    public final diu a;
    public final Context b;

    public pph0(diu diuVar, Context context) {
        diuVar.getClass();
        this.a = diuVar;
        this.b = context;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        f00 f00Var = vgb0.a;
        String appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(this.b);
        String str = this.a.e;
        String strConcat = str != null ? "&".concat(str) : null;
        if (strConcat == null) {
            strConcat = "";
        }
        builderNewBuilder.addHeader("User-metadata", "appsFlyerId=" + appsFlyerUID + strConcat);
        return chain.proceed(builderNewBuilder.build());
    }
}
