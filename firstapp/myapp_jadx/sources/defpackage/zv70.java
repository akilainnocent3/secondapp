package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class zv70 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public zv70(String str, String str2, String str3, String str4, String str5) {
        qn4.b(str, str2, str3, str4, str5);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv70)) {
            return false;
        }
        zv70 zv70Var = (zv70) obj;
        return Intrinsics.g(this.a, zv70Var.a) && Intrinsics.g(this.b, zv70Var.b) && Intrinsics.g(this.c, zv70Var.c) && Intrinsics.g(this.d, zv70Var.d) && Intrinsics.g(this.e, zv70Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SearchGame(gameId=", this.a, ", gameName=", this.b, ", gameCategory=");
        hxa.c(sbA, this.c, ", gameIcon=", this.d, ", gameLink=");
        return uf80.a(sbA, this.e, ")");
    }
}
