package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ij5 implements nk0.a {
    public static final long e = d2l.c(1);
    public static final ij5 f;
    public final long a;
    public final long b;
    public final long c;
    public final wcf d;

    static {
        long jG = d2l.g(0.25f, 8589934592L);
        f = new ij5(jG, jG, d2l.g(0.25f, 8589934592L));
    }

    public ij5(long j, long j2, long j3) {
        rlh rlhVar = rlh.a;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = rlhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ij5)) {
            return false;
        }
        ij5 ij5Var = (ij5) obj;
        if (!omf0.a(this.a, ij5Var.a) || !omf0.a(this.b, ij5Var.b)) {
            return false;
        }
        omf0.a(this.c, ij5Var.c);
        return false;
    }

    public final int hashCode() {
        int iHashCode = ao7.a.hashCode() * 31;
        pmf0[] pmf0VarArr = omf0.b;
        return this.d.hashCode() + tvh.a(Float.NaN, f87.a(f87.a(f87.a(iHashCode, this.a, 31), this.b, 31), this.c, 961), 31);
    }

    public final String toString() {
        return "Bullet(shape=" + ao7.a + ", size=(" + ((Object) omf0.f(this.a)) + ", " + ((Object) omf0.f(this.b)) + "), padding=" + ((Object) omf0.f(this.c)) + ", brush=null, alpha=NaN, drawStyle=" + this.d + ')';
    }
}
