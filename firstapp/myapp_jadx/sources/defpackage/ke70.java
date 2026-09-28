package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ke70 {
    public final int a;
    public final String b;
    public final qzd0 c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public ke70(int i, String str, qzd0 qzd0Var, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        qn4.b(str, str4, str5, str6, str7);
        str8.getClass();
        this.a = i;
        this.b = str;
        this.c = qzd0Var;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke70)) {
            return false;
        }
        ke70 ke70Var = (ke70) obj;
        return this.a == ke70Var.a && Intrinsics.g(this.b, ke70Var.b) && this.c == ke70Var.c && this.d.equals(ke70Var.d) && this.e.equals(ke70Var.e) && Intrinsics.g(this.f, ke70Var.f) && Intrinsics.g(this.g, ke70Var.g) && Intrinsics.g(this.h, ke70Var.h) && Intrinsics.g(this.i, ke70Var.i) && Intrinsics.g(this.j, ke70Var.j);
    }

    public final int hashCode() {
        int iA = gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        qzd0 qzd0Var = this.c;
        return this.j.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a((iA + (qzd0Var == null ? 0 : qzd0Var.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "ScheduledFootballOverviewStatsLeagueStandingsTeamState(backgroundColorResId=", ", positionText=", this.b, ", statsTrend=");
        sbA.append(this.c);
        sbA.append(", logoUrl=");
        sbA.append(this.d);
        sbA.append(", nameText=");
        hxa.c(sbA, this.e, ", playedText=", this.f, ", wonText=");
        hxa.c(sbA, this.g, ", drawnText=", this.h, ", lostText=");
        return kwi.a(sbA, this.i, ", pointsText=", this.j, ")");
    }
}
