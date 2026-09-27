package com.fyber.inneractive.sdk.player.mediaplayer;

import android.view.SurfaceHolder;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SurfaceHolder f47277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f47278b;

    public e(p pVar, SurfaceHolder surfaceHolder) {
        this.f47278b = pVar;
        this.f47277a = surfaceHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.a(this.f47278b, this.f47277a);
    }
}
