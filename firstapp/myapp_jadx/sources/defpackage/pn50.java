package defpackage;

import java.io.File;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import okhttp3.Cache;
import okhttp3.ConnectionPool;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes8.dex */
public final class pn50 {

    public static final class a implements Interceptor {
        public static final a a = new a();

        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) throws UnknownHostException {
            chain.getClass();
            Request request = chain.request();
            try {
                return chain.proceed(request);
            } catch (UnknownHostException e) {
                String message = e.getMessage();
                if (message != null && StringsKt.M(message, ". url: ", false)) {
                    throw e;
                }
                String i = request.url().getI();
                String message2 = e.getMessage();
                if (message2 == null) {
                    message2 = e.getClass().getSimpleName();
                }
                UnknownHostException unknownHostException = new UnknownHostException(tug.a(message2, ". url: ", i));
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        }
    }

    public static OkHttpClient a(File file, Interceptor[] interceptorArr, yly ylyVar, hzi0 hzi0Var, ConnectionPool connectionPool, Cache cache, int i) {
        Interceptor interceptor = null;
        if ((i & 1) != 0) {
            file = null;
        }
        if ((i & 2) != 0) {
            interceptorArr = null;
        }
        if ((i & 4) != 0) {
            ylyVar = null;
        }
        if ((i & 8) != 0) {
            hzi0Var = null;
        }
        if ((i & 32) != 0) {
            connectionPool = null;
        }
        boolean z = (i & 64) != 0;
        long j = (i & 128) != 0 ? 30L : 60L;
        if ((i & 512) != 0) {
            cache = file != null ? new Cache(file, 10485760L) : null;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        int i2 = rpm.a;
        OkHttpClient.Builder builderRetryOnConnectionFailure = builder.proxySelector(new qpm()).connectTimeout(j, timeUnit).readTimeout(j, timeUnit).writeTimeout(j, timeUnit).callTimeout(j, timeUnit).retryOnConnectionFailure(z);
        if (cache != null) {
            builderRetryOnConnectionFailure.cache(cache);
        }
        builderRetryOnConnectionFailure.eventListener(new qn50());
        if (interceptorArr != null) {
            for (Interceptor interceptor2 : interceptorArr) {
                if (interceptor2 instanceof czm) {
                    interceptor = interceptor2;
                    break;
                }
            }
        }
        if (interceptor != null) {
            builderRetryOnConnectionFailure.addNetworkInterceptor(interceptor);
        }
        if (connectionPool != null) {
            builderRetryOnConnectionFailure.connectionPool(connectionPool);
        }
        if (ylyVar != null) {
            builderRetryOnConnectionFailure.authenticator(ylyVar);
        }
        if (hzi0Var != null) {
            builderRetryOnConnectionFailure.cookieJar(hzi0Var);
        }
        if (interceptorArr != null) {
            for (Interceptor interceptor3 : interceptorArr) {
                builderRetryOnConnectionFailure.addInterceptor(interceptor3);
            }
        }
        builderRetryOnConnectionFailure.addInterceptor(a.a);
        return builderRetryOnConnectionFailure.build();
    }

    public static on50 b(String str, str strVar, Function0 function0, cj50 cj50Var, int i) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        boolean z = (i & 8) == 0;
        boolean z2 = (i & 16) != 0;
        if ((i & 32) != 0) {
            cj50Var = null;
        }
        str.getClass();
        strVar.getClass();
        on50.b bVar = new on50.b();
        bVar.a(str);
        bVar.a = new sn50(strVar, function0);
        ArrayList arrayList = bVar.c;
        if (z) {
            arrayList.add(fal.c());
        } else {
            arrayList.add(new uy60());
            arrayList.add(fal.c());
        }
        ArrayList arrayList2 = bVar.d;
        if (cj50Var != null) {
            arrayList2.add(new es60(cj50Var.a, cj50Var.b));
        }
        if (z2) {
            arrayList2.add(new n760());
        }
        return bVar.b();
    }
}
