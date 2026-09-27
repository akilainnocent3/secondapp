package yads;

import com.yandex.mobile.ads.video.playback.model.AdPodInfo;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yp3 implements AdPodInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lf3 f158452a;

    public yp3(lf3 lf3Var) {
        this.f158452a = lf3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yp3) && kotlin.jvm.internal.m0.g(this.f158452a, ((yp3) obj).f158452a);
    }

    @Override // com.yandex.mobile.ads.video.playback.model.AdPodInfo
    public final int getAdPosition() {
        return this.f158452a.f151972b;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.AdPodInfo
    public final int getAdsCount() {
        return this.f158452a.f151971a;
    }

    public final int hashCode() {
        return this.f158452a.hashCode();
    }

    public final String toString() {
        return "YandexAdPodInfo(adPodInfo=" + this.f158452a + gi.j.f86771d;
    }
}
