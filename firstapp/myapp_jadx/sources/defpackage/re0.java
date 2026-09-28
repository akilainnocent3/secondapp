package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class re0 {
    public static final hep.a a = hep.a.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");
    public static final hep.a b = hep.a.a("k");

    public static void a(be0 be0Var, xmt xmtVar) {
        Float fValueOf = Float.valueOf(0.0f);
        List list = (List) be0Var.b;
        if (list.isEmpty()) {
            list.add(new cpp(xmtVar, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(xmtVar.m)));
        } else if (((cpp) list.get(0)).b == 0) {
            list.set(0, new cpp(xmtVar, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(xmtVar.m)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(be0 be0Var) {
        if (be0Var != null) {
            return be0Var.d() && ((Float) ((cpp) ((List) be0Var.b).get(0)).b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0123  */
    /* JADX WARN: Multi-variable type inference failed */
    public static qe0 c(hfp hfpVar, xmt xmtVar) {
        ie0 ie0Var;
        boolean z = hfpVar.J() == hep.b.c;
        if (z) {
            hfpVar.f();
        }
        fe0 fe0VarA = null;
        se0 se0VarB = null;
        be0 be0VarB = null;
        ie0 ie0Var2 = null;
        be0 be0VarB2 = null;
        be0 be0VarB3 = null;
        be0 be0VarB4 = null;
        be0 be0VarB5 = null;
        be0 be0VarB6 = null;
        de0 de0VarD = null;
        be0 be0VarB7 = null;
        be0 be0VarB8 = null;
        while (hfpVar.o()) {
            switch (hfpVar.V(a)) {
                case 0:
                    hfpVar.f();
                    while (hfpVar.o()) {
                        if (hfpVar.V(b) != 0) {
                            hfpVar.Y();
                            hfpVar.Z();
                        } else {
                            fe0VarA = ge0.a(hfpVar, xmtVar);
                        }
                    }
                    hfpVar.l();
                    break;
                case 1:
                    se0VarB = ge0.b(hfpVar, xmtVar);
                    break;
                case 2:
                    ie0Var2 = new ie0(fpp.a(hfpVar, xmtVar, 1.0f, dz60.a, false));
                    break;
                case 3:
                    be0VarB6 = te0.b(hfpVar, xmtVar, false);
                    a(be0VarB6, xmtVar);
                    break;
                case 4:
                    be0VarB = te0.b(hfpVar, xmtVar, false);
                    a(be0VarB, xmtVar);
                    break;
                case 5:
                    de0VarD = te0.d(hfpVar, xmtVar);
                    break;
                case 6:
                    be0VarB7 = te0.b(hfpVar, xmtVar, false);
                    break;
                case 7:
                    be0VarB8 = te0.b(hfpVar, xmtVar, false);
                    break;
                case 8:
                    be0VarB2 = te0.b(hfpVar, xmtVar, false);
                    break;
                case 9:
                    be0VarB3 = te0.b(hfpVar, xmtVar, false);
                    break;
                case 10:
                    be0VarB4 = te0.b(hfpVar, xmtVar, false);
                    a(be0VarB4, xmtVar);
                    break;
                case 11:
                    be0VarB5 = te0.b(hfpVar, xmtVar, false);
                    a(be0VarB5, xmtVar);
                    break;
                default:
                    hfpVar.Y();
                    hfpVar.Z();
                    break;
            }
        }
        if (z) {
            hfpVar.l();
        }
        if (fe0VarA == null || (fe0VarA.d() && ((PointF) ((cpp) ((ArrayList) fe0VarA.a).get(0)).b).equals(0.0f, 0.0f))) {
            fe0VarA = null;
        }
        se0 se0Var = (se0VarB == null || (!(se0VarB instanceof ke0) && se0VarB.d() && ((PointF) ((cpp) se0VarB.c().get(0)).b).equals(0.0f, 0.0f))) ? null : se0VarB;
        be0 be0Var = b(be0VarB) ? null : be0VarB;
        if (ie0Var2 == null) {
            ie0Var = null;
        } else {
            if (ie0Var2.d()) {
                cz60 cz60Var = (cz60) ((cpp) ((List) ie0Var2.b).get(0)).b;
                if (cz60Var.a == 1.0f && cz60Var.b == 1.0f) {
                    ie0Var = null;
                }
            }
            ie0Var = ie0Var2;
        }
        return new qe0(fe0VarA, se0Var, ie0Var, be0Var, de0VarD, be0VarB7, be0VarB8, (be0VarB2 == null || (be0VarB2.d() && ((Float) ((cpp) ((List) be0VarB2.b).get(0)).b).floatValue() == 0.0f)) ? null : be0VarB2, (be0VarB3 == null || (be0VarB3.d() && ((Float) ((cpp) ((List) be0VarB3.b).get(0)).b).floatValue() == 0.0f)) ? null : be0VarB3, b(be0VarB4) ? null : be0VarB4, b(be0VarB5) ? null : be0VarB5, b(be0VarB6) ? null : be0VarB6);
    }
}
