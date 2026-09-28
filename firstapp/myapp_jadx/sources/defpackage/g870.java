package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g870 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final h870 g;
    public final String h;
    public final ArrayList i;

    public g870(String str, String str2, String str3, String str4, String str5, String str6, h870 h870Var, String str7, ArrayList arrayList) {
        str7.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = h870Var;
        this.h = str7;
        this.i = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g870)) {
            return false;
        }
        g870 g870Var = (g870) obj;
        return this.a.equals(g870Var.a) && this.b.equals(g870Var.b) && this.c.equals(g870Var.c) && this.d.equals(g870Var.d) && this.e.equals(g870Var.e) && this.f.equals(g870Var.f) && Intrinsics.g(this.g, g870Var.g) && Intrinsics.g(this.h, g870Var.h) && this.i.equals(g870Var.i);
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        h870 h870Var = this.g;
        return this.i.hashCode() + gmf0.a((iA + (h870Var == null ? 0 : h870Var.hashCode())) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ScheduledFootballMarket(id=", this.a, ", poolId=", this.b, ", title=");
        hxa.c(sbA, this.c, ", subtitle=", this.d, ", type=");
        hxa.c(sbA, this.e, ", guide=", this.f, ", attributes=");
        sbA.append(this.g);
        sbA.append(", bannerTitles=");
        sbA.append(this.h);
        sbA.append(", outcomes=");
        sbA.append(this.i);
        sbA.append(")");
        return sbA.toString();
    }
}
