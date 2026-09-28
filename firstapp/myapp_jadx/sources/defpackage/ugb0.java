package defpackage;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class ugb0 implements Interceptor {
    public final cbg a;

    public ugb0(cbg cbgVar) {
        cbgVar.getClass();
        this.a = cbgVar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        String str = this.a.b().g;
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        builderNewBuilder.addHeader("Authorization", str);
        return chain.proceed(builderNewBuilder.build());
    }
}
