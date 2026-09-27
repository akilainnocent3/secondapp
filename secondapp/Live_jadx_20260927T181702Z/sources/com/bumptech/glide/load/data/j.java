package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class j implements d<InputStream> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f31442h = "HttpUrlFetcher";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f31443i = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @h1
    public static final String f31444j = "Location";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @h1
    public static final b f31445k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @h1
    public static final int f31446l = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ac.h f31447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f31449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HttpURLConnection f31450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InputStream f31451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f31452g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements b {
        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public j(ac.h hVar, int i10) {
        this(hVar, i10, f31445k);
    }

    public static int e(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (!Log.isLoggable(f31442h, 3)) {
                return -1;
            }
            Log.d(f31442h, "Failed to get a response code", e10);
            return -1;
        }
    }

    public static boolean g(int i10) {
        return i10 / 100 == 2;
    }

    public static boolean h(int i10) {
        return i10 / 100 == 3;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public tb.a b() {
        return tb.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void c(@NonNull com.bumptech.glide.i iVar, @NonNull d.a<? super InputStream> aVar) {
        long jB = pc.i.b();
        try {
            aVar.d(i(this.f31447b.i(), 0, null, this.f31447b.e()));
        } catch (IOException e10) {
            if (Log.isLoggable(f31442h, 3)) {
                Log.d(f31442h, "Failed to load data for url", e10);
            }
            aVar.e(e10);
        } finally {
            if (Log.isLoggable(f31442h, 2)) {
                Log.v(f31442h, "Finished http url fetcher fetch in " + pc.i.a(jB));
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f31452g = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cleanup() {
        InputStream inputStream = this.f31451f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f31450e;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f31450e = null;
    }

    public final HttpURLConnection d(URL url, Map<String, String> map) throws tb.e {
        try {
            HttpURLConnection httpURLConnectionA = this.f31449d.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionA.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnectionA.setConnectTimeout(this.f31448c);
            httpURLConnectionA.setReadTimeout(this.f31448c);
            httpURLConnectionA.setUseCaches(false);
            httpURLConnectionA.setDoInput(true);
            httpURLConnectionA.setInstanceFollowRedirects(false);
            return httpURLConnectionA;
        } catch (IOException e10) {
            throw new tb.e("URL.openConnection threw", 0, e10);
        }
    }

    public final InputStream f(HttpURLConnection httpURLConnection) throws tb.e {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f31451f = pc.c.b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable(f31442h, 3)) {
                    Log.d(f31442h, "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f31451f = httpURLConnection.getInputStream();
            }
            return this.f31451f;
        } catch (IOException e10) {
            throw new tb.e("Failed to obtain InputStream", e(httpURLConnection), e10);
        }
    }

    public final InputStream i(URL url, int i10, URL url2, Map<String, String> map) throws tb.e {
        if (i10 >= 5) {
            throw new tb.e("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new tb.e("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionD = d(url, map);
        this.f31450e = httpURLConnectionD;
        try {
            httpURLConnectionD.connect();
            this.f31451f = this.f31450e.getInputStream();
            if (this.f31452g) {
                return null;
            }
            int iE = e(this.f31450e);
            if (g(iE)) {
                return f(this.f31450e);
            }
            if (!h(iE)) {
                if (iE == -1) {
                    throw new tb.e(iE);
                }
                try {
                    throw new tb.e(this.f31450e.getResponseMessage(), iE);
                } catch (IOException e10) {
                    throw new tb.e("Failed to get a response message", iE, e10);
                }
            }
            String headerField = this.f31450e.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new tb.e("Received empty or null redirect url", iE);
            }
            try {
                URL url3 = new URL(url, headerField);
                cleanup();
                return i(url3, i10 + 1, url, map);
            } catch (MalformedURLException e11) {
                throw new tb.e("Bad redirect url: " + headerField, iE, e11);
            }
        } catch (IOException e12) {
            throw new tb.e("Failed to connect or obtain data", e(this.f31450e), e12);
        }
    }

    @h1
    public j(ac.h hVar, int i10, b bVar) {
        this.f31447b = hVar;
        this.f31448c = i10;
        this.f31449d = bVar;
    }
}
