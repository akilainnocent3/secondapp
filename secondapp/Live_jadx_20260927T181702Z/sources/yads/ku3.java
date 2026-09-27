package yads;

import com.yandex.mobile.ads.video.playback.model.SkipInfo;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ku3 implements SkipInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gg3 f151717a;

    public ku3(gg3 gg3Var) {
        this.f151717a = gg3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ku3) && kotlin.jvm.internal.m0.g(this.f151717a, ((ku3) obj).f151717a);
    }

    @Override // com.yandex.mobile.ads.video.playback.model.SkipInfo
    public final long getSkipOffset() {
        return this.f151717a.f149608a;
    }

    public final int hashCode() {
        return this.f151717a.hashCode();
    }

    public final String toString() {
        return "YandexSkipInfo(skipInfo=" + this.f151717a + gi.j.f86771d;
    }
}
