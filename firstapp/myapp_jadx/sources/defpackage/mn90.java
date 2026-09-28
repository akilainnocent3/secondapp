package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mn90 {
    public final String a;
    public final Integer b;

    public mn90(String str, Integer num) {
        this.a = str;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn90)) {
            return false;
        }
        mn90 mn90Var = (mn90) obj;
        return this.a.equals(mn90Var.a) && Intrinsics.g(this.b, mn90Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "SimulationSettleRound(roundId=" + this.a + ", bizCode=" + this.b + ")";
    }
}
