package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f45592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f45593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f45594d;

    public g(AudioRendererEventListener.EventDispatcher eventDispatcher, int i10, long j10, long j11) {
        this.f45594d = eventDispatcher;
        this.f45591a = i10;
        this.f45592b = j10;
        this.f45593c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45594d.listener.onAudioTrackUnderrun(this.f45591a, this.f45592b, this.f45593c);
    }
}
