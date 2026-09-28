package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a770 {
    public final UiText a;
    public final UiText b;
    public final UiText c;
    public final boolean d;

    public a770(UiText uiText, UiText uiText2, UiText uiText3, boolean z) {
        this.a = uiText;
        this.b = uiText2;
        this.c = uiText3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a770)) {
            return false;
        }
        a770 a770Var = (a770) obj;
        return this.a.equals(a770Var.a) && Intrinsics.g(this.b, a770Var.b) && this.c.equals(a770Var.c) && this.d == a770Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        UiText uiText = this.b;
        return Boolean.hashCode(this.d) + yvf.a((iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sbA = uh8.a(this.a, this.b, "ScheduledFootballKickoffCellHeaderState(primaryUiText=", ", secondaryUiText=", ", tertiaryUiText=");
        sbA.append(this.c);
        sbA.append(", shouldShowLoading=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
