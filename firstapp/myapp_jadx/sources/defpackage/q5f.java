package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q5f {
    public static final q5f c = new q5f(null, 1.0f);
    public final UiText a;
    public final float b;

    public q5f(ResourceUiText resourceUiText, float f) {
        this.a = resourceUiText;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5f)) {
            return false;
        }
        q5f q5fVar = (q5f) obj;
        return Intrinsics.g(this.a, q5fVar.a) && Float.compare(this.b, q5fVar.b) == 0;
    }

    public final int hashCode() {
        UiText uiText = this.a;
        return Float.hashCode(this.b) + ((uiText == null ? 0 : uiText.hashCode()) * 31);
    }

    public final String toString() {
        return "DoubleOrNothingTimerBarState(hintUiText=" + this.a + ", progress=" + this.b + ")";
    }
}
