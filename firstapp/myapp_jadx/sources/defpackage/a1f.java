package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a1f {
    public final int a;
    public final String b;
    public final l4f c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final BigDecimal f;
    public final BigDecimal g;

    public a1f(int i, String str, l4f l4fVar, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        bigDecimal4.getClass();
        this.a = i;
        this.b = str;
        this.c = l4fVar;
        this.d = bigDecimal;
        this.e = bigDecimal2;
        this.f = bigDecimal3;
        this.g = bigDecimal4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1f)) {
            return false;
        }
        a1f a1fVar = (a1f) obj;
        return this.a == a1fVar.a && this.b.equals(a1fVar.b) && this.c == a1fVar.c && Intrinsics.g(this.d, a1fVar.d) && Intrinsics.g(this.e, a1fVar.e) && Intrinsics.g(this.f, a1fVar.f) && Intrinsics.g(this.g, a1fVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + dd3.a(this.f, dd3.a(this.e, dd3.a(this.d, (this.c.hashCode() + gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "DoubleOrNothingDetailRound(roundNumber=", ", ticketNumber=", this.b, ", status=");
        sbA.append(this.c);
        sbA.append(", baseAmount=");
        sbA.append(this.d);
        sbA.append(", cashoutAmount=");
        iib0.b(sbA, this.e, ", stakeAmount=", this.f, ", roundBalance=");
        return mh2.a(")", sbA, this.g);
    }
}
