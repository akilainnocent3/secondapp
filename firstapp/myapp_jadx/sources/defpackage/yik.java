package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yik {
    public final UiText a;
    public final int b;
    public final int c;
    public final boolean d;

    public yik(int i, int i2, UiText uiText, boolean z) {
        uiText.getClass();
        this.a = uiText;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yik)) {
            return false;
        }
        yik yikVar = (yik) obj;
        return Intrinsics.g(this.a, yikVar.a) && this.b == yikVar.b && this.c == yikVar.c && this.d == yikVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + gpp.a(this.c, gpp.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "GiftButtonUiModel(text=" + this.a + ", backgroundColorRes=" + this.b + ", textColorRes=" + this.c + ", isClickable=" + this.d + ")";
    }
}
