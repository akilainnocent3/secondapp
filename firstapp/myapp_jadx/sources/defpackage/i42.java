package defpackage;

import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.e;
import com.google.protobuf.Reader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class i42 implements so10 {
    public final qxf0.c a = new qxf0.c();

    @Override // defpackage.so10
    public final void A(int i, long j) {
        m0(i, j, false);
    }

    @Override // defpackage.so10
    public final long E() {
        d dVar = (d) this;
        qxf0 qxf0VarV = dVar.v();
        if (qxf0VarV.p()) {
            return -9223372036854775807L;
        }
        return jrh0.Z(qxf0VarV.m(dVar.U(), this.a, 0L).l);
    }

    @Override // defpackage.so10
    public final void K(long j) {
        n0(5, j);
    }

    @Override // defpackage.so10
    public final boolean Q() {
        d dVar = (d) this;
        return dVar.P() == 3 && dVar.B() && dVar.u() == 0;
    }

    @Override // defpackage.so10
    public final void S(njv njvVar) {
        c150 c150VarN = pcn.n(njvVar);
        d dVar = (d) this;
        dVar.S0();
        ArrayList arrayListT0 = dVar.t0(c150VarN);
        dVar.S0();
        ArrayList arrayList = dVar.p;
        int iMin = Math.min(Reader.READ_DONE, arrayList.size());
        if (arrayList.isEmpty()) {
            dVar.J0(arrayListT0, dVar.m0 == -1);
            return;
        }
        co10 co10Var = dVar.l0;
        qxf0 qxf0Var = co10Var.a;
        dVar.I++;
        ArrayList arrayListQ0 = dVar.q0(iMin, arrayListT0);
        br10 br10Var = new br10(arrayList, dVar.P);
        co10 co10VarC0 = dVar.C0(co10Var, br10Var, dVar.z0(qxf0Var, br10Var, dVar.x0(co10Var), dVar.v0(co10Var)));
        dVar.l.v.b(new e.b(arrayListQ0, dVar.P, -1, -9223372036854775807L), 18, iMin, 0).b();
        dVar.Q0(co10VarC0, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.so10
    public final void T() {
        ((d) this).n(true);
    }

    @Override // defpackage.so10
    public final void a() {
        ((d) this).n(false);
    }

    @Override // defpackage.so10
    public final void b0() {
        d dVar = (d) this;
        dVar.S0();
        o0(12, dVar.w);
    }

    @Override // defpackage.so10
    public final void c0() {
        d dVar = (d) this;
        dVar.S0();
        o0(11, -dVar.v);
    }

    @Override // defpackage.so10
    public final void f(float f) {
        d dVar = (d) this;
        dVar.e(new eo10(f, dVar.c().b));
    }

    public final njv g0() {
        d dVar = (d) this;
        qxf0 qxf0VarV = dVar.v();
        if (qxf0VarV.p()) {
            return null;
        }
        return qxf0VarV.m(dVar.U(), this.a, 0L).b;
    }

    public final boolean h0() {
        int iK;
        d dVar = (d) this;
        qxf0 qxf0VarV = dVar.v();
        if (qxf0VarV.p()) {
            iK = -1;
        } else {
            int iU = dVar.U();
            dVar.S0();
            int i = dVar.G;
            if (i == 1) {
                i = 0;
            }
            dVar.S0();
            iK = qxf0VarV.k(iU, i, dVar.H);
        }
        return iK != -1;
    }

    @Override // defpackage.so10
    public final void i() {
        d dVar = (d) this;
        dVar.S0();
        ArrayList arrayList = dVar.p;
        int size = arrayList.size();
        int iMin = Math.min(Reader.READ_DONE, size);
        if (size <= 0 || iMin == 0) {
            return;
        }
        co10 co10Var = dVar.l0;
        int iX0 = dVar.x0(co10Var);
        long jV0 = dVar.v0(co10Var);
        qxf0 qxf0Var = co10Var.a;
        int size2 = arrayList.size();
        dVar.I++;
        for (int i = iMin - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        dVar.P = dVar.P.a(iMin);
        br10 br10Var = new br10(arrayList, dVar.P);
        co10 co10VarC0 = dVar.C0(co10Var, br10Var, dVar.z0(qxf0Var, br10Var, iX0, jV0));
        int i2 = co10VarC0.e;
        if (i2 != 1 && i2 != 4 && iMin > 0 && iMin == size2 && iX0 >= co10VarC0.a.o()) {
            co10VarC0 = d.B0(co10VarC0, 4);
        }
        co10 co10Var2 = co10VarC0;
        dVar.l.v.b(dVar.P, 20, 0, iMin).b();
        dVar.Q0(co10Var2, 0, !co10Var2.b.a.equals(dVar.l0.b.a), 4, dVar.w0(co10Var2), -1, false);
    }

    public final void i0() {
        ((d) this).S0();
    }

    @Override // defpackage.so10
    public final void j() {
        m0(((d) this).U(), -9223372036854775807L, false);
    }

    public final boolean j0() {
        d dVar = (d) this;
        qxf0 qxf0VarV = dVar.v();
        return !qxf0VarV.p() && qxf0VarV.m(dVar.U(), this.a, 0L).h;
    }

    public final boolean k0() {
        d dVar = (d) this;
        qxf0 qxf0VarV = dVar.v();
        return !qxf0VarV.p() && qxf0VarV.m(dVar.U(), this.a, 0L).a();
    }

    public final boolean l0() {
        d dVar = (d) this;
        qxf0 qxf0VarV = dVar.v();
        return !qxf0VarV.p() && qxf0VarV.m(dVar.U(), this.a, 0L).g;
    }

    @Override // defpackage.so10
    public final void m() {
        int iK;
        int iK2;
        d dVar = (d) this;
        if (dVar.v().p() || dVar.g()) {
            i0();
            return;
        }
        boolean zH0 = h0();
        if (k0() && !l0()) {
            if (!zH0) {
                i0();
                return;
            }
            qxf0 qxf0VarV = dVar.v();
            if (qxf0VarV.p()) {
                iK2 = -1;
            } else {
                int iU = dVar.U();
                dVar.S0();
                int i = dVar.G;
                if (i == 1) {
                    i = 0;
                }
                dVar.S0();
                iK2 = qxf0VarV.k(iU, i, dVar.H);
            }
            if (iK2 == -1) {
                i0();
                return;
            } else if (iK2 == dVar.U()) {
                m0(dVar.U(), -9223372036854775807L, true);
                return;
            } else {
                m0(iK2, -9223372036854775807L, false);
                return;
            }
        }
        if (zH0) {
            long jE0 = dVar.e0();
            dVar.S0();
            if (jE0 <= dVar.x) {
                qxf0 qxf0VarV2 = dVar.v();
                if (qxf0VarV2.p()) {
                    iK = -1;
                } else {
                    int iU2 = dVar.U();
                    dVar.S0();
                    int i2 = dVar.G;
                    if (i2 == 1) {
                        i2 = 0;
                    }
                    dVar.S0();
                    iK = qxf0VarV2.k(iU2, i2, dVar.H);
                }
                if (iK == -1) {
                    i0();
                    return;
                } else if (iK == dVar.U()) {
                    m0(dVar.U(), -9223372036854775807L, true);
                    return;
                } else {
                    m0(iK, -9223372036854775807L, false);
                    return;
                }
            }
        }
        n0(7, 0L);
    }

    public abstract void m0(int i, long j, boolean z);

    public final void n0(int i, long j) {
        m0(((d) this).U(), j, false);
    }

    @Override // defpackage.so10
    public final void o() {
        int iE;
        d dVar = (d) this;
        qxf0 qxf0VarV = dVar.v();
        if (qxf0VarV.p()) {
            iE = -1;
        } else {
            int iU = dVar.U();
            dVar.S0();
            int i = dVar.G;
            if (i == 1) {
                i = 0;
            }
            dVar.S0();
            iE = qxf0VarV.e(iU, i, dVar.H);
        }
        if (iE == -1) {
            i0();
        } else if (iE == dVar.U()) {
            m0(dVar.U(), -9223372036854775807L, true);
        } else {
            m0(iE, -9223372036854775807L, false);
        }
    }

    public final void o0(int i, long j) {
        d dVar = (d) this;
        long jE0 = dVar.e0() + j;
        long jY0 = dVar.y0();
        if (jY0 != -9223372036854775807L) {
            jE0 = Math.min(jE0, jY0);
        }
        n0(i, Math.max(jE0, 0L));
    }

    public final void p0(njv njvVar) {
        c150 c150VarN = pcn.n(njvVar);
        d dVar = (d) this;
        dVar.S0();
        dVar.J0(dVar.t0(c150VarN), true);
    }

    @Override // defpackage.so10
    public final boolean q() {
        int iE;
        d dVar = (d) this;
        qxf0 qxf0VarV = dVar.v();
        if (qxf0VarV.p()) {
            iE = -1;
        } else {
            int iU = dVar.U();
            dVar.S0();
            int i = dVar.G;
            if (i == 1) {
                i = 0;
            }
            dVar.S0();
            iE = qxf0VarV.e(iU, i, dVar.H);
        }
        return iE != -1;
    }

    @Override // defpackage.so10
    public final boolean t(int i) {
        d dVar = (d) this;
        dVar.S0();
        return dVar.R.a.a.get(i);
    }

    @Override // defpackage.so10
    public final void y() {
        int iE;
        d dVar = (d) this;
        if (dVar.v().p() || dVar.g()) {
            i0();
            return;
        }
        if (!q()) {
            if (k0() && j0()) {
                m0(dVar.U(), -9223372036854775807L, false);
                return;
            } else {
                i0();
                return;
            }
        }
        qxf0 qxf0VarV = dVar.v();
        if (qxf0VarV.p()) {
            iE = -1;
        } else {
            int iU = dVar.U();
            dVar.S0();
            int i = dVar.G;
            if (i == 1) {
                i = 0;
            }
            dVar.S0();
            iE = qxf0VarV.e(iU, i, dVar.H);
        }
        if (iE == -1) {
            i0();
        } else if (iE == dVar.U()) {
            m0(dVar.U(), -9223372036854775807L, true);
        } else {
            m0(iE, -9223372036854775807L, false);
        }
    }
}
