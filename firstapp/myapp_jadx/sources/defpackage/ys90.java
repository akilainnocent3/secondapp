package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ys90 {
    public final String a;
    public final String b;
    public final String c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final long f;
    public final Integer g;
    public final List<vs90> h;
    public final List<sq90> i;

    public ys90(String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, long j, Integer num, List<vs90> list, List<sq90> list2) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bigDecimal;
        this.e = bigDecimal2;
        this.f = j;
        this.g = num;
        this.h = list;
        this.i = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys90)) {
            return false;
        }
        ys90 ys90Var = (ys90) obj;
        return this.a.equals(ys90Var.a) && this.b.equals(ys90Var.b) && this.c.equals(ys90Var.c) && Intrinsics.g(this.d, ys90Var.d) && Intrinsics.g(this.e, ys90Var.e) && this.f == ys90Var.f && Intrinsics.g(this.g, ys90Var.g) && Intrinsics.g(this.h, ys90Var.h) && Intrinsics.g(this.i, ys90Var.i);
    }

    public final int hashCode() {
        int iA = f87.a(dd3.a(this.e, dd3.a(this.d, gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), this.f, 31);
        Integer num = this.g;
        return this.i.hashCode() + ai50.a((iA + (num == null ? 0 : num.hashCode())) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SimulationTicketResult(id=", this.a, ", number=", this.b, ", betTypeString=");
        sbA.append(this.c);
        sbA.append(", totalStake=");
        sbA.append(this.d);
        sbA.append(", totalReturn=");
        sbA.append(this.e);
        sbA.append(", createTimestampMillis=");
        sbA.append(this.f);
        sbA.append(", flexibleMinWinnings=");
        sbA.append(this.g);
        sbA.append(", events=");
        sbA.append(this.h);
        return ka1.a(sbA, ", bets=", this.i, ")");
    }
}
