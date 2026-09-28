package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ia60 {
    public final int a;
    public final boolean b;
    public final qcn<qcn<Integer>> c;
    public final BigDecimal d;
    public final String e;
    public final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public ia60(int i, boolean z, qcn<? extends qcn<Integer>> qcnVar, BigDecimal bigDecimal, String str, boolean z2) {
        qcnVar.getClass();
        bigDecimal.getClass();
        str.getClass();
        this.a = i;
        this.b = z;
        this.c = qcnVar;
        this.d = bigDecimal;
        this.e = str;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia60)) {
            return false;
        }
        ia60 ia60Var = (ia60) obj;
        if (this.a != ia60Var.a || this.b != ia60Var.b || !Intrinsics.g(this.c, ia60Var.c)) {
            return false;
        }
        BigDecimal bigDecimal = ia60Var.d;
        BigDecimal bigDecimal2 = skd0.b;
        return Intrinsics.g(this.d, bigDecimal) && Intrinsics.g(this.e, ia60Var.e) && this.f == ia60Var.f;
    }

    public final int hashCode() {
        int iA = shu.a(this.c, mtg0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31);
        BigDecimal bigDecimal = skd0.b;
        return Boolean.hashCode(this.f) + gmf0.a(dd3.a(this.d, iA, 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SBBetResult(id=");
        sb.append(this.a);
        sb.append(", isGift=");
        sb.append(this.b);
        sb.append(", numbers=");
        sb.append(this.c);
        sb.append(", extraBallPrice=");
        r03.a(", currency=", sb, this.d);
        sb.append(this.e);
        sb.append(", isWin=");
        return ruw.a(sb, this.f, ')');
    }
}
