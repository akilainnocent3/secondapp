package defpackage;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes7.dex */
public final class evp {
    public final WebView a;
    public final cvp b;
    public final dvp c;

    public interface a {
        evp a(WebView webView);
    }

    public evp(WebView webView, dvp dvpVar) {
        this.b = null;
        this.a = webView;
        this.c = dvpVar;
        this.b = new cvp(this, webView);
        if (webView != null) {
            try {
                webView.getSettings().setUserAgentString(webView.getSettings().getUserAgentString() + " _MAPP_/1.82.2");
            } catch (Exception unused) {
            }
        }
    }

    public final void a(String str) {
        this.a.loadUrl(tug.a("javascript:mapp.disPatchEvent('", str, "');"));
    }
}
