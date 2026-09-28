package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ru3 implements ut3 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;
    public final UiText f;

    public ru3(String str, int i, int i2, String str2, int i3, UiText uiText) {
        str.getClass();
        uiText.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru3)) {
            return false;
        }
        ru3 ru3Var = (ru3) obj;
        return Intrinsics.g(this.a, ru3Var.a) && this.b == ru3Var.b && this.c == ru3Var.c && this.d.equals(ru3Var.d) && this.e == ru3Var.e && Intrinsics.g(this.f, ru3Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + gpp.a(this.e, gmf0.a(gpp.a(this.c, gpp.a(R.drawable.ic__sports__football, gpp.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "BetslipSelectionScheduledFootballContentState(oddsText=", this.a, ", oddsTextColorResId=", ", sportIconResId=2131231771, sportIconTintResId=");
        f78.b(this.c, ", outcomeDescriptionText=", this.d, ", outcomeDescriptionTextColorResId=", sbA);
        sbA.append(this.e);
        sbA.append(", teamUiText=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
