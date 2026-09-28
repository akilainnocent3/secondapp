package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class iqm implements cpc<InputStream> {
    public final d0l a;
    public final int b;
    public HttpURLConnection c;
    public InputStream d;
    public volatile boolean e;

    public static class a {
    }

    public iqm(d0l d0lVar, int i) {
        this.a = d0lVar;
        this.b = i;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    @Override // defpackage.cpc
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.cpc
    public final void b() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // defpackage.cpc
    public final void cancel() {
        this.e = true;
    }

    @Override // defpackage.cpc
    public final void d(lw20 lw20Var, cpc.a<? super InputStream> aVar) {
        d0l d0lVar = this.a;
        int i = agt.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            URL url = d0lVar.f;
            if (url == null) {
                url = new URL(d0lVar.d());
                d0lVar.f = url;
            }
            aVar.f(f(url, 0, null, d0lVar.b.a()));
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            aVar.c(e);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + agt.a(jElapsedRealtimeNanos));
            }
        }
    }

    @Override // defpackage.cpc
    public final cqc e() {
        return cqc.b;
    }

    public final InputStream f(URL url, int i, URL url2, Map<String, String> map) throws som {
        if (i >= 5) {
            throw new som(-1, null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new som(-1, null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i2 = this.b;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.d = this.c.getInputStream();
                if (this.e) {
                    return null;
                }
                int iC = c(this.c);
                int i3 = iC / 100;
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (iC == -1) {
                            throw new som(iC, null, "Http request failed");
                        }
                        try {
                            throw new som(iC, null, this.c.getResponseMessage());
                        } catch (IOException e) {
                            throw new som(iC, e, "Failed to get a response message");
                        }
                    }
                    String headerField = this.c.getHeaderField("Location");
                    if (TextUtils.isEmpty(headerField)) {
                        throw new som(iC, null, "Received empty or null redirect url");
                    }
                    try {
                        URL url3 = new URL(url, headerField);
                        b();
                        return f(url3, i + 1, url, map);
                    } catch (MalformedURLException e2) {
                        throw new som(iC, e2, inm.a("Bad redirect url: ", headerField));
                    }
                }
                HttpURLConnection httpURLConnection2 = this.c;
                try {
                    if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                        tza tzaVar = new tza(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        this.d = tzaVar;
                        return tzaVar;
                    }
                    if (Log.isLoggable("HttpUrlFetcher", 3)) {
                        Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                    }
                    InputStream inputStream = httpURLConnection2.getInputStream();
                    this.d = inputStream;
                    return inputStream;
                } catch (IOException e3) {
                    throw new som(c(httpURLConnection2), e3, "Failed to obtain InputStream");
                }
            } catch (IOException e4) {
                throw new som(c(this.c), e4, "Failed to connect or obtain data");
            }
        } catch (IOException e5) {
            throw new som(0, e5, "URL.openConnection threw");
        }
    }
}
