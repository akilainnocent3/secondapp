package defpackage;

import com.appsflyer.internal.m;
import com.sportygames.newcms.CMSRes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class lwe0 {
    public final int a;
    public final String b;
    public final String c;
    public final double d;
    public final boolean e;
    public final double f;
    public final String g;
    public final boolean h;
    public final String i;
    public final double j;
    public final CMSRes k;
    public final CMSRes l;
    public final CMSRes m;
    public final boolean n;

    public lwe0(int i, String str, String str2, double d, boolean z, double d2, String str3, boolean z2, String str4, double d3, CMSRes cMSRes, CMSRes cMSRes2, CMSRes cMSRes3) {
        m.a(str, str2, str3);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = d;
        this.e = z;
        this.f = d2;
        this.g = str3;
        this.h = z2;
        this.i = str4;
        this.j = d3;
        this.k = cMSRes;
        this.l = cMSRes2;
        this.m = cMSRes3;
        this.n = Math.abs(d3) > 1.0E-7d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwe0)) {
            return false;
        }
        lwe0 lwe0Var = (lwe0) obj;
        return this.a == lwe0Var.a && Intrinsics.g(this.b, lwe0Var.b) && Intrinsics.g(this.c, lwe0Var.c) && Double.compare(this.d, lwe0Var.d) == 0 && this.e == lwe0Var.e && Double.compare(this.f, lwe0Var.f) == 0 && Intrinsics.g(this.g, lwe0Var.g) && this.h == lwe0Var.h && this.i.equals(lwe0Var.i) && Double.compare(this.j, lwe0Var.j) == 0 && Intrinsics.g(this.k, lwe0Var.k) && Intrinsics.g(this.l, lwe0Var.l) && Intrinsics.g(this.m, lwe0Var.m);
    }

    public final int hashCode() {
        int iA = nrg0.a(gmf0.a(mtg0.a(gmf0.a(nrg0.a(mtg0.a(nrg0.a(gmf0.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        CMSRes cMSRes = this.k;
        int iHashCode = (iA + (cMSRes == null ? 0 : cMSRes.hashCode())) * 31;
        CMSRes cMSRes2 = this.l;
        int iHashCode2 = (iHashCode + (cMSRes2 == null ? 0 : cMSRes2.hashCode())) * 31;
        CMSRes cMSRes3 = this.m;
        return iHashCode2 + (cMSRes3 != null ? cMSRes3.hashCode() : 0);
    }

    public final String toString() {
        return "TGHistoryRecord(id=" + this.a + ", time=" + this.b + ", date=" + this.c + ", stake=" + this.d + ", isWin=" + this.e + ", amount=" + this.f + ", ticketId=" + this.g + ", isExpend=" + this.h + ", multiplier=" + this.i + ", giftAmount=" + this.j + ", mapKey=" + this.k + ", iconURL=" + this.l + ", frameURL=" + this.m + ')';
    }
}
