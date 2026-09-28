package defpackage;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes4.dex */
public final class cns extends WebViewClient {
    public final /* synthetic */ hns a;

    public cns(hns hnsVar) {
        this.a = hnsVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        this.a.b();
    }
}
