package defpackage;

import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class qxp {
    public final qcn<tsq> a;
    public final qcn<ixp> b;
    public final qcn<ixp> c;
    public final boolean d;
    public final scn<ysq, n4q> e;
    public final BigDecimal f;
    public final BigDecimal g;
    public final BigDecimal h;
    public final f3q i;
    public final dvq j;
    public final s4r k;

    public qxp(qcn qcnVar, qcn qcnVar2, qcn qcnVar3, boolean z, wf00 wf00Var, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, f3q f3qVar, dvq dvqVar, s4r s4rVar) {
        qcnVar.getClass();
        qcnVar2.getClass();
        qcnVar3.getClass();
        wf00Var.getClass();
        bigDecimal.getClass();
        bigDecimal2.getClass();
        dvqVar.getClass();
        this.a = qcnVar;
        this.b = qcnVar2;
        this.c = qcnVar3;
        this.d = z;
        this.e = wf00Var;
        this.f = bigDecimal;
        this.g = bigDecimal2;
        this.h = bigDecimal3;
        this.i = f3qVar;
        this.j = dvqVar;
        this.k = s4rVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxp)) {
            return false;
        }
        qxp qxpVar = (qxp) obj;
        if (!Intrinsics.g(this.a, qxpVar.a) || !Intrinsics.g(this.b, qxpVar.b) || !Intrinsics.g(this.c, qxpVar.c) || this.d != qxpVar.d || !Intrinsics.g(this.e, qxpVar.e)) {
            return false;
        }
        BigDecimal bigDecimal = qxpVar.f;
        rkd0.a aVar = rkd0.Companion;
        if (!Intrinsics.g(this.f, bigDecimal) || !Intrinsics.g(this.g, qxpVar.g)) {
            return false;
        }
        BigDecimal bigDecimal2 = qxpVar.h;
        BigDecimal bigDecimal3 = this.h;
        if (bigDecimal3 == null) {
            if (bigDecimal2 == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (bigDecimal2 == null) {
            zEquals = false;
        } else {
            zEquals = bigDecimal3.equals(bigDecimal2);
        }
        return zEquals && this.i == qxpVar.i && Intrinsics.g(this.j, qxpVar.j) && Intrinsics.g(this.k, qxpVar.k);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + mtg0.a(shu.a(this.c, shu.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d)) * 31;
        rkd0.a aVar = rkd0.Companion;
        int iA = dd3.a(this.g, dd3.a(this.f, iHashCode, 31), 31);
        BigDecimal bigDecimal = this.h;
        int iHashCode2 = (this.j.hashCode() + ((this.i.hashCode() + ((iA + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31)) * 31)) * 31;
        s4r s4rVar = this.k;
        return iHashCode2 + (s4rVar != null ? s4rVar.hashCode() : 0);
    }

    public final String toString() {
        String plainString;
        String strA = rkd0.a(this.f);
        String strA2 = rkd0.a(this.g);
        BigDecimal bigDecimal = this.h;
        if (bigDecimal == null) {
            plainString = "null";
        } else {
            plainString = bigDecimal.toPlainString();
            plainString.getClass();
        }
        StringBuilder sb = new StringBuilder("LNBetConfig(marketGroup=");
        sb.append(this.a);
        sb.append(", mainBalls=");
        sb.append(this.b);
        sb.append(", bonusBalls=");
        sb.append(this.c);
        sb.append(", isAutoApplyGift=");
        sb.append(this.d);
        sb.append(oAudzpbdOhCI.KQRgrXXYv);
        sb.append(this.e);
        sb.append(", maxStake=");
        sb.append(strA);
        sb.append(", minStake=");
        hxa.c(sb, strA2, ", maxPayout=", plainString, ", bonusBallType=");
        sb.append(this.i);
        sb.append(", myNumbers=");
        sb.append(this.j);
        sb.append(", reBetData=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qxp() {
        n1a0 n1a0Var = n1a0.c;
        xf00 xf00Var = xf00.i;
        xf00Var.getClass();
        rkd0.a aVar = rkd0.Companion;
        aVar.getClass();
        BigDecimal bigDecimal = rkd0.b;
        aVar.getClass();
        this(n1a0Var, n1a0Var, n1a0Var, false, xf00Var, bigDecimal, bigDecimal, null, f3q.None, dvq.a.a, null);
    }
}
