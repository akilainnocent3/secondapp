package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vc8 {
    public final yzd a;
    public final boolean b;
    public final mqv c;
    public final boolean d;

    public vc8(yzd yzdVar, boolean z, mqv mqvVar, boolean z2) {
        this.a = yzdVar;
        this.b = z;
        this.c = mqvVar;
        this.d = z2;
    }

    public static vc8 a(vc8 vc8Var, yzd yzdVar, boolean z, mqv mqvVar, boolean z2, int i) {
        if ((i & 1) != 0) {
            yzdVar = vc8Var.a;
        }
        if ((i & 2) != 0) {
            z = vc8Var.b;
        }
        if ((i & 4) != 0) {
            mqvVar = vc8Var.c;
        }
        if ((i & 8) != 0) {
            z2 = vc8Var.d;
        }
        vc8Var.getClass();
        return new vc8(yzdVar, z, mqvVar, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc8)) {
            return false;
        }
        vc8 vc8Var = (vc8) obj;
        return Intrinsics.g(this.a, vc8Var.a) && this.b == vc8Var.b && Intrinsics.g(this.c, vc8Var.c) && this.d == vc8Var.d;
    }

    public final int hashCode() {
        yzd yzdVar = this.a;
        int iA = mtg0.a((yzdVar == null ? 0 : yzdVar.hashCode()) * 31, 31, this.b);
        mqv mqvVar = this.c;
        return Boolean.hashCode(this.d) + ((iA + (mqvVar != null ? Integer.hashCode(mqvVar.a) : 0)) * 31);
    }

    public final String toString() {
        return "CommonDepositDialogsState(depositFailed=" + this.a + ", isPendingDepositDialogVisible=" + this.b + ", minTierForDeposit=" + this.c + ", isDepositPendingKycCheckDialogVisible=" + this.d + ")";
    }

    public /* synthetic */ vc8(int i) {
        this(null, false, null, false);
    }

    public vc8() {
        this(0);
    }
}
