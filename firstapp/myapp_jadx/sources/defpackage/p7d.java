package defpackage;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class p7d implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        String strA;
        chain.getClass();
        Request request = chain.request();
        Request.Builder builderNewBuilder = request.newBuilder();
        String str = r7d.b;
        if (str != null && (strA = nnn.a(str)) != null && strA.length() != 0) {
            String strHeader = request.header("Sporty-Referer");
            if (strHeader == null || strHeader.length() == 0) {
                builderNewBuilder.addHeader("Sporty-Referer", strA);
            } else if (strHeader.equalsIgnoreCase("no_source=unknown")) {
                builderNewBuilder.header("Sporty-Referer", strA);
            }
        }
        return chain.proceed(builderNewBuilder.build());
    }
}
