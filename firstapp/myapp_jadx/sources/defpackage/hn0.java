package defpackage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class hn0 implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        mpe0 mpe0Var = on0.a;
        HttpLoggingInterceptor httpLoggingInterceptorT = on0.t();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(httpLoggingInterceptorT);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builder.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).retryOnConnectionFailure(false).build();
        on50.b bVar = new on50.b();
        bVar.a("https://api.giphy.com/v1/gifs/");
        bVar.c(okHttpClientBuild);
        fal falVarC = fal.c();
        ArrayList arrayList = bVar.c;
        arrayList.add(falVarC);
        arrayList.add(i5w.c());
        arrayList.add(new uy60());
        return (bik) bVar.b().a(bik.class);
    }
}
