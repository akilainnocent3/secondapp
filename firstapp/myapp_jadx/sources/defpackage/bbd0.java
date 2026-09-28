package defpackage;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes8.dex */
public final class bbd0 {
    public static final bbd0 b = new bbd0();
    public final cbd0 a;

    public bbd0() {
        OkHttpClient okHttpClientBuild = new OkHttpClient.Builder().addInterceptor(new dbd0()).addInterceptor(new HttpLoggingInterceptor()).build();
        on50.b bVar = new on50.b();
        bVar.a("https://flickball.api.on.sportybet2.com/");
        bVar.c(okHttpClientBuild);
        bVar.c.add(fal.c());
        this.a = (cbd0) bVar.b().a(cbd0.class);
    }
}
