package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class o31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f153338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153339b;

    public o31(int i10, int i11) {
        this.f153338a = i10;
        this.f153339b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o31)) {
            return false;
        }
        o31 o31Var = (o31) obj;
        return this.f153338a == o31Var.f153338a && this.f153339b == o31Var.f153339b;
    }

    public final int hashCode() {
        return this.f153339b + (this.f153338a * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f153338a + ", height=" + this.f153339b + gi.j.f86771d;
    }
}
