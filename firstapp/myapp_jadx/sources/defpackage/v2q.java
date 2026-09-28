package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v2q {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final atq g;
    public final String h;
    public final BigDecimal i;
    public final String j;
    public final hlr k;
    public final long l;
    public final long m;
    public final qcn<Integer> n;
    public final qcn<Integer> o;
    public final qcn<Integer> p;
    public final qcn<Integer> q;
    public final String r;
    public final String s;
    public final boolean t;

    public v2q(String str, String str2, String str3, String str4, String str5, String str6, atq atqVar, String str7, BigDecimal bigDecimal, String str8, hlr hlrVar, long j, long j2, uf00 uf00Var, uf00 uf00Var2, uf00 uf00Var3, uf00 uf00Var4, String str9, String str10, boolean z) {
        qn4.b(str, str2, str3, str5, str6);
        str7.getClass();
        str8.getClass();
        hlrVar.getClass();
        uf00Var.getClass();
        uf00Var2.getClass();
        uf00Var3.getClass();
        uf00Var4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = atqVar;
        this.h = str7;
        this.i = bigDecimal;
        this.j = str8;
        this.k = hlrVar;
        this.l = j;
        this.m = j2;
        this.n = uf00Var;
        this.o = uf00Var2;
        this.p = uf00Var3;
        this.q = uf00Var4;
        this.r = str9;
        this.s = str10;
        this.t = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2q)) {
            return false;
        }
        v2q v2qVar = (v2q) obj;
        if (!Intrinsics.g(this.a, v2qVar.a) || !Intrinsics.g(this.b, v2qVar.b) || !Intrinsics.g(this.c, v2qVar.c) || !this.d.equals(v2qVar.d) || !Intrinsics.g(this.e, v2qVar.e) || !Intrinsics.g(this.f, v2qVar.f) || this.g != v2qVar.g || !Intrinsics.g(this.h, v2qVar.h)) {
            return false;
        }
        BigDecimal bigDecimal = v2qVar.i;
        rkd0.a aVar = rkd0.Companion;
        return this.i.equals(bigDecimal) && Intrinsics.g(this.j, v2qVar.j) && this.k == v2qVar.k && this.l == v2qVar.l && this.m == v2qVar.m && Intrinsics.g(this.n, v2qVar.n) && Intrinsics.g(this.o, v2qVar.o) && Intrinsics.g(this.p, v2qVar.p) && Intrinsics.g(this.q, v2qVar.q) && Intrinsics.g(this.r, v2qVar.r) && Intrinsics.g(this.s, v2qVar.s) && this.t == v2qVar.t;
    }

    public final int hashCode() {
        int iA = gmf0.a((this.g.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h);
        rkd0.a aVar = rkd0.Companion;
        int iA2 = shu.a(this.q, shu.a(this.p, shu.a(this.o, shu.a(this.n, f87.a(f87.a((this.k.hashCode() + gmf0.a(dd3.a(this.i, iA, 31), 31, this.j)) * 31, this.l, 31), this.m, 31), 31), 31), 31), 31);
        String str = this.r;
        int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.s;
        return Boolean.hashCode(this.t) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        rkd0.a aVar = rkd0.Companion;
        String plainString = this.i.toPlainString();
        plainString.getClass();
        StringBuilder sbA = ux5.a("LNBetSelection(id=", this.a, ", drawId=", this.b, ", lotteryId=");
        hxa.c(sbA, this.c, ", lotteryTitle=", this.d, ", marketId=");
        hxa.c(sbA, this.e, ", marketTitle=", this.f, ", marketType=");
        sbA.append(this.g);
        sbA.append(", outcomeId=");
        sbA.append(this.h);
        sbA.append(", odds=");
        hxa.c(sbA, plainString, ", prob=", this.j, ", status=");
        sbA.append(this.k);
        sbA.append(", resultTime=");
        sbA.append(this.l);
        g41.a(this.m, ", createTime=", ", userMainNumbers=", sbA);
        sbA.append(this.n);
        sbA.append(", userBonusNumbers=");
        sbA.append(this.o);
        sbA.append(", drawMainNumbers=");
        sbA.append(this.p);
        sbA.append(", drawBonusNumbers=");
        sbA.append(this.q);
        sbA.append(", correctOutcomeTitle=");
        hxa.c(sbA, this.r, ", outcomeTitle=", this.s, ", shouldShowReBetButton=");
        return mq0.a(sbA, this.t, ")");
    }
}
