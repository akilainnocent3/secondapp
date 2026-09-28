package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zfo {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ago f;
    public final ArrayList g;
    public final String h;

    public zfo(String str, String str2, String str3, String str4, String str5, ago agoVar, ArrayList arrayList, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = agoVar;
        this.g = arrayList;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfo)) {
            return false;
        }
        zfo zfoVar = (zfo) obj;
        return this.a.equals(zfoVar.a) && this.b.equals(zfoVar.b) && this.c.equals(zfoVar.c) && this.d.equals(zfoVar.d) && this.e.equals(zfoVar.e) && this.f.equals(zfoVar.f) && this.g.equals(zfoVar.g) && this.h.equals(zfoVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + vt5.a(this.g, (this.f.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantWinMarket(marketId=", this.a, ", type=", this.b, ", title=");
        hxa.c(sbA, this.c, ", subTitle=", this.d, ", bannerTitles=");
        sbA.append(this.e);
        sbA.append(", attributes=");
        sbA.append(this.f);
        sbA.append(", outcomes=");
        sbA.append(this.g);
        sbA.append(", guide=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}
