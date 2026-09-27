package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class st3 implements com.yandex.mobile.ads.nativeads.video.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i10 f155549a;

    public st3(i10 i10Var) {
        this.f155549a = i10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof st3) && kotlin.jvm.internal.m0.g(this.f155549a, ((st3) obj).f155549a);
    }

    public final int hashCode() {
        return this.f155549a.hashCode();
    }

    @Override // com.yandex.mobile.ads.nativeads.video.b, com.yandex.mobile.ads.nativeads.video.NativeAdVideoController
    public final void pauseAd() {
        this.f155549a.f150378a.b();
    }

    @Override // com.yandex.mobile.ads.nativeads.video.b, com.yandex.mobile.ads.nativeads.video.NativeAdVideoController
    public final void resumeAd() {
        this.f155549a.f150378a.a();
    }

    public final String toString() {
        return "YandexNativeAdVideoControllerAdapter(nativeAdVideoController=" + this.f155549a + gi.j.f86771d;
    }
}
