package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tsd0 {
    public final int a;
    public final int b;
    public final boolean c;
    public final qcn<rkd0> d;

    public tsd0(int i, int i2, boolean z, qcn<rkd0> qcnVar) {
        qcnVar.getClass();
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsd0)) {
            return false;
        }
        tsd0 tsd0Var = (tsd0) obj;
        return this.a == tsd0Var.a && this.b == tsd0Var.b && this.c == tsd0Var.c && Intrinsics.g(this.d, tsd0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + mtg0.a(gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbA = dy5.a("StakeKeyboardUiState(quickStakeToolStatus=", this.a, this.b, ", checkBoxStatus=", ", hasError=");
        sbA.append(this.c);
        sbA.append(", quickStakes=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }

    public tsd0() {
        this(0);
    }

    public tsd0(int i) {
        this(1, 3, false, n1a0.c);
    }
}
