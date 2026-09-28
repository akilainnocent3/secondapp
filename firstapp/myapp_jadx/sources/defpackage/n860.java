package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n860 {
    public final qcn<g860> a;
    public final qcn<Integer> b;
    public final qcn<Integer> c;
    public final String d;
    public final BigDecimal e;
    public final BigDecimal f;

    public n860(uf00 uf00Var, uf00 uf00Var2, qcn qcnVar, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        uf00Var.getClass();
        uf00Var2.getClass();
        qcnVar.getClass();
        this.a = uf00Var;
        this.b = uf00Var2;
        this.c = qcnVar;
        this.d = str;
        this.e = bigDecimal;
        this.f = bigDecimal2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n860)) {
            return false;
        }
        n860 n860Var = (n860) obj;
        if (!Intrinsics.g(this.a, n860Var.a) || !Intrinsics.g(this.b, n860Var.b) || !Intrinsics.g(this.c, n860Var.c) || !Intrinsics.g(this.d, n860Var.d)) {
            return false;
        }
        BigDecimal bigDecimal = n860Var.e;
        BigDecimal bigDecimal2 = this.e;
        if (bigDecimal2 == null) {
            if (bigDecimal == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (bigDecimal == null) {
            zEquals = false;
        } else {
            BigDecimal bigDecimal3 = skd0.b;
            zEquals = bigDecimal2.equals(bigDecimal);
        }
        if (!zEquals) {
            return false;
        }
        BigDecimal bigDecimal4 = n860Var.f;
        BigDecimal bigDecimal5 = this.f;
        if (bigDecimal5 == null) {
            if (bigDecimal4 == null) {
                zEquals2 = true;
            } else {
                zEquals2 = false;
            }
        } else if (bigDecimal4 == null) {
            zEquals2 = false;
        } else {
            BigDecimal bigDecimal6 = skd0.b;
            zEquals2 = bigDecimal5.equals(bigDecimal4);
        }
        return zEquals2;
    }

    public final int hashCode() {
        int iHashCode;
        int iA = shu.a(this.c, shu.a(this.b, this.a.hashCode() * 31, 31), 31);
        int iHashCode2 = 0;
        String str = this.d;
        int iHashCode3 = (iA + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.e;
        if (bigDecimal == null) {
            iHashCode = 0;
        } else {
            BigDecimal bigDecimal2 = skd0.b;
            iHashCode = bigDecimal.hashCode();
        }
        int i = (iHashCode3 + iHashCode) * 31;
        BigDecimal bigDecimal3 = this.f;
        if (bigDecimal3 != null) {
            BigDecimal bigDecimal4 = skd0.b;
            iHashCode2 = bigDecimal3.hashCode();
        }
        return i + iHashCode2;
    }

    public final String toString() {
        String plainString;
        StringBuilder sb = new StringBuilder("SBBetHistoryDetail(cards=");
        sb.append(this.a);
        sb.append(", balls=");
        sb.append(this.b);
        sb.append(", extraBall=");
        sb.append(this.c);
        sb.append(", extraBallTicketId=");
        sb.append(this.d);
        sb.append(", extraStakeAmount=");
        String plainString2 = "null";
        BigDecimal bigDecimal = this.e;
        if (bigDecimal == null) {
            plainString = "null";
        } else {
            BigDecimal bigDecimal2 = skd0.b;
            plainString = bigDecimal.toPlainString();
            plainString.getClass();
        }
        sb.append((Object) plainString);
        sb.append(", extraPayout=");
        BigDecimal bigDecimal3 = this.f;
        if (bigDecimal3 != null) {
            BigDecimal bigDecimal4 = skd0.b;
            plainString2 = bigDecimal3.toPlainString();
            plainString2.getClass();
        }
        sb.append((Object) plainString2);
        sb.append(')');
        return sb.toString();
    }
}
