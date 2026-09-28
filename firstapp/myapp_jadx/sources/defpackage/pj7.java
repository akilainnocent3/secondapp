package defpackage;

import androidx.compose.runtime.a;

/* JADX INFO: loaded from: classes.dex */
public final class pj7 {
    public static oj7 a(long j, long j2, long j3, long j4, long j5, a aVar, int i) {
        long j6 = (i & 4) != 0 ? j58.m : j3;
        long j7 = (i & 8) != 0 ? j58.m : j4;
        long j8 = (i & 16) != 0 ? j58.m : j5;
        long j9 = j58.m;
        d68 d68Var = (d68) aVar.O(g68.a);
        oj7 oj7Var = d68Var.d0;
        if (oj7Var == null) {
            long jC = g68.c(d68Var, wj7.c);
            long j10 = j58.l;
            e68 e68Var = wj7.a;
            long jC2 = g68.c(d68Var, e68Var);
            e68 e68Var2 = wj7.b;
            oj7 oj7Var2 = new oj7(jC, j10, jC2, j10, j58.c(0.38f, g68.c(d68Var, e68Var2)), j10, j58.c(0.38f, g68.c(d68Var, e68Var2)), g68.c(d68Var, e68Var), g68.c(d68Var, wj7.f), j58.c(0.38f, g68.c(d68Var, e68Var2)), j58.c(0.38f, g68.c(d68Var, wj7.e)), j58.c(0.38f, g68.c(d68Var, e68Var2)));
            d68Var.d0 = oj7Var2;
            oj7Var = oj7Var2;
        }
        long j11 = j58.l;
        long j12 = j6 != 16 ? j6 : oj7Var.a;
        long j13 = j11 != 16 ? j11 : oj7Var.b;
        long j14 = j != 16 ? j : oj7Var.c;
        long j15 = j11 != 16 ? j11 : oj7Var.d;
        long j16 = j7 != 16 ? j7 : oj7Var.e;
        if (j11 == 16) {
            j11 = oj7Var.f;
        }
        long j17 = j11;
        long j18 = j9 != r2 ? j9 : oj7Var.g;
        long j19 = j != 16 ? j : oj7Var.h;
        long j20 = j2 != r2 ? j2 : oj7Var.i;
        long j21 = j7 != 16 ? j7 : oj7Var.j;
        if (j8 == 16) {
            j8 = oj7Var.k;
        }
        long j22 = j8;
        if (j9 == r2) {
            j9 = oj7Var.l;
        }
        return new oj7(j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j9);
    }
}
