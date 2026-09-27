package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class h2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j2 f74941a;

    public h2(j2 j2Var) {
        this.f74941a = j2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmapB;
        j2 j2Var = this.f74941a;
        if (j2Var.f75016b) {
            bitmapB = k2.a(j2Var.f75015a, j2Var.f75017c);
        } else {
            bitmapB = k2.b(j2Var.f75017c);
        }
        new Handler(Looper.getMainLooper()).post(new g2(this, bitmapB));
    }
}
