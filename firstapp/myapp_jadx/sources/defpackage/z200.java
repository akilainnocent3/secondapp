package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z200 {
    public final List<y200> a;
    public final List<y200> b;
    public final y200 c;

    /* JADX WARN: Multi-variable type inference failed */
    public z200(List<? extends y200> list, List<? extends y200> list2, y200 y200Var) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
        this.c = y200Var;
    }

    public final boolean a(z200 z200Var) {
        List<y200> list = z200Var != null ? z200Var.a : null;
        List<y200> list2 = this.a;
        list2.getClass();
        if (list != null) {
            return CollectionsKt.a0(list2, null, null, null, new b300(), 31).equals(CollectionsKt.a0(list, null, null, null, new c300(0), 31));
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z200)) {
            return false;
        }
        z200 z200Var = (z200) obj;
        return Intrinsics.g(this.a, z200Var.a) && Intrinsics.g(this.b, z200Var.b) && Intrinsics.g(this.c, z200Var.c);
    }

    public final int hashCode() {
        int iA = ai50.a(this.a.hashCode() * 31, 31, this.b);
        y200 y200Var = this.c;
        return iA + (y200Var == null ? 0 : y200Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = hfb0.a("PayMethodConfig(methods=", ", needShowIsNewLabelMethods=", ", initSelectedMethod=", this.a, this.b);
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }

    public z200(List list) {
        this(list, m2g.a, null);
    }
}
