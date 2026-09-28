package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gk70 {
    public final String a;
    public final sj70 b;
    public final BigDecimal c;
    public final List<yk70> d;

    public gk70(String str, sj70 sj70Var, BigDecimal bigDecimal, List<yk70> list) {
        bigDecimal.getClass();
        list.getClass();
        this.a = str;
        this.b = sj70Var;
        this.c = bigDecimal;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk70)) {
            return false;
        }
        gk70 gk70Var = (gk70) obj;
        return this.a.equals(gk70Var.a) && this.b == gk70Var.b && Intrinsics.g(this.c, gk70Var.c) && Intrinsics.g(this.d, gk70Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dd3.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ScheduledFootballTicketBet(id=" + this.a + ", settlementStatus=" + this.b + ", potentialWin=" + this.c + ", subBets=" + this.d + ")";
    }
}
