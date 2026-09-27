package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Surface f47236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f47237b;

    public n(VideoRendererEventListener.EventDispatcher eventDispatcher, Surface surface) {
        this.f47237b = eventDispatcher;
        this.f47236a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47237b.listener.onRenderedFirstFrame(this.f47236a);
    }
}
