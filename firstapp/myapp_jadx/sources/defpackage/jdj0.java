package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class jdj0 {
    public final ResourceUiText a;
    public final int b;

    public jdj0(int i, ResourceUiText resourceUiText) {
        this.a = resourceUiText;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdj0)) {
            return false;
        }
        jdj0 jdj0Var = (jdj0) obj;
        return this.a.equals(jdj0Var.a) && this.b == jdj0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WinningPopupDoubleOrNothingStakeInputHintState(stakeInputHintText=" + this.a + ", stakeInputHintColorResId=" + this.b + ")";
    }
}
