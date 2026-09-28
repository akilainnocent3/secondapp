package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.widget.HintView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o200 {
    public final UiText a;
    public final HintView.a b;

    public /* synthetic */ o200(int i, UiText uiText) {
        this((i & 1) != 0 ? null : uiText, HintView.a.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o200)) {
            return false;
        }
        o200 o200Var = (o200) obj;
        return Intrinsics.g(this.a, o200Var.a) && this.b == o200Var.b;
    }

    public final int hashCode() {
        UiText uiText = this.a;
        return this.b.hashCode() + ((uiText == null ? 0 : uiText.hashCode()) * 31);
    }

    public final String toString() {
        return "PayHintAndAlertUiState(content=" + this.a + ", type=" + this.b + ")";
    }

    public o200(UiText uiText, HintView.a aVar) {
        this.a = uiText;
        this.b = aVar;
    }

    public o200() {
        this(3, (UiText) null);
    }
}
