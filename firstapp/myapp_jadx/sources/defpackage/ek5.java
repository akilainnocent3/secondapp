package defpackage;

import androidx.compose.runtime.a;

/* JADX INFO: loaded from: classes.dex */
public final class ek5 {
    public static final umz a;
    public static final umz b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        float f = r82.a;
        float f2 = r82.b;
        cy80 cy80Var = ok5.a;
        a = new umz(f, 8.0f, f2, 8.0f);
        if (!(f2 >= 0.0f)) {
            ukn.a("Padding must be non-negative");
        }
        b = new umz(12.0f, 8.0f, 12.0f, 8.0f);
        if (!((8.0f >= 0.0f) & (8.0f >= 0.0f))) {
            ukn.a("Padding must be non-negative");
        }
        c = 58.0f;
        d = 40.0f;
        e = ok5.b;
    }

    public static ak5 a(long j, long j2, long j3, long j4, a aVar, int i) {
        if ((i & 1) != 0) {
            j = j58.m;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = j58.m;
        }
        long j6 = j2;
        if ((i & 4) != 0) {
            j3 = j58.m;
        }
        return c((d68) aVar.O(g68.a)).a(j5, j6, j3, (i & 8) != 0 ? j58.m : j4);
    }

    public static hk5 b(int i) {
        if ((i & 1) != 0) {
            e68 e68Var = vlh.a;
        }
        return new hk5(0.0f, vlh.f);
    }

    public static ak5 c(d68 d68Var) {
        ak5 ak5Var = d68Var.W;
        if (ak5Var != null) {
            return ak5Var;
        }
        ak5 ak5Var2 = new ak5(g68.c(d68Var, vlh.a), g68.c(d68Var, vlh.g), j58.c(vlh.c, g68.c(d68Var, vlh.b)), j58.c(vlh.e, g68.c(d68Var, vlh.d)));
        d68Var.W = ak5Var2;
        return ak5Var2;
    }

    public static ak5 d(d68 d68Var) {
        ak5 ak5Var = d68Var.X;
        if (ak5Var != null) {
            return ak5Var;
        }
        long j = j58.l;
        ak5 ak5Var2 = new ak5(j, g68.c(d68Var, h9z.c), j, j58.c(h9z.b, g68.c(d68Var, h9z.a)));
        d68Var.X = ak5Var2;
        return ak5Var2;
    }

    public static ak5 e(d68 d68Var) {
        ak5 ak5Var = d68Var.Y;
        if (ak5Var != null) {
            return ak5Var;
        }
        long j = j58.l;
        ak5 ak5Var2 = new ak5(j, g68.c(d68Var, e68.A), j, j58.c(rdf0.b, g68.c(d68Var, rdf0.a)));
        d68Var.Y = ak5Var2;
        return ak5Var2;
    }

    public static ak5 f(long j, long j2, long j3, a aVar, int i) {
        if ((i & 1) != 0) {
            j = j58.m;
        }
        long j4 = j;
        long j5 = j58.m;
        return d((d68) aVar.O(g68.a)).a(j4, j2, j5, (i & 8) != 0 ? j5 : j3);
    }

    public static ak5 g(long j, long j2, a aVar, int i) {
        long j3 = j58.m;
        return e((d68) aVar.O(g68.a)).a(j3, j, j3, (i & 8) != 0 ? j3 : j2);
    }
}
