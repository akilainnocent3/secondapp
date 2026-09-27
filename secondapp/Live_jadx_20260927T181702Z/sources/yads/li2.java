package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class li2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yz2 f152005b;

    public li2(String str, yz2 yz2Var) {
        this.f152004a = str;
        this.f152005b = yz2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li2)) {
            return false;
        }
        li2 li2Var = (li2) obj;
        return kotlin.jvm.internal.m0.g(this.f152004a, li2Var.f152004a) && kotlin.jvm.internal.m0.g(this.f152005b, li2Var.f152005b);
    }

    public final int hashCode() {
        return this.f152005b.hashCode() + (this.f152004a.hashCode() * 31);
    }

    public final String toString() {
        return "Preview(base64=" + this.f152004a + ", size=" + this.f152005b + gi.j.f86771d;
    }
}
