package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
public final class ejx {
    public static final fzo a(pd80 pd80Var) {
        String strP = c.p(pd80Var.h(), "?", "", false);
        if (Intrinsics.g(pd80Var.getKind(), yd80.b.a)) {
            return pd80Var.b() ? fzo.J : fzo.I;
        }
        if (strP.equals("kotlin.Int")) {
            return pd80Var.b() ? fzo.b : fzo.a;
        }
        if (strP.equals("kotlin.Boolean")) {
            return pd80Var.b() ? fzo.d : fzo.c;
        }
        if (strP.equals("kotlin.Double")) {
            return pd80Var.b() ? fzo.f : fzo.e;
        }
        if (strP.equals("kotlin.Float")) {
            return pd80Var.b() ? fzo.v : fzo.i;
        }
        if (strP.equals("kotlin.Long")) {
            return pd80Var.b() ? fzo.y : fzo.w;
        }
        if (strP.equals("kotlin.String")) {
            return pd80Var.b() ? fzo.A : fzo.z;
        }
        if (strP.equals("kotlin.IntArray")) {
            return fzo.B;
        }
        if (strP.equals("kotlin.DoubleArray")) {
            return fzo.D;
        }
        if (strP.equals("kotlin.BooleanArray")) {
            return fzo.C;
        }
        if (strP.equals("kotlin.FloatArray")) {
            return fzo.E;
        }
        if (strP.equals("kotlin.LongArray")) {
            return fzo.F;
        }
        if (strP.equals("kotlin.Array")) {
            return fzo.G;
        }
        return c.u(strP, "kotlin.collections.ArrayList", false) ? fzo.H : fzo.K;
    }
}
