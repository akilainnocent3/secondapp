package defpackage;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class co10 {
    public static final ekv.b u = new ekv.b(new Object());
    public final qxf0 a;
    public final ekv.b b;
    public final long c;
    public final long d;
    public final int e;
    public final rwg f;
    public final boolean g;
    public final ljg0 h;
    public final ujg0 i;
    public final List<uov> j;
    public final ekv.b k;
    public final boolean l;
    public final int m;
    public final int n;
    public final eo10 o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public co10(qxf0 qxf0Var, ekv.b bVar, long j, long j2, int i, rwg rwgVar, boolean z, ljg0 ljg0Var, ujg0 ujg0Var, List<uov> list, ekv.b bVar2, boolean z2, int i2, int i3, eo10 eo10Var, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = qxf0Var;
        this.b = bVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = rwgVar;
        this.g = z;
        this.h = ljg0Var;
        this.i = ujg0Var;
        this.j = list;
        this.k = bVar2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = eo10Var;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static co10 k(ujg0 ujg0Var) {
        qxf0.a aVar = qxf0.a;
        ljg0 ljg0Var = ljg0.d;
        pcn.b bVar = pcn.b;
        c150 c150Var = c150.e;
        eo10 eo10Var = eo10.d;
        ekv.b bVar2 = u;
        return new co10(aVar, bVar2, -9223372036854775807L, 0L, 1, null, false, ljg0Var, ujg0Var, c150Var, bVar2, false, 1, 0, eo10Var, 0L, 0L, 0L, 0L, false);
    }

    public final co10 a() {
        return new co10(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final co10 b(boolean z) {
        return new co10(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final co10 c(ekv.b bVar) {
        return new co10(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, bVar, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final co10 d(ekv.b bVar, long j, long j2, long j3, long j4, ljg0 ljg0Var, ujg0 ujg0Var, List<uov> list) {
        return new co10(this.a, bVar, j2, j3, this.e, this.f, this.g, ljg0Var, ujg0Var, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final co10 e(int i, int i2, boolean z) {
        return new co10(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final co10 f(rwg rwgVar) {
        return new co10(this.a, this.b, this.c, this.d, this.e, rwgVar, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final co10 g(eo10 eo10Var) {
        return new co10(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, eo10Var, this.q, this.r, this.s, this.t, this.p);
    }

    public final co10 h(int i) {
        return new co10(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final co10 i(boolean z) {
        return new co10(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final co10 j(qxf0 qxf0Var) {
        return new co10(qxf0Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long l() {
        long j;
        long j2;
        if (!m()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return jrh0.O(jrh0.Z(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.a)));
    }

    public final boolean m() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
