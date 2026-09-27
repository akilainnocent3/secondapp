package com.startapp.sdk.internal;

import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class nk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f75267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f75268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qi f75269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk f75270d;

    public nk(pk pkVar, AtomicBoolean atomicBoolean, WebView webView, qi qiVar) {
        this.f75270d = pkVar;
        this.f75267a = atomicBoolean;
        this.f75268b = webView;
        this.f75269c = qiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f75267a.compareAndSet(false, true)) {
            this.f75270d.a(this.f75268b);
            this.f75269c.a("Unknown error");
        }
    }
}
