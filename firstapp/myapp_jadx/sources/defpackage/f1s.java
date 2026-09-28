package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f1s {
    public final String a;
    public final Integer b;
    public final double c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;

    public f1s(String str, Integer num, double d, String str2, String str3, String str4, String str5, boolean z) {
        str.getClass();
        this.a = str;
        this.b = num;
        this.c = d;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1s)) {
            return false;
        }
        f1s f1sVar = (f1s) obj;
        return Intrinsics.g(this.a, f1sVar.a) && Intrinsics.g(this.b, f1sVar.b) && Double.compare(this.c, f1sVar.c) == 0 && Intrinsics.g(this.d, f1sVar.d) && Intrinsics.g(this.e, f1sVar.e) && Intrinsics.g(this.f, f1sVar.f) && Intrinsics.g(this.g, f1sVar.g) && this.h == f1sVar.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iA = nrg0.a((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
        String str = this.d;
        int iHashCode2 = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return Boolean.hashCode(this.h) + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ew7.a(this.b, "LeaderboardEntry(userId=", this.a, ", ranking=", ", accumulatedAmount=");
        fwv.a(this.c, ", nickname=", this.d, sbA);
        hxa.c(sbA, ", phone=", this.e, ", email=", this.f);
        sbA.append(", avatar=");
        sbA.append(this.g);
        sbA.append(", isSelf=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}
