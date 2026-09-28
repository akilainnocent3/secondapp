package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lxq {
    public final String a;
    public final String b;
    public final pxq c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final hlr f;
    public final String g;
    public final int h;
    public final int i;
    public final qcn<ekq> j;
    public final long k;
    public final boolean l;

    public lxq(String str, String str2, pxq pxqVar, BigDecimal bigDecimal, BigDecimal bigDecimal2, hlr hlrVar, String str3, int i, int i2, uf00 uf00Var, long j, boolean z) {
        pxqVar.getClass();
        bigDecimal.getClass();
        hlrVar.getClass();
        uf00Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = pxqVar;
        this.d = bigDecimal;
        this.e = bigDecimal2;
        this.f = hlrVar;
        this.g = str3;
        this.h = i;
        this.i = i2;
        this.j = uf00Var;
        this.k = j;
        this.l = z;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj instanceof lxq) {
                lxq lxqVar = (lxq) obj;
                if (this.a.equals(lxqVar.a) && this.b.equals(lxqVar.b) && this.c == lxqVar.c) {
                    BigDecimal bigDecimal = lxqVar.d;
                    rkd0.a aVar = rkd0.Companion;
                    if (Intrinsics.g(this.d, bigDecimal)) {
                        BigDecimal bigDecimal2 = lxqVar.e;
                        BigDecimal bigDecimal3 = this.e;
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
                        if (zEquals && this.f == lxqVar.f && this.g.equals(lxqVar.g) && this.h == lxqVar.h && this.i == lxqVar.i && Intrinsics.g(this.j, lxqVar.j) && this.k == lxqVar.k && this.l == lxqVar.l) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31;
        rkd0.a aVar = rkd0.Companion;
        int iA = dd3.a(this.d, iHashCode, 31);
        BigDecimal bigDecimal = this.e;
        return Boolean.hashCode(this.l) + f87.a(shu.a(this.j, gpp.a(this.i, gpp.a(this.h, gmf0.a((this.f.hashCode() + ((iA + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31)) * 31, 31, this.g), 31), 31), 31), this.k, 31);
    }

    public final String toString() {
        String plainString;
        String strA = rkd0.a(this.d);
        BigDecimal bigDecimal = this.e;
        if (bigDecimal == null) {
            plainString = "null";
        } else {
            plainString = bigDecimal.toPlainString();
            plainString.getClass();
        }
        StringBuilder sbA = ux5.a("LNOrder(orderId=", this.a, ", shortId=", this.b, ", orderType=");
        sbA.append(this.c);
        sbA.append(", totalStake=");
        sbA.append(strA);
        sbA.append(", totalWinnings=");
        sbA.append(plainString);
        sbA.append(", winningStatus=");
        sbA.append(this.f);
        sbA.append(", currency=");
        wxa.b(this.h, this.g, ", combinationSize=", ", selectionSize=", sbA);
        sbA.append(this.i);
        sbA.append(", selections=");
        sbA.append(this.j);
        sbA.append(", createTime=");
        sbA.append(this.k);
        sbA.append(", shouldShowReBetButton=");
        sbA.append(this.l);
        sbA.append(")");
        return sbA.toString();
    }
}
