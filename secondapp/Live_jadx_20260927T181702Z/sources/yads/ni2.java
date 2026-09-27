package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ni2 extends pi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4 f153052a;

    public ni2(l4 l4Var) {
        super(0);
        this.f153052a = l4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ni2) && kotlin.jvm.internal.m0.g(this.f153052a, ((ni2) obj).f153052a);
    }

    public final int hashCode() {
        return this.f153052a.hashCode();
    }

    public final String toString() {
        return "Failure(adRequestError=" + this.f153052a + gi.j.f86771d;
    }
}
