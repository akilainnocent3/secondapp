package defpackage;

import androidx.compose.runtime.a;

/* JADX INFO: loaded from: classes.dex */
public final class oj7 {
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

    public oj7(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
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
    }

    public static goh a(kzf0 kzf0Var, a aVar) {
        if (kzf0Var == kzf0.b) {
            aVar.N(1539262271);
            goh gohVarB = a6w.b(z5w.d, aVar);
            aVar.H();
            return gohVarB;
        }
        aVar.N(1539355581);
        goh gohVarB2 = a6w.b(z5w.c, aVar);
        aVar.H();
        return gohVarB2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof oj7)) {
            return false;
        }
        oj7 oj7Var = (oj7) obj;
        long j = oj7Var.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && nbh0.a(this.b, oj7Var.b) && nbh0.a(this.c, oj7Var.c) && nbh0.a(this.d, oj7Var.d) && nbh0.a(this.e, oj7Var.e) && nbh0.a(this.f, oj7Var.f) && nbh0.a(this.g, oj7Var.g) && nbh0.a(this.h, oj7Var.h) && nbh0.a(this.i, oj7Var.i) && nbh0.a(this.j, oj7Var.j) && nbh0.a(this.k, oj7Var.k) && nbh0.a(this.l, oj7Var.l);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.l) + f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31), this.j, 31), this.k, 31);
    }
}
