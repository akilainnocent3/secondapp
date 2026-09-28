package defpackage;

import com.appsflyer.internal.w;

/* JADX INFO: loaded from: classes6.dex */
public final class o34 {
    public final double a;
    public final int b;
    public final boolean c;

    public o34(double d, int i, boolean z) {
        this.a = d;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o34)) {
            return false;
        }
        o34 o34Var = (o34) obj;
        return Double.compare(this.a, o34Var.a) == 0 && this.b == o34Var.b && this.c == o34Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + gpp.a(this.b, Double.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BettingStreakRewardStatus(multiplier=");
        sb.append(this.a);
        sb.append(", bonus=");
        sb.append(this.b);
        return w.a(sb, ", isEnabled=", this.c, ")");
    }
}
