package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xt3 {
    public final String a;
    public final UiText b;

    public xt3(UiText uiText, String str) {
        uiText.getClass();
        this.a = str;
        this.b = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt3)) {
            return false;
        }
        xt3 xt3Var = (xt3) obj;
        return this.a.equals(xt3Var.a) && Intrinsics.g(this.b, xt3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BetslipSelectionGroupTitleState(iconUrl=" + this.a + ", uiText=" + this.b + ")";
    }
}
