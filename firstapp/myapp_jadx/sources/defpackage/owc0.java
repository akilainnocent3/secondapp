package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class owc0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final gyc0 g;
    public final boolean h;
    public final List<hyc0> i;

    public owc0(String str, String str2, String str3, String str4, String str5, String str6, gyc0 gyc0Var, boolean z, List<hyc0> list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = gyc0Var;
        this.h = z;
        this.i = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owc0)) {
            return false;
        }
        owc0 owc0Var = (owc0) obj;
        return this.a.equals(owc0Var.a) && this.b.equals(owc0Var.b) && this.c.equals(owc0Var.c) && this.d.equals(owc0Var.d) && this.e.equals(owc0Var.e) && this.f.equals(owc0Var.f) && this.g == owc0Var.g && this.h == owc0Var.h && Intrinsics.g(this.i, owc0Var.i);
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        gyc0 gyc0Var = this.g;
        return this.i.hashCode() + mtg0.a((iA + (gyc0Var == null ? 0 : gyc0Var.hashCode())) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SportyPenaltyMarket(id=", this.a, ", poolId=", this.b, ", type=");
        hxa.c(sbA, this.c, ", title=", this.d, ", subtitle=");
        hxa.c(sbA, this.e, ", guide=", this.f, ", layoutMode=");
        sbA.append(this.g);
        sbA.append(", combo=");
        sbA.append(this.h);
        sbA.append(", outcomes=");
        return ng1.a(sbA, this.i, ")");
    }
}
