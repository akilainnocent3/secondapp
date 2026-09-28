package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uq90 {
    public final String a;
    public final String b;
    public final BigDecimal c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final boolean f;
    public final List<vq90> g;
    public final BigDecimal h;

    public uq90(String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, List list, boolean z) {
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
        this.h = bigDecimal4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq90)) {
            return false;
        }
        uq90 uq90Var = (uq90) obj;
        return this.a.equals(uq90Var.a) && this.b.equals(uq90Var.b) && Intrinsics.g(this.c, uq90Var.c) && Intrinsics.g(this.d, uq90Var.d) && Intrinsics.g(this.e, uq90Var.e) && this.f == uq90Var.f && Intrinsics.g(this.g, uq90Var.g) && this.h.equals(uq90Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ai50.a(mtg0.a(dd3.a(this.e, dd3.a(this.d, dd3.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SimulationTicketDetailBet(id=", this.a, ", groupId=", this.b, ", stake=");
        iib0.b(sbA, this.c, ", potentialWin=", this.d, ", bonus=");
        sbA.append(this.e);
        sbA.append(", hit=");
        sbA.append(this.f);
        sbA.append(", details=");
        sbA.append(this.g);
        sbA.append(", odds=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}
