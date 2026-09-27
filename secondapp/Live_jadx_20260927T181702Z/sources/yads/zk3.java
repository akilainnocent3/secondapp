package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f158892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f158893b;

    public zk3(int i10, int i11) {
        this.f158892a = i10;
        this.f158893b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk3)) {
            return false;
        }
        zk3 zk3Var = (zk3) obj;
        return this.f158892a == zk3Var.f158892a && this.f158893b == zk3Var.f158893b;
    }

    public final int hashCode() {
        return this.f158893b + (this.f158892a * 31);
    }

    public final String toString() {
        return "ViewSize(width=" + this.f158892a + ", height=" + this.f158893b + gi.j.f86771d;
    }
}
