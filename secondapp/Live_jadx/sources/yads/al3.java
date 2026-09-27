package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class al3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f146855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f146856b;

    public al3(int i10, int i11) {
        this.f146855a = i10;
        this.f146856b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al3)) {
            return false;
        }
        al3 al3Var = (al3) obj;
        return this.f146855a == al3Var.f146855a && this.f146856b == al3Var.f146856b;
    }

    public final int hashCode() {
        return this.f146856b + (this.f146855a * 31);
    }

    public final String toString() {
        return "ViewSize(width=" + this.f146855a + ", height=" + this.f146856b + gi.j.f86771d;
    }
}
