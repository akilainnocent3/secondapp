package defpackage;

import androidx.media3.exoplayer.g;

/* JADX INFO: loaded from: classes.dex */
public final class nwf0 implements zjv, zjv.a {
    public final zjv a;
    public final long b;
    public zjv.a c;

    public static final class a implements rs60 {
        public final rs60 a;
        public final long b;

        public a(rs60 rs60Var, long j) {
            this.a = rs60Var;
            this.b = j;
        }

        @Override // defpackage.rs60
        public final void a() {
            this.a.a();
        }

        @Override // defpackage.rs60
        public final int b(yti ytiVar, g5d g5dVar, int i) {
            int iB = this.a.b(ytiVar, g5dVar, i);
            if (iB == -4) {
                g5dVar.f += this.b;
            }
            return iB;
        }

        @Override // defpackage.rs60
        public final int c(long j) {
            return this.a.c(j - this.b);
        }

        @Override // defpackage.rs60
        public final boolean isReady() {
            return this.a.isReady();
        }
    }

    public nwf0(zjv zjvVar, long j) {
        this.a = zjvVar;
        this.b = j;
    }

    @Override // defpackage.xc80
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.xc80
    public final boolean b(g gVar) {
        g.a aVar = new g.a();
        long j = gVar.a;
        aVar.b = gVar.b;
        aVar.c = gVar.c;
        aVar.a = j - this.b;
        return this.a.b(new g(aVar));
    }

    @Override // defpackage.zjv
    public final long c(oyg[] oygVarArr, boolean[] zArr, rs60[] rs60VarArr, boolean[] zArr2, long j) {
        rs60[] rs60VarArr2 = new rs60[rs60VarArr.length];
        int i = 0;
        while (true) {
            rs60 rs60Var = null;
            if (i >= rs60VarArr.length) {
                break;
            }
            a aVar = (a) rs60VarArr[i];
            if (aVar != null) {
                rs60Var = aVar.a;
            }
            rs60VarArr2[i] = rs60Var;
            i++;
        }
        zjv zjvVar = this.a;
        long j2 = this.b;
        long jC = zjvVar.c(oygVarArr, zArr, rs60VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < rs60VarArr.length; i2++) {
            rs60 rs60Var2 = rs60VarArr2[i2];
            if (rs60Var2 == null) {
                rs60VarArr[i2] = null;
            } else {
                rs60 rs60Var3 = rs60VarArr[i2];
                if (rs60Var3 == null || ((a) rs60Var3).a != rs60Var2) {
                    rs60VarArr[i2] = new a(rs60Var2, j2);
                }
            }
        }
        return jC + j2;
    }

    @Override // defpackage.xc80
    public final long d() {
        long jD = this.a.d();
        if (jD == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jD + this.b;
    }

    @Override // xc80.a
    public final void e(xc80 xc80Var) {
        zjv.a aVar = this.c;
        aVar.getClass();
        aVar.e(this);
    }

    @Override // defpackage.zjv
    public final long f(long j, q480 q480Var) {
        long j2 = this.b;
        return this.a.f(j - j2, q480Var) + j2;
    }

    @Override // zjv.a
    public final void g(zjv zjvVar) {
        zjv.a aVar = this.c;
        aVar.getClass();
        aVar.g(this);
    }

    @Override // defpackage.zjv
    public final long h(long j) {
        long j2 = this.b;
        return this.a.h(j - j2) + j2;
    }

    @Override // defpackage.zjv
    public final long j() {
        long j = this.a.j();
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j + this.b;
    }

    @Override // defpackage.zjv
    public final void m() {
        this.a.m();
    }

    @Override // defpackage.zjv
    public final void o(zjv.a aVar, long j) {
        this.c = aVar;
        this.a.o(this, j - this.b);
    }

    @Override // defpackage.zjv
    public final ljg0 q() {
        return this.a.q();
    }

    @Override // defpackage.xc80
    public final long s() {
        long jS = this.a.s();
        if (jS == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jS + this.b;
    }

    @Override // defpackage.zjv
    public final void u(long j, boolean z) {
        this.a.u(j - this.b, z);
    }

    @Override // defpackage.xc80
    public final void v(long j) {
        this.a.v(j - this.b);
    }
}
