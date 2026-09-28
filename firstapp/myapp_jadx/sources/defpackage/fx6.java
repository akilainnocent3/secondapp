package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fx6 {
    public final UiText a;
    public final String b;
    public final UiText c;
    public final UiText d;

    public fx6(UiText uiText, UiText uiText2, UiText uiText3, String str) {
        uiText.getClass();
        uiText2.getClass();
        uiText3.getClass();
        this.a = uiText;
        this.b = str;
        this.c = uiText2;
        this.d = uiText3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx6)) {
            return false;
        }
        fx6 fx6Var = (fx6) obj;
        return Intrinsics.g(this.a, fx6Var.a) && Intrinsics.g(this.b, fx6Var.b) && Intrinsics.g(this.c, fx6Var.c) && Intrinsics.g(this.d, fx6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + yvf.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "ChallengeAnnouncementBottomSheetUiState(title=" + this.a + ", imgUrl=" + this.b + ", description=" + this.c + ", buttonText=" + this.d + ")";
    }

    public fx6() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public fx6(int i) {
        StringUiText stringUiText = vch0.a;
        this(stringUiText, stringUiText, stringUiText, "");
    }
}
