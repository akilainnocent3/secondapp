package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class fn90 {
    public final bt90 a;

    public fn90(bt90 bt90Var) {
        this.a = bt90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fn90) && this.a.equals(((fn90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SimulationHowToPlayUiState(topBarState=" + this.a + ")";
    }
}
