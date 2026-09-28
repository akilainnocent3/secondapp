package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cnc0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final List<ufc0> l;
    public final int m;

    public cnc0(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, List<ufc0> list, int i5) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = f;
        this.i = f2;
        this.j = f3;
        this.k = f4;
        this.l = list;
        this.m = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnc0)) {
            return false;
        }
        cnc0 cnc0Var = (cnc0) obj;
        return this.a.equals(cnc0Var.a) && this.b.equals(cnc0Var.b) && this.c.equals(cnc0Var.c) && this.d == cnc0Var.d && this.e == cnc0Var.e && this.f == cnc0Var.f && this.g == cnc0Var.g && Float.compare(this.h, cnc0Var.h) == 0 && Float.compare(this.i, cnc0Var.i) == 0 && Float.compare(this.j, cnc0Var.j) == 0 && Float.compare(this.k, cnc0Var.k) == 0 && Intrinsics.g(this.l, cnc0Var.l) && this.m == cnc0Var.m;
    }

    public final int hashCode() {
        return Integer.hashCode(this.m) + ai50.a(tvh.a(this.k, tvh.a(this.j, tvh.a(this.i, tvh.a(this.h, gpp.a(this.g, gpp.a(this.f, gpp.a(this.e, gpp.a(this.d, gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SportyLegendsStatsTeam(teamId=", this.a, ", teamName=", this.b, ", teamLogoUrl=");
        wxa.b(this.d, this.c, ", probability=", ", rank=", sbA);
        d5d.a(sbA, this.e, ", form=", this.f, ", teamSize=");
        sbA.append(this.g);
        sbA.append(", avgPoints=");
        sbA.append(this.h);
        sbA.append(", homeAvgScore=");
        ew7.b(sbA, this.i, ", awayAvgScore=", this.j, ", overallAvgScore=");
        sbA.append(this.k);
        sbA.append(", recentMatches=");
        sbA.append(this.l);
        sbA.append(", star=");
        return zk1.a(this.m, ")", sbA);
    }
}
