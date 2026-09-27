package yads;

import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class lv3 implements VideoPlayerListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t10 f152172a;

    public lv3(pi3 pi3Var) {
        this.f152172a = pi3Var;
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoCompleted() {
        this.f152172a.onVideoCompleted();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoError() {
        this.f152172a.onVideoError();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPaused() {
        this.f152172a.onVideoPaused();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPrepared() {
        this.f152172a.onVideoPrepared();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoResumed() {
        this.f152172a.onVideoResumed();
    }
}
