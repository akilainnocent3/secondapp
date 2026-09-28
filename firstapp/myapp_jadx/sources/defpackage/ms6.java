package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ms6 {
    public final BigDecimal a;
    public final BigDecimal b;
    public final boolean c;

    public ms6(boolean z, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        bigDecimal2.getClass();
        this.a = bigDecimal;
        this.b = bigDecimal2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms6)) {
            return false;
        }
        ms6 ms6Var = (ms6) obj;
        return this.a.equals(ms6Var.a) && Intrinsics.g(this.b, ms6Var.b) && this.c == ms6Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dd3.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CashoutTaxResult(grossAmount=");
        sb.append(this.a);
        sb.append(", taxAmount=");
        sb.append(this.b);
        sb.append(", shouldShowFormula=");
        return mq0.a(sb, this.c, ")");
    }
}
