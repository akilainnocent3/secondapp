package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class iw90 {
    public final BigDecimal a;
    public final BigDecimal b;
    public final BigDecimal c;
    public final BigDecimal d;
    public final BigDecimal e;

    public iw90(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        bigDecimal4.getClass();
        bigDecimal5.getClass();
        this.a = bigDecimal;
        this.b = bigDecimal2;
        this.c = bigDecimal3;
        this.d = bigDecimal4;
        this.e = bigDecimal5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw90)) {
            return false;
        }
        iw90 iw90Var = (iw90) obj;
        return Intrinsics.g(this.a, iw90Var.a) && Intrinsics.g(this.b, iw90Var.b) && Intrinsics.g(this.c, iw90Var.c) && Intrinsics.g(this.d, iw90Var.d) && Intrinsics.g(this.e, iw90Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dd3.a(this.d, dd3.a(this.c, dd3.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleWHTaxAndNetWin(ptMin=");
        sb.append(this.a);
        sb.append(", ptMax=");
        sb.append(this.b);
        sb.append(", bonus=");
        iib0.b(sb, this.c, ", minStake=", this.d, ", maxStake=");
        return mh2.a(")", sb, this.e);
    }
}
