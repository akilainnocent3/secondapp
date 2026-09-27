package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class h10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f149864a;

    public h10(float f10) {
        this.f149864a = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h10) && Float.compare(this.f149864a, ((h10) obj).f149864a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f149864a);
    }

    public final String toString() {
        return "CoreNativeAdMedia(aspectRatio=" + this.f149864a + gi.j.f86771d;
    }
}
