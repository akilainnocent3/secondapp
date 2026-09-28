package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class he70 implements rd70 {
    public final UiText a;
    public final qcn<ke70> b;

    public he70(qcn qcnVar, UiText uiText) {
        uiText.getClass();
        qcnVar.getClass();
        this.a = uiText;
        this.b = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he70)) {
            return false;
        }
        he70 he70Var = (he70) obj;
        return Intrinsics.g(this.a, he70Var.a) && Intrinsics.g(this.b, he70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ScheduledFootballOverviewStatsLeagueStandingsContentState(titleUiText=" + this.a + ", teamStates=" + this.b + ")";
    }
}
