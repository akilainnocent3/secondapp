package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ql30 {
    public final tq30 a;
    public final tq30 b;
    public final String c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final BigDecimal f;
    public final BigDecimal g;
    public final BigDecimal h;
    public final float i;
    public final int j;
    public final boolean k;

    public ql30(tq30 tq30Var, tq30 tq30Var2, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, float f, int i) {
        tq30Var.getClass();
        tq30Var2.getClass();
        str.getClass();
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        bigDecimal4.getClass();
        bigDecimal5.getClass();
        this.a = tq30Var;
        this.b = tq30Var2;
        this.c = str;
        this.d = bigDecimal;
        this.e = bigDecimal2;
        this.f = bigDecimal3;
        this.g = bigDecimal4;
        this.h = bigDecimal5;
        this.i = f;
        this.j = i;
        this.k = tq30Var == tq30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql30)) {
            return false;
        }
        ql30 ql30Var = (ql30) obj;
        if (this.a != ql30Var.a || this.b != ql30Var.b || !Intrinsics.g(this.c, ql30Var.c)) {
            return false;
        }
        BigDecimal bigDecimal = ql30Var.d;
        BigDecimal bigDecimal2 = skd0.b;
        return Intrinsics.g(this.d, bigDecimal) && Intrinsics.g(this.e, ql30Var.e) && Intrinsics.g(this.f, ql30Var.f) && Intrinsics.g(this.g, ql30Var.g) && Intrinsics.g(this.h, ql30Var.h) && Float.compare(this.i, ql30Var.i) == 0 && this.j == ql30Var.j;
    }

    public final int hashCode() {
        int iA = gmf0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        BigDecimal bigDecimal = skd0.b;
        return Integer.hashCode(this.j) + tvh.a(this.i, dd3.a(this.h, dd3.a(this.g, dd3.a(this.f, dd3.a(this.e, dd3.a(this.d, iA, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RCBetData(userPick=");
        sb.append(this.a);
        sb.append(", result=");
        sb.append(this.b);
        sb.append(", currency=");
        sb.append(this.c);
        sb.append(", payoutAmount=");
        r03.a(", stakeAmount=", sb, this.d);
        r03.a(", actualDebitedAmt=", sb, this.e);
        r03.a(", actualCreditedAmt=", sb, this.f);
        r03.a(", giftAmount=", sb, this.g);
        r03.a(", randomFloat=", sb, this.h);
        sb.append(this.i);
        sb.append(", randomInt=");
        return rr1.b(sb, this.j, ')');
    }
}
