package defpackage;

import com.appsflyer.internal.w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a24 {
    public final int a;
    public final int b;
    public final t6e0 c;
    public final double d;
    public final String e;
    public final int f;
    public final boolean g;

    public a24(int i, int i2, t6e0 t6e0Var, double d, String str, int i3, boolean z) {
        str.getClass();
        this.a = i;
        this.b = i2;
        this.c = t6e0Var;
        this.d = d;
        this.e = str;
        this.f = i3;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a24)) {
            return false;
        }
        a24 a24Var = (a24) obj;
        return this.a == a24Var.a && this.b == a24Var.b && this.c == a24Var.c && Double.compare(this.d, a24Var.d) == 0 && Intrinsics.g(this.e, a24Var.e) && this.f == a24Var.f && this.g == a24Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + gpp.a(this.f, gmf0.a(nrg0.a((this.c.hashCode() + gpp.a(this.b, Integer.hashCode(this.a) * 31, 31)) * 31, 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sbA = dy5.a("BettingStreakMetric(minimumStreakDaysForBonus=", this.a, this.b, ", currentStreakDays=", ", currentStreakLevel=");
        sbA.append(this.c);
        sbA.append(", currentMultiplier=");
        sbA.append(this.d);
        sbA.append(", maximumWeeklyReward=");
        sbA.append(this.e);
        sbA.append(", availableRepairTools=");
        sbA.append(this.f);
        return w.a(sbA, ", isStreakAlertEnabled=", this.g, ")");
    }
}
