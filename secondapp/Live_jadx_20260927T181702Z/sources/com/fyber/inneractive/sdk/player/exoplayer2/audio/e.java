package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f45585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f45586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f45587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f45588d;

    public e(AudioRendererEventListener.EventDispatcher eventDispatcher, String str, long j10, long j11) {
        this.f45588d = eventDispatcher;
        this.f45585a = str;
        this.f45586b = j10;
        this.f45587c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45588d.listener.onAudioDecoderInitialized(this.f45585a, this.f45586b, this.f45587c);
    }
}
