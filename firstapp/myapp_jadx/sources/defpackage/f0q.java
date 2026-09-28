package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f0q {
    public final String a;
    public final String b;
    public final String c;
    public final pxq d;
    public final BigDecimal e;
    public final BigDecimal f;
    public final BigDecimal g;
    public final hlr h;
    public final int i;
    public final int j;
    public final long k;
    public final boolean l;
    public final qcn<v2q> m;

    public f0q(String str, String str2, String str3, pxq pxqVar, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, hlr hlrVar, int i, int i2, long j, boolean z, uf00 uf00Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        pxqVar.getClass();
        hlrVar.getClass();
        uf00Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = pxqVar;
        this.e = bigDecimal;
        this.f = bigDecimal2;
        this.g = bigDecimal3;
        this.h = hlrVar;
        this.i = i;
        this.j = i2;
        this.k = j;
        this.l = z;
        this.m = uf00Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj instanceof f0q) {
                f0q f0qVar = (f0q) obj;
                if (Intrinsics.g(this.a, f0qVar.a) && Intrinsics.g(this.b, f0qVar.b) && Intrinsics.g(this.c, f0qVar.c) && this.d == f0qVar.d) {
                    BigDecimal bigDecimal = f0qVar.e;
                    rkd0.a aVar = rkd0.Companion;
                    if (this.e.equals(bigDecimal)) {
                        BigDecimal bigDecimal2 = f0qVar.f;
                        BigDecimal bigDecimal3 = this.f;
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
                        if (zEquals && this.g.equals(f0qVar.g) && this.h == f0qVar.h && this.i == f0qVar.i && this.j == f0qVar.j && this.k == f0qVar.k && this.l == f0qVar.l && Intrinsics.g(this.m, f0qVar.m)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        rkd0.a aVar = rkd0.Companion;
        int iA = dd3.a(this.e, iHashCode, 31);
        BigDecimal bigDecimal = this.f;
        return this.m.hashCode() + mtg0.a(f87.a(gpp.a(this.j, gpp.a(this.i, (this.h.hashCode() + dd3.a(this.g, (iA + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31, 31)) * 31, 31), 31), this.k, 31), 31, this.l);
    }

    public final String toString() {
        String plainString;
        rkd0.a aVar = rkd0.Companion;
        String plainString2 = this.e.toPlainString();
        plainString2.getClass();
        BigDecimal bigDecimal = this.f;
        if (bigDecimal == null) {
            plainString = "null";
        } else {
            plainString = bigDecimal.toPlainString();
            plainString.getClass();
        }
        String plainString3 = this.g.toPlainString();
        plainString3.getClass();
        StringBuilder sbA = ux5.a("LNBetOrder(orderId=", this.a, ", shortId=", this.b, ", currency=");
        sbA.append(this.c);
        sbA.append(", orderType=");
        sbA.append(this.d);
        sbA.append(", totalStake=");
        hxa.c(sbA, plainString2, ", giftTotalAmount=", plainString, ", totalWinnings=");
        sbA.append(plainString3);
        sbA.append(", winningStatus=");
        sbA.append(this.h);
        sbA.append(", combinationSize=");
        d5d.a(sbA, this.i, ", betSize=", this.j, ", createTime=");
        sbA.append(this.k);
        sbA.append(", showOffEnable=");
        sbA.append(this.l);
        sbA.append(", selections=");
        sbA.append(this.m);
        sbA.append(")");
        return sbA.toString();
    }
}
