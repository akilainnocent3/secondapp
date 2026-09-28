package defpackage;

import kotlin.jvm.functions.Function2;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ft0 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((qn70) obj).getClass();
        ((wrz) obj2).getClass();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
        return httpLoggingInterceptor;
    }
}
