package com.startapp.sdk.internal;

import android.os.Handler;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class mk extends qk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f75209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f75210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f75211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi f75212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f75213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f75214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk f75215g;

    public mk(pk pkVar, Handler handler, AtomicBoolean atomicBoolean, WebView webView, qi qiVar, AtomicLong atomicLong, int i10) {
        this.f75215g = pkVar;
        this.f75209a = handler;
        this.f75210b = atomicBoolean;
        this.f75211c = webView;
        this.f75212d = qiVar;
        this.f75213e = atomicLong;
        this.f75214f = i10;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        long jB = si.b();
        this.f75209a.removeCallbacksAndMessages(null);
        this.f75209a.postDelayed(new kk(this, jB), this.f75214f);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        this.f75209a.removeCallbacksAndMessages(null);
        this.f75209a.post(new lk(this, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView == null || str == null || si.c(webView.getContext(), str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
