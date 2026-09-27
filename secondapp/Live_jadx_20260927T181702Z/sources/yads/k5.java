package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f151396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f151397b;

    public k5(int i10, int i11) {
        this.f151396a = i10;
        this.f151397b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5)) {
            return false;
        }
        k5 k5Var = (k5) obj;
        return this.f151396a == k5Var.f151396a && this.f151397b == k5Var.f151397b;
    }

    public final int hashCode() {
        return this.f151397b + (this.f151396a * 31);
    }

    public final String toString() {
        return "AdInfo(adGroupIndex=" + this.f151396a + ", adIndexInAdGroup=" + this.f151397b + gi.j.f86771d;
    }
}
