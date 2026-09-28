package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class hn80 implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return builder.connectTimeout(2L, timeUnit).readTimeout(7L, timeUnit).writeTimeout(7L, timeUnit).addInterceptor(new pkm()).build();
    }
}
