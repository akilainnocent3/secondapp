package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sdc0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final ffc0 g;
    public final boolean h;
    public final List<gfc0> i;

    public sdc0(String str, String str2, String str3, String str4, String str5, String str6, ffc0 ffc0Var, boolean z, List<gfc0> list) {
        bt6.a(str, str3, list);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = ffc0Var;
        this.h = z;
        this.i = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdc0)) {
            return false;
        }
        sdc0 sdc0Var = (sdc0) obj;
        return Intrinsics.g(this.a, sdc0Var.a) && this.b.equals(sdc0Var.b) && Intrinsics.g(this.c, sdc0Var.c) && this.d.equals(sdc0Var.d) && this.e.equals(sdc0Var.e) && this.f.equals(sdc0Var.f) && this.g == sdc0Var.g && this.h == sdc0Var.h && Intrinsics.g(this.i, sdc0Var.i);
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        ffc0 ffc0Var = this.g;
        return this.i.hashCode() + mtg0.a((iA + (ffc0Var == null ? 0 : ffc0Var.hashCode())) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SportyLegendsMarket(id=", this.a, ", poolId=", this.b, ", type=");
        hxa.c(sbA, this.c, ", title=", this.d, ", subtitle=");
        hxa.c(sbA, this.e, ", guide=", this.f, ", layoutMode=");
        sbA.append(this.g);
        sbA.append(", combo=");
        sbA.append(this.h);
        sbA.append(", outcomes=");
        return ng1.a(sbA, this.i, ")");
    }
}
