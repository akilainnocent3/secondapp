package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class om90 implements ll90 {
    public final ArrayList a;

    public om90(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof om90) && this.a.equals(((om90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SimulationBetHistoryTicketListContentState(cellStates=" + this.a + ")";
    }
}
