package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ub60 {
    public final boolean a;
    public final BigDecimal b;
    public final qcn<skd0> c;
    public final boolean d;
    public final int e;
    public final xc60 f;
    public final int g;
    public final boolean h;
    public final boolean i;

    public ub60(BigDecimal bigDecimal, uf00 uf00Var, int i, xc60 xc60Var, int i2) {
        this(true, (i2 & 2) != 0 ? skd0.b : bigDecimal, (i2 & 4) != 0 ? n1a0.c : uf00Var, false, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? new xc60(null, null, 15) : xc60Var, 0, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub60)) {
            return false;
        }
        ub60 ub60Var = (ub60) obj;
        if (this.a != ub60Var.a) {
            return false;
        }
        BigDecimal bigDecimal = ub60Var.b;
        BigDecimal bigDecimal2 = skd0.b;
        return Intrinsics.g(this.b, bigDecimal) && Intrinsics.g(this.c, ub60Var.c) && this.d == ub60Var.d && this.e == ub60Var.e && Intrinsics.g(this.f, ub60Var.f) && this.g == ub60Var.g && this.h == ub60Var.h && this.i == ub60Var.i;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        BigDecimal bigDecimal = skd0.b;
        return Boolean.hashCode(this.i) + mtg0.a(gpp.a(this.g, (this.f.hashCode() + gpp.a(this.e, mtg0.a(shu.a(this.c, dd3.a(this.b, iHashCode, 31), 31), 31, this.d), 31)) * 31, 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SBCardRequiredData(canRebuildCard=");
        sb.append(this.a);
        sb.append(", betAmount=");
        r03.a(", multipliers=", sb, this.b);
        sb.append(this.c);
        sb.append(", cardEditMode=");
        sb.append(this.d);
        sb.append(", cardCount=");
        sb.append(this.e);
        sb.append(", extraBallResult=");
        sb.append(this.f);
        sb.append(", betResultId=");
        sb.append(this.g);
        sb.append(", isAutoSpin=");
        sb.append(this.h);
        sb.append(", showFakeExtra=");
        return ruw.a(sb, this.i, ')');
    }

    public ub60(boolean z, BigDecimal bigDecimal, qcn<skd0> qcnVar, boolean z2, int i, xc60 xc60Var, int i2, boolean z3, boolean z4) {
        bigDecimal.getClass();
        qcnVar.getClass();
        xc60Var.getClass();
        this.a = z;
        this.b = bigDecimal;
        this.c = qcnVar;
        this.d = z2;
        this.e = i;
        this.f = xc60Var;
        this.g = i2;
        this.h = z3;
        this.i = z4;
    }
}
