package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class oh4 {
    public final long a;
    public final Long b;
    public final Double c;
    public final Double d;
    public final int e;
    public final Integer f;

    public oh4(long j, Long l, Double d, Double d2, int i, Integer num) {
        this.a = j;
        this.b = l;
        this.c = d;
        this.d = d2;
        this.e = i;
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh4)) {
            return false;
        }
        oh4 oh4Var = (oh4) obj;
        return this.a == oh4Var.a && Intrinsics.g(this.b, oh4Var.b) && Intrinsics.g(this.c, oh4Var.c) && Intrinsics.g(this.d, oh4Var.d) && this.e == oh4Var.e && Intrinsics.g(this.f, oh4Var.f);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.d;
        int iA = gpp.a(this.e, (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31, 31);
        Integer num = this.f;
        return iA + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "BonusCupActiveSession(sessionId=" + this.a + ", expiresAt=" + this.b + ", accumulatedReward=" + this.c + ", remainingBudget=" + this.d + ", yellowCards=" + this.e + ", timerSeconds=" + this.f + ')';
    }
}
