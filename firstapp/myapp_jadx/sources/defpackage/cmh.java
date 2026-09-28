package defpackage;

import androidx.compose.runtime.a;

/* JADX INFO: loaded from: classes.dex */
public final class cmh {
    public static final float a;

    static {
        cy80 cy80Var = dmh.a;
        a = 32.0f;
    }

    public static l35 a(boolean z, long j, long j2, a aVar, int i) {
        if ((i & 4) != 0) {
            j = g68.d(dmh.k, aVar);
        }
        if ((i & 8) != 0) {
            j2 = j58.l;
        }
        j58.c(dmh.h, g68.d(dmh.g, aVar));
        int i2 = j58.n;
        float f = dmh.l;
        if (z) {
            j = j2;
        }
        if (z) {
            f = 0.0f;
        }
        return m35.a(f, j);
    }

    public static d780 b(long j, long j2, long j3, long j4, a aVar, int i) {
        long j5 = (i & 2) != 0 ? j58.m : j2;
        long j6 = j58.m;
        long j7 = (i & 128) != 0 ? j6 : j3;
        long j8 = (i & 512) != 0 ? j6 : j4;
        d780 d780VarC = c((d68) aVar.O(g68.a));
        long j9 = j != 16 ? j : d780VarC.a;
        if (j5 == 16) {
            j5 = d780VarC.b;
        }
        long j10 = j5;
        long j11 = j6 != 16 ? j6 : d780VarC.c;
        long j12 = j6 != 16 ? j6 : d780VarC.d;
        long j13 = j6 != 16 ? j6 : d780VarC.e;
        long j14 = j6 != 16 ? j6 : d780VarC.f;
        long j15 = j6 != 16 ? j6 : d780VarC.g;
        long j16 = j6 != 16 ? j6 : d780VarC.h;
        if (j7 == 16) {
            j7 = d780VarC.i;
        }
        long j17 = j7;
        long j18 = j6 != 16 ? j6 : d780VarC.j;
        if (j8 == 16) {
            j8 = d780VarC.k;
        }
        long j19 = j8;
        long j20 = j6 != 16 ? j6 : d780VarC.l;
        if (j6 == 16) {
            j6 = d780VarC.m;
        }
        return new d780(j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j6);
    }

    public static d780 c(d68 d68Var) {
        d780 d780Var = d68Var.b0;
        if (d780Var != null) {
            return d780Var;
        }
        long j = j58.l;
        d780 d780Var2 = new d780(j, g68.c(d68Var, dmh.o), g68.c(d68Var, dmh.s), g68.c(d68Var, dmh.w), j, j58.c(dmh.c, g68.c(d68Var, dmh.b)), j58.c(dmh.q, g68.c(d68Var, dmh.p)), j58.c(dmh.u, g68.c(d68Var, dmh.t)), g68.c(d68Var, dmh.i), j58.c(dmh.f, g68.c(d68Var, dmh.e)), g68.c(d68Var, dmh.n), g68.c(d68Var, dmh.r), g68.c(d68Var, dmh.v));
        d68Var.b0 = d780Var2;
        return d780Var2;
    }
}
