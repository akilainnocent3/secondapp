package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a07 {
    public final UiText a;
    public final UiText b;

    public a07(UiText uiText, UiText uiText2) {
        uiText.getClass();
        uiText2.getClass();
        this.a = uiText;
        this.b = uiText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a07)) {
            return false;
        }
        a07 a07Var = (a07) obj;
        return Intrinsics.g(this.a, a07Var.a) && Intrinsics.g(this.b, a07Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChallengeEmptyStateUiModel(title=" + this.a + ", subtitle=" + this.b + ")";
    }
}
