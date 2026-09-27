package k8;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final a f102112a;

    public p0(@oy.l a customAudience) {
        kotlin.jvm.internal.m0.p(customAudience, "customAudience");
        this.f102112a = customAudience;
    }

    @oy.l
    public final a a() {
        return this.f102112a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p0) {
            return kotlin.jvm.internal.m0.g(this.f102112a, ((p0) obj).f102112a);
        }
        return false;
    }

    public int hashCode() {
        return this.f102112a.hashCode();
    }

    @oy.l
    public String toString() {
        return "JoinCustomAudience: customAudience=" + this.f102112a;
    }
}
