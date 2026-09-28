package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i1d0 {
    public final k4d0 a;
    public final List<pwc0> b;
    public final a0d0 c;
    public final List<lwc0> d;
    public final l4d0 e;

    public i1d0(k4d0 k4d0Var, List<pwc0> list, a0d0 a0d0Var, List<lwc0> list2, l4d0 l4d0Var) {
        list.getClass();
        list2.getClass();
        this.a = k4d0Var;
        this.b = list;
        this.c = a0d0Var;
        this.d = list2;
        this.e = l4d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1d0)) {
            return false;
        }
        i1d0 i1d0Var = (i1d0) obj;
        return this.a.equals(i1d0Var.a) && Intrinsics.g(this.b, i1d0Var.b) && this.c.equals(i1d0Var.c) && Intrinsics.g(this.d, i1d0Var.d) && Intrinsics.g(this.e, i1d0Var.e);
    }

    public final int hashCode() {
        int iA = ai50.a(gmf0.a(ai50.a(this.a.hashCode() * 31, 31, this.b), 31, this.c.a), 31, this.d);
        l4d0 l4d0Var = this.e;
        return iA + (l4d0Var == null ? 0 : l4d0Var.hashCode());
    }

    public final String toString() {
        return "SportyPenaltySessionData(sportConfig=" + this.a + ", marketCategories=" + this.b + ", roundInfo=" + this.c + ", events=" + this.d + ", stats=" + this.e + ")";
    }
}
