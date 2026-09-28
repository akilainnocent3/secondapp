package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jl00 {
    public final String a;
    public final boolean b;
    public final long c;
    public final Long d;
    public final String e;
    public final String f;
    public final int g;
    public final String h;
    public final int i;
    public final String j;
    public final double k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;

    public jl00(String str, boolean z, long j, Long l, String str2, String str3, int i, String str4, int i2, String str5, double d, String str6, String str7, String str8, String str9, String str10) {
        qn4.b(str, str2, str3, str4, str5);
        str6.getClass();
        this.a = str;
        this.b = z;
        this.c = j;
        this.d = l;
        this.e = str2;
        this.f = str3;
        this.g = i;
        this.h = str4;
        this.i = i2;
        this.j = str5;
        this.k = d;
        this.l = str6;
        this.m = str7;
        this.n = str8;
        this.o = str9;
        this.p = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl00)) {
            return false;
        }
        jl00 jl00Var = (jl00) obj;
        return Intrinsics.g(this.a, jl00Var.a) && this.b == jl00Var.b && this.c == jl00Var.c && Intrinsics.g(this.d, jl00Var.d) && Intrinsics.g(this.e, jl00Var.e) && Intrinsics.g(this.f, jl00Var.f) && this.g == jl00Var.g && Intrinsics.g(this.h, jl00Var.h) && this.i == jl00Var.i && Intrinsics.g(this.j, jl00Var.j) && Double.compare(this.k, jl00Var.k) == 0 && Intrinsics.g(this.l, jl00Var.l) && Intrinsics.g(this.m, jl00Var.m) && Intrinsics.g(this.n, jl00Var.n) && Intrinsics.g(this.o, jl00Var.o) && Intrinsics.g(this.p, jl00Var.p);
    }

    public final int hashCode() {
        int iA = f87.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), this.c, 31);
        Long l = this.d;
        int iA2 = gmf0.a(nrg0.a(gmf0.a(gpp.a(this.i, gmf0.a(gpp.a(this.g, gmf0.a(gmf0.a((iA + (l == null ? 0 : l.hashCode())) * 31, 31, this.e), 31, this.f), 31), 31, this.h), 31), 31, this.j), 31, this.k), 31, this.l);
        String str = this.m;
        int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.n;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.p;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = z620.a("CodeDetailState(eventId=", this.a, ", isOutrightEvent=", ", startTime=", this.b);
        sbA.append(this.c);
        sbA.append(", endTime=");
        sbA.append(this.d);
        hxa.c(sbA, ", homeTeamName=", this.e, ", awayTeamName=", this.f);
        sbA.append(", marketId=");
        sbA.append(this.g);
        sbA.append(", marketDescription=");
        sbA.append(this.h);
        sbA.append(", outcomeId=");
        sbA.append(this.i);
        sbA.append(", outcomeDescription=");
        sbA.append(this.j);
        hib0.b(this.k, ", odds=", ", sportId=", sbA);
        hxa.c(sbA, this.l, ", tournamentId=", this.m, ", tournamentIcon=");
        hxa.c(sbA, this.n, ", tournamentName=", this.o, ", formattedStartTime=");
        return uf80.a(sbA, this.p, ")");
    }
}
