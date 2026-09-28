package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class prg {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final String s;

    public prg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2, boolean z3, String str12, boolean z4, boolean z5, String str13, String str14) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = str12;
        this.p = z4;
        this.q = z5;
        this.r = str13;
        this.s = str14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof prg)) {
            return false;
        }
        prg prgVar = (prg) obj;
        return Intrinsics.g(this.a, prgVar.a) && this.b.equals(prgVar.b) && this.c.equals(prgVar.c) && this.d.equals(prgVar.d) && this.e.equals(prgVar.e) && Intrinsics.g(this.f, prgVar.f) && Intrinsics.g(this.g, prgVar.g) && Intrinsics.g(this.h, prgVar.h) && Intrinsics.g(this.i, prgVar.i) && Intrinsics.g(this.j, prgVar.j) && Intrinsics.g(this.k, prgVar.k) && this.l == prgVar.l && this.m == prgVar.m && this.n == prgVar.n && Intrinsics.g(this.o, prgVar.o) && this.p == prgVar.p && this.q == prgVar.q && Intrinsics.g(this.r, prgVar.r) && Intrinsics.g(this.s, prgVar.s);
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        int iA2 = mtg0.a(mtg0.a(mtg0.a((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.l), 961, this.m), 31, this.n);
        String str7 = this.o;
        int iA3 = mtg0.a(mtg0.a((iA2 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.p), 31, this.q);
        String str8 = this.r;
        int iHashCode6 = (iA3 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.s;
        return iHashCode6 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("EventUiModel(id=", this.a, ", dateTimeLabel=", this.b, ", tournamentName=");
        hxa.c(sbA, this.c, ", homeTeamName=", this.d, ", awayTeamName=");
        hxa.c(sbA, this.e, ", homeTeamId=", this.f, ", awayTeamId=");
        hxa.c(sbA, this.g, ", homeLogoUrl=", this.h, ", awayLogoUrl=");
        hxa.c(sbA, this.i, ", homeScoreFT=", this.j, ", awayScoreFT=");
        uts.b(this.k, ", isLive=", ", isUpcomingEvent=", sbA, this.l);
        nng.a(", startOdds=null, isHomeTeamHighlighted=", ", sportId=", sbA, this.m, this.n);
        uts.b(this.o, ", isLiveStreamAvailable=", ", isAudioStreamAvailable=", sbA, this.p);
        mng.a(", matchTrackerUrl=", this.r, ", matchStatsUrl=", sbA, this.q);
        return uf80.a(sbA, this.s, ")");
    }
}
