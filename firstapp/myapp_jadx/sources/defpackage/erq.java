package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class erq {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final String j;
    public final long k;
    public final long l;
    public final qcn<esq> m;

    public erq(int i, long j, long j2, String str, String str2, String str3) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, 0, "", "", "", "", "", false, (i & 512) != 0 ? "" : str3, (i & 1024) != 0 ? 0L : j, (i & 2048) != 0 ? 0L : j2, n1a0.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erq)) {
            return false;
        }
        erq erqVar = (erq) obj;
        return Intrinsics.g(this.a, erqVar.a) && Intrinsics.g(this.b, erqVar.b) && this.c == erqVar.c && Intrinsics.g(this.d, erqVar.d) && Intrinsics.g(this.e, erqVar.e) && Intrinsics.g(this.f, erqVar.f) && Intrinsics.g(this.g, erqVar.g) && Intrinsics.g(this.h, erqVar.h) && this.i == erqVar.i && Intrinsics.g(this.j, erqVar.j) && this.k == erqVar.k && this.l == erqVar.l && Intrinsics.g(this.m, erqVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + f87.a(f87.a(gmf0.a(mtg0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), this.k, 31), this.l, 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("LNLottery(id=", this.a, ", name=", this.b, ", countryIndex=");
        f78.b(this.c, ", countryCode=", this.d, ", countryName=", sbA);
        hxa.c(sbA, this.e, ", countryFlag=", this.f, ", backgroundUrl=");
        hxa.c(sbA, this.g, ", icon=", this.h, ", isFavorite=");
        mng.a(", drawId=", this.j, ", drawTime=", sbA, this.i);
        sbA.append(this.k);
        g41.a(this.l, ", drawTimeForElapsedRealtime=", ", streams=", sbA);
        return ts3.a(sbA, this.m, ")");
    }

    public erq() {
        this(8191, 0L, 0L, null, null, null);
    }

    public erq(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, long j, long j2, qcn<esq> qcnVar) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str8.getClass();
        qcnVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = z;
        this.j = str8;
        this.k = j;
        this.l = j2;
        this.m = qcnVar;
    }
}
