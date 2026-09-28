package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l4d0 {
    public final g5d0 a;
    public final g5d0 b;

    public l4d0(g5d0 g5d0Var, g5d0 g5d0Var2) {
        this.a = g5d0Var;
        this.b = g5d0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4d0)) {
            return false;
        }
        l4d0 l4d0Var = (l4d0) obj;
        return Intrinsics.g(this.a, l4d0Var.a) && Intrinsics.g(this.b, l4d0Var.b);
    }

    public final int hashCode() {
        g5d0 g5d0Var = this.a;
        int iHashCode = (g5d0Var == null ? 0 : g5d0Var.hashCode()) * 31;
        g5d0 g5d0Var2 = this.b;
        return iHashCode + (g5d0Var2 != null ? g5d0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "SportyPenaltyStats(leftTeam=" + this.a + ", rightTeam=" + this.b + ")";
    }
}
