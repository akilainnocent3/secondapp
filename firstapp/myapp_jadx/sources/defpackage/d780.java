package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d780 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;

    public d780(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d780)) {
            return false;
        }
        d780 d780Var = (d780) obj;
        long j = d780Var.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && nbh0.a(this.b, d780Var.b) && nbh0.a(this.c, d780Var.c) && nbh0.a(this.d, d780Var.d) && nbh0.a(this.e, d780Var.e) && nbh0.a(this.f, d780Var.f) && nbh0.a(this.g, d780Var.g) && nbh0.a(this.h, d780Var.h) && nbh0.a(this.i, d780Var.i) && nbh0.a(this.j, d780Var.j) && nbh0.a(this.k, d780Var.k) && nbh0.a(this.l, d780Var.l) && nbh0.a(this.m, d780Var.m);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.m) + f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31), this.j, 31), this.k, 31), this.l, 31);
    }
}
