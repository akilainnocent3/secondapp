package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class ieo {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final ArrayList j;

    public ieo(String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, int i3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
        this.g = str6;
        this.h = i2;
        this.i = i3;
        this.j = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ieo)) {
            return false;
        }
        ieo ieoVar = (ieo) obj;
        return this.a.equals(ieoVar.a) && this.b.equals(ieoVar.b) && this.c.equals(ieoVar.c) && this.d.equals(ieoVar.d) && this.e == ieoVar.e && this.f.equals(ieoVar.f) && this.g.equals(ieoVar.g) && this.h == ieoVar.h && this.i == ieoVar.i && this.j.equals(ieoVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + gpp.a(this.i, gpp.a(this.h, gmf0.a(gmf0.a(gpp.a(this.e, gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantWinEvent(eventId=", this.a, ", leagueId=", this.b, ", homeTeamName=");
        hxa.c(sbA, this.c, ", homeTeamLogo=", this.d, ", homeTeamStarCount=");
        f78.b(this.e, ", awayTeamName=", this.f, ", awayTeamLogo=", sbA);
        wxa.b(this.h, this.g, ", awayTeamStarCount=", ", marketCount=", sbA);
        sbA.append(this.i);
        sbA.append(", markets=");
        sbA.append(this.j);
        sbA.append(")");
        return sbA.toString();
    }
}
