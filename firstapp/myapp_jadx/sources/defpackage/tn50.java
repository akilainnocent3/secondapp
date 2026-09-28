package defpackage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes8.dex */
public final class tn50 {
    public static on50 a(String str, Interceptor[] interceptorArr) {
        on50.b bVar = new on50.b();
        OkHttpClient.Builder builderFollowRedirects = new OkHttpClient().newBuilder().followRedirects(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderWriteTimeout = builderFollowRedirects.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit);
        for (Interceptor interceptor : interceptorArr) {
            builderWriteTimeout.addInterceptor(interceptor);
        }
        builderWriteTimeout.eventListener(new fcd());
        bVar.c(builderWriteTimeout.build());
        bVar.a(str);
        uy60 uy60Var = new uy60();
        ArrayList arrayList = bVar.c;
        arrayList.add(uy60Var);
        arrayList.add(fal.c());
        bVar.d.add(new n760());
        return bVar.b();
    }
}
