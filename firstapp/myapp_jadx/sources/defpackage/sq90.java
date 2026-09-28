package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sq90 {
    public final String a;
    public final String b;
    public final BigDecimal c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final boolean f;
    public final List<tq90> g;

    public sq90(String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, boolean z, List<tq90> list) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = bigDecimal;
        this.d = bigDecimal2;
        this.e = bigDecimal3;
        this.f = z;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq90)) {
            return false;
        }
        sq90 sq90Var = (sq90) obj;
        return this.a.equals(sq90Var.a) && this.b.equals(sq90Var.b) && Intrinsics.g(this.c, sq90Var.c) && Intrinsics.g(this.d, sq90Var.d) && Intrinsics.g(this.e, sq90Var.e) && this.f == sq90Var.f && Intrinsics.g(this.g, sq90Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + mtg0.a(dd3.a(this.e, dd3.a(this.d, dd3.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SimulationTicketBet(id=", this.a, ", groupId=", this.b, ", stake=");
        iib0.b(sbA, this.c, ", potentialWin=", this.d, ", bonus=");
        sbA.append(this.e);
        sbA.append(", hit=");
        sbA.append(this.f);
        sbA.append(", details=");
        return ng1.a(sbA, this.g, ")");
    }
}
