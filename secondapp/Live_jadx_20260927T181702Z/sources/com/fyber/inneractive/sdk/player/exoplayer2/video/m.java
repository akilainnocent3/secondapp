package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f47233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f47234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f47235e;

    public m(VideoRendererEventListener.EventDispatcher eventDispatcher, int i10, int i11, int i12, float f10) {
        this.f47235e = eventDispatcher;
        this.f47231a = i10;
        this.f47232b = i11;
        this.f47233c = i12;
        this.f47234d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47235e.listener.onVideoSizeChanged(this.f47231a, this.f47232b, this.f47233c, this.f47234d);
    }
}
