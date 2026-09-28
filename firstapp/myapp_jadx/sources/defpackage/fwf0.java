package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fwf0 {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Long e;
    public final int f;

    public /* synthetic */ fwf0(int i, Integer num, Integer num2, Integer num3, Integer num4) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, null, 0);
    }

    public final boolean a() {
        Integer num;
        Integer num2;
        Integer num3 = this.a;
        if (num3 != null && (num2 = this.b) != null && num2.intValue() >= num3.intValue()) {
            return true;
        }
        Integer num4 = this.c;
        return (num4 == null || (num = this.d) == null || num.intValue() < num4.intValue()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwf0)) {
            return false;
        }
        fwf0 fwf0Var = (fwf0) obj;
        return Intrinsics.g(this.a, fwf0Var.a) && Intrinsics.g(this.b, fwf0Var.b) && Intrinsics.g(this.c, fwf0Var.c) && Intrinsics.g(this.d, fwf0Var.d) && Intrinsics.g(this.e, fwf0Var.e) && this.f == fwf0Var.f;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l = this.e;
        return Integer.hashCode(this.f) + ((iHashCode4 + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeLimits(dailyLimit=");
        sb.append(this.a);
        sb.append(", consumedDailyLimit=");
        sb.append(this.b);
        sb.append(", weeklyLimit=");
        cv7.a(sb, this.c, ", consumedWeeklyLimit=", this.d, ", lastReportedActivityTimestamp=");
        sb.append(this.e);
        sb.append(", unreportedAppUsageInMinutes=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public fwf0() {
        this(63, null, null, null, null);
    }

    public fwf0(Integer num, Integer num2, Integer num3, Integer num4, Long l, int i) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.e = l;
        this.f = i;
    }
}
