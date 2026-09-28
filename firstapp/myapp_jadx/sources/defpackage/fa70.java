package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fa70 {
    public final String a;
    public final String b;
    public final String c;
    public final BigDecimal d;
    public final long e;
    public final List<gk70> f;

    public fa70(String str, String str2, String str3, BigDecimal bigDecimal, long j, List<gk70> list) {
        bigDecimal.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bigDecimal;
        this.e = j;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa70)) {
            return false;
        }
        fa70 fa70Var = (fa70) obj;
        return this.a.equals(fa70Var.a) && this.b.equals(fa70Var.b) && this.c.equals(fa70Var.c) && Intrinsics.g(this.d, fa70Var.d) && this.e == fa70Var.e && Intrinsics.g(this.f, fa70Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + f87.a(dd3.a(this.d, gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ScheduledFootballOpenBetTicket(id=", this.a, ", number=", this.b, ", betTypeString=");
        sbA.append(this.c);
        sbA.append(", totalStake=");
        sbA.append(this.d);
        sbA.append(", createTimestampMillis=");
        sbA.append(this.e);
        sbA.append(", bets=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
