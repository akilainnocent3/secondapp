package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class mo4 {
    public final Double a;
    public final double b;

    public mo4(double d, Double d2) {
        this.a = d2;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo4)) {
            return false;
        }
        mo4 mo4Var = (mo4) obj;
        return Intrinsics.g(this.a, mo4Var.a) && Double.compare(this.b, mo4Var.b) == 0;
    }

    public final int hashCode() {
        Double d = this.a;
        return Double.hashCode(this.b) + ((d == null ? 0 : d.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusCupRewardState(totalBudget=");
        sb.append(this.a);
        sb.append(", earned=");
        return org0.a(sb, this.b, ')');
    }

    public /* synthetic */ mo4(int i) {
        this(0.0d, null);
    }
}
