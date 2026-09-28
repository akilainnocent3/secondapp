package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zlc0 {
    public final vlc0 a;
    public final slc0 b;

    public zlc0(vlc0 vlc0Var, slc0 slc0Var) {
        vlc0Var.getClass();
        slc0Var.getClass();
        this.a = vlc0Var;
        this.b = slc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlc0)) {
            return false;
        }
        zlc0 zlc0Var = (zlc0) obj;
        return this.a == zlc0Var.a && Intrinsics.g(this.b, zlc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SportyLegendsSettlementUiState(currentStage=" + this.a + ", runningPageState=" + this.b + ")";
    }
}
