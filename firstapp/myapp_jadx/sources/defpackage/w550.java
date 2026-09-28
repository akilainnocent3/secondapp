package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w550 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public w550(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w550)) {
            return false;
        }
        w550 w550Var = (w550) obj;
        return Intrinsics.g(this.a, w550Var.a) && Intrinsics.g(this.b, w550Var.b) && Intrinsics.g(this.c, w550Var.c) && Intrinsics.g(this.d, w550Var.d) && Intrinsics.g(this.e, w550Var.e) && Intrinsics.g(this.f, w550Var.f) && Intrinsics.g(this.g, w550Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("RemixPickUiState(iconUrl=", this.a, ", outcome=", this.b, ", market=");
        hxa.c(sbA, this.c, ", home=", this.d, ", away=");
        hxa.c(sbA, this.e, ", timeText=", this.f, ", oddText=");
        return uf80.a(sbA, this.g, ")");
    }
}
