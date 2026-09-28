package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class np40 {
    public final ijf0 a;
    public final boolean b;
    public final UiText c;

    public /* synthetic */ np40(int i) {
        this(new ijf0((String) null, 0L, 7), false, null);
    }

    public static np40 a(np40 np40Var, ijf0 ijf0Var, boolean z, UiText uiText, int i) {
        if ((i & 1) != 0) {
            ijf0Var = np40Var.a;
        }
        if ((i & 2) != 0) {
            z = np40Var.b;
        }
        if ((i & 4) != 0) {
            uiText = np40Var.c;
        }
        np40Var.getClass();
        ijf0Var.getClass();
        return new np40(ijf0Var, z, uiText);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np40)) {
            return false;
        }
        np40 np40Var = (np40) obj;
        return Intrinsics.g(this.a, np40Var.a) && this.b == np40Var.b && Intrinsics.g(this.c, np40Var.c);
    }

    public final int hashCode() {
        int iA = mtg0.a(this.a.hashCode() * 31, 31, this.b);
        UiText uiText = this.c;
        return iA + (uiText == null ? 0 : uiText.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RedeemCodeUiState(code=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", inlineError=");
        return plf.a(sb, this.c, ")");
    }

    public np40(ijf0 ijf0Var, boolean z, UiText uiText) {
        this.a = ijf0Var;
        this.b = z;
        this.c = uiText;
    }

    public np40() {
        this(0);
    }
}
