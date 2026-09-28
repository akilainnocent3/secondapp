package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class erf0 {
    public final tsf0 a;
    public final tsf0 b;
    public final String c;
    public final krf0 d;
    public final ev0 e;

    public erf0(tsf0 tsf0Var, tsf0 tsf0Var2, String str, krf0 krf0Var, ev0 ev0Var) {
        str.getClass();
        krf0Var.getClass();
        this.a = tsf0Var;
        this.b = tsf0Var2;
        this.c = str;
        this.d = krf0Var;
        this.e = ev0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erf0)) {
            return false;
        }
        erf0 erf0Var = (erf0) obj;
        return this.a.equals(erf0Var.a) && this.b.equals(erf0Var.b) && Intrinsics.g(this.c, erf0Var.c) && this.d == erf0Var.d && Intrinsics.g(this.e, erf0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + gmf0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31;
        ev0 ev0Var = this.e;
        return iHashCode + (ev0Var == null ? 0 : ev0Var.hashCode());
    }

    public final String toString() {
        return "WagerProgress(monthlyWager=" + this.a + ", lifetimeWager=" + this.b + ", currency=" + this.c + ", tier=" + this.d + ", boostInfo=" + this.e + ")";
    }
}
