package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sh5 {
    public final String a;
    public final BigDecimal b;
    public final boolean c;
    public final List<th5> d;

    public sh5(String str, BigDecimal bigDecimal, boolean z, List<th5> list) {
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
        if (!(obj instanceof sh5)) {
            return false;
        }
        sh5 sh5Var = (sh5) obj;
        return this.a.equals(sh5Var.a) && this.b.equals(sh5Var.b) && this.c == sh5Var.c && Intrinsics.g(this.d, sh5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + mtg0.a(dd3.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbA = yz80.a(this.b, "BuildAndGoTicketBetBuilder(id=", this.a, ", odds=", ", hit=");
        sbA.append(this.c);
        sbA.append(", selections=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
