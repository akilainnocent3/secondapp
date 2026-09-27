package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kj1 f151124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kj1 f151125b;

    public jj1(kj1 kj1Var, kj1 kj1Var2) {
        this.f151124a = kj1Var;
        this.f151125b = kj1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj1)) {
            return false;
        }
        jj1 jj1Var = (jj1) obj;
        return kotlin.jvm.internal.m0.g(this.f151124a, jj1Var.f151124a) && kotlin.jvm.internal.m0.g(this.f151125b, jj1Var.f151125b);
    }

    public final int hashCode() {
        return this.f151125b.hashCode() + (this.f151124a.hashCode() * 31);
    }

    public final String toString() {
        return "MeasuredSize(width=" + this.f151124a + ", height=" + this.f151125b + gi.j.f86771d;
    }
}
