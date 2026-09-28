package defpackage;

import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes.dex */
public final class qmy implements cpc<InputStream>, Callback {
    public final Call.Factory a;
    public final d0l b;
    public tza c;
    public ResponseBody d;
    public cpc.a<? super InputStream> e;
    public volatile Call f;

    public qmy(Call.Factory factory, d0l d0lVar) {
        this.a = factory;
        this.b = d0lVar;
    }

    @Override // defpackage.cpc
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.cpc
    public final void b() {
        try {
            tza tzaVar = this.c;
            if (tzaVar != null) {
                tzaVar.close();
            }
        } catch (IOException unused) {
        }
        ResponseBody responseBody = this.d;
        if (responseBody != null) {
            responseBody.close();
        }
        this.e = null;
    }

    @Override // defpackage.cpc
    public final void cancel() {
        Call call = this.f;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // defpackage.cpc
    public final void d(lw20 lw20Var, cpc.a<? super InputStream> aVar) {
        Request.Builder builderUrl = new Request.Builder().url(this.b.d());
        for (Map.Entry<String, String> entry : this.b.b.a().entrySet()) {
            builderUrl.addHeader(entry.getKey(), entry.getValue());
        }
        Request requestBuild = builderUrl.build();
        this.e = aVar;
        this.f = this.a.newCall(requestBuild);
        FirebasePerfOkHttpClient.enqueue(this.f, this);
    }

    @Override // defpackage.cpc
    public final cqc e() {
        return cqc.b;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        if (Log.isLoggable("OkHttpFetcher", 3)) {
            Log.d("OkHttpFetcher", "OkHttp failed to obtain result", iOException);
        }
        this.e.c(iOException);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        this.d = response.body();
        if (!response.getIsSuccessful()) {
            this.e.c(new som(response.code(), null, response.message()));
        } else {
            ResponseBody responseBody = this.d;
            gm20.c(responseBody, "Argument must not be null");
            tza tzaVar = new tza(this.d.byteStream(), responseBody.getC());
            this.c = tzaVar;
            this.e.f(tzaVar);
        }
    }
}
