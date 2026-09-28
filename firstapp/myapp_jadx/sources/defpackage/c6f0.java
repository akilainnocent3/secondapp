package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c6f0 {
    public final BigDecimal a;
    public final BigDecimal b;
    public final BigDecimal c;

    public c6f0(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        this.a = bigDecimal;
        this.b = bigDecimal2;
        this.c = bigDecimal3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6f0)) {
            return false;
        }
        c6f0 c6f0Var = (c6f0) obj;
        return this.a.equals(c6f0Var.a) && Intrinsics.g(this.b, c6f0Var.b) && Intrinsics.g(this.c, c6f0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dd3.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxedAmountResult(base=");
        sb.append(this.a);
        sb.append(", tax=");
        sb.append(this.b);
        sb.append(", total=");
        return mh2.a(")", sb, this.c);
    }
}
