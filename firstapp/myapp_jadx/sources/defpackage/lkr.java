package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lkr {
    public final String a;
    public final BigDecimal b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final qcn<dlr> g;

    public lkr(String str, BigDecimal bigDecimal, String str2, String str3, boolean z, boolean z2, qcn<dlr> qcnVar) {
        str.getClass();
        bigDecimal.getClass();
        str2.getClass();
        str3.getClass();
        qcnVar.getClass();
        this.a = str;
        this.b = bigDecimal;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkr)) {
            return false;
        }
        lkr lkrVar = (lkr) obj;
        if (!Intrinsics.g(this.a, lkrVar.a)) {
            return false;
        }
        BigDecimal bigDecimal = lkrVar.b;
        rkd0.a aVar = rkd0.Companion;
        return Intrinsics.g(this.b, bigDecimal) && Intrinsics.g(this.c, lkrVar.c) && Intrinsics.g(this.d, lkrVar.d) && this.e == lkrVar.e && this.f == lkrVar.f && Intrinsics.g(this.g, lkrVar.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        rkd0.a aVar = rkd0.Companion;
        return this.g.hashCode() + mtg0.a(mtg0.a(gmf0.a(gmf0.a(dd3.a(this.b, iHashCode, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("LNWinningPopupDomainData(orderId=", this.a, ", totalWinnings=", rkd0.a(this.b), ", ticketId=");
        hxa.c(sbA, this.c, ", currency=", this.d, ", pushEnable=");
        nng.a(", showOffEnable=", ", tournamentInfos=", sbA, this.e, this.f);
        return ts3.a(sbA, this.g, ")");
    }
}
