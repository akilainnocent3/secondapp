package defpackage;

import com.appsflyer.internal.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ogq {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final double g;
    public final String h;
    public final String i;
    public final String j;

    public ogq(String str, String str2, String str3, long j, long j2, long j3, double d, String str4, String str5, String str6) {
        qn4.b(str, str2, str3, str5, str6);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = d;
        this.h = str4;
        this.i = str5;
        this.j = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogq)) {
            return false;
        }
        ogq ogqVar = (ogq) obj;
        return Intrinsics.g(this.a, ogqVar.a) && Intrinsics.g(this.b, ogqVar.b) && Intrinsics.g(this.c, ogqVar.c) && this.d == ogqVar.d && this.e == ogqVar.e && this.f == ogqVar.f && Double.compare(this.g, ogqVar.g) == 0 && Intrinsics.g(this.h, ogqVar.h) && Intrinsics.g(this.i, ogqVar.i) && Intrinsics.g(this.j, ogqVar.j);
    }

    public final int hashCode() {
        int iA = nrg0.a(f87.a(f87.a(f87.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), this.e, 31), this.f, 31), 31, this.g);
        String str = this.h;
        return this.j.hashCode() + gmf0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("LNHighestOddsCard(lotteryId=", this.a, ", name=", this.b, ", drawId=");
        l.a(this.d, this.c, ", drawTime=", sbA);
        g41.a(this.e, ", drawTimeForElapsedRealtime=", ", refreshAtElapsedRealtime=", sbA);
        sbA.append(this.f);
        hib0.b(this.g, ", odds=", ", marketGroupId=", sbA);
        hxa.c(sbA, this.h, ", marketId=", this.i, ", marketTitle=");
        return uf80.a(sbA, this.j, ")");
    }
}
