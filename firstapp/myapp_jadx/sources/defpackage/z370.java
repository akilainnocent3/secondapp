package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z370 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final List<g870> i;

    public z370(String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, List<g870> list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
        this.g = str6;
        this.h = i2;
        this.i = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z370)) {
            return false;
        }
        z370 z370Var = (z370) obj;
        return this.a.equals(z370Var.a) && this.b.equals(z370Var.b) && this.c.equals(z370Var.c) && this.d.equals(z370Var.d) && this.e == z370Var.e && this.f.equals(z370Var.f) && this.g.equals(z370Var.g) && this.h == z370Var.h && Intrinsics.g(this.i, z370Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + gpp.a(this.h, gmf0.a(gmf0.a(gpp.a(this.e, gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ScheduledFootballEvent(id=", this.a, ", leagueId=", this.b, ", homeTeamName=");
        hxa.c(sbA, this.c, ", homeTeamLogoUrl=", this.d, ", homeTeamStarCount=");
        f78.b(this.e, ", awayTeamName=", this.f, ", awayTeamLogoUrl=", sbA);
        wxa.b(this.h, this.g, ", awayTeamStarCount=", ", markets=", sbA);
        return ng1.a(sbA, this.i, ")");
    }
}
