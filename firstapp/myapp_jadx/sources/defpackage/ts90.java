package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ts90 {
    public final bt90 a;
    public final rr90 b;
    public final cr90 c;
    public final hr90 d;
    public final slo e;

    public ts90(bt90 bt90Var, rr90 rr90Var, cr90 cr90Var, hr90 hr90Var, slo sloVar) {
        this.a = bt90Var;
        this.b = rr90Var;
        this.c = cr90Var;
        this.d = hr90Var;
        this.e = sloVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts90)) {
            return false;
        }
        ts90 ts90Var = (ts90) obj;
        return this.a.equals(ts90Var.a) && this.b.equals(ts90Var.b) && this.c.equals(ts90Var.c) && this.d.equals(ts90Var.d) && Intrinsics.g(this.e, ts90Var.e);
    }

    public final int hashCode() {
        int iA = gmf0.a(shu.a(this.c.a, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d.a);
        slo sloVar = this.e;
        return iA + (sloVar == null ? 0 : sloVar.hashCode());
    }

    public final String toString() {
        return "SimulationTicketDetailUiState(topBarState=" + this.a + ", headerState=" + this.b + ", contentState=" + this.c + ", footerState=" + this.d + ", selectionDescriptionBottomSheetState=" + this.e + ")";
    }
}
