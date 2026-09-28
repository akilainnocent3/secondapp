package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes6.dex */
public final class ce40 {
    public static List a(gd40 gd40Var) {
        if (!gd40Var.a) {
            return a.c(be40.c.a);
        }
        ngs ngsVarB = a.b();
        for (ro10 ro10Var : gd40Var.b) {
            String str = ro10Var.b;
            List<String> list = ro10Var.d;
            ngsVarB.add(new be40.b(str, ro10Var.a, list.size(), list));
        }
        for (qqf0 qqf0Var : gd40Var.c) {
            ngsVarB.add(new be40.d(qqf0Var.b, qqf0Var.a, qqf0Var.c, qqf0Var.d));
        }
        for (t1g0 t1g0Var : gd40Var.d) {
            ngsVarB.add(new be40.e(t1g0Var.b, t1g0Var.a, t1g0Var.c));
        }
        return CollectionsKt.j0(a.a(ngsVarB), be40.a.a);
    }
}
