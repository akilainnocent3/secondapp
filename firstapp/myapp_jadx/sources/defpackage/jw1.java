package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jw1 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final Boolean g;
    public final Integer h;
    public final boolean i;
    public final boolean j;
    public final String k;

    public /* synthetic */ jw1(int i, String str, String str2, String str3, boolean z, boolean z2, Boolean bool, Integer num, boolean z3, boolean z4, String str4, int i2) {
        this(i, str, str2, str3, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, bool, num, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? false : z4, (i2 & 1024) != 0 ? "" : str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw1)) {
            return false;
        }
        jw1 jw1Var = (jw1) obj;
        return this.a == jw1Var.a && Intrinsics.g(this.b, jw1Var.b) && Intrinsics.g(this.c, jw1Var.c) && Intrinsics.g(this.d, jw1Var.d) && this.e == jw1Var.e && this.f == jw1Var.f && Intrinsics.g(this.g, jw1Var.g) && Intrinsics.g(this.h, jw1Var.h) && this.i == jw1Var.i && this.j == jw1Var.j && Intrinsics.g(this.k, jw1Var.k);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iA = mtg0.a(mtg0.a((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e), 31, this.f);
        Boolean bool = this.g;
        int iHashCode4 = (iA + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.h;
        return this.k.hashCode() + mtg0.a(mtg0.a((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31, 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "BankInfo(bankId=", ", bankCode=", this.b, ", bankName=");
        hxa.c(sbA, this.c, ", bankIconUrl=", this.d, ", isDisabled=");
        nng.a(", isEasyBankAccount=", ", ranked=", sbA, this.e, this.f);
        sbA.append(this.g);
        sbA.append(", rank=");
        sbA.append(this.h);
        sbA.append(", lastUsed=");
        nng.a(", isRecommended=", ", description=", sbA, this.i, this.j);
        return uf80.a(sbA, this.k, ")");
    }

    public jw1(int i, String str, String str2, String str3, boolean z, boolean z2, Boolean bool, Integer num, boolean z3, boolean z4, String str4) {
        str4.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = bool;
        this.h = num;
        this.i = z3;
        this.j = z4;
        this.k = str4;
    }
}
