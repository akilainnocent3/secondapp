package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class np90 {
    public final mp90 a;
    public final UiText b;
    public final String c;
    public final String d;

    public np90(mp90 mp90Var, UiText uiText, String str, String str2) {
        uiText.getClass();
        this.a = mp90Var;
        this.b = uiText;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np90)) {
            return false;
        }
        np90 np90Var = (np90) obj;
        return Intrinsics.g(this.a, np90Var.a) && Intrinsics.g(this.b, np90Var.b) && this.c.equals(np90Var.c) && this.d.equals(np90Var.d);
    }

    public final int hashCode() {
        mp90 mp90Var = this.a;
        return this.d.hashCode() + gmf0.a(yvf.a((mp90Var == null ? 0 : mp90Var.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimulationSettlementSelectionState(resultState=");
        sb.append(this.a);
        sb.append(", titleUiText=");
        sb.append(this.b);
        sb.append(", marketTitleText=");
        return kwi.a(sb, this.c, ", oddsText=", this.d, ")");
    }
}
