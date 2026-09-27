package ws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class p0 {
    public static final void a(@oy.l n0 n0Var, @oy.l wt.c fqName, @oy.l Collection<m0> packageFragments) {
        kotlin.jvm.internal.m0.p(n0Var, "<this>");
        kotlin.jvm.internal.m0.p(fqName, "fqName");
        kotlin.jvm.internal.m0.p(packageFragments, "packageFragments");
        if (n0Var instanceof q0) {
            ((q0) n0Var).b(fqName, packageFragments);
        } else {
            packageFragments.addAll(n0Var.a(fqName));
        }
    }

    public static final boolean b(@oy.l n0 n0Var, @oy.l wt.c fqName) {
        kotlin.jvm.internal.m0.p(n0Var, "<this>");
        kotlin.jvm.internal.m0.p(fqName, "fqName");
        return n0Var instanceof q0 ? ((q0) n0Var).c(fqName) : c(n0Var, fqName).isEmpty();
    }

    @oy.l
    public static final List<m0> c(@oy.l n0 n0Var, @oy.l wt.c fqName) {
        kotlin.jvm.internal.m0.p(n0Var, "<this>");
        kotlin.jvm.internal.m0.p(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        a(n0Var, fqName, arrayList);
        return arrayList;
    }
}
