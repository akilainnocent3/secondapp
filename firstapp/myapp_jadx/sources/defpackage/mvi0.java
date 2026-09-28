package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class mvi0 {
    public final ovi0 a;
    public final nvi0 b;
    public final uf00<gsi0> c;
    public final hsi0 d;

    public mvi0(ovi0 ovi0Var, nvi0 nvi0Var, uf00<gsi0> uf00Var, hsi0 hsi0Var) {
        ovi0Var.getClass();
        nvi0Var.getClass();
        uf00Var.getClass();
        hsi0Var.getClass();
        this.a = ovi0Var;
        this.b = nvi0Var;
        this.c = uf00Var;
        this.d = hsi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvi0)) {
            return false;
        }
        mvi0 mvi0Var = (mvi0) obj;
        return Intrinsics.g(this.a, mvi0Var.a) && Intrinsics.g(this.b, mvi0Var.b) && Intrinsics.g(this.c, mvi0Var.c) && Intrinsics.g(this.d, mvi0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + yvz.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "WDWheelPanelState(wheelState=" + this.a + ", wheelResult=" + this.b + ", multipliers=" + this.c + ", multiplierHint=" + this.d + ')';
    }

    public mvi0() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mvi0(int i) {
        n1a0 n1a0Var = n1a0.c;
        this(new ovi0.a(n1a0Var, 0.0f), nvi0.a.a, n1a0Var, hsi0.a.a);
    }
}
