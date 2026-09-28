package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class um0 implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        mpe0 mpe0Var = on0.a;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(new yhl());
        builder.addInterceptor(new mzf0());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (p) on0.s(builder.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).retryOnConnectionFailure(false).build(), true).a(p.class);
    }
}
