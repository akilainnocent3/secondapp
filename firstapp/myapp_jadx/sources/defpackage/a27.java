package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a27 {
    public final int a;
    public final UiText b;
    public final String c;

    public a27(String str, UiText uiText, int i) {
        uiText.getClass();
        str.getClass();
        this.a = i;
        this.b = uiText;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a27)) {
            return false;
        }
        a27 a27Var = (a27) obj;
        return this.a == a27Var.a && Intrinsics.g(this.b, a27Var.b) && Intrinsics.g(this.c, a27Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + yvf.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChallengePrizeUiModel(iconRes=");
        sb.append(this.a);
        sb.append(", label=");
        sb.append(this.b);
        sb.append(", content=");
        return uf80.a(sb, this.c, ")");
    }
}
