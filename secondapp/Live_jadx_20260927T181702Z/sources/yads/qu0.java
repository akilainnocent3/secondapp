package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u41 f154604a;

    public qu0(u41 u41Var) {
        this.f154604a = u41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qu0) && kotlin.jvm.internal.m0.g(this.f154604a, ((qu0) obj).f154604a);
    }

    public final int hashCode() {
        u41 u41Var = this.f154604a;
        if (u41Var == null) {
            return 0;
        }
        return u41Var.hashCode();
    }

    public final String toString() {
        return "FeedbackValue(imageValue=" + this.f154604a + gi.j.f86771d;
    }
}
