package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a2g0 {
    public final UiText a;
    public final UiText b;

    public a2g0(UiText uiText, UiText uiText2) {
        uiText.getClass();
        uiText2.getClass();
        this.a = uiText;
        this.b = uiText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2g0)) {
            return false;
        }
        a2g0 a2g0Var = (a2g0) obj;
        return Intrinsics.g(this.a, a2g0Var.a) && Intrinsics.g(this.b, a2g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TopUpAction(ussdCodeUiText=" + this.a + ", appLinkUiText=" + this.b + ")";
    }
}
