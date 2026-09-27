package io.appmetrica.analytics.impl;

import android.app.Activity;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC5160k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f97679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5211m f97680b;

    public RunnableC5160k(C5211m c5211m, Activity activity) {
        this.f97680b = c5211m;
        this.f97679a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f97680b.a(this.f97679a);
    }
}
