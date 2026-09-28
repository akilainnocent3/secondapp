package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gu3 implements ut3 {
    public final String a;
    public final String b;
    public final UiText c;

    public gu3(UiText uiText, String str, String str2) {
        str.getClass();
        uiText.getClass();
        this.a = str;
        this.b = str2;
        this.c = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu3)) {
            return false;
        }
        gu3 gu3Var = (gu3) obj;
        return Intrinsics.g(this.a, gu3Var.a) && this.b.equals(gu3Var.b) && Intrinsics.g(this.c, gu3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(gpp.a(R.drawable.ic__sports__football, gpp.a(R.color.text_primary, this.a.hashCode() * 31, 31), 31), 31, this.b);
    }

    public final String toString() {
        return plf.a(ux5.a("BetslipSelectionPenaltyContentState(oddsText=", this.a, ", oddsTextColorResId=2131101788, sportIconResId=2131231771, outcomeDescription=", this.b, ", teamUiText="), this.c, ")");
    }
}
