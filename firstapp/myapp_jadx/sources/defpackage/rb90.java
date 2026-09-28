package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rb90 implements id90 {
    public final UiText a;

    public rb90(UiText uiText) {
        uiText.getClass();
        this.a = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rb90) && Intrinsics.g(this.a, ((rb90) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xh8.a(this.a, "ShowToast(msg=", ", isShort=true)");
    }
}
