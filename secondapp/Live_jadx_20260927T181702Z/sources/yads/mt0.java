package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mt0 extends qt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4 f152673a;

    public mt0(l4 l4Var) {
        super(0);
        this.f152673a = l4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mt0) && kotlin.jvm.internal.m0.g(this.f152673a, ((mt0) obj).f152673a);
    }

    public final int hashCode() {
        return this.f152673a.hashCode();
    }

    public final String toString() {
        return "Failed(adFetchRequestError=" + this.f152673a + gi.j.f86771d;
    }
}
