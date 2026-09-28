package defpackage;

import java.io.File;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes5.dex */
public final class ran implements l730 {
    public static OkHttpClient a(pan panVar, Interceptor[] interceptorArr, File file) {
        file.getClass();
        OkHttpClient okHttpClientA = pn50.a(null, interceptorArr, null, null, null, new Cache(file, zjh.a(file)), 509);
        jm20.a(okHttpClientA);
        return okHttpClientA;
    }
}
