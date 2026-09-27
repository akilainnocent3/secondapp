package com.inmobi.media;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.h3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3707h3 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f56562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.l1.h f56563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3732i3 f56564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S2 f56565d;

    public C3707h3(AtomicBoolean atomicBoolean, kotlin.jvm.internal.l1.h hVar, C3732i3 c3732i3, S2 s10) {
        this.f56562a = atomicBoolean;
        this.f56563b = hVar;
        this.f56564c = c3732i3;
        this.f56565d = s10;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C3732i3.a(this.f56562a, this.f56563b, this.f56564c, this.f56565d, true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i10, String description, String failingUrl) {
        kotlin.jvm.internal.m0.p(view, "view");
        kotlin.jvm.internal.m0.p(description, "description");
        kotlin.jvm.internal.m0.p(failingUrl, "failingUrl");
        C3732i3.a(this.f56562a, this.f56563b, this.f56564c, this.f56565d, false);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        kotlin.jvm.internal.m0.p(view, "view");
        kotlin.jvm.internal.m0.p(request, "request");
        kotlin.jvm.internal.m0.p(errorResponse, "errorResponse");
        C3732i3.a(this.f56562a, this.f56563b, this.f56564c, this.f56565d, false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        kotlin.jvm.internal.m0.p(view, "view");
        kotlin.jvm.internal.m0.p(detail, "detail");
        C3732i3.a(this.f56562a, this.f56563b, this.f56564c, this.f56565d, false);
        return oo.a(view, detail, "click_mgr");
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        kotlin.jvm.internal.m0.p(view, "view");
        kotlin.jvm.internal.m0.p(request, "request");
        return (this.f56565d.f55464d || kotlin.jvm.internal.m0.g(request.getUrl().toString(), this.f56565d.f55462b)) ? false : true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        kotlin.jvm.internal.m0.p(view, "view");
        kotlin.jvm.internal.m0.p(request, "request");
        kotlin.jvm.internal.m0.p(error, "error");
        C3732i3.a(this.f56562a, this.f56563b, this.f56564c, this.f56565d, false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        kotlin.jvm.internal.m0.p(view, "view");
        kotlin.jvm.internal.m0.p(url, "url");
        S2 s10 = this.f56565d;
        return (s10.f55464d || kotlin.jvm.internal.m0.g(url, s10.f55462b)) ? false : true;
    }
}
