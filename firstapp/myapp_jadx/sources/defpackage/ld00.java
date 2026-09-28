package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ld00 {
    public final UiText a;
    public final UiText b;
    public final UiText c;
    public final UiText d;
    public final UiText e;
    public final UiText f;
    public final UiText g;

    public ld00(UiText uiText, UiText uiText2, UiText uiText3, UiText uiText4, UiText uiText5, UiText uiText6, UiText uiText7) {
        this.a = uiText;
        this.b = uiText2;
        this.c = uiText3;
        this.d = uiText4;
        this.e = uiText5;
        this.f = uiText6;
        this.g = uiText7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld00)) {
            return false;
        }
        ld00 ld00Var = (ld00) obj;
        return this.a.equals(ld00Var.a) && this.b.equals(ld00Var.b) && this.c.equals(ld00Var.c) && Intrinsics.g(this.d, ld00Var.d) && this.e.equals(ld00Var.e) && this.f.equals(ld00Var.f) && Intrinsics.g(this.g, ld00Var.g);
    }

    public final int hashCode() {
        int iA = yvf.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        UiText uiText = this.d;
        int iA2 = yvf.a(yvf.a((iA + (uiText == null ? 0 : uiText.hashCode())) * 31, 31, this.e), 31, this.f);
        UiText uiText2 = this.g;
        return iA2 + (uiText2 != null ? uiText2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = uh8.a(this.a, this.b, "PendingTransactionTexts(title=", ", message=", ", tooltip=");
        vh8.a(sbA, this.c, ", tooltipUssdNumberUiText=", this.d, ", primaryButtonText=");
        vh8.a(sbA, this.e, ", secondaryButtonText=", this.f, ", ussdDialCode=");
        return plf.a(sbA, this.g, ")");
    }
}
