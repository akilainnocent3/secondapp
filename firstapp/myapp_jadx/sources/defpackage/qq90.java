package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class qq90 {
    public final rn90 a;

    public qq90(rn90 rn90Var) {
        this.a = rn90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qq90) && this.a.equals(((qq90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SimulationSettlementUiState(contentState=" + this.a + ")";
    }
}
