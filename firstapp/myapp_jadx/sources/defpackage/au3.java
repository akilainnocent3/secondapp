package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class au3 implements ut3 {
    public final String a;
    public final String b;
    public final UiText c;

    public au3(UiText uiText, String str, String str2) {
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
        if (!(obj instanceof au3)) {
            return false;
        }
        au3 au3Var = (au3) obj;
        return Intrinsics.g(this.a, au3Var.a) && this.b.equals(au3Var.b) && Intrinsics.g(this.c, au3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(gpp.a(R.drawable.ic__sports__football, gpp.a(R.color.text_primary, this.a.hashCode() * 31, 31), 31), 31, this.b);
    }

    public final String toString() {
        return plf.a(ux5.a("BetslipSelectionLegendsContentState(oddsText=", this.a, ", oddsTextColorResId=2131101788, sportIconResId=2131231771, outcomeDescription=", this.b, ", teamUiText="), this.c, ")");
    }
}
