package defpackage;

import com.appsflyer.internal.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ue70 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public ue70(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7) {
        m.a(str, str6, str7);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue70)) {
            return false;
        }
        ue70 ue70Var = (ue70) obj;
        return this.a == ue70Var.a && Intrinsics.g(this.b, ue70Var.b) && this.c.equals(ue70Var.c) && this.d.equals(ue70Var.d) && this.e.equals(ue70Var.e) && this.f.equals(ue70Var.f) && Intrinsics.g(this.g, ue70Var.g) && Intrinsics.g(this.h, ue70Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "ScheduledFootballOverviewStatsMatchResultsEventState(backgroundColorResId=", ", positionText=", this.b, ", homeTeamLogoUrl=");
        hxa.c(sbA, this.c, ", homeTeamNameText=", this.d, ", awayTeamLogoUrl=");
        hxa.c(sbA, this.e, ", awayTeamNameText=", this.f, ", halfTimeScoreText=");
        return kwi.a(sbA, this.g, ", fullTimeScoreText=", this.h, ")");
    }
}
