package com.cleveradssolutions.adapters.exchange.rendering.views.webview;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends WebViewClient {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f42886e = "zr";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f42887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f42888b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashSet f42889c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f42890d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a();

        void c();

        void zz();
    }

    public b(a aVar) {
        this.f42887a = aVar;
    }

    public final void a(WebView webView, String str) {
        webView.stopLoading();
        webView.loadUrl(str);
    }

    public final void b(String str, k kVar) {
        this.f42889c.clear();
        this.f42888b = false;
        String targetUrl = kVar.getTargetUrl();
        if (!TextUtils.isEmpty(targetUrl)) {
            str = targetUrl;
        }
        if (kVar.v()) {
            this.f42888b = true;
            this.f42889c.clear();
            kVar.f42919h.b(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        if (webView == null) {
            com.cleveradssolutions.adapters.exchange.b.a(f42886e, "onPageStarted failed, WebView is null");
            return;
        }
        if (str == null || !str.equals(this.f42890d)) {
            try {
                k kVar = (k) webView;
                if (kVar.k() && kVar.o() && !this.f42889c.contains(str) && webView.getHitTestResult() != null && (webView.getHitTestResult().getType() == 7 || webView.getHitTestResult().getType() == 8)) {
                    a(webView, str);
                }
                this.f42889c.add(str);
                super.onLoadResource(webView, str);
            } catch (Exception e10) {
                com.cleveradssolutions.adapters.exchange.b.a(f42886e, "onLoadResource failed for url: " + str + " : " + Log.getStackTraceString(e10));
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (webView == null) {
            com.cleveradssolutions.adapters.exchange.b.a(f42886e, "onPageFinished failed, WebView is null");
            return;
        }
        com.cleveradssolutions.adapters.exchange.b.h(f42886e, "onPageFinished: " + webView);
        try {
            this.f42887a.zz();
            webView.setBackgroundColor(0);
        } catch (Exception e10) {
            com.cleveradssolutions.adapters.exchange.b.a(f42886e, "onPageFinished failed for url: " + str + " : " + Log.getStackTraceString(e10));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (webView == null) {
            com.cleveradssolutions.adapters.exchange.b.a(f42886e, "onPageStarted failed, WebView is null");
            return;
        }
        try {
            super.onPageStarted(webView, str, bitmap);
            this.f42890d = str;
            this.f42888b = false;
            this.f42887a.c();
        } catch (Exception e10) {
            com.cleveradssolutions.adapters.exchange.b.a(f42886e, "onPageStarted failed for url: " + str + " : " + Log.getStackTraceString(e10));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2 = f42886e;
        com.cleveradssolutions.adapters.exchange.b.h(str2, "shouldOverrideUrlLoading, url: " + str);
        if (webView == null) {
            com.cleveradssolutions.adapters.exchange.b.a(str2, "onPageStarted failed, WebView is null");
            return false;
        }
        try {
            k kVar = (k) webView;
            if (kVar.o()) {
                b(str, kVar);
                return true;
            }
            a(webView, "javascript:window.HtmlViewer.showHTML('<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>');");
            return true;
        } catch (Exception e10) {
            com.cleveradssolutions.adapters.exchange.b.a(f42886e, "shouldOverrideUrlLoading failed for url: " + str + " : " + Log.getStackTraceString(e10));
        }
    }
}
