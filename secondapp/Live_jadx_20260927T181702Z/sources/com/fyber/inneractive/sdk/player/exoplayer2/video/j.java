package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f47222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f47223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f47224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f47225d;

    public j(VideoRendererEventListener.EventDispatcher eventDispatcher, String str, long j10, long j11) {
        this.f47225d = eventDispatcher;
        this.f47222a = str;
        this.f47223b = j10;
        this.f47224c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47225d.listener.onVideoDecoderInitialized(this.f47222a, this.f47223b, this.f47224c);
    }
}
