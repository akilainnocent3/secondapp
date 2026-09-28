package defpackage;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class qkm extends WebViewClient {
    public final int a = 2000;
    public final int b = 7000;

    public qkm(int i) {
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bd A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #1 {all -> 0x00c3, blocks: (B:40:0x00b9, B:42:0x00bd), top: B:49:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public final WebResourceResponse a(String str, WebResourceRequest webResourceRequest) {
        HttpURLConnection httpURLConnection;
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
            uRLConnection.getClass();
            httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setConnectTimeout(this.a);
            httpURLConnection.setReadTimeout(this.b);
            httpURLConnection.setInstanceFollowRedirects(true);
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (requestHeaders != null) {
                for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    try {
                        zi50.a aVar = zi50.b;
                        httpURLConnection.setRequestProperty(key, value);
                        Unit unit = Unit.a;
                    } catch (Throwable unused) {
                        zi50.a aVar2 = zi50.b;
                    }
                }
            }
            try {
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (200 > responseCode || responseCode >= 300) {
                    try {
                        zi50.a aVar3 = zi50.b;
                        httpURLConnection.disconnect();
                        Unit unit2 = Unit.a;
                    } catch (Throwable unused2) {
                        zi50.a aVar4 = zi50.b;
                    }
                    return null;
                }
                String contentType = httpURLConnection.getContentType();
                if (contentType == null) {
                    contentType = "application/octet-stream";
                }
                String string = StringsKt.t0(StringsKt.o0(contentType, ";")).toString();
                String contentEncoding = httpURLConnection.getContentEncoding();
                if (contentEncoding == null) {
                    contentEncoding = "utf-8";
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    inputStream.getClass();
                    byte[] bArrC = ll5.c(inputStream);
                    inputStream.close();
                    WebResourceResponse webResourceResponse = new WebResourceResponse(string, contentEncoding, new ByteArrayInputStream(bArrC));
                    try {
                        zi50.a aVar5 = zi50.b;
                        httpURLConnection.disconnect();
                        Unit unit3 = Unit.a;
                    } catch (Throwable unused3) {
                        zi50.a aVar6 = zi50.b;
                    }
                    return webResourceResponse;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ft7.a(inputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable unused4) {
                try {
                    zi50.a aVar7 = zi50.b;
                    if (httpURLConnection != null) {
                        return null;
                    }
                    httpURLConnection.disconnect();
                    Unit unit4 = Unit.a;
                    return null;
                } catch (Throwable unused5) {
                    zi50.a aVar8 = zi50.b;
                    return null;
                }
            }
        } catch (Throwable unused6) {
            httpURLConnection = null;
            zi50.a aVar9 = zi50.b;
            if (httpURLConnection != null) {
                return null;
            }
            httpURLConnection.disconnect();
            Unit unit5 = Unit.a;
            return null;
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Object bVar;
        Uri url;
        String string;
        try {
            zi50.a aVar = zi50.b;
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
                bVar = null;
            } else {
                x8n.a.getClass();
                if (x8n.a() && !webResourceRequest.isForMainFrame() && x8n.c(string) && x8n.b(string)) {
                    String strE = x8n.e(string);
                    if (!strE.equals(string)) {
                        bVar = a(string, webResourceRequest);
                        if (bVar == null) {
                            bVar = a(strE, webResourceRequest);
                        }
                    }
                }
                bVar = null;
            }
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        return (WebResourceResponse) (bVar instanceof zi50.b ? null : bVar);
    }
}
