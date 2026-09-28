package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class gd3 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public gd3(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd3)) {
            return false;
        }
        gd3 gd3Var = (gd3) obj;
        return Intrinsics.g(this.a, gd3Var.a) && this.b == gd3Var.b && this.c == gd3Var.c && this.d == gd3Var.d && this.e == gd3Var.e && this.f == gd3Var.f && this.g == gd3Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbA = z620.a("BetUiChecklistRow(stateKey=", this.a, ", expectBetVisible=", ", expectBetClickEnabled=", this.b);
        nng.a(", expectCashoutVisible=", ", expectCashoutClickEnabled=", sbA, this.c, this.d);
        nng.a(", expectCancelVisible=", ", expectCancelClickEnabled=", sbA, this.e, this.f);
        return mq0.a(sbA, this.g, ")");
    }
}
