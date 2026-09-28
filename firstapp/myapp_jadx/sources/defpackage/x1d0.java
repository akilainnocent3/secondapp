package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x1d0 {
    public static final x1d0 d = new x1d0(null, null, null);
    public final h2d0 a;
    public final e2d0 b;
    public final d2d0 c;

    public x1d0(h2d0 h2d0Var, e2d0 e2d0Var, d2d0 d2d0Var) {
        this.a = h2d0Var;
        this.b = e2d0Var;
        this.c = d2d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1d0)) {
            return false;
        }
        x1d0 x1d0Var = (x1d0) obj;
        return Intrinsics.g(this.a, x1d0Var.a) && this.b == x1d0Var.b && Intrinsics.g(this.c, x1d0Var.c);
    }

    public final int hashCode() {
        h2d0 h2d0Var = this.a;
        int iHashCode = (h2d0Var == null ? 0 : h2d0Var.hashCode()) * 31;
        e2d0 e2d0Var = this.b;
        int iHashCode2 = (iHashCode + (e2d0Var == null ? 0 : e2d0Var.hashCode())) * 31;
        d2d0 d2d0Var = this.c;
        return iHashCode2 + (d2d0Var != null ? d2d0Var.hashCode() : 0);
    }

    public final String toString() {
        return "SportyPenaltySettlementAnimationState(kickingVisualState=" + this.a + ", kickingPostAnimationType=" + this.b + ", kickingEndAnimationType=" + this.c + ")";
    }
}
