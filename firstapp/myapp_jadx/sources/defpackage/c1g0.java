package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c1g0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public c1g0(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c1g0)) {
            return false;
        }
        c1g0 c1g0Var = (c1g0) obj;
        long j = c1g0Var.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && nbh0.a(this.b, c1g0Var.b) && nbh0.a(this.c, c1g0Var.c) && nbh0.a(this.d, c1g0Var.d) && nbh0.a(this.e, c1g0Var.e) && nbh0.a(this.f, c1g0Var.f);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.f) + f87.a(f87.a(f87.a(f87.a(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
    }
}
