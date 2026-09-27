package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f47229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f47230c;

    public l(VideoRendererEventListener.EventDispatcher eventDispatcher, int i10, long j10) {
        this.f47230c = eventDispatcher;
        this.f47228a = i10;
        this.f47229b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47230c.listener.onDroppedFrames(this.f47228a, this.f47229b);
    }
}
