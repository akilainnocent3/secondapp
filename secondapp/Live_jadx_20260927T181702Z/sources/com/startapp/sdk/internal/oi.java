package com.startapp.sdk.internal;

import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class oi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f75328a;

    public oi(WebView webView) {
        this.f75328a = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f75328a.destroy();
        } catch (Throwable unused) {
        }
    }
}
