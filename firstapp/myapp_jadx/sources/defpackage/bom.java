package defpackage;

import okhttp3.Interceptor;

/* JADX INFO: loaded from: classes8.dex */
public interface bom<REQUEST, RESPONSE> {
    String a(Interceptor.Chain chain);

    default String c(Interceptor.Chain chain, Object obj) {
        return null;
    }

    default String d(Interceptor.Chain chain, Object obj) {
        return null;
    }
}
