package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wm0 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ wm0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                OkHttpClient.Builder builderAddInterceptor = new OkHttpClient.Builder().addInterceptor(new yhl()).addInterceptor(new mzf0()).addInterceptor(new pkm());
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return builderAddInterceptor.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).retryOnConnectionFailure(false).build();
            default:
                return Unit.a;
        }
    }
}
