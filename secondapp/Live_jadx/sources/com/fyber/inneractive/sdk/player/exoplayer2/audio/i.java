package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f45598b;

    public i(AudioRendererEventListener.EventDispatcher eventDispatcher, int i10) {
        this.f45598b = eventDispatcher;
        this.f45597a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45598b.listener.onAudioSessionId(this.f45597a);
    }
}
