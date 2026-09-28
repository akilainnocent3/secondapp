package defpackage;

import java.math.BigDecimal;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mtz {
    public final String a;
    public final Date b;
    public final String c;
    public final BigDecimal d;
    public final String e;
    public final cuz f;
    public final String g;
    public final BigDecimal h;
    public final BigDecimal i;
    public final String j;
    public final Date k;
    public final Date l;
    public final String m;

    public mtz(String str, Date date, String str2, BigDecimal bigDecimal, String str3, cuz cuzVar, String str4, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str5, Date date2, Date date3, String str6) {
        this.a = str;
        this.b = date;
        this.c = str2;
        this.d = bigDecimal;
        this.e = str3;
        this.f = cuzVar;
        this.g = str4;
        this.h = bigDecimal2;
        this.i = bigDecimal3;
        this.j = str5;
        this.k = date2;
        this.l = date3;
        this.m = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mtz)) {
            return false;
        }
        mtz mtzVar = (mtz) obj;
        return Intrinsics.g(this.a, mtzVar.a) && Intrinsics.g(this.b, mtzVar.b) && Intrinsics.g(this.c, mtzVar.c) && Intrinsics.g(this.d, mtzVar.d) && Intrinsics.g(this.e, mtzVar.e) && this.f == mtzVar.f && Intrinsics.g(this.g, mtzVar.g) && Intrinsics.g(this.h, mtzVar.h) && Intrinsics.g(this.i, mtzVar.i) && Intrinsics.g(this.j, mtzVar.j) && Intrinsics.g(this.k, mtzVar.k) && Intrinsics.g(this.l, mtzVar.l) && Intrinsics.g(this.m, mtzVar.m);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Date date = this.b;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.d;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (this.f.hashCode() + ((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.g;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.h;
        int iHashCode7 = (iHashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.i;
        int iHashCode8 = (iHashCode7 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str5 = this.j;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Date date2 = this.k;
        int iHashCode10 = (iHashCode9 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.l;
        int iHashCode11 = (iHashCode10 + (date3 == null ? 0 : date3.hashCode())) * 31;
        String str6 = this.m;
        return iHashCode11 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartnerWithdrawRequestDetails(tradeId=");
        sb.append(this.a);
        sb.append(", requestTime=");
        sb.append(this.b);
        sb.append(", ptnCode=");
        sb.append(this.c);
        sb.append(", initAmount=");
        sb.append(this.d);
        sb.append(", currency=");
        sb.append(this.e);
        sb.append(", status=");
        sb.append(this.f);
        sb.append(", pin=");
        sb.append(this.g);
        sb.append(", cancelFee=");
        sb.append(this.h);
        sb.append(", ptnFee=");
        sb.append(this.i);
        sb.append(", ptnInfo=");
        sb.append(this.j);
        sb.append(", approveTime=");
        sb.append(this.k);
        sb.append(", finishTime=");
        sb.append(this.l);
        sb.append(", playerPhone=");
        return uf80.a(sb, this.m, ")");
    }
}
