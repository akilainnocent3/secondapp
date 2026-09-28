package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j24 {
    public final UiText a;
    public final UiText b;
    public final UiText c;

    public j24(UiText uiText, UiText uiText2, UiText uiText3) {
        uiText.getClass();
        uiText2.getClass();
        uiText3.getClass();
        this.a = uiText;
        this.b = uiText2;
        this.c = uiText3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j24)) {
            return false;
        }
        j24 j24Var = (j24) obj;
        return Intrinsics.g(this.a, j24Var.a) && Intrinsics.g(this.b, j24Var.b) && Intrinsics.g(this.c, j24Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + yvf.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return plf.a(uh8.a(this.a, this.b, "BettingStreakMissionBottomSheetUiState(title=", ", description=", ", buttonText="), this.c, ")");
    }

    public j24() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j24(int i) {
        StringUiText stringUiText = vch0.a;
        this(stringUiText, stringUiText, stringUiText);
    }
}
