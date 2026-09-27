package com.chartboost.sdk.impl;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class t2 extends s5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ka f40933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yg f40934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f40935g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(ka impressionInterface, yg gestureDetector, t5 callback, l7 eventTracker) {
        super(callback, eventTracker, impressionInterface, (mg) c4.f38374b.a().b().get());
        kotlin.jvm.internal.m0.p(impressionInterface, "impressionInterface");
        kotlin.jvm.internal.m0.p(gestureDetector, "gestureDetector");
        kotlin.jvm.internal.m0.p(callback, "callback");
        kotlin.jvm.internal.m0.p(eventTracker, "eventTracker");
        this.f40933e = impressionInterface;
        this.f40934f = gestureDetector;
    }

    public final yg a() {
        return this.f40934f;
    }

    public final boolean b(String str) {
        if (this.f40935g) {
            if (!this.f40934f.a()) {
                return false;
            }
            this.f40933e.c(new l3(str, Boolean.FALSE));
            this.f40934f.b();
            return true;
        }
        sb.b("Attempt to open " + str + " detected before WebView loading finished.", (Throwable) null, 2, (Object) null);
        this.f40933e.d(new l3(str, Boolean.FALSE));
        return true;
    }

    @Override // com.chartboost.sdk.impl.s5, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f40935g = true;
    }

    @Override // com.chartboost.sdk.impl.s5, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        kotlin.jvm.internal.m0.p(view, "view");
        kotlin.jvm.internal.m0.p(request, "request");
        String string = request.getUrl().toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return b(string);
    }

    @Override // com.chartboost.sdk.impl.s5, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String url) {
        kotlin.jvm.internal.m0.p(url, "url");
        return b(url);
    }
}
