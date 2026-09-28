package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bd30 implements ed30 {
    public final UiText a;

    public bd30(UiText uiText) {
        uiText.getClass();
        this.a = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bd30) && Intrinsics.g(this.a, ((bd30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xh8.a(this.a, "QuickBetTertiaryTextPenaltyState(uiText=", ")");
    }
}
