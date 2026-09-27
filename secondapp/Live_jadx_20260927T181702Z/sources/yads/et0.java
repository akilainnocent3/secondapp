package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class et0 extends gt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4 f148833a;

    public et0(l4 l4Var) {
        super(0);
        this.f148833a = l4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof et0) && kotlin.jvm.internal.m0.g(this.f148833a, ((et0) obj).f148833a);
    }

    public final int hashCode() {
        return this.f148833a.hashCode();
    }

    public final String toString() {
        return "Failure(adRequestError=" + this.f148833a + gi.j.f86771d;
    }
}
