package defpackage;

import com.google.firebase.perf.util.Timer;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* JADX INFO: loaded from: classes4.dex */
public final class hso<T> implements ResponseHandler<T> {
    public final ResponseHandler<? extends T> a;
    public final Timer b;
    public final dox c;

    public hso(ResponseHandler<? extends T> responseHandler, Timer timer, dox doxVar) {
        this.a = responseHandler;
        this.b = timer;
        this.c = doxVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final T handleResponse(HttpResponse httpResponse) {
        this.c.p(this.b.a());
        this.c.h(httpResponse.getStatusLine().getStatusCode());
        Long lA = eox.a(httpResponse);
        if (lA != null) {
            this.c.n(lA.longValue());
        }
        String strB = eox.b(httpResponse);
        if (strB != null) {
            this.c.k(strB);
        }
        this.c.e();
        return this.a.handleResponse(httpResponse);
    }
}
