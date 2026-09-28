package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fr90 {
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
    public final int k;
    public final int l;
    public final String m;
    public final List<wr90> n;

    public fr90(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2, String str11, List<wr90> list) {
        list.getClass();
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
        this.k = i;
        this.l = i2;
        this.m = str11;
        this.n = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr90)) {
            return false;
        }
        fr90 fr90Var = (fr90) obj;
        return this.a.equals(fr90Var.a) && this.b.equals(fr90Var.b) && this.c.equals(fr90Var.c) && this.d.equals(fr90Var.d) && this.e.equals(fr90Var.e) && this.f.equals(fr90Var.f) && this.g.equals(fr90Var.g) && this.h.equals(fr90Var.h) && this.i.equals(fr90Var.i) && this.j.equals(fr90Var.j) && this.k == fr90Var.k && this.l == fr90Var.l && this.m.equals(fr90Var.m) && Intrinsics.g(this.n, fr90Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + gmf0.a(gpp.a(this.l, gpp.a(this.k, gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SimulationTicketDetailEvent(leagueId=", this.a, ", eventId=", this.b, ", homeTeamName=");
        hxa.c(sbA, this.c, ", homeTeamLogo=", this.d, ", homeTeamBaseColor=");
        hxa.c(sbA, this.e, ", homeTeamSleeveColor=", this.f, ", awayTeamName=");
        hxa.c(sbA, this.g, ", awayTeamLogo=", this.h, ", awayTeamBaseColor=");
        hxa.c(sbA, this.i, ", awayTeamSleeveColor=", this.j, ", homeTeamScore=");
        d5d.a(sbA, this.k, ", awayTeamScore=", this.l, ", resultSequence=");
        return nve.a(this.m, ", markets=", ")", sbA, this.n);
    }
}
