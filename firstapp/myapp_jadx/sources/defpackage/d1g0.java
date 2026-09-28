package defpackage;

import androidx.compose.runtime.a;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class d1g0 {
    public static final float a;

    static {
        fah0 fah0Var = cq0.a;
        a = 64.0f;
        int i = bq0.a;
        int i2 = aq0.a;
        int i3 = xp0.a;
        int i4 = wp0.a;
    }

    public static qwg a(a aVar) {
        chf chfVar = vp0.a;
        Object[] objArr = new Object[0];
        uv60 uv60Var = i1g0.d;
        boolean zC = aVar.c(-3.4028235E38f) | aVar.c(0.0f) | aVar.c(0.0f);
        Object objY = aVar.y();
        Object obj = a.C0041a.a;
        if (zC || objY == obj) {
            objY = new kp0();
            aVar.r(objY);
        }
        i1g0 i1g0Var = (i1g0) o350.c(objArr, uv60Var, (Function0) objY, aVar, 0);
        Object objY2 = aVar.y();
        if (objY2 == obj) {
            objY2 = new b8f();
            aVar.r(objY2);
        }
        Function0 function0 = (Function0) objY2;
        goh gohVarB = a6w.b(z5w.c, aVar);
        h4d h4dVarA = zdb0.a(aVar);
        boolean zM = aVar.M(i1g0Var) | aVar.M(function0) | aVar.M(gohVarB) | aVar.M(h4dVarA);
        Object objY3 = aVar.y();
        if (zM || objY3 == obj) {
            objY3 = new qwg(i1g0Var, gohVarB, h4dVarA, function0);
            aVar.r(objY3);
        }
        return (qwg) objY3;
    }

    public static vbs b(a aVar) {
        return new vbs(bqe0.a(aVar), w8j0.e | 16);
    }

    public static c1g0 c(long j, long j2, long j3, long j4, long j5, long j6, a aVar, int i) {
        long j7 = (i & 2) != 0 ? j58.m : j2;
        long j8 = (i & 4) != 0 ? j58.m : j3;
        long j9 = (i & 8) != 0 ? j58.m : j4;
        long j10 = (i & 16) != 0 ? j58.m : j5;
        long j11 = (i & 32) != 0 ? j58.m : j6;
        d68 d68Var = (d68) aVar.O(g68.a);
        c1g0 c1g0Var = d68Var.c0;
        if (c1g0Var == null) {
            c1g0 c1g0Var2 = new c1g0(g68.c(d68Var, eq0.a), g68.c(d68Var, eq0.c), g68.c(d68Var, eq0.b), g68.c(d68Var, eq0.e), g68.c(d68Var, eq0.f), g68.c(d68Var, eq0.d));
            d68Var.c0 = c1g0Var2;
            c1g0Var = c1g0Var2;
        }
        long j12 = j != 16 ? j : c1g0Var.a;
        if (j7 == 16) {
            j7 = c1g0Var.b;
        }
        if (j8 == 16) {
            j8 = c1g0Var.c;
        }
        if (j9 == 16) {
            j9 = c1g0Var.d;
        }
        if (j10 == 16) {
            j10 = c1g0Var.e;
        }
        if (j11 == 16) {
            j11 = c1g0Var.f;
        }
        return new c1g0(j12, j7, j8, j9, j10, j11);
    }

    @fae
    public static c1g0 d(long j, long j2, a aVar, int i, int i2) {
        long j3 = j58.m;
        long j4 = (i2 & 8) != 0 ? j3 : j2;
        return c(j, j3, j3, j4, j3, j4, aVar, 0);
    }
}
