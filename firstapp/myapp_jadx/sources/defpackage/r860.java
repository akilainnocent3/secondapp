package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r860 {
    public final int a;
    public final BigDecimal b;
    public final BigDecimal c;
    public final BigDecimal d;
    public final String e;
    public final String f;
    public final long g;
    public final n860 h;
    public final boolean i;

    public r860(int i, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str, String str2, long j, n860 n860Var) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = bigDecimal;
        this.c = bigDecimal2;
        this.d = bigDecimal3;
        this.e = str;
        this.f = str2;
        this.g = j;
        this.h = n860Var;
        BigDecimal bigDecimal4 = n860Var.f;
        BigDecimal bigDecimalAdd = bigDecimal3.add(bigDecimal4 == null ? skd0.b : bigDecimal4);
        bigDecimalAdd.getClass();
        this.i = bigDecimalAdd.compareTo(skd0.b) > 0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002c  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj instanceof r860) {
                r860 r860Var = (r860) obj;
                if (this.a == r860Var.a) {
                    BigDecimal bigDecimal = r860Var.b;
                    BigDecimal bigDecimal2 = skd0.b;
                    if (this.b.equals(bigDecimal)) {
                        BigDecimal bigDecimal3 = r860Var.c;
                        BigDecimal bigDecimal4 = this.c;
                        if (bigDecimal4 == null) {
                            if (bigDecimal3 == null) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (bigDecimal3 == null) {
                            zEquals = false;
                        } else {
                            zEquals = bigDecimal4.equals(bigDecimal3);
                        }
                        if (zEquals && this.d.equals(r860Var.d) && Intrinsics.g(this.e, r860Var.e) && Intrinsics.g(this.f, r860Var.f) && this.g == r860Var.g && this.h.equals(r860Var.h)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        BigDecimal bigDecimal = skd0.b;
        int iA = dd3.a(this.b, iHashCode, 31);
        BigDecimal bigDecimal2 = this.c;
        return this.h.hashCode() + f87.a(gmf0.a(gmf0.a(dd3.a(this.d, (iA + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31, 31), 31, this.e), 31, this.f), this.g, 31);
    }

    public final String toString() {
        String plainString;
        StringBuilder sb = new StringBuilder("SBBetHistoryItem(id=");
        sb.append(this.a);
        sb.append(", stakeAmount=");
        BigDecimal bigDecimal = skd0.b;
        String plainString2 = this.b.toPlainString();
        plainString2.getClass();
        sb.append((Object) plainString2);
        sb.append(", giftAmount=");
        BigDecimal bigDecimal2 = this.c;
        if (bigDecimal2 == null) {
            plainString = "null";
        } else {
            plainString = bigDecimal2.toPlainString();
            plainString.getClass();
        }
        sb.append((Object) plainString);
        sb.append(", payoutAmount=");
        String plainString3 = this.d.toPlainString();
        plainString3.getClass();
        sb.append((Object) plainString3);
        sb.append(", ticketId=");
        sb.append(this.e);
        sb.append(", currency=");
        sb.append(this.f);
        sb.append(", createTime=");
        sb.append(this.g);
        sb.append(", detail=");
        sb.append(this.h);
        sb.append(')');
        return sb.toString();
    }
}
