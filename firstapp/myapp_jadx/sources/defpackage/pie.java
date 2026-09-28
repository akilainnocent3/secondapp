package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class pie {
    public static final String a = jgt.g("DiagnosticsWrkr");

    public static final String a(yvj0 yvj0Var, lxj0 lxj0Var, lqe0 lqe0Var, List<owj0> list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for (owj0 owj0Var : list) {
            ivj0 ivj0VarA = jxj0.a(owj0Var);
            String str = owj0Var.a;
            kqe0 kqe0VarD = lqe0Var.d(ivj0VarA);
            Integer numValueOf = kqe0VarD != null ? Integer.valueOf(kqe0VarD.c) : null;
            String strA0 = CollectionsKt.a0(yvj0Var.b(str), ",", null, null, null, 62);
            String strA1 = CollectionsKt.a0(lxj0Var.a(str), ",", null, null, null, 62);
            StringBuilder sbA = he.a("\n", str, "\t ");
            oie.a(numValueOf, owj0Var.c, "\t ", "\t ", sbA);
            sbA.append(owj0Var.b.name());
            sbA.append("\t ");
            sbA.append(strA0);
            sbA.append("\t ");
            sbA.append(strA1);
            sbA.append('\t');
            sb.append(sbA.toString());
        }
        return sb.toString();
    }
}
