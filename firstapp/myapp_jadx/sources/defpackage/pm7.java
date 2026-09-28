package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pm7 {
    public final Long a;
    public final Long b;
    public final Boolean c;

    public pm7(Long l, Long l2, Boolean bool) {
        this.a = l;
        this.b = l2;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm7)) {
            return false;
        }
        pm7 pm7Var = (pm7) obj;
        return Intrinsics.g(this.a, pm7Var.a) && Intrinsics.g(this.b, pm7Var.b) && this.c.equals(pm7Var.c);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        return this.c.hashCode() + ((iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseBetHistoryDateRangeParameter(startTime=");
        sb.append(this.a);
        sb.append(", endTime=");
        sb.append(this.b);
        sb.append(", showDiscardToast=");
        return rg2.a(sb, this.c, ")");
    }
}
