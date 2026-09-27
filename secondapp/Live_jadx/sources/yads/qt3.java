package yads;

import com.yandex.mobile.ads.nativeads.NativeAdMedia;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qt3 implements NativeAdMedia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h10 f154601a;

    public qt3(h10 h10Var) {
        this.f154601a = h10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qt3) && kotlin.jvm.internal.m0.g(this.f154601a, ((qt3) obj).f154601a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdMedia
    public final float getAspectRatio() {
        return this.f154601a.f149864a;
    }

    public final int hashCode() {
        return this.f154601a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdMediaAdapter(media=" + this.f154601a + gi.j.f86771d;
    }
}
