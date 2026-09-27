package yads;

import com.yandex.mobile.ads.instream.player.content.VideoPlayer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kv3 implements s10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VideoPlayer f151747a;

    public kv3(VideoPlayer videoPlayer) {
        this.f151747a = videoPlayer;
    }

    @Override // yads.s10
    public final void a(pi3 pi3Var) {
        this.f151747a.setVideoPlayerListener(pi3Var != null ? new lv3(pi3Var) : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kv3) && kotlin.jvm.internal.m0.g(this.f151747a, ((kv3) obj).f151747a);
    }

    @Override // yads.s10
    public final long getVideoDuration() {
        return this.f151747a.getVideoDuration();
    }

    @Override // yads.s10
    public final long getVideoPosition() {
        return this.f151747a.getVideoPosition();
    }

    @Override // yads.s10
    public final float getVolume() {
        return this.f151747a.getVolume();
    }

    public final int hashCode() {
        return this.f151747a.hashCode();
    }

    @Override // yads.s10
    public final void pauseVideo() {
        this.f151747a.pauseVideo();
    }

    @Override // yads.s10
    public final void prepareVideo() {
        this.f151747a.prepareVideo();
    }

    @Override // yads.s10
    public final void resumeVideo() {
        this.f151747a.resumeVideo();
    }

    public final String toString() {
        return "YandexVideoPlayerAdapter(videoPlayer=" + this.f151747a + gi.j.f86771d;
    }
}
