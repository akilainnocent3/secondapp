package com.google.firebase.perf.network;

import com.google.firebase.perf.util.Timer;
import defpackage.avg0;
import defpackage.dox;
import defpackage.eox;
import defpackage.kso;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public class FirebasePerfOkHttpClient {
    public static void a(Response response, dox doxVar, long j, long j2) {
        Request request = response.request();
        if (request == null) {
            return;
        }
        doxVar.q(request.url().url().toString());
        doxVar.g(request.method());
        if (request.body() != null) {
            long jContentLength = request.body().contentLength();
            if (jContentLength != -1) {
                doxVar.i(jContentLength);
            }
        }
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody != null) {
            long c = responseBodyBody.getC();
            if (c != -1) {
                doxVar.n(c);
            }
            MediaType b = responseBodyBody.getB();
            if (b != null) {
                doxVar.k(b.toString());
            }
        }
        doxVar.h(response.code());
        doxVar.j(j);
        doxVar.p(j2);
        doxVar.e();
    }

    public static void enqueue(Call call, Callback callback) {
        Timer timer = new Timer();
        call.enqueue(new kso(callback, avg0.H, timer, timer.a));
    }

    public static Response execute(Call call) {
        dox doxVar = new dox(avg0.H);
        Timer timer = new Timer();
        long j = timer.a;
        try {
            Response responseExecute = call.execute();
            a(responseExecute, doxVar, j, timer.a());
            return responseExecute;
        } catch (IOException e) {
            Request request = call.request();
            if (request != null) {
                HttpUrl httpUrlUrl = request.url();
                if (httpUrlUrl != null) {
                    doxVar.q(httpUrlUrl.url().toString());
                }
                if (request.method() != null) {
                    doxVar.g(request.method());
                }
            }
            doxVar.j(j);
            doxVar.p(timer.a());
            eox.c(doxVar);
            throw e;
        }
    }
}
