package com.startapp.sdk.internal;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class z8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a9 f75967d;

    public z8(a9 a9Var, int i10, String str, String str2) {
        this.f75967d = a9Var;
        this.f75964a = i10;
        this.f75965b = str;
        this.f75966c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f75966c;
        Bitmap bitmapB = str != null ? k2.b(str) : null;
        ((k8) this.f75967d.f74530b.a()).f75082a.post(new y8(this, bitmapB));
    }
}
