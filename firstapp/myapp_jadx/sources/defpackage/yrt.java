package defpackage;

import com.appsflyer.internal.l;
import com.google.android.gms.common.annotation.LjLk.llGRV;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class yrt {
    public final String a;
    public final int b;
    public final String c;
    public final long d;
    public final String e;
    public final List<String> f;
    public final List<String> g;
    public final List<String> h;
    public final List<String> i;
    public final List<String> j;
    public final List<String> k;
    public final List<String> l;
    public final List<String> m;
    public final Long n;
    public final Double o;
    public final Double p;
    public final Boolean q;
    public final Boolean r;
    public final List<k27> s;
    public final List<k27> t;
    public final Integer u;

    public yrt(String str, int i, String str2, long j, String str3, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, List<String> list7, List<String> list8, Long l, Double d, Double d2, Boolean bool, Boolean bool2, List<k27> list9, List<k27> list10, Integer num) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        list7.getClass();
        list8.getClass();
        list9.getClass();
        list10.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = j;
        this.e = str3;
        this.f = list;
        this.g = list2;
        this.h = list3;
        this.i = list4;
        this.j = list5;
        this.k = list6;
        this.l = list7;
        this.m = list8;
        this.n = l;
        this.o = d;
        this.p = d2;
        this.q = bool;
        this.r = bool2;
        this.s = list9;
        this.t = list10;
        this.u = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrt)) {
            return false;
        }
        yrt yrtVar = (yrt) obj;
        return Intrinsics.g(this.a, yrtVar.a) && this.b == yrtVar.b && Intrinsics.g(this.c, yrtVar.c) && this.d == yrtVar.d && Intrinsics.g(this.e, yrtVar.e) && Intrinsics.g(this.f, yrtVar.f) && Intrinsics.g(this.g, yrtVar.g) && Intrinsics.g(this.h, yrtVar.h) && Intrinsics.g(this.i, yrtVar.i) && Intrinsics.g(this.j, yrtVar.j) && Intrinsics.g(this.k, yrtVar.k) && Intrinsics.g(this.l, yrtVar.l) && Intrinsics.g(this.m, yrtVar.m) && Intrinsics.g(this.n, yrtVar.n) && Intrinsics.g(this.o, yrtVar.o) && Intrinsics.g(this.p, yrtVar.p) && Intrinsics.g(this.q, yrtVar.q) && Intrinsics.g(this.r, yrtVar.r) && Intrinsics.g(this.s, yrtVar.s) && Intrinsics.g(this.t, yrtVar.t) && Intrinsics.g(this.u, yrtVar.u);
    }

    public final int hashCode() {
        int iA = ai50.a(ai50.a(ai50.a(ai50.a(ai50.a(ai50.a(ai50.a(ai50.a(gmf0.a(f87.a(gmf0.a(gpp.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), this.d, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        Long l = this.n;
        int iHashCode = (iA + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.o;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.p;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Boolean bool = this.q;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.r;
        int iA2 = ai50.a(ai50.a((iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.s), 31, this.t);
        Integer num = this.u;
        return iA2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "LoyaltyChallengeParameters(challengeType=", this.a, ", topRanking=", ", url=");
        l.a(this.d, this.c, ", lastParticipationTime=", sbA);
        sbA.append(", betCategory=");
        sbA.append(this.e);
        sbA.append(", betInSpecificRealSportTypes=");
        sbA.append(this.f);
        qjk.a(", betInSpecificInstantVirtualTypes=", ", betInSpecificTournaments=", sbA, this.g, this.h);
        qjk.a(", betInSpecificMarkets=", ", betTypes=", sbA, this.i, this.j);
        qjk.a(", betBuilderTypes=", ", upTypes=", sbA, this.k, this.l);
        sbA.append(", earlyGoalsTypes=");
        sbA.append(this.m);
        sbA.append(", minStake=");
        sbA.append(this.n);
        lsv.a(this.o, this.p, llGRV.mJYWFCgRdYPUFXx, ", maxTotalOdd=", sbA);
        sbA.append(", giftUsage=");
        sbA.append(this.q);
        sbA.append(", cashOut=");
        sbA.append(this.r);
        qjk.a(", championRewards=", ", topRankingRewards=", sbA, this.s, this.t);
        sbA.append(", participantCount=");
        sbA.append(this.u);
        sbA.append(")");
        return sbA.toString();
    }
}
