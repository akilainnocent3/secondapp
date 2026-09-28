package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ygq {
    public final String a;
    public final String b;
    public final pxq c;
    public final hlr d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final qcn<piq> m;

    public ygq(String str, String str2, pxq pxqVar, hlr hlrVar, String str3, String str4, String str5, String str6, boolean z, String str7, boolean z2, boolean z3, qcn<piq> qcnVar) {
        str.getClass();
        pxqVar.getClass();
        hlrVar.getClass();
        str5.getClass();
        str6.getClass();
        qcnVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = pxqVar;
        this.d = hlrVar;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = z;
        this.j = str7;
        this.k = z2;
        this.l = z3;
        this.m = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygq)) {
            return false;
        }
        ygq ygqVar = (ygq) obj;
        return Intrinsics.g(this.a, ygqVar.a) && Intrinsics.g(this.b, ygqVar.b) && this.c == ygqVar.c && this.d == ygqVar.d && Intrinsics.g(this.e, ygqVar.e) && Intrinsics.g(this.f, ygqVar.f) && Intrinsics.g(this.g, ygqVar.g) && Intrinsics.g(this.h, ygqVar.h) && this.i == ygqVar.i && Intrinsics.g(this.j, ygqVar.j) && this.k == ygqVar.k && this.l == ygqVar.l && Intrinsics.g(this.m, ygqVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + mtg0.a(mtg0.a(gmf0.a(mtg0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a((this.d.hashCode() + ((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("LNHistoryDetailContentState(ticketId=", this.a, ", lotteryId=", this.b, ", type=");
        sbA.append(this.c);
        sbA.append(", winningStatus=");
        sbA.append(this.d);
        sbA.append(", createTime=");
        hxa.c(sbA, this.e, ", currency=", this.f, ", totalStake=");
        hxa.c(sbA, this.g, ", totalReturn=", this.h, ", canDelete=");
        mng.a(", freeBetGift=", this.j, ", enableShowOff=", sbA, this.i);
        nng.a(", shouldShowReBetButton=", ", selections=", sbA, this.k, this.l);
        return ts3.a(sbA, this.m, ")");
    }

    public ygq() {
        this(0);
    }

    public ygq(int i) {
        this("", "", pxq.SINGLE, hlr.WIN, "", "", "", "", false, "", false, false, n1a0.c);
    }
}
