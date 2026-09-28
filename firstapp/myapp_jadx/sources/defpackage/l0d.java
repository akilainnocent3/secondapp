package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l0d {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final int g;
    public final String h;
    public final String i;
    public final yi5 j;
    public final String k;

    public l0d(String str, String str2, String str3, boolean z, String str4, String str5, int i, String str6, String str7, yi5 yi5Var, String str8) {
        qn4.b(str, str2, str3, str5, str6);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = str5;
        this.g = i;
        this.h = str6;
        this.i = str7;
        this.j = yi5Var;
        this.k = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0d)) {
            return false;
        }
        l0d l0dVar = (l0d) obj;
        return Intrinsics.g(this.a, l0dVar.a) && Intrinsics.g(this.b, l0dVar.b) && Intrinsics.g(this.c, l0dVar.c) && this.d == l0dVar.d && this.e.equals(l0dVar.e) && Intrinsics.g(this.f, l0dVar.f) && this.g == l0dVar.g && Intrinsics.g(this.h, l0dVar.h) && Intrinsics.g(this.i, l0dVar.i) && this.j.equals(l0dVar.j) && Intrinsics.g(this.k, l0dVar.k);
    }

    public final int hashCode() {
        int iA = gmf0.a(gpp.a(this.g, gmf0.a(gmf0.a(mtg0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h);
        String str = this.i;
        int iHashCode = (this.j.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.k;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("DebugScreenData(firebaseToken=", this.a, ", deviceId=", this.b, ", fingerPrints=");
        uts.b(this.c, ", firebaseAnalyticsEnabled=", ", accType=", sbA, this.d);
        hxa.c(sbA, this.e, ", socketAddress=", this.f, ", socketStatus=");
        f78.b(this.g, ", fullStoryDebugInfo=", this.h, ", installer=", sbA);
        sbA.append(this.i);
        sbA.append(", buildConfiguration=");
        sbA.append(this.j);
        sbA.append(", userId=");
        return uf80.a(sbA, this.k, ")");
    }
}
