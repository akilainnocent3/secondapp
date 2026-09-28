package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k9f0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final boolean m;

    public k9f0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z) {
        qn4.b(str, str2, str3, str4, str5);
        qn4.b(str6, str7, str8, str9, str10);
        str11.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9f0)) {
            return false;
        }
        k9f0 k9f0Var = (k9f0) obj;
        return Intrinsics.g(this.a, k9f0Var.a) && Intrinsics.g(this.b, k9f0Var.b) && Intrinsics.g(this.c, k9f0Var.c) && Intrinsics.g(this.d, k9f0Var.d) && Intrinsics.g(this.e, k9f0Var.e) && Intrinsics.g(this.f, k9f0Var.f) && Intrinsics.g(this.g, k9f0Var.g) && Intrinsics.g(this.h, k9f0Var.h) && Intrinsics.g(this.i, k9f0Var.i) && Intrinsics.g(this.j, k9f0Var.j) && Intrinsics.g(this.k, k9f0Var.k) && Intrinsics.g(this.l, k9f0Var.l) && this.m == k9f0Var.m;
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        String str = this.l;
        return Boolean.hashCode(this.m) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("TeamStandingRowUiModel(competitorId=", this.a, ", rank=", this.b, ", teamName=");
        hxa.c(sbA, this.c, ", played=", this.d, ", win=");
        hxa.c(sbA, this.e, ", draw=", this.f, ", loss=");
        hxa.c(sbA, this.g, ", goalsFor=", this.h, ", goalsAgainst=");
        hxa.c(sbA, this.i, ", goalsDiff=", this.j, ", points=");
        hxa.c(sbA, this.k, ", flagUrl=", this.l, ", isFavorite=");
        return mq0.a(sbA, this.m, ")");
    }

    public /* synthetic */ k9f0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, (i & 2048) != 0 ? null : str12, false);
    }
}
