package defpackage;

import java.util.Map;
import kotlin.text.c;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class u72 implements Interceptor {
    public final cbg a;
    public final mpe0 b;

    public interface a {
        u72 a();
    }

    public u72(cbg cbgVar) {
        cbgVar.getClass();
        this.a = cbgVar;
        this.b = hwr.b(new t72(this, 0));
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request request = chain.request();
        String strB = v70.b(request.url().scheme(), "://", request.url().host(), "/");
        String str = (String) ((Map) this.b.getValue()).get(strB);
        if (str == null) {
            return chain.proceed(request);
        }
        HttpUrl httpUrl = HttpUrl.INSTANCE.parse(c.p(request.url().getI(), strB, str, false));
        if (httpUrl != null) {
            return chain.proceed(request.newBuilder().url(httpUrl).build());
        }
        ib5.a("Invalid URL ".concat(str));
        return null;
    }
}
