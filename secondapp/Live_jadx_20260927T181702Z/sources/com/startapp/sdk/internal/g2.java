package com.startapp.sdk.internal;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class g2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f74854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2 f74855b;

    public g2(h2 h2Var, Bitmap bitmap) {
        this.f74855b = h2Var;
        this.f74854a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j2 j2Var = this.f74855b.f74941a;
        i2 i2Var = j2Var.f75018d;
        if (i2Var != null) {
            i2Var.a(this.f74854a, j2Var.f75019e);
        }
    }
}
