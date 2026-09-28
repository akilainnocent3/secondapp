package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k9h {
    public final UiText a;
    public final r700 b;
    public final UiText c;

    public k9h(UiText uiText, r700 r700Var, UiText uiText2) {
        uiText.getClass();
        this.a = uiText;
        this.b = r700Var;
        this.c = uiText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9h)) {
            return false;
        }
        k9h k9hVar = (k9h) obj;
        return Intrinsics.g(this.a, k9hVar.a) && this.b == k9hVar.b && Intrinsics.g(this.c, k9hVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        UiText uiText = this.c;
        return iHashCode + (uiText == null ? 0 : uiText.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FailedTransactionDialogState(channelName=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", description=");
        return plf.a(sb, this.c, ")");
    }
}
