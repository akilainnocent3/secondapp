package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ft0 extends gt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xf1 f149234a;

    public ft0(xf1 xf1Var) {
        super(0);
        this.f149234a = xf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ft0) && kotlin.jvm.internal.m0.g(this.f149234a, ((ft0) obj).f149234a);
    }

    public final int hashCode() {
        return this.f149234a.hashCode();
    }

    public final String toString() {
        return "Success(feedItem=" + this.f149234a + gi.j.f86771d;
    }
}
