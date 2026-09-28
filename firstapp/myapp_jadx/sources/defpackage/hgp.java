package defpackage;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes5.dex */
public final class hgp implements tse {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ i0j0 b;
    public final /* synthetic */ ogp c;

    public hgp(WebView webView, i0j0 i0j0Var, ogp ogpVar) {
        this.a = webView;
        this.b = i0j0Var;
        this.c = ogpVar;
    }

    @Override // defpackage.tse
    public final void dispose() {
        Object value;
        WebView webView = this.a;
        webView.stopLoading();
        this.b.uninstallJsBridge(webView);
        webView.destroy();
        wwd0 wwd0Var = this.c.a.i;
        do {
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.TRUE));
    }
}
