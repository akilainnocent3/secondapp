package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.StringUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class ev0 {
    public final StringUiText a;
    public final ConcatUiText b;

    public ev0(StringUiText stringUiText, ConcatUiText concatUiText) {
        this.a = stringUiText;
        this.b = concatUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev0)) {
            return false;
        }
        ev0 ev0Var = (ev0) obj;
        return this.a.equals(ev0Var.a) && this.b.equals(ev0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "AppliedBoostUiModel(multiplier=" + this.a + ", formattedRemainingTime=" + this.b + ")";
    }
}
