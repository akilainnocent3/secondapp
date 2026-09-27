package com.cleveradssolutions.adapters.exchange.rendering.mraid.methods.network;

import android.os.AsyncTask;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class b extends AsyncTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f42346b = "b";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f42347a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(String str, Throwable th2);

        void onSuccess(String str);
    }

    public b(a aVar) {
        this.f42347a = aVar;
    }

    public static String c(String str, HttpURLConnection httpURLConnection) throws URISyntaxException, IOException {
        int responseCode = httpURLConnection.getResponseCode();
        String headerField = httpURLConnection.getHeaderField(FirebaseAnalytics.d.f52112s);
        if (responseCode < 300 || responseCode >= 400) {
            return null;
        }
        try {
            return new URI(str.replace(il.b.f94863g, "%7C")).resolve(headerField).toString();
        } catch (IllegalArgumentException unused) {
            com.cleveradssolutions.adapters.exchange.b.a(f42346b, "Invalid URL redirection. baseUrl=" + str + "\n redirectUrl=" + headerField);
            throw new URISyntaxException(headerField, "Unable to parse invalid URL");
        } catch (NullPointerException e10) {
            com.cleveradssolutions.adapters.exchange.b.a(f42346b, "Invalid URL redirection. baseUrl=" + str + "\n redirectUrl=" + headerField);
            throw e10;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        if (isCancelled() || str == null) {
            onCancelled();
        } else {
            this.f42347a.onSuccess(str);
        }
    }

    public final String b(String str) throws Throwable {
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection2.setInstanceFollowRedirects(false);
                String strC = c(str, httpURLConnection2);
                try {
                    InputStream inputStream = httpURLConnection2.getInputStream();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException unused) {
                    com.cleveradssolutions.adapters.exchange.b.a(f42346b, "IOException when closing httpUrlConnection. Ignoring.");
                }
                httpURLConnection2.disconnect();
                return strC;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    try {
                        InputStream inputStream2 = httpURLConnection.getInputStream();
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                    } catch (IOException unused2) {
                        com.cleveradssolutions.adapters.exchange.b.a(f42346b, "IOException when closing httpUrlConnection. Ignoring.");
                    }
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String doInBackground(String... strArr) throws Throwable {
        if (strArr != null && strArr.length != 0) {
            int i10 = 0;
            try {
                String strB = strArr[0];
                String str = null;
                while (strB != null && i10 < 3) {
                    if (!strB.startsWith("http")) {
                        return strB;
                    }
                    i10++;
                    str = strB;
                    strB = b(strB);
                }
                return str;
            } catch (Throwable th2) {
                com.cleveradssolutions.adapters.exchange.b.i(f42346b, "", th2);
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        super.onCancelled();
        this.f42347a.a("Task for resolving url was cancelled", null);
    }
}
