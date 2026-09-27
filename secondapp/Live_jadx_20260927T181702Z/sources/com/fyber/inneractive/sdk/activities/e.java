package com.fyber.inneractive.sdk.activities;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f44140a;

    public e(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f44140a = inneractiveInternalBrowserActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        this.f44140a.setTitle("Page is Loading...");
        this.f44140a.setProgress(i10 * 100);
        if (i10 == 100) {
            this.f44140a.setTitle(webView.getUrl());
        }
    }
}
