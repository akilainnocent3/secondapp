package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dtv {
    public final UiText a;
    public final float b;
    public final ctv c;
    public final UiText d;

    public dtv(UiText uiText, float f, ctv ctvVar, ResourceUiText resourceUiText) {
        uiText.getClass();
        this.a = uiText;
        this.b = f;
        this.c = ctvVar;
        this.d = resourceUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtv)) {
            return false;
        }
        dtv dtvVar = (dtv) obj;
        return Intrinsics.g(this.a, dtvVar.a) && Float.compare(this.b, dtvVar.b) == 0 && this.c == dtvVar.c && Intrinsics.g(this.d, dtvVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + tvh.a(this.b, this.a.hashCode() * 31, 31)) * 31;
        UiText uiText = this.d;
        return iHashCode + (uiText == null ? 0 : uiText.hashCode());
    }

    public final String toString() {
        return "MissionProgressUiData(requireTargetAmount=" + this.a + ", progressPercentage=" + this.b + ", progressState=" + this.c + ", alertMessage=" + this.d + ")";
    }
}
