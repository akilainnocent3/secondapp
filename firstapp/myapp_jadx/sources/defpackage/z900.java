package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z900 {
    public final UiText a;
    public final boolean b;

    public z900(UiText uiText, boolean z) {
        uiText.getClass();
        this.a = uiText;
        this.b = z;
    }

    public static z900 a(z900 z900Var, UiText uiText) {
        boolean z = z900Var.b;
        z900Var.getClass();
        uiText.getClass();
        return new z900(uiText, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z900)) {
            return false;
        }
        z900 z900Var = (z900) obj;
        return Intrinsics.g(this.a, z900Var.a) && this.b == z900Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentTextFieldErrorState(text=" + this.a + ", isClickable=" + this.b + ")";
    }

    public z900() {
        this(3, (StringUiText) null);
    }

    public z900(int i, StringUiText stringUiText) {
        this((UiText) ((i & 1) != 0 ? vch0.a : stringUiText), false);
    }
}
