package defpackage;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class pkm implements Interceptor {
    public static Response a(Interceptor.Chain chain, Request request, String str) {
        try {
            return chain.proceed(request.newBuilder().url(str).removeHeader("X-Fallback-Domain").header("X-Fallback-Domain", request.url().host()).build());
        } catch (Throwable unused) {
            return chain.proceed(request);
        }
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        int iCode;
        chain.getClass();
        Request request = chain.request();
        String i = request.url().getI();
        x8n.a.getClass();
        if (!x8n.a()) {
            return chain.proceed(request);
        }
        if (!x8n.c(i)) {
            return chain.proceed(request);
        }
        if (!x8n.b(i)) {
            return chain.proceed(request);
        }
        String strE = x8n.e(i);
        if (strE.equals(i)) {
            return chain.proceed(request);
        }
        try {
            Response responseProceed = chain.proceed(request);
            if (responseProceed.getIsSuccessful() || 500 > (iCode = responseProceed.code()) || iCode >= 600) {
                return responseProceed;
            }
            responseProceed.close();
            return a(chain, request, strE);
        } catch (IOException unused) {
            return a(chain, request, strE);
        } catch (Throwable unused2) {
            return chain.proceed(request);
        }
    }
}
