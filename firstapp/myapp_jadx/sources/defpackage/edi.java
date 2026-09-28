package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class edi implements obi {
    public final zki a;
    public final hci b;
    public final ResourceUiText c;
    public final UiText d;
    public final UiText e;
    public final qcn<gci> f;
    public final ici g;

    public edi(zki zkiVar, hci hciVar, ResourceUiText resourceUiText, UiText uiText, UiText uiText2, qcn qcnVar, ici iciVar) {
        qcnVar.getClass();
        this.a = zkiVar;
        this.b = hciVar;
        this.c = resourceUiText;
        this.d = uiText;
        this.e = uiText2;
        this.f = qcnVar;
        this.g = iciVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edi)) {
            return false;
        }
        edi ediVar = (edi) obj;
        return this.a.equals(ediVar.a) && this.b == ediVar.b && this.c.equals(ediVar.c) && Intrinsics.g(this.d, ediVar.d) && this.e.equals(ediVar.e) && Intrinsics.g(this.f, ediVar.f) && Intrinsics.g(this.g, ediVar.g);
    }

    public final int hashCode() {
        int iA = wh8.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        UiText uiText = this.d;
        int iA2 = shu.a(this.f, yvf.a((iA + (uiText == null ? 0 : uiText.hashCode())) * 31, 31, this.e), 31);
        ici iciVar = this.g;
        return iA2 + (iciVar != null ? iciVar.hashCode() : 0);
    }

    public final String toString() {
        return "FootballFamilySettlementRunningContentState(footballLottieSimulationState=" + this.a + ", simulationExpansion=" + this.b + ", simulationExpansionUiText=" + this.c + ", speedUiText=" + this.d + ", expansionButtonUiText=" + this.e + ", myEventStates=" + this.f + ", fillingEvent=" + this.g + ")";
    }
}
