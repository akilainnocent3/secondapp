package com.cleveradssolutions.adapters.exchange.rendering.views.webview.mraid;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class k extends com.cleveradssolutions.adapters.exchange.rendering.views.webview.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f42967g = "zv";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f42968f;

    public k(com.cleveradssolutions.adapters.exchange.rendering.views.webview.b.a aVar, String str) {
        super(aVar);
        this.f42968f = "javascript:" + com.cleveradssolutions.adapters.exchange.rendering.mraid.a.a() + str;
    }

    public final WebResourceResponse c() {
        if (com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.j.h(this.f42968f)) {
            this.f42887a.a();
            return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(this.f42968f.getBytes()));
        }
        com.cleveradssolutions.adapters.exchange.b.a(f42967g, "Failed to inject mraid.js into twoPart mraid webview");
        return null;
    }

    public boolean d(String str) {
        return "mraid.js".equals(Uri.parse(str.toLowerCase(Locale.US)).getLastPathSegment());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return d(str) ? c() : super.shouldInterceptRequest(webView, str);
    }
}
