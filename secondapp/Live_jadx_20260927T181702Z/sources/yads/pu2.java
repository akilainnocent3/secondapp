package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pu2 implements ru2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4 f154141a;

    public pu2(l4 l4Var) {
        this.f154141a = l4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pu2) && kotlin.jvm.internal.m0.g(this.f154141a, ((pu2) obj).f154141a);
    }

    public final int hashCode() {
        return this.f154141a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f154141a + gi.j.f86771d;
    }
}
