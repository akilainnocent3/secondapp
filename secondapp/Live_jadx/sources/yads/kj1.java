package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f151557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lj1 f151558b;

    public kj1(int i10, lj1 lj1Var) {
        this.f151557a = i10;
        this.f151558b = lj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj1)) {
            return false;
        }
        kj1 kj1Var = (kj1) obj;
        return this.f151557a == kj1Var.f151557a && this.f151558b == kj1Var.f151558b;
    }

    public final int hashCode() {
        return this.f151558b.hashCode() + (this.f151557a * 31);
    }

    public final String toString() {
        return "MeasuredSizeSpec(value=" + this.f151557a + ", mode=" + this.f151558b + gi.j.f86771d;
    }
}
