package defpackage;

import androidx.compose.runtime.a;

/* JADX INFO: loaded from: classes.dex */
public final class gg6 {
    public static final /* synthetic */ int a = 0;

    public static fg6 a(a aVar) {
        return e((d68) aVar.O(g68.a));
    }

    public static fg6 b(long j, long j2, a aVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            j2 = g68.b(j, aVar);
        }
        long j3 = j2;
        return e((d68) aVar.O(g68.a)).a(j, j3, j58.m, j58.c(0.38f, j3));
    }

    public static jg6 c(int i, float f) {
        if ((i & 1) != 0) {
            e68 e68Var = wlh.a;
            f = 0.0f;
        }
        return new jg6(f, 0.0f, 0.0f, wlh.f, wlh.e, 0.0f);
    }

    public static jg6 d(int i) {
        return new jg6((i & 1) != 0 ? gwf.b : 2.0f, gwf.j, gwf.h, gwf.i, gwf.g, gwf.e);
    }

    public static fg6 e(d68 d68Var) {
        fg6 fg6Var = d68Var.Z;
        if (fg6Var != null) {
            return fg6Var;
        }
        e68 e68Var = wlh.a;
        fg6 fg6Var2 = new fg6(g68.c(d68Var, e68Var), g68.a(d68Var, g68.c(d68Var, e68Var)), r58.h(j58.c(wlh.d, g68.c(d68Var, wlh.c)), g68.c(d68Var, e68Var)), j58.c(0.38f, g68.a(d68Var, g68.c(d68Var, e68Var))));
        d68Var.Z = fg6Var2;
        return fg6Var2;
    }
}
