package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dd30 implements ed30 {
    public final UiText a;

    public dd30(UiText uiText) {
        uiText.getClass();
        this.a = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dd30) && Intrinsics.g(this.a, ((dd30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xh8.a(this.a, "QuickBetTertiaryTextScheduledFootballState(uiText=", ")");
    }
}
