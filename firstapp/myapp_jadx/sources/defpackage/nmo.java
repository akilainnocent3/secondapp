package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nmo implements omo {
    public final nno a;
    public final qcn<voo> b;
    public final ResourceUiText c;
    public final qcn<rmo> d;

    public nmo(nno nnoVar, qcn qcnVar, ResourceUiText resourceUiText, qcn qcnVar2) {
        qcnVar.getClass();
        this.a = nnoVar;
        this.b = qcnVar;
        this.c = resourceUiText;
        this.d = qcnVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmo)) {
            return false;
        }
        nmo nmoVar = (nmo) obj;
        return Intrinsics.g(this.a, nmoVar.a) && Intrinsics.g(this.b, nmoVar.b) && this.c.equals(nmoVar.c) && Intrinsics.g(this.d, nmoVar.d);
    }

    public final int hashCode() {
        nno nnoVar = this.a;
        int iA = wh8.a(shu.a(this.b, (nnoVar == null ? 0 : nnoVar.hashCode()) * 31, 31), 31, this.c);
        qcn<rmo> qcnVar = this.d;
        return iA + (qcnVar != null ? qcnVar.hashCode() : 0);
    }

    public final String toString() {
        return "InstantWinTicketDetailBetCellState(groupState=" + this.a + ", selectionStates=" + this.b + ", betGroupIdUiText=" + this.c + ", comboDetailStates=" + this.d + ")";
    }
}
