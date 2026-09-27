package com.fyber.inneractive.sdk.player.mediaplayer;

import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Surface f47279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f47280b;

    public f(p pVar, Surface surface) {
        this.f47280b = pVar;
        this.f47279a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.a(this.f47280b, this.f47279a);
    }
}
