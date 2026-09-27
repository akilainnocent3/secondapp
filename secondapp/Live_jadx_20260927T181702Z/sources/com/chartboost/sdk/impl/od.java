package com.chartboost.sdk.impl;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class od {
    public HttpsURLConnection a(b3 request) throws IOException {
        kotlin.jvm.internal.m0.p(request, "request");
        URLConnection uRLConnectionOpenConnection = new URL(request.e()).openConnection();
        HttpsURLConnection httpsURLConnection = uRLConnectionOpenConnection instanceof HttpsURLConnection ? (HttpsURLConnection) uRLConnectionOpenConnection : null;
        if (httpsURLConnection != null) {
            return httpsURLConnection;
        }
        throw new IOException("Invalid URL");
    }
}
