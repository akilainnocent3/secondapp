package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ez90 {
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

    public ez90(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
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
    }

    public final long a(boolean z, boolean z2) {
        if (z) {
            return z2 ? this.c : this.e;
        }
        return z2 ? this.h : this.j;
    }

    public final long b(boolean z, boolean z2) {
        if (z) {
            return z2 ? this.b : this.d;
        }
        return z2 ? this.g : this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ez90)) {
            return false;
        }
        ez90 ez90Var = (ez90) obj;
        long j = ez90Var.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && nbh0.a(this.b, ez90Var.b) && nbh0.a(this.c, ez90Var.c) && nbh0.a(this.d, ez90Var.d) && nbh0.a(this.e, ez90Var.e) && nbh0.a(this.f, ez90Var.f) && nbh0.a(this.g, ez90Var.g) && nbh0.a(this.h, ez90Var.h) && nbh0.a(this.i, ez90Var.i) && nbh0.a(this.j, ez90Var.j);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.j) + f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31);
    }
}
