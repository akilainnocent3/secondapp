package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t27 {
    public final hk2 a;
    public final ArrayList b;
    public final ArrayList c;
    public final List<String> d;
    public final List<String> e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final Double j;
    public final Double k;
    public final Double l;
    public final Boolean m;
    public final Boolean n;

    public t27(hk2 hk2Var, ArrayList arrayList, ArrayList arrayList2, List list, List list2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, Double d, Double d2, Double d3, Boolean bool, Boolean bool2) {
        list.getClass();
        list2.getClass();
        this.a = hk2Var;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = list;
        this.e = list2;
        this.f = arrayList3;
        this.g = arrayList4;
        this.h = arrayList5;
        this.i = arrayList6;
        this.j = d;
        this.k = d2;
        this.l = d3;
        this.m = bool;
        this.n = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t27)) {
            return false;
        }
        t27 t27Var = (t27) obj;
        return this.a == t27Var.a && this.b.equals(t27Var.b) && this.c.equals(t27Var.c) && Intrinsics.g(this.d, t27Var.d) && Intrinsics.g(this.e, t27Var.e) && this.f.equals(t27Var.f) && this.g.equals(t27Var.g) && this.h.equals(t27Var.h) && this.i.equals(t27Var.i) && Intrinsics.g(this.j, t27Var.j) && Intrinsics.g(this.k, t27Var.k) && Intrinsics.g(this.l, t27Var.l) && Intrinsics.g(this.m, t27Var.m) && Intrinsics.g(this.n, t27Var.n);
    }

    public final int hashCode() {
        int iA = vt5.a(this.i, vt5.a(this.h, vt5.a(this.g, vt5.a(this.f, ai50.a(ai50.a(vt5.a(this.c, vt5.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31), 31), 31), 31);
        Double d = this.j;
        int iHashCode = (iA + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.k;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.l;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Boolean bool = this.m;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.n;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChallengeRules(betCategory=");
        sb.append(this.a);
        sb.append(", realSportTypes=");
        sb.append(this.b);
        sb.append(", instantVirtualTypes=");
        sb.append(this.c);
        sb.append(", tournaments=");
        sb.append(this.d);
        sb.append(", markets=");
        sb.append(this.e);
        sb.append(", betTypes=");
        sb.append(this.f);
        sb.append(", betBuilderTypes=");
        sb.append(this.g);
        sb.append(", upTypes=");
        sb.append(this.h);
        sb.append(", earlyGoalsTypes=");
        sb.append(this.i);
        sb.append(", minStake=");
        sb.append(this.j);
        sb.append(", minTotalOdds=");
        s27.a(this.k, this.l, ", maxTotalOdds=", ", giftUsage=", sb);
        sb.append(this.m);
        sb.append(", cashOut=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}
