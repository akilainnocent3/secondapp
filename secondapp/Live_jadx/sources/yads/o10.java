package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class o10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n10 f153300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153301b;

    public o10(n10 n10Var, String str) {
        this.f153300a = n10Var;
        this.f153301b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o10)) {
            return false;
        }
        o10 o10Var = (o10) obj;
        return this.f153300a == o10Var.f153300a && kotlin.jvm.internal.m0.g(this.f153301b, o10Var.f153301b);
    }

    public final int hashCode() {
        int iHashCode = this.f153300a.hashCode() * 31;
        String str = this.f153301b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CoreNativeCloseButton(type=" + this.f153300a + ", text=" + this.f153301b + gi.j.f86771d;
    }
}
