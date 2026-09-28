package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xc60 {
    public final int a;
    public final BigDecimal b;
    public final qcn<Integer> c;
    public final boolean d;

    public xc60(BigDecimal bigDecimal, uf00 uf00Var, int i) {
        this((i & 1) != 0 ? -1 : 0, (i & 4) != 0 ? n1a0.c : uf00Var, (i & 2) != 0 ? skd0.b : bigDecimal, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc60)) {
            return false;
        }
        xc60 xc60Var = (xc60) obj;
        if (this.a != xc60Var.a) {
            return false;
        }
        BigDecimal bigDecimal = xc60Var.b;
        BigDecimal bigDecimal2 = skd0.b;
        return Intrinsics.g(this.b, bigDecimal) && Intrinsics.g(this.c, xc60Var.c) && this.d == xc60Var.d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        BigDecimal bigDecimal = skd0.b;
        return Boolean.hashCode(this.d) + shu.a(this.c, dd3.a(this.b, iHashCode, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SBExtraBall(betId=");
        sb.append(this.a);
        sb.append(", stakeAmount=");
        r03.a(", balls=", sb, this.b);
        sb.append(this.c);
        sb.append(", isWin=");
        return ruw.a(sb, this.d, ')');
    }

    public xc60(int i, qcn qcnVar, BigDecimal bigDecimal, boolean z) {
        bigDecimal.getClass();
        qcnVar.getClass();
        this.a = i;
        this.b = bigDecimal;
        this.c = qcnVar;
        this.d = z;
    }
}
