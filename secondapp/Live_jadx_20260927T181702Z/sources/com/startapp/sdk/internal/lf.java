package com.startapp.sdk.internal;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class lf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f75145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pf f75146b;

    public lf(pf pfVar, Activity activity) {
        this.f75146b = pfVar;
        this.f75145a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f75146b.b(this.f75145a);
        } catch (Throwable th2) {
            d9.a(th2);
        }
    }
}
