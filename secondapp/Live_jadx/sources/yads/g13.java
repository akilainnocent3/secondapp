package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class g13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f149342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f149343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f149344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f149345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f149346e;

    public g13(int i10, int i11, int i12, int i13) {
        this.f149342a = i10;
        this.f149343b = i11;
        this.f149344c = i12;
        this.f149345d = i13;
        this.f149346e = i12 * i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g13)) {
            return false;
        }
        g13 g13Var = (g13) obj;
        return this.f149342a == g13Var.f149342a && this.f149343b == g13Var.f149343b && this.f149344c == g13Var.f149344c && this.f149345d == g13Var.f149345d;
    }

    public final int hashCode() {
        return this.f149345d + nd3.a(this.f149344c, nd3.a(this.f149343b, this.f149342a * 31, 31), 31);
    }

    public final String toString() {
        return "SmartCenter(x=" + this.f149342a + ", y=" + this.f149343b + ", width=" + this.f149344c + ", height=" + this.f149345d + gi.j.f86771d;
    }
}
