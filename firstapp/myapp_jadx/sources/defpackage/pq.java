package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pq {
    public final String a;
    public final BigDecimal b;
    public final boolean c;
    public final List<rq> d;

    public pq(String str, BigDecimal bigDecimal, boolean z, List<rq> list) {
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
        if (!(obj instanceof pq)) {
            return false;
        }
        pq pqVar = (pq) obj;
        return this.a.equals(pqVar.a) && this.b.equals(pqVar.b) && this.c == pqVar.c && Intrinsics.g(this.d, pqVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + mtg0.a(dd3.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbA = yz80.a(this.b, "AfricanCupTicketBetBuilder(id=", this.a, ", odds=", ", hit=");
        sbA.append(this.c);
        sbA.append(", selections=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
