package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kmc0 {
    public final String a;
    public final int b;

    public kmc0(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmc0)) {
            return false;
        }
        kmc0 kmc0Var = (kmc0) obj;
        return Intrinsics.g(this.a, kmc0Var.a) && this.b == kmc0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return d830.a(this.b, "SportyLegendsStatsAverageGoalsState(overallAvgScore=", this.a, ", averageGoalsTextColorResId=", ")");
    }
}
