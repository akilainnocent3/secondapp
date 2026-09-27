package com.startapp.sdk.internal;

import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ok implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f75330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f75331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qi f75332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f75333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk f75334e;

    public ok(pk pkVar, AtomicBoolean atomicBoolean, WebView webView, qi qiVar, AtomicLong atomicLong) {
        this.f75334e = pkVar;
        this.f75330a = atomicBoolean;
        this.f75331b = webView;
        this.f75332c = qiVar;
        this.f75333d = atomicLong;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f75330a.compareAndSet(false, true)) {
            this.f75334e.a(this.f75331b);
            qi qiVar = this.f75332c;
            this.f75333d.get();
            si.b();
            qiVar.a();
        }
    }
}
