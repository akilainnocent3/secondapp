package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class a12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g9 f146612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v42 f146613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yo2 f146614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f146615d;

    public a12(g9 g9Var, v42 v42Var, b12 b12Var, int i10) {
        this.f146612a = g9Var;
        this.f146613b = v42Var;
        this.f146614c = b12Var;
        this.f146615d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a12)) {
            return false;
        }
        a12 a12Var = (a12) obj;
        return kotlin.jvm.internal.m0.g(this.f146612a, a12Var.f146612a) && this.f146613b == a12Var.f146613b && kotlin.jvm.internal.m0.g(this.f146614c, a12Var.f146614c) && this.f146615d == a12Var.f146615d;
    }

    public final int hashCode() {
        return this.f146615d + ((this.f146614c.hashCode() + ((this.f146613b.hashCode() + (this.f146612a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NativeAdRequestData(adRequestData=" + this.f146612a + ", nativeResponseType=" + this.f146613b + ", requestPolicy=" + this.f146614c + ", adsCount=" + this.f146615d + gi.j.f86771d;
    }
}
