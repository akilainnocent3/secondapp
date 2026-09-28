package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jmo implements koo {
    public final UiText a;
    public final qcn<poo> b;

    public jmo(qcn qcnVar, UiText uiText) {
        uiText.getClass();
        qcnVar.getClass();
        this.a = uiText;
        this.b = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmo)) {
            return false;
        }
        jmo jmoVar = (jmo) obj;
        return Intrinsics.g(this.a, jmoVar.a) && Intrinsics.g(this.b, jmoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InstantWinTicketDetailBetBuilderSelectionContentState(titleUiText=" + this.a + ", itemStates=" + this.b + ")";
    }
}
