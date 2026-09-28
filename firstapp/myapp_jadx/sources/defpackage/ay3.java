package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ay3 {
    public final UiText a;
    public final UiText b;
    public final int c;
    public final UiText d;
    public final by3 e;

    public ay3(UiText uiText, UiText uiText2, int i, UiText uiText3, by3 by3Var) {
        uiText.getClass();
        uiText2.getClass();
        uiText3.getClass();
        this.a = uiText;
        this.b = uiText2;
        this.c = i;
        this.d = uiText3;
        this.e = by3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay3)) {
            return false;
        }
        ay3 ay3Var = (ay3) obj;
        return Intrinsics.g(this.a, ay3Var.a) && Intrinsics.g(this.b, ay3Var.b) && this.c == ay3Var.c && Intrinsics.g(this.d, ay3Var.d) && this.e == ay3Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + yvf.a(gpp.a(this.c, yvf.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = uh8.a(this.a, this.b, "BetslipThemeMissionBottomSheetUiState(title=", ", imgUrl=", ", contentRes=");
        sbA.append(this.c);
        sbA.append(", buttonText=");
        sbA.append(this.d);
        sbA.append(", variant=");
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }

    public ay3() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ay3(int i) {
        StringUiText stringUiText = vch0.a;
        this(stringUiText, stringUiText, R.string.page_loyalty__popup_betslip_mission_invite_content, stringUiText, by3.a);
    }
}
