package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class rrj0 {
    public final ResourceUiText a;
    public final StringUiText b;

    public rrj0(ResourceUiText resourceUiText, StringUiText stringUiText) {
        this.a = resourceUiText;
        this.b = stringUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrj0)) {
            return false;
        }
        rrj0 rrj0Var = (rrj0) obj;
        return this.a.equals(rrj0Var.a) && this.b.equals(rrj0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WithdrawableBalanceState(label=" + this.a + ", text=" + this.b + ")";
    }
}
