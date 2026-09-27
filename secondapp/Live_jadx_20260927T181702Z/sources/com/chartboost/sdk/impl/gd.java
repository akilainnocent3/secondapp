package com.chartboost.sdk.impl;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class gd extends WebViewClient {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39025b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39026a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    public gd(String mraidVersion) {
        kotlin.jvm.internal.m0.p(mraidVersion, "mraidVersion");
        this.f39026a = mraidVersion;
    }

    public final WebResourceResponse a(String url) {
        kotlin.jvm.internal.m0.p(url, "url");
        if (!cv.k0.b2(url, "mraid.js", false, 2, null)) {
            return null;
        }
        byte[] bytes = yc.f41662a.a(this.f39026a).getBytes(cv.g.f77202b);
        kotlin.jvm.internal.m0.o(bytes, "getBytes(...)");
        return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(bytes));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        kotlin.jvm.internal.m0.p(view, "view");
        kotlin.jvm.internal.m0.p(request, "request");
        String string = request.getUrl().toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        WebResourceResponse webResourceResponseA = a(string);
        return webResourceResponseA == null ? super.shouldInterceptRequest(view, request) : webResourceResponseA;
    }
}
