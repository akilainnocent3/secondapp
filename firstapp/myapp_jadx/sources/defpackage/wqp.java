package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wqp {
    public final String a;
    public final String b;
    public final int c;
    public final Long d;
    public final xqp e;
    public final n7v f;
    public final n7v g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final String l;

    public wqp(String str, String str2, int i, Long l, xqp xqpVar, n7v n7vVar, n7v n7vVar2, Integer num, Integer num2, Integer num3, Integer num4, String str3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = l;
        this.e = xqpVar;
        this.f = n7vVar;
        this.g = n7vVar2;
        this.h = num;
        this.i = num2;
        this.j = num3;
        this.k = num4;
        this.l = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqp)) {
            return false;
        }
        wqp wqpVar = (wqp) obj;
        return Intrinsics.g(this.a, wqpVar.a) && Intrinsics.g(this.b, wqpVar.b) && this.c == wqpVar.c && Intrinsics.g(this.d, wqpVar.d) && this.e == wqpVar.e && this.f.equals(wqpVar.f) && this.g.equals(wqpVar.g) && Intrinsics.g(this.h, wqpVar.h) && Intrinsics.g(this.i, wqpVar.i) && Intrinsics.g(this.j, wqpVar.j) && Intrinsics.g(this.k, wqpVar.k) && Intrinsics.g(this.l, wqpVar.l);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iA = gpp.a(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Long l = this.d;
        int iHashCode2 = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iA + (l == null ? 0 : l.hashCode())) * 31)) * 31)) * 31)) * 31;
        Integer num = this.h;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.i;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.j;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.k;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.l;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("KnockoutMatch(matchSlotId=", this.a, ", eventId=", this.b, ", matchNumber=");
        sbA.append(this.c);
        sbA.append(", startTime=");
        sbA.append(this.d);
        sbA.append(", status=");
        sbA.append(this.e);
        sbA.append(", home=");
        sbA.append(this.f);
        sbA.append(", away=");
        sbA.append(this.g);
        sbA.append(", homeScore=");
        sbA.append(this.h);
        sbA.append(", awayScore=");
        cv7.a(sbA, this.i, ", penaltyHomeScore=", this.j, ", penaltyAwayScore=");
        sbA.append(this.k);
        sbA.append(", nextSlotId=");
        sbA.append(this.l);
        sbA.append(")");
        return sbA.toString();
    }
}
