package com.google.firebase.perf.network;

import com.google.firebase.perf.util.Timer;
import defpackage.avg0;
import defpackage.dox;
import defpackage.eox;
import defpackage.hso;
import defpackage.mqh;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes4.dex */
public class FirebasePerfHttpClient {
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        Timer timer = new Timer();
        dox doxVar = new dox(avg0.H);
        try {
            doxVar.q(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            doxVar.g(httpRequest.getRequestLine().getMethod());
            Long lA = eox.a(httpRequest);
            if (lA != null) {
                doxVar.i(lA.longValue());
            }
            timer.g();
            doxVar.j(timer.a);
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            doxVar.p(timer.a());
            doxVar.h(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = eox.a(httpResponseExecute);
            if (lA2 != null) {
                doxVar.n(lA2.longValue());
            }
            String strB = eox.b(httpResponseExecute);
            if (strB != null) {
                doxVar.k(strB);
            }
            doxVar.e();
            return httpResponseExecute;
        } catch (IOException e) {
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        dox doxVar = new dox(avg0.H);
        try {
            doxVar.q(httpUriRequest.getURI().toString());
            doxVar.g(httpUriRequest.getMethod());
            Long lA = eox.a(httpUriRequest);
            if (lA != null) {
                doxVar.i(lA.longValue());
            }
            timer.g();
            doxVar.j(timer.a);
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            doxVar.p(timer.a());
            doxVar.h(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = eox.a(httpResponseExecute);
            if (lA2 != null) {
                doxVar.n(lA2.longValue());
            }
            String strB = eox.b(httpResponseExecute);
            if (strB != null) {
                doxVar.k(strB);
            }
            doxVar.e();
            return httpResponseExecute;
        } catch (IOException e) {
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        Timer timer = new Timer();
        dox doxVar = new dox(avg0.H);
        try {
            doxVar.q(httpUriRequest.getURI().toString());
            doxVar.g(httpUriRequest.getMethod());
            Long lA = eox.a(httpUriRequest);
            if (lA != null) {
                doxVar.i(lA.longValue());
            }
            timer.g();
            doxVar.j(timer.a);
            return (T) httpClient.execute(httpUriRequest, new hso(responseHandler, timer, doxVar));
        } catch (IOException e) {
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        dox doxVar = new dox(avg0.H);
        try {
            doxVar.q(httpUriRequest.getURI().toString());
            doxVar.g(httpUriRequest.getMethod());
            Long lA = eox.a(httpUriRequest);
            if (lA != null) {
                doxVar.i(lA.longValue());
            }
            timer.g();
            doxVar.j(timer.a);
            return (T) httpClient.execute(httpUriRequest, new hso(responseHandler, timer, doxVar), httpContext);
        } catch (IOException e) {
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        Timer timer = new Timer();
        dox doxVar = new dox(avg0.H);
        try {
            doxVar.q(httpUriRequest.getURI().toString());
            doxVar.g(httpUriRequest.getMethod());
            Long lA = eox.a(httpUriRequest);
            if (lA != null) {
                doxVar.i(lA.longValue());
            }
            timer.g();
            doxVar.j(timer.a);
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            doxVar.p(timer.a());
            doxVar.h(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = eox.a(httpResponseExecute);
            if (lA2 != null) {
                doxVar.n(lA2.longValue());
            }
            String strB = eox.b(httpResponseExecute);
            if (strB != null) {
                doxVar.k(strB);
            }
            doxVar.e();
            return httpResponseExecute;
        } catch (IOException e) {
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        dox doxVar = new dox(avg0.H);
        try {
            doxVar.q(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            doxVar.g(httpRequest.getRequestLine().getMethod());
            Long lA = eox.a(httpRequest);
            if (lA != null) {
                doxVar.i(lA.longValue());
            }
            timer.g();
            doxVar.j(timer.a);
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            doxVar.p(timer.a());
            doxVar.h(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = eox.a(httpResponseExecute);
            if (lA2 != null) {
                doxVar.n(lA2.longValue());
            }
            String strB = eox.b(httpResponseExecute);
            if (strB != null) {
                doxVar.k(strB);
            }
            doxVar.e();
            return httpResponseExecute;
        } catch (IOException e) {
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        Timer timer = new Timer();
        dox doxVar = new dox(avg0.H);
        try {
            doxVar.q(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            doxVar.g(httpRequest.getRequestLine().getMethod());
            Long lA = eox.a(httpRequest);
            if (lA != null) {
                doxVar.i(lA.longValue());
            }
            timer.g();
            doxVar.j(timer.a);
            return (T) httpClient.execute(httpHost, httpRequest, new hso(responseHandler, timer, doxVar));
        } catch (IOException e) {
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        dox doxVar = new dox(avg0.H);
        try {
            doxVar.q(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            doxVar.g(httpRequest.getRequestLine().getMethod());
            Long lA = eox.a(httpRequest);
            if (lA != null) {
                doxVar.i(lA.longValue());
            }
            timer.g();
            doxVar.j(timer.a);
            return (T) httpClient.execute(httpHost, httpRequest, new hso(responseHandler, timer, doxVar), httpContext);
        } catch (IOException e) {
            mqh.a(timer, doxVar, doxVar);
            throw e;
        }
    }
}
