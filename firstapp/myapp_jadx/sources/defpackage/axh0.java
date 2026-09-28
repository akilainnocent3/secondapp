package defpackage;

import defpackage.mj0;

/* JADX INFO: loaded from: classes.dex */
public final class axh0<V extends mj0> implements uwh0<V> {
    public final int a;
    public final twh0<V> b;
    public final l850 c;
    public final long d;
    public final long e;

    public axh0(int i, twh0<V> twh0Var, l850 l850Var, long j) {
        this.a = i;
        this.b = twh0Var;
        this.c = l850Var;
        if (i < 1) {
            hb5.a("Iterations count can't be less than 1");
            throw null;
        }
        this.d = ((long) (twh0Var.b() + twh0Var.d())) * 1000000;
        this.e = j * 1000000;
    }

    @Override // defpackage.pwh0
    public final long c(V v, V v2, V v3) {
        return (((long) this.a) * this.d) - this.e;
    }

    @Override // defpackage.pwh0
    public final V f(long j, V v, V v2, V v3) {
        return this.b.f(h(j), v, v2, i(j, v, v3, v2));
    }

    @Override // defpackage.pwh0
    public final V g(long j, V v, V v2, V v3) {
        return this.b.g(h(j), v, v2, i(j, v, v3, v2));
    }

    public final long h(long j) {
        long j2 = this.e;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.d;
        long jMin = Math.min(j3 / j4, ((long) this.a) - 1);
        return (this.c == l850.a || jMin % 2 == 0) ? j3 - (jMin * j4) : ((jMin + 1) * j4) - j3;
    }

    public final V i(long j, V v, V v2, V v3) {
        long j2 = this.e;
        long j3 = j + j2;
        long j4 = this.d;
        return j3 > j4 ? (V) f(j4 - j2, v, v2, v3) : v2;
    }
}
