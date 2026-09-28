package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;

/* JADX INFO: loaded from: classes5.dex */
public final class yzd {
    public final ResourceUiText a;
    public final UiText b;

    public yzd(ResourceUiText resourceUiText, UiText uiText) {
        this.a = resourceUiText;
        this.b = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzd)) {
            return false;
        }
        yzd yzdVar = (yzd) obj;
        return this.a.equals(yzdVar.a) && this.b.equals(yzdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DepositFailedDialogState(title=" + this.a + ", message=" + this.b + ")";
    }
}
