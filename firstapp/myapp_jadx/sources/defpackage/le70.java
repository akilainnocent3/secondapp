package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class le70 {
    public final String a;
    public final UiText b;
    public final UiText c;
    public final qcn<ue70> d;

    public le70(String str, UiText uiText, UiText uiText2, qcn<ue70> qcnVar) {
        uiText.getClass();
        qcnVar.getClass();
        this.a = str;
        this.b = uiText;
        this.c = uiText2;
        this.d = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le70)) {
            return false;
        }
        le70 le70Var = (le70) obj;
        return this.a.equals(le70Var.a) && Intrinsics.g(this.b, le70Var.b) && this.c.equals(le70Var.c) && Intrinsics.g(this.d, le70Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + yvf.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbA = x45.a(this.b, "ScheduledFootballOverviewStatsMatchResultsCellState(leagueLogoUrl=", this.a, ", titleUiText=", ", seasonIdUiText=");
        sbA.append(this.c);
        sbA.append(", eventStates=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
