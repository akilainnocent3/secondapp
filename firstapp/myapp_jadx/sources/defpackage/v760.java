package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v760 {
    public static boolean a(goh0 goh0Var) {
        goh0Var.getClass();
        dg60 dg60Var = goh0Var.c;
        if (dg60Var instanceof dg60.a) {
            if (!((dg60.a) dg60Var).a) {
                t760 t760Var = goh0Var.a;
                t760Var.getClass();
                if (t760Var.equals(t760.a.a) || t760Var.equals(t760.b.a)) {
                    return true;
                }
                if (t760Var instanceof t760.c) {
                    return ((t760.c) t760Var).a != 0;
                }
                uhc.a();
                return false;
            }
        } else if (!Intrinsics.g(dg60Var, dg60.b.a)) {
            uhc.a();
            return false;
        }
        return false;
    }
}
