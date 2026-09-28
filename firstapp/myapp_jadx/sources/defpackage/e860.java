package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e860 {
    public final BigDecimal a;
    public final BigDecimal b;
    public final BigDecimal c;
    public final BigDecimal d;
    public final qcn<skd0> e;

    public e860(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, qcn<skd0> qcnVar) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        bigDecimal4.getClass();
        qcnVar.getClass();
        this.a = bigDecimal;
        this.b = bigDecimal2;
        this.c = bigDecimal3;
        this.d = bigDecimal4;
        this.e = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e860)) {
            return false;
        }
        e860 e860Var = (e860) obj;
        BigDecimal bigDecimal = e860Var.a;
        BigDecimal bigDecimal2 = skd0.b;
        return Intrinsics.g(this.a, bigDecimal) && Intrinsics.g(this.b, e860Var.b) && Intrinsics.g(this.c, e860Var.c) && Intrinsics.g(this.d, e860Var.d) && Intrinsics.g(this.e, e860Var.e);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = skd0.b;
        return this.e.hashCode() + dd3.a(this.d, dd3.a(this.c, dd3.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SBBetAmountData(maxAmount=");
        r03.a(", minAmount=", sb, this.a);
        r03.a(", stepAmount=", sb, this.b);
        r03.a(", defaultAmount=", sb, this.c);
        r03.a(", preDefined=", sb, this.d);
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
