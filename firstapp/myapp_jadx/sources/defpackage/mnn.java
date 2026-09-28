package defpackage;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class mnn implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        String strA;
        chain.getClass();
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        String str = nnn.d;
        if (str != null && (strA = nnn.a(str)) != null && strA.length() != 0) {
            builderNewBuilder.addHeader("Sporty-Referer", strA);
        }
        return chain.proceed(builderNewBuilder.build());
    }
}
