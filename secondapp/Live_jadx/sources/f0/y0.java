package f0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f82175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f82176b;

    public y0(long j10, long j11) {
        this.f82175a = j10;
        this.f82176b = j11;
    }

    public final long a() {
        return c();
    }

    public final long b() {
        return d();
    }

    public final long c() {
        return this.f82175a;
    }

    public final long d() {
        return this.f82176b;
    }

    public boolean equals(@oy.m Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return y0Var.f82175a == this.f82175a && y0Var.f82176b == this.f82176b;
    }

    public int hashCode() {
        return p.a(this.f82175a) ^ p.a(this.f82176b);
    }

    @oy.l
    public String toString() {
        return '(' + this.f82175a + ", " + this.f82176b + ')';
    }
}
