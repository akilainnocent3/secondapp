package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b24 {
    public final s24 a;
    public final r24 b;
    public final long c;
    public final double d;
    public final int e;
    public final String f;

    public b24(s24 s24Var, r24 r24Var, long j, double d, int i, String str) {
        str.getClass();
        this.a = s24Var;
        this.b = r24Var;
        this.c = j;
        this.d = d;
        this.e = i;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b24)) {
            return false;
        }
        b24 b24Var = (b24) obj;
        return this.a == b24Var.a && this.b == b24Var.b && this.c == b24Var.c && Double.compare(this.d, b24Var.d) == 0 && this.e == b24Var.e && Intrinsics.g(this.f, b24Var.f);
    }

    public final int hashCode() {
        s24 s24Var = this.a;
        int iHashCode = (s24Var == null ? 0 : s24Var.hashCode()) * 31;
        r24 r24Var = this.b;
        return this.f.hashCode() + gpp.a(this.e, nrg0.a(f87.a((iHashCode + (r24Var != null ? r24Var.hashCode() : 0)) * 31, this.c, 31), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BettingStreakMission(type=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        hib0.b(this.d, ", currentWager=", ", targetWager=", sb);
        sb.append(this.e);
        sb.append(", currencyCode=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
