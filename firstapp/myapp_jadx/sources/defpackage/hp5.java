package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hp5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public hp5(String str, String str2, String str3, String str4, String str5, String str6) {
        wd7.a(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp5)) {
            return false;
        }
        hp5 hp5Var = (hp5) obj;
        return Intrinsics.g(this.a, hp5Var.a) && Intrinsics.g(this.b, hp5Var.b) && Intrinsics.g(this.c, hp5Var.c) && Intrinsics.g(this.d, hp5Var.d) && Intrinsics.g(this.e, hp5Var.e) && Intrinsics.g(this.f, hp5Var.f);
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("CMSResponseEntity(key=", this.a, ", page=", this.b, ", countryCode=");
        hxa.c(sbA, this.c, ", locale=", this.d, ", value=");
        return kwi.a(sbA, this.e, ", type=", this.f, ")");
    }
}
