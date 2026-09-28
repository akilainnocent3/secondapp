package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r5k0 {
    public final String a;
    public final BigDecimal b;
    public final boolean c;
    public final List<t5k0> d;

    public r5k0(String str, BigDecimal bigDecimal, boolean z, List<t5k0> list) {
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
        if (!(obj instanceof r5k0)) {
            return false;
        }
        r5k0 r5k0Var = (r5k0) obj;
        return this.a.equals(r5k0Var.a) && this.b.equals(r5k0Var.b) && this.c == r5k0Var.c && Intrinsics.g(this.d, r5k0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + mtg0.a(dd3.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbA = yz80.a(this.b, "WorldCupTicketBetBuilder(id=", this.a, ", odds=", ", hit=");
        sbA.append(this.c);
        sbA.append(", selections=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
