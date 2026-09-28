package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sm90 {
    public final bt90 a;
    public final ll90 b;

    public sm90(bt90 bt90Var, ll90 ll90Var) {
        ll90Var.getClass();
        this.a = bt90Var;
        this.b = ll90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm90)) {
            return false;
        }
        sm90 sm90Var = (sm90) obj;
        return this.a.equals(sm90Var.a) && Intrinsics.g(this.b, sm90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SimulationBetHistoryUiState(topBarState=" + this.a + ", contentState=" + this.b + ")";
    }
}
