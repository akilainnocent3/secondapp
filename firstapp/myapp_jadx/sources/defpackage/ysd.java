package defpackage;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sporty.android.core.model.MyLog;

/* JADX INFO: loaded from: classes6.dex */
public final class ysd extends WebViewClient {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ usd b;

    public ysd(WebView webView, usd usdVar) {
        this.a = webView;
        this.b = usdVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        this.a.setVisibility(8);
        bc6 bc6Var = this.b.j0;
        if (bc6Var != null) {
            if (bc6Var.p() instanceof bzx) {
                zi50.a aVar = zi50.b;
                bc6Var.resumeWith(dg6.a.a);
            } else {
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_COMMON);
                aVar2.n("Continuation not active, resume not perform.", new Object[0]);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        this.a.setVisibility(8);
        return false;
    }

    @Override // android.webkit.WebViewClient
    @fae
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        webView.loadUrl(str);
        return false;
    }
}
