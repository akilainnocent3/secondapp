package com.startapp.sdk.internal;

import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class uk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f75677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f75678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vk f75679c;

    public uk(vk vkVar, String str, WebView webView) {
        this.f75679c = vkVar;
        this.f75677a = str;
        this.f75678b = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f75679c.f75730g = this.f75677a;
        this.f75678b.setWebViewClient(new qk());
        vk vkVar = this.f75679c;
        WebView webView = this.f75678b;
        vkVar.getClass();
        try {
            vkVar.f75729f.addLast(webView);
        } catch (Throwable th2) {
            if (vkVar.a(4)) {
                d9.a(th2);
            }
        }
    }
}
