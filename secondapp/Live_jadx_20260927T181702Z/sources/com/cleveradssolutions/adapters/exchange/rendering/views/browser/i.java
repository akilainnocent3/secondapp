package com.cleveradssolutions.adapters.exchange.rendering.views.browser;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class i extends WebViewClient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f42847c = "zz";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f42848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f42849b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a();

        void zz();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements com.cleveradssolutions.adapters.exchange.rendering.utils.url.a.c {
        public b() {
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.utils.url.a.c
        public void a(String str, com.cleveradssolutions.adapters.exchange.rendering.utils.url.action.d dVar) {
            i.this.f42849b = false;
            if (i.this.f42848a != null) {
                i.this.f42848a.zz();
            }
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.utils.url.a.c
        public void b(String str) {
            com.cleveradssolutions.adapters.exchange.b.h(i.f42847c, "Failed to handleUrl: " + str);
            i.this.f42849b = false;
        }
    }

    public i(a aVar) {
        this.f42848a = aVar;
    }

    public final com.cleveradssolutions.adapters.exchange.rendering.utils.url.a a() {
        return new com.cleveradssolutions.adapters.exchange.rendering.utils.url.a.b().b(new com.cleveradssolutions.adapters.exchange.rendering.utils.url.action.b()).a(new com.cleveradssolutions.adapters.exchange.rendering.utils.url.action.a()).e(new b()).f();
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        a aVar = this.f42848a;
        if (aVar != null) {
            aVar.a();
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String strC;
        String str2 = f42847c;
        com.cleveradssolutions.adapters.exchange.b.h(str2, "shouldOverrideUrlLoading: " + str);
        if (this.f42849b) {
            return false;
        }
        this.f42849b = true;
        boolean zH = a().h(webView.getContext(), str, null, true);
        if (zH || (strC = com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.c.c(str)) == null) {
            return zH;
        }
        com.cleveradssolutions.adapters.exchange.b.h(str2, "Found fallback URL: " + strC);
        webView.loadUrl(strC);
        return true;
    }
}
