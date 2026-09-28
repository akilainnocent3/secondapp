package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ad30 implements ed30 {
    public final UiText a;

    public ad30(UiText uiText) {
        uiText.getClass();
        this.a = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ad30) && Intrinsics.g(this.a, ((ad30) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.style.B1_B) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xh8.a(this.a, "QuickBetTertiaryTextLegendsState(uiText=", ", textStyleResId=2132082715)");
    }
}
