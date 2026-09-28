package defpackage;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class a9n implements Interceptor {
    public final yi5 a;

    public a9n(yi5 yi5Var) {
        this.a = yi5Var;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request.Builder builderAddHeader = chain.request().newBuilder().addHeader("Accept", "image/webp,image/*,*/*;q=0.8");
        yi5 yi5Var = this.a;
        return chain.proceed(builderAddHeader.header("AppVersion", yi5Var.b().a()).header("Platform", "android").header("OSVersion", yi5Var.b().d()).header("PhoneModel", yi5Var.b().m()).build());
    }
}
