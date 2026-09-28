package defpackage;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.cashoutphase3.b;

/* JADX INFO: loaded from: classes5.dex */
public final class yj6 extends WebViewClient {
    public final /* synthetic */ dm8 a;
    public final /* synthetic */ b b;

    public yj6(dm8 dm8Var, b bVar) {
        this.a = dm8Var;
        this.b = bVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        dm8 dm8Var = this.a;
        if (dm8Var.isCompleted()) {
            return;
        }
        b bVar = this.b;
        bVar.j0 = true;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_CASHOUT_CALC);
        aVar.a("WebView load %s success: %s", str, Boolean.valueOf(bVar.j0));
        dm8Var.R(Boolean.TRUE);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        if (webResourceRequest.isForMainFrame()) {
            dm8 dm8Var = this.a;
            if (dm8Var.isCompleted()) {
                return;
            }
            this.b.j0 = false;
            dm8Var.R(Boolean.FALSE);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceResponse.getClass();
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.isForMainFrame()) {
            dm8 dm8Var = this.a;
            if (dm8Var.isCompleted()) {
                return;
            }
            this.b.j0 = false;
            dm8Var.R(Boolean.FALSE);
        }
    }
}
