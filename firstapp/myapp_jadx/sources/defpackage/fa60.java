package defpackage;

import com.sportygames.common.ui.model.GiftItem;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fa60 implements rc60 {
    public final d860 a;
    public final BigDecimal b;
    public final BigDecimal c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final qcn<skd0> f;
    public final qcn<GiftItem> g;
    public final boolean h;
    public final boolean i;

    public fa60(d860 d860Var, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, qcn<skd0> qcnVar, qcn<GiftItem> qcnVar2, boolean z) {
        d860Var.getClass();
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        bigDecimal4.getClass();
        qcnVar.getClass();
        qcnVar2.getClass();
        this.a = d860Var;
        this.b = bigDecimal;
        this.c = bigDecimal2;
        this.d = bigDecimal3;
        this.e = bigDecimal4;
        this.f = qcnVar;
        this.g = qcnVar2;
        this.h = z;
        this.i = !qcnVar2.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa60)) {
            return false;
        }
        fa60 fa60Var = (fa60) obj;
        if (!Intrinsics.g(this.a, fa60Var.a)) {
            return false;
        }
        BigDecimal bigDecimal = fa60Var.b;
        BigDecimal bigDecimal2 = skd0.b;
        return Intrinsics.g(this.b, bigDecimal) && Intrinsics.g(this.c, fa60Var.c) && Intrinsics.g(this.d, fa60Var.d) && Intrinsics.g(this.e, fa60Var.e) && Intrinsics.g(this.f, fa60Var.f) && Intrinsics.g(this.g, fa60Var.g) && this.h == fa60Var.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        BigDecimal bigDecimal = skd0.b;
        return Boolean.hashCode(this.h) + shu.a(this.g, shu.a(this.f, dd3.a(this.e, dd3.a(this.d, dd3.a(this.c, dd3.a(this.b, iHashCode, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SBBetPanelState(currentAmount=");
        sb.append(this.a);
        sb.append(", defaultAmount=");
        r03.a(", maxAmount=", sb, this.b);
        r03.a(", minAmount=", sb, this.c);
        r03.a(", stepAmount=", sb, this.d);
        r03.a(", preDefined=", sb, this.e);
        sb.append(this.f);
        sb.append(", giftList=");
        sb.append(this.g);
        sb.append(", giftAvailable=");
        return ruw.a(sb, this.h, ')');
    }

    public fa60() {
        d860.a aVar = new d860.a();
        BigDecimal bigDecimal = skd0.b;
        n1a0 n1a0Var = n1a0.c;
        this(aVar, bigDecimal, bigDecimal, bigDecimal, bigDecimal, n1a0Var, n1a0Var, true);
    }
}
