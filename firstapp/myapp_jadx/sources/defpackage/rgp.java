package defpackage;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes5.dex */
public final class rgp extends WebViewClient {
    public final egp a;
    public final fgp b;
    public final ggp c;

    public rgp(egp egpVar, fgp fgpVar, ggp ggpVar) {
        this.a = egpVar;
        this.b = fgpVar;
        this.c = ggpVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.b.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webResourceRequest.getClass();
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        this.c.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        str.getClass();
        this.a.invoke(str);
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        this.c.invoke();
    }
}
