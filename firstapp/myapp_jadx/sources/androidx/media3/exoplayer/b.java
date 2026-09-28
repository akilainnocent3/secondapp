package androidx.media3.exoplayer;

import defpackage.d850;
import defpackage.ekv;
import defpackage.g5d;
import defpackage.ly0;
import defpackage.qxf0;
import defpackage.rs60;
import defpackage.rwg;
import defpackage.sp10;
import defpackage.uiv;
import defpackage.vs7;
import defpackage.yti;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements k, l {
    public long A;
    public boolean C;
    public boolean D;
    public ekv.b F;
    public l.a G;
    public final int b;
    public d850 d;
    public int e;
    public sp10 f;
    public vs7 i;
    public int v;
    public rs60 w;
    public androidx.media3.common.a[] y;
    public long z;
    public final Object a = new Object();
    public final yti c = new yti();
    public long B = Long.MIN_VALUE;
    public qxf0 E = qxf0.a;

    public b(int i) {
        this.b = i;
    }

    @Override // androidx.media3.exoplayer.k
    public final long A() {
        return this.B;
    }

    @Override // androidx.media3.exoplayer.k
    public final void B(long j) {
        this.C = false;
        this.A = j;
        this.B = j;
        G(j, false);
    }

    @Override // androidx.media3.exoplayer.k
    public uiv C() {
        return null;
    }

    public final rwg D(Exception exc, androidx.media3.common.a aVar, boolean z, int i) {
        int iD;
        if (aVar == null || this.D) {
            iD = 4;
        } else {
            this.D = true;
            try {
                iD = d(aVar) & 7;
                this.D = false;
            } catch (rwg unused) {
                this.D = false;
                iD = 4;
            } catch (Throwable th) {
                this.D = false;
                throw th;
            }
        }
        return new rwg(1, exc, i, getName(), this.e, aVar, aVar == null ? 4 : iD, this.F, z);
    }

    public abstract void E();

    public void F(boolean z, boolean z2) {
    }

    public abstract void G(long j, boolean z);

    public void H() {
    }

    public void I() {
    }

    public void J() {
    }

    public void K() {
    }

    public final int M(yti ytiVar, g5d g5dVar, int i) {
        rs60 rs60Var = this.w;
        rs60Var.getClass();
        int iB = rs60Var.b(ytiVar, g5dVar, i);
        if (iB == -4) {
            if (g5dVar.i(4)) {
                this.B = Long.MIN_VALUE;
                return this.C ? -4 : -3;
            }
            long j = g5dVar.f + this.z;
            g5dVar.f = j;
            this.B = Math.max(this.B, j);
            return iB;
        }
        if (iB == -5) {
            androidx.media3.common.a aVar = ytiVar.b;
            aVar.getClass();
            long j2 = aVar.s;
            if (j2 != Long.MAX_VALUE) {
                androidx.media3.common.a.C0062a c0062aA = aVar.a();
                c0062aA.r = j2 + this.z;
                ytiVar.b = new androidx.media3.common.a(c0062aA);
            }
        }
        return iB;
    }

    @Override // androidx.media3.exoplayer.k
    public final void a() {
        ly0.f(this.v == 1);
        this.c.a();
        this.v = 0;
        this.w = null;
        this.y = null;
        this.C = false;
        E();
        this.F = null;
    }

    @Override // androidx.media3.exoplayer.k
    public boolean b() {
        return f();
    }

    @Override // androidx.media3.exoplayer.k
    public final boolean f() {
        return this.B == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.k
    public final int getState() {
        return this.v;
    }

    @Override // androidx.media3.exoplayer.k
    public final void j() {
        this.C = true;
    }

    @Override // androidx.media3.exoplayer.j.b
    public void m(int i, Object obj) {
    }

    @Override // androidx.media3.exoplayer.k
    public final void n(d850 d850Var, androidx.media3.common.a[] aVarArr, rs60 rs60Var, boolean z, boolean z2, long j, long j2, ekv.b bVar) {
        ly0.f(this.v == 0);
        this.d = d850Var;
        this.F = bVar;
        this.v = 1;
        F(z, z2);
        y(aVarArr, rs60Var, j, j2, bVar);
        this.C = false;
        this.A = j;
        this.B = j;
        G(j, z);
    }

    @Override // androidx.media3.exoplayer.k
    public final void o() {
        rs60 rs60Var = this.w;
        rs60Var.getClass();
        rs60Var.a();
    }

    @Override // androidx.media3.exoplayer.k
    public final boolean p() {
        return this.C;
    }

    @Override // androidx.media3.exoplayer.k
    public final int q() {
        return this.b;
    }

    @Override // androidx.media3.exoplayer.k
    public final void r(qxf0 qxf0Var) {
        if (Objects.equals(this.E, qxf0Var)) {
            return;
        }
        this.E = qxf0Var;
    }

    @Override // androidx.media3.exoplayer.k
    public final void release() {
        ly0.f(this.v == 0);
        H();
    }

    @Override // androidx.media3.exoplayer.k
    public final void reset() {
        ly0.f(this.v == 0);
        this.c.a();
        I();
    }

    @Override // androidx.media3.exoplayer.k
    public final void start() {
        ly0.f(this.v == 1);
        this.v = 2;
        J();
    }

    @Override // androidx.media3.exoplayer.k
    public final void stop() {
        ly0.f(this.v == 2);
        this.v = 1;
        K();
    }

    @Override // androidx.media3.exoplayer.k
    public final void t(int i, sp10 sp10Var, vs7 vs7Var) {
        this.e = i;
        this.f = sp10Var;
        this.i = vs7Var;
    }

    @Override // androidx.media3.exoplayer.l
    public int x() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.k
    public final void y(androidx.media3.common.a[] aVarArr, rs60 rs60Var, long j, long j2, ekv.b bVar) {
        ly0.f(!this.C);
        this.w = rs60Var;
        this.F = bVar;
        if (this.B == Long.MIN_VALUE) {
            this.B = j;
        }
        this.y = aVarArr;
        this.z = j2;
        L(aVarArr, j, j2, bVar);
    }

    @Override // androidx.media3.exoplayer.k
    public final rs60 z() {
        return this.w;
    }

    @Override // androidx.media3.exoplayer.k
    public final b u() {
        return this;
    }

    public void L(androidx.media3.common.a[] aVarArr, long j, long j2, ekv.b bVar) {
    }
}
