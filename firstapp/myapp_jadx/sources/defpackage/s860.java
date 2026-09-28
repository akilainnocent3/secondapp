package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s860 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final o860 i;

    public s860(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, o860 o860Var) {
        str3.getClass();
        str4.getClass();
        o860Var.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = o860Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s860)) {
            return false;
        }
        s860 s860Var = (s860) obj;
        return this.a == s860Var.a && Intrinsics.g(this.b, s860Var.b) && Intrinsics.g(this.c, s860Var.c) && Intrinsics.g(this.d, s860Var.d) && Intrinsics.g(this.e, s860Var.e) && this.f == s860Var.f && this.g == s860Var.g && this.h == s860Var.h && Intrinsics.g(this.i, s860Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + mtg0.a(mtg0.a(mtg0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        return "SBBetHistoryItemState(id=" + this.a + ", time=" + this.b + ", date=" + this.c + ", stake=" + this.d + ", result=" + this.e + ", isWin=" + this.f + ", hasGift=" + this.g + ", hasExtraBall=" + this.h + ", detail=" + this.i + ')';
    }

    public s860() {
        this(-1, "", "", "", "", true, false, false, o860.a.a);
    }
}
