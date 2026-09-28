package defpackage;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes6.dex */
public final class b8i0 extends WebViewClient {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ String b;

    public b8i0(WebView webView, String str) {
        this.a = webView;
        this.b = str;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        this.a.evaluateJavascript("document.querySelector('html').setAttribute('theme', '" + this.b + "');", null);
    }
}
