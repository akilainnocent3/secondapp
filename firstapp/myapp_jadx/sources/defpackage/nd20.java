package defpackage;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class nd20 extends WebViewClient {
    public final /* synthetic */ PreMatchEventActivity a;

    public nd20(PreMatchEventActivity preMatchEventActivity) {
        this.a = preMatchEventActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        PreMatchEventActivity preMatchEventActivity = this.a;
        if (!preMatchEventActivity.N0) {
            preMatchEventActivity.M0 = true;
        }
        preMatchEventActivity.N0 = false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        PreMatchEventActivity preMatchEventActivity = this.a;
        preMatchEventActivity.M0 = false;
        preMatchEventActivity.N0 = true;
    }
}
