package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class VungleWebClient$VungleWebViewRenderProcessClient$onRenderProcessUnresponsive$1 extends o0 implements ds.a<String> {
    final /* synthetic */ WebView $webView;
    final /* synthetic */ WebViewRenderProcess $webViewRenderProcess;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleWebClient$VungleWebViewRenderProcessClient$onRenderProcessUnresponsive$1(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        super(0);
        this.$webView = webView;
        this.$webViewRenderProcess = webViewRenderProcess;
    }

    @Override // ds.a
    @oy.l
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onRenderProcessUnresponsive(Title = ");
        sb2.append(this.$webView.getTitle());
        sb2.append(", URL = ");
        sb2.append(this.$webView.getOriginalUrl());
        sb2.append(", (webViewRenderProcess != null) = ");
        sb2.append(this.$webViewRenderProcess != null);
        return sb2.toString();
    }
}
