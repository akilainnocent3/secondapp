package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class dse0 {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final mze0 g;

    public dse0(int i, String str, String str2, boolean z, boolean z2, boolean z3, mze0 mze0Var) {
        str.getClass();
        str2.getClass();
        mze0Var.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = mze0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dse0)) {
            return false;
        }
        dse0 dse0Var = (dse0) obj;
        return this.a == dse0Var.a && Intrinsics.g(this.b, dse0Var.b) && Intrinsics.g(this.c, dse0Var.c) && this.d == dse0Var.d && this.e == dse0Var.e && this.f == dse0Var.f && Intrinsics.g(this.g, dse0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + mtg0.a(mtg0.a(mtg0.a(gmf0.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "TGAnimationUIState(caveIndex=" + this.a + ", maxMultiplier=" + this.b + ", hitRate=" + this.c + ", isLocked=" + this.d + ", hasCollection=" + this.e + ", caveSwitchEnable=" + this.f + ", result=" + this.g + ')';
    }

    public dse0() {
        this(0);
    }

    public /* synthetic */ dse0(int i) {
        this(0, "", "", false, false, true, mze0.c.a);
    }
}
