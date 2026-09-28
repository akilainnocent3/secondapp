package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class loc0 {
    public final String a;
    public final BigDecimal b;
    public final boolean c;
    public final List<moc0> d;

    public loc0(String str, BigDecimal bigDecimal, boolean z, List<moc0> list) {
        list.getClass();
        this.a = str;
        this.b = bigDecimal;
        this.c = z;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loc0)) {
            return false;
        }
        loc0 loc0Var = (loc0) obj;
        return this.a.equals(loc0Var.a) && this.b.equals(loc0Var.b) && this.c == loc0Var.c && Intrinsics.g(this.d, loc0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + mtg0.a(dd3.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbA = yz80.a(this.b, "SportyLegendsTicketBetBuilder(id=", this.a, ", odds=", ", hit=");
        sbA.append(this.c);
        sbA.append(", selections=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
