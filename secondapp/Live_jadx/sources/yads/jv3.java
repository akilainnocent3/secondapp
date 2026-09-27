package yads;

import com.yandex.mobile.ads.common.VideoEventListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VideoEventListener f151286a;

    public jv3(VideoEventListener videoEventListener) {
        this.f151286a = videoEventListener;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jv3) && kotlin.jvm.internal.m0.g(((jv3) obj).f151286a, this.f151286a);
    }

    public final int hashCode() {
        return this.f151286a.hashCode();
    }
}
