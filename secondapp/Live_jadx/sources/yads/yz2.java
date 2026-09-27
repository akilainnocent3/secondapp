package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yz2 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f158539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f158540c;

    public yz2(int i10, int i11) {
        this.f158539b = i10;
        this.f158540c = i11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        yz2 yz2Var = (yz2) obj;
        return kotlin.jvm.internal.m0.t(this.f158539b * this.f158540c, yz2Var.f158539b * yz2Var.f158540c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz2)) {
            return false;
        }
        yz2 yz2Var = (yz2) obj;
        return this.f158539b == yz2Var.f158539b && this.f158540c == yz2Var.f158540c;
    }

    public final int hashCode() {
        return this.f158540c + (this.f158539b * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f158539b + ", height=" + this.f158540c + gi.j.f86771d;
    }
}
