package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class lff0 {
    public final long A;
    public final long B;
    public final long C;
    public final long D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final long I;
    public final long J;
    public final long K;
    public final long L;
    public final long M;
    public final long N;
    public final long O;
    public final long P;
    public final long Q;
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
    public final bmf0 k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final long r;
    public final long s;
    public final long t;
    public final long u;
    public final long v;
    public final long w;
    public final long x;
    public final long y;
    public final long z;

    public lff0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, bmf0 bmf0Var, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42) {
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
        this.k = bmf0Var;
        this.l = j11;
        this.m = j12;
        this.n = j13;
        this.o = j14;
        this.p = j15;
        this.q = j16;
        this.r = j17;
        this.s = j18;
        this.t = j19;
        this.u = j20;
        this.v = j21;
        this.w = j22;
        this.x = j23;
        this.y = j24;
        this.z = j25;
        this.A = j26;
        this.B = j27;
        this.C = j28;
        this.D = j29;
        this.E = j30;
        this.F = j31;
        this.G = j32;
        this.H = j33;
        this.I = j34;
        this.J = j35;
        this.K = j36;
        this.L = j37;
        this.M = j38;
        this.N = j39;
        this.O = j40;
        this.P = j41;
        this.Q = j42;
    }

    public final lff0 a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, bmf0 bmf0Var, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42) {
        return new lff0(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d, j5 != 16 ? j5 : this.e, j6 != 16 ? j6 : this.f, j7 != 16 ? j7 : this.g, j8 != r1 ? j8 : this.h, j9 != r1 ? j9 : this.i, j10 != r1 ? j10 : this.j, bmf0Var == null ? this.k : bmf0Var, j11 != 16 ? j11 : this.l, j12 != 16 ? j12 : this.m, j13 != 16 ? j13 : this.n, j14 != 16 ? j14 : this.o, j15 != 16 ? j15 : this.p, j16 != 16 ? j16 : this.q, j17 != 16 ? j17 : this.r, j18 != 16 ? j18 : this.s, j19 != 16 ? j19 : this.t, j20 != 16 ? j20 : this.u, j21 != 16 ? j21 : this.v, j22 != 16 ? j22 : this.w, j23 != 16 ? j23 : this.x, j24 != 16 ? j24 : this.y, j25 != 16 ? j25 : this.z, j26 != 16 ? j26 : this.A, j27 != 16 ? j27 : this.B, j28 != 16 ? j28 : this.C, j29 != 16 ? j29 : this.D, j30 != 16 ? j30 : this.E, j31 != 16 ? j31 : this.F, j32 != 16 ? j32 : this.G, j33 != 16 ? j33 : this.H, j34 != 16 ? j34 : this.I, j35 != 16 ? j35 : this.J, j36 != 16 ? j36 : this.K, j37 != 16 ? j37 : this.L, j38 != 16 ? j38 : this.M, j39 != 16 ? j39 : this.N, j40 != 16 ? j40 : this.O, j41 != 16 ? j41 : this.P, j42 != 16 ? j42 : this.Q);
    }

    public final long c(boolean z, boolean z2, boolean z3) {
        if (!z) {
            return this.n;
        }
        if (z2) {
            return this.o;
        }
        return z3 ? this.l : this.m;
    }

    public final long d(boolean z, boolean z2, boolean z3) {
        if (!z) {
            return this.c;
        }
        if (z2) {
            return this.d;
        }
        return z3 ? this.a : this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof lff0)) {
            return false;
        }
        lff0 lff0Var = (lff0) obj;
        long j = lff0Var.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && nbh0.a(this.b, lff0Var.b) && nbh0.a(this.c, lff0Var.c) && nbh0.a(this.d, lff0Var.d) && nbh0.a(this.e, lff0Var.e) && nbh0.a(this.f, lff0Var.f) && nbh0.a(this.g, lff0Var.g) && nbh0.a(this.h, lff0Var.h) && nbh0.a(this.i, lff0Var.i) && nbh0.a(this.j, lff0Var.j) && Intrinsics.g(this.k, lff0Var.k) && nbh0.a(this.l, lff0Var.l) && nbh0.a(this.m, lff0Var.m) && nbh0.a(this.n, lff0Var.n) && nbh0.a(this.o, lff0Var.o) && nbh0.a(this.p, lff0Var.p) && nbh0.a(this.q, lff0Var.q) && nbh0.a(this.r, lff0Var.r) && nbh0.a(this.s, lff0Var.s) && nbh0.a(this.t, lff0Var.t) && nbh0.a(this.u, lff0Var.u) && nbh0.a(this.v, lff0Var.v) && nbh0.a(this.w, lff0Var.w) && nbh0.a(this.x, lff0Var.x) && nbh0.a(this.y, lff0Var.y) && nbh0.a(this.z, lff0Var.z) && nbh0.a(this.A, lff0Var.A) && nbh0.a(this.B, lff0Var.B) && nbh0.a(this.C, lff0Var.C) && nbh0.a(this.D, lff0Var.D) && nbh0.a(this.E, lff0Var.E) && nbh0.a(this.F, lff0Var.F) && nbh0.a(this.G, lff0Var.G) && nbh0.a(this.H, lff0Var.H) && nbh0.a(this.I, lff0Var.I) && nbh0.a(this.J, lff0Var.J) && nbh0.a(this.K, lff0Var.K) && nbh0.a(this.L, lff0Var.L) && nbh0.a(this.M, lff0Var.M) && nbh0.a(this.N, lff0Var.N) && nbh0.a(this.O, lff0Var.O) && nbh0.a(this.P, lff0Var.P) && nbh0.a(this.Q, lff0Var.Q);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.Q) + f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a((this.k.hashCode() + f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(f87.a(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31), this.j, 31)) * 31, this.l, 31), this.m, 31), this.n, 31), this.o, 31), this.p, 31), this.q, 31), this.r, 31), this.s, 31), this.t, 31), this.u, 31), this.v, 31), this.w, 31), this.x, 31), this.y, 31), this.z, 31), this.A, 31), this.B, 31), this.C, 31), this.D, 31), this.E, 31), this.F, 31), this.G, 31), this.H, 31), this.I, 31), this.J, 31), this.K, 31), this.L, 31), this.M, 31), this.N, 31), this.O, 31), this.P, 31);
    }
}
