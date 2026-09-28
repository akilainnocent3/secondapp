package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class kso implements Callback {
    public final Callback a;
    public final dox b;
    public final Timer c;
    public final long d;

    public kso(Callback callback, avg0 avg0Var, Timer timer, long j) {
        this.a = callback;
        this.b = new dox(avg0Var);
        this.d = j;
        this.c = timer;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        Request request = call.request();
        dox doxVar = this.b;
        if (request != null) {
            HttpUrl httpUrlUrl = request.url();
            if (httpUrlUrl != null) {
                doxVar.q(httpUrlUrl.url().toString());
            }
            if (request.method() != null) {
                doxVar.g(request.method());
            }
        }
        doxVar.j(this.d);
        mqh.a(this.c, doxVar, doxVar);
        this.a.onFailure(call, iOException);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        FirebasePerfOkHttpClient.a(response, this.b, this.d, this.c.a());
        this.a.onResponse(call, response);
    }
}
