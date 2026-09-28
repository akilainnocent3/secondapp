package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hl90 {
    public final String a;
    public final gl90 b;
    public final UiText c;
    public final pm90 d;
    public final yl90 e;
    public final UiText f;
    public final int g;
    public final String h;
    public final ResourceUiText i;

    public hl90(String str, gl90 gl90Var, UiText uiText, pm90 pm90Var, yl90 yl90Var, UiText uiText2, int i, String str2, ResourceUiText resourceUiText) {
        uiText.getClass();
        this.a = str;
        this.b = gl90Var;
        this.c = uiText;
        this.d = pm90Var;
        this.e = yl90Var;
        this.f = uiText2;
        this.g = i;
        this.h = str2;
        this.i = resourceUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl90)) {
            return false;
        }
        hl90 hl90Var = (hl90) obj;
        return this.a.equals(hl90Var.a) && Intrinsics.g(this.b, hl90Var.b) && Intrinsics.g(this.c, hl90Var.c) && this.d.equals(hl90Var.d) && Intrinsics.g(this.e, hl90Var.e) && this.f.equals(hl90Var.f) && this.g == hl90Var.g && this.h.equals(hl90Var.h) && this.i.equals(hl90Var.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        gl90 gl90Var = this.b;
        int iHashCode2 = (this.d.hashCode() + yvf.a((iHashCode + (gl90Var == null ? 0 : gl90Var.hashCode())) * 31, 31, this.c)) * 31;
        yl90 yl90Var = this.e;
        return this.i.hashCode() + gmf0.a(gpp.a(this.g, yvf.a((iHashCode2 + (yl90Var != null ? yl90Var.hashCode() : 0)) * 31, 31, this.f), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimulationBetHistoryCellState(ticketId=");
        sb.append(this.a);
        sb.append(", dateState=");
        sb.append(this.b);
        sb.append(", betslipTypeUiText=");
        sb.append(this.c);
        sb.append(", resultState=");
        sb.append(this.d);
        sb.append(", insureState=");
        sb.append(this.e);
        sb.append(", totalReturnUiText=");
        sb.append(this.f);
        sb.append(", totalReturnTextColorResId=");
        f78.b(this.g, ", totalStakeText=", this.h, ", roundIdUiText=", sb);
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
