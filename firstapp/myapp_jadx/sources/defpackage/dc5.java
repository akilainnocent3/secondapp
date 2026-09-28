package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;

/* JADX INFO: loaded from: classes5.dex */
public final class dc5 {
    public final ResourceUiText a;
    public final UiText b;
    public final String c;

    public dc5(ResourceUiText resourceUiText, UiText uiText, String str) {
        this.a = resourceUiText;
        this.b = uiText;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc5)) {
            return false;
        }
        dc5 dc5Var = (dc5) obj;
        return this.a.equals(dc5Var.a) && this.b.equals(dc5Var.b) && this.c.equals(dc5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + yvf.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildAndGoBetButtonRowState(labelUiText=");
        sb.append(this.a);
        sb.append(", valueUiText=");
        sb.append(this.b);
        sb.append(", resId=");
        return uf80.a(sb, this.c, ")");
    }
}
