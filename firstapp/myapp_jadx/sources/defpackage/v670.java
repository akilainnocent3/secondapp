package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v670 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final List<r670> h;

    public v670(String str, String str2, String str3, int i, float f, float f2, float f3, List<r670> list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v670)) {
            return false;
        }
        v670 v670Var = (v670) obj;
        return this.a.equals(v670Var.a) && this.b.equals(v670Var.b) && this.c.equals(v670Var.c) && this.d == v670Var.d && Float.compare(this.e, v670Var.e) == 0 && Float.compare(this.f, v670Var.f) == 0 && Float.compare(this.g, v670Var.g) == 0 && Intrinsics.g(this.h, v670Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + tvh.a(this.g, tvh.a(this.f, tvh.a(this.e, gpp.a(this.d, gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ScheduledFootballHeadToHeadStatsTeamInfo(teamId=", this.a, ", teamName=", this.b, ", teamLogoUrl=");
        wxa.b(this.d, this.c, ", probability=", ", homeAverageScore=", sbA);
        ew7.b(sbA, this.e, ", awayAverageScore=", this.f, ", overallAverageScore=");
        sbA.append(this.g);
        sbA.append(", recentMatchRecords=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}
