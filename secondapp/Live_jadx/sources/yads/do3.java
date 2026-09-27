package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class do3 implements fo3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fw1 f148302a;

    public do3(fw1 fw1Var) {
        this.f148302a = fw1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof do3) && kotlin.jvm.internal.m0.g(this.f148302a, ((do3) obj).f148302a);
    }

    public final int hashCode() {
        fw1 fw1Var = this.f148302a;
        if (fw1Var == null) {
            return 0;
        }
        return fw1Var.hashCode();
    }

    public final String toString() {
        return "Loading(preloadingListener=" + this.f148302a + gi.j.f86771d;
    }
}
