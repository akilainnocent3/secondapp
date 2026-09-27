package com.fyber.inneractive.sdk.network;

import java.io.FilterInputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HttpURLConnection f45319g;

    public j(HttpURLConnection httpURLConnection, int i10, FilterInputStream filterInputStream, Map map, String str) {
        this.f45319g = httpURLConnection;
        this.f45324a = i10;
        this.f45326c = filterInputStream;
        this.f45327d = map;
        this.f45328e = str;
    }

    @Override // com.fyber.inneractive.sdk.network.l
    public final void a() {
        try {
            HttpURLConnection httpURLConnection = this.f45319g;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (Throwable unused) {
        }
        super.a();
    }
}
