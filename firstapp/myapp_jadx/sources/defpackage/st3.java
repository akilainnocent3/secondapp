package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class st3 {
    public final oo3 a;
    public final boolean b;
    public final nz3 c;
    public final UiText d;

    public st3(oo3 oo3Var, boolean z, nz3 nz3Var, UiText uiText) {
        oo3Var.getClass();
        this.a = oo3Var;
        this.b = z;
        this.c = nz3Var;
        this.d = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st3)) {
            return false;
        }
        st3 st3Var = (st3) obj;
        return Intrinsics.g(this.a, st3Var.a) && this.b == st3Var.b && Intrinsics.g(this.c, st3Var.c) && Intrinsics.g(this.d, st3Var.d);
    }

    public final int hashCode() {
        int iA = mtg0.a(this.a.hashCode() * 31, 31, this.b);
        nz3 nz3Var = this.c;
        int iHashCode = (iA + (nz3Var == null ? 0 : nz3Var.hashCode())) * 31;
        UiText uiText = this.d;
        return iHashCode + (uiText != null ? uiText.hashCode() : 0);
    }

    public final String toString() {
        return "BetslipSectionUiState(model=" + this.a + ", hasThemes=" + this.b + ", unlockSheet=" + this.c + ", errorText=" + this.d + ")";
    }
}
