package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes7.dex */
public final class xn50 implements zym {
    public final b5 a;

    public xn50(b5 b5Var) {
        b5Var.getClass();
        this.a = b5Var;
    }

    @Override // defpackage.zym
    public final on50 a(boolean z, OkHttpClient okHttpClient, Interceptor... interceptorArr) {
        String baseUrl;
        okHttpClient.getClass();
        Interceptor[] interceptorArr2 = (Interceptor[]) Arrays.copyOf(interceptorArr, interceptorArr.length);
        OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
        for (Interceptor interceptor : interceptorArr2) {
            builderNewBuilder.addInterceptor(interceptor);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builderNewBuilder.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).retryOnConnectionFailure(false).build();
        b5 b5Var = this.a;
        if (z) {
            baseUrl = b5Var.getBaseUrl();
            int iV = StringsKt.V(6, baseUrl, "/games");
            if (iV != -1) {
                baseUrl = StringsKt.b0(iV, 6 + iV, baseUrl).toString();
            }
        } else {
            baseUrl = b5Var.getBaseUrl();
        }
        on50.b bVar = new on50.b();
        bVar.a(baseUrl);
        bVar.c(okHttpClientBuild);
        fal falVarC = fal.c();
        ArrayList arrayList = bVar.c;
        arrayList.add(falVarC);
        arrayList.add(i5w.c());
        arrayList.add(new uy60());
        return bVar.b();
    }
}
