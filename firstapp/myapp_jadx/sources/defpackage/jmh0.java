package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jmh0 {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;
    public final String f;

    public jmh0(String str, String str2, String str3, Integer num, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmh0)) {
            return false;
        }
        jmh0 jmh0Var = (jmh0) obj;
        return this.a.equals(jmh0Var.a) && this.b.equals(jmh0Var.b) && Intrinsics.g(this.c, jmh0Var.c) && Intrinsics.g(this.d, jmh0Var.d) && Intrinsics.g(this.e, jmh0Var.e) && this.f.equals(jmh0Var.f);
    }

    public final int hashCode() {
        int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("UpsellBannerGame(id=", this.a, ", name=", this.b, ", iconUrl=");
        oie.a(this.d, this.c, ", onlineUserCount=", ", deepLinkUrl=", sbA);
        return kwi.a(sbA, this.e, ", category=", this.f, ")");
    }
}
