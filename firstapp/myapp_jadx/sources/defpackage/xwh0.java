package defpackage;

import defpackage.mj0;

/* JADX INFO: loaded from: classes.dex */
public final class xwh0<V extends mj0> implements pwh0<V> {
    public final twh0<V> a;
    public final l850 b;
    public final long c;
    public final long d;

    public xwh0(twh0<V> twh0Var, l850 l850Var, long j) {
        this.a = twh0Var;
        this.b = l850Var;
        this.c = ((long) (twh0Var.b() + twh0Var.d())) * 1000000;
        this.d = j * 1000000;
    }

    @Override // defpackage.pwh0
    public final boolean a() {
        return true;
    }

    @Override // defpackage.pwh0
    public final long c(V v, V v2, V v3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.pwh0
    public final V f(long j, V v, V v2, V v3) {
        return this.a.f(h(j), v, v2, i(j, v, v3, v2));
    }

    @Override // defpackage.pwh0
    public final V g(long j, V v, V v2, V v3) {
        return this.a.g(h(j), v, v2, i(j, v, v3, v2));
    }

    public final long h(long j) {
        long j2 = this.d;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.c;
        long j5 = j3 / j4;
        return (this.b == l850.a || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    public final V i(long j, V v, V v2, V v3) {
        long j2 = this.d;
        long j3 = j + j2;
        long j4 = this.c;
        return j3 > j4 ? this.a.f(j4 - j2, v, v3, v2) : v2;
    }
}
