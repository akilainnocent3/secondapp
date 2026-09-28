package defpackage;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes6.dex */
public interface i0j0 {
    void installJsBridge(Context context, WebView webView, WebViewClient webViewClient, WebChromeClient webChromeClient);

    void installJsBridge(Context context, WebView webView, WebViewClient webViewClient, WebChromeClient webChromeClient, Boolean bool);

    void uninstallJsBridge(WebView webView);
}
