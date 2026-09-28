package defpackage;

import androidx.media3.exoplayer.g;

/* JADX INFO: loaded from: classes.dex */
public final class qs7 implements zjv, zjv.a {
    public final zjv a;
    public zjv.a b;
    public a[] c = new a[0];
    public long d;
    public long e;
    public long f;
    public rs7.c i;

    public final class a implements rs60 {
        public final rs60 a;
        public boolean b;

        public a(rs60 rs60Var) {
            this.a = rs60Var;
        }

        @Override // defpackage.rs60
        public final void a() {
            this.a.a();
        }

        @Override // defpackage.rs60
        public final int b(yti ytiVar, g5d g5dVar, int i) {
            qs7 qs7Var = qs7.this;
            if (qs7Var.i()) {
                return -3;
            }
            if (this.b) {
                g5dVar.a = 4;
                return -4;
            }
            long jS = qs7Var.s();
            int iB = this.a.b(ytiVar, g5dVar, i);
            if (iB != -5) {
                long j = qs7Var.f;
                if (j == Long.MIN_VALUE || ((iB != -4 || g5dVar.f < j) && !(iB == -3 && jS == Long.MIN_VALUE && !g5dVar.e))) {
                    return iB;
                }
                g5dVar.j();
                g5dVar.a = 4;
                this.b = true;
                return -4;
            }
            androidx.media3.common.a aVar = ytiVar.b;
            aVar.getClass();
            int i2 = aVar.J;
            int i3 = aVar.I;
            if (i3 == 0 && i2 == 0) {
                return -5;
            }
            if (qs7Var.e != 0) {
                i3 = 0;
            }
            if (qs7Var.f != Long.MIN_VALUE) {
                i2 = 0;
            }
            androidx.media3.common.a.C0062a c0062aA = aVar.a();
            c0062aA.H = i3;
            c0062aA.I = i2;
            ytiVar.b = new androidx.media3.common.a(c0062aA);
            return -5;
        }

        @Override // defpackage.rs60
        public final int c(long j) {
            if (qs7.this.i()) {
                return -3;
            }
            return this.a.c(j);
        }

        @Override // defpackage.rs60
        public final boolean isReady() {
            return !qs7.this.i() && this.a.isReady();
        }
    }

    public qs7(zjv zjvVar, boolean z, long j, long j2) {
        this.a = zjvVar;
        this.d = z ? j : -9223372036854775807L;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.xc80
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.xc80
    public final boolean b(g gVar) {
        return this.a.b(gVar);
    }

    @Override // defpackage.zjv
    public final long c(oyg[] oygVarArr, boolean[] zArr, rs60[] rs60VarArr, boolean[] zArr2, long j) {
        long j2;
        this.c = new a[rs60VarArr.length];
        rs60[] rs60VarArr2 = new rs60[rs60VarArr.length];
        for (int i = 0; i < rs60VarArr.length; i++) {
            a[] aVarArr = this.c;
            a aVar = (a) rs60VarArr[i];
            aVarArr[i] = aVar;
            rs60VarArr2[i] = aVar != null ? aVar.a : null;
        }
        long jC = this.a.c(oygVarArr, zArr, rs60VarArr2, zArr2, j);
        long j3 = this.f;
        long jMax = Math.max(jC, j);
        if (j3 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j3);
        }
        if (i()) {
            if (jC >= j) {
                if (jC != 0) {
                    int length = oygVarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            oyg oygVar = oygVarArr[i2];
                            if (oygVar != null) {
                                androidx.media3.common.a aVarR = oygVar.r();
                                if (!gqv.a(aVarR.n, aVarR.k)) {
                                }
                            }
                            i2++;
                        }
                    }
                }
                j2 = -9223372036854775807L;
            }
            j2 = jMax;
        } else {
            j2 = -9223372036854775807L;
        }
        this.d = j2;
        for (int i3 = 0; i3 < rs60VarArr.length; i3++) {
            rs60 rs60Var = rs60VarArr2[i3];
            a[] aVarArr2 = this.c;
            if (rs60Var == null) {
                aVarArr2[i3] = null;
            } else {
                a aVar2 = aVarArr2[i3];
                if (aVar2 == null || aVar2.a != rs60Var) {
                    aVarArr2[i3] = new a(rs60Var);
                }
            }
            rs60VarArr[i3] = aVarArr2[i3];
        }
        return jMax;
    }

    @Override // defpackage.xc80
    public final long d() {
        long jD = this.a.d();
        if (jD != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || jD < j) {
                return jD;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // xc80.a
    public final void e(xc80 xc80Var) {
        zjv.a aVar = this.b;
        aVar.getClass();
        aVar.e(this);
    }

    @Override // defpackage.zjv
    public final long f(long j, q480 q480Var) {
        long j2 = this.e;
        if (j == j2) {
            return j2;
        }
        long j3 = jrh0.j(q480Var.a, 0L, j - j2);
        long j4 = q480Var.b;
        long j5 = this.f;
        long j6 = jrh0.j(j4, 0L, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j);
        if (j3 != q480Var.a || j6 != q480Var.b) {
            q480Var = new q480(j3, j6);
        }
        return this.a.f(j, q480Var);
    }

    @Override // zjv.a
    public final void g(zjv zjvVar) {
        if (this.i != null) {
            return;
        }
        zjv.a aVar = this.b;
        aVar.getClass();
        aVar.g(this);
    }

    @Override // defpackage.zjv
    public final long h(long j) {
        this.d = -9223372036854775807L;
        for (a aVar : this.c) {
            if (aVar != null) {
                aVar.b = false;
            }
        }
        long jH = this.a.h(j);
        long j2 = this.e;
        long j3 = this.f;
        long jMax = Math.max(jH, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    public final boolean i() {
        return this.d != -9223372036854775807L;
    }

    @Override // defpackage.zjv
    public final long j() {
        if (i()) {
            long j = this.d;
            this.d = -9223372036854775807L;
            long j2 = j();
            return j2 != -9223372036854775807L ? j2 : j;
        }
        long j3 = this.a.j();
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j4 = this.e;
        long j5 = this.f;
        long jMax = Math.max(j3, j4);
        return j5 != Long.MIN_VALUE ? Math.min(jMax, j5) : jMax;
    }

    @Override // defpackage.zjv
    public final void m() throws rs7.c {
        rs7.c cVar = this.i;
        if (cVar != null) {
            throw cVar;
        }
        this.a.m();
    }

    @Override // defpackage.zjv
    public final void o(zjv.a aVar, long j) {
        this.b = aVar;
        this.a.o(this, j);
    }

    @Override // defpackage.zjv
    public final ljg0 q() {
        return this.a.q();
    }

    @Override // defpackage.xc80
    public final long s() {
        long jS = this.a.s();
        if (jS != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || jS < j) {
                return jS;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.zjv
    public final void u(long j, boolean z) {
        this.a.u(j, z);
    }

    @Override // defpackage.xc80
    public final void v(long j) {
        this.a.v(j);
    }
}
