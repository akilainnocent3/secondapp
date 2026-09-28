package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class no4 {
    public final Double a;
    public final Float b;

    public no4(Double d, Float f) {
        this.a = d;
        this.b = f;
        if (d != null && d.doubleValue() < 0.0d) {
            hb5.a("totalBonusBudget must be non-negative");
            throw null;
        }
        if (f == null || f.floatValue() > 0.0f) {
            return;
        }
        hb5.a("roundDurationSeconds must be positive");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no4)) {
            return false;
        }
        no4 no4Var = (no4) obj;
        return Intrinsics.g(this.a, no4Var.a) && Intrinsics.g(this.b, no4Var.b);
    }

    public final int hashCode() {
        Double d = this.a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Float f = this.b;
        return iHashCode + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "BonusCupRoundConfig(totalBonusBudget=" + this.a + ", roundDurationSeconds=" + this.b + ')';
    }
}
