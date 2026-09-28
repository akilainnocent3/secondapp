package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w14 {
    public static final List<Integer> l = b.k(28, 90);
    public final int a;
    public final int b;
    public final t6e0 c;
    public final double d;
    public final String e;
    public final int f;
    public final List<b24> g;
    public final ArrayList h;
    public final boolean i;
    public final List<a7e0> j;
    public final List<Integer> k;

    public w14(int i, int i2, t6e0 t6e0Var, double d, String str, int i3, List list, ArrayList arrayList, boolean z, List list2, List list3) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = i;
        this.b = i2;
        this.c = t6e0Var;
        this.d = d;
        this.e = str;
        this.f = i3;
        this.g = list;
        this.h = arrayList;
        this.i = z;
        this.j = list2;
        this.k = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w14)) {
            return false;
        }
        w14 w14Var = (w14) obj;
        return this.a == w14Var.a && this.b == w14Var.b && this.c == w14Var.c && Double.compare(this.d, w14Var.d) == 0 && Intrinsics.g(this.e, w14Var.e) && this.f == w14Var.f && Intrinsics.g(this.g, w14Var.g) && this.h.equals(w14Var.h) && this.i == w14Var.i && Intrinsics.g(this.j, w14Var.j) && Intrinsics.g(this.k, w14Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ai50.a(mtg0.a(vt5.a(this.h, ai50.a(gpp.a(this.f, gmf0.a(nrg0.a((this.c.hashCode() + gpp.a(this.b, Integer.hashCode(this.a) * 31, 31)) * 31, 31, this.d), 31, this.e), 31), 31, this.g), 31), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbA = dy5.a("BettingStreakLobbyData(minimumStreakDaysForBonus=", this.a, this.b, ", currentStreakDays=", ", currentLevel=");
        sbA.append(this.c);
        sbA.append(", currentBonus=");
        sbA.append(this.d);
        sbA.append(", maximumWeeklyReward=");
        sbA.append(this.e);
        sbA.append(", availableRepairTools=");
        sbA.append(this.f);
        sbA.append(", missions=");
        sbA.append(this.g);
        sbA.append(", weeks=");
        sbA.append(this.h);
        sbA.append(", isAlertEnabled=");
        sbA.append(this.i);
        sbA.append(", allLevels=");
        sbA.append(this.j);
        return ka1.a(sbA, ", repairToolStreakDays=", this.k, ")");
    }
}
