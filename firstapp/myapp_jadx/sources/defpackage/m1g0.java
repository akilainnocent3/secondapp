package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m1g0 {
    public final l1g0 a;
    public final List<l1g0> b;
    public final epa0 c;

    public m1g0(l1g0 l1g0Var, List<l1g0> list, epa0 epa0Var) {
        list.getClass();
        epa0Var.getClass();
        this.a = l1g0Var;
        this.b = list;
        this.c = epa0Var;
    }

    public static m1g0 a(m1g0 m1g0Var, l1g0 l1g0Var, epa0 epa0Var, int i) {
        if ((i & 1) != 0) {
            l1g0Var = m1g0Var.a;
        }
        List<l1g0> list = m1g0Var.b;
        if ((i & 4) != 0) {
            epa0Var = m1g0Var.c;
        }
        m1g0Var.getClass();
        list.getClass();
        epa0Var.getClass();
        return new m1g0(l1g0Var, list, epa0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1g0)) {
            return false;
        }
        m1g0 m1g0Var = (m1g0) obj;
        return Intrinsics.g(this.a, m1g0Var.a) && Intrinsics.g(this.b, m1g0Var.b) && this.c == m1g0Var.c;
    }

    public final int hashCode() {
        l1g0 l1g0Var = this.a;
        return this.c.hashCode() + ai50.a((l1g0Var == null ? 0 : l1g0Var.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "TopBetBuilderSortAndFilter(selectedFilter=" + this.a + ", filters=" + this.b + ", sortType=" + this.c + ")";
    }

    public m1g0() {
        this(0);
    }

    public m1g0(int i) {
        this(null, m2g.a, epa0.a);
    }
}
