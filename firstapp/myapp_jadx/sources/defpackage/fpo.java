package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fpo {
    public final fqo a;
    public final bno b;
    public final slo c;

    public fpo(fqo fqoVar, bno bnoVar, slo sloVar) {
        bnoVar.getClass();
        this.a = fqoVar;
        this.b = bnoVar;
        this.c = sloVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpo)) {
            return false;
        }
        fpo fpoVar = (fpo) obj;
        return Intrinsics.g(this.a, fpoVar.a) && Intrinsics.g(this.b, fpoVar.b) && Intrinsics.g(this.c, fpoVar.c);
    }

    public final int hashCode() {
        fqo fqoVar = this.a;
        int iHashCode = (this.b.hashCode() + ((fqoVar == null ? 0 : fqoVar.hashCode()) * 31)) * 31;
        slo sloVar = this.c;
        return iHashCode + (sloVar != null ? sloVar.hashCode() : 0);
    }

    public final String toString() {
        return "InstantWinTicketDetailUiState(topAppBarState=" + this.a + ", contentStatus=" + this.b + ", selectionDescriptionBottomSheetState=" + this.c + ")";
    }
}
