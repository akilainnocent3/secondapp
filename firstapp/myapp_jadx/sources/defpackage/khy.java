package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class khy {
    public final float a;
    public final UiText b;

    public khy(float f, UiText uiText) {
        uiText.getClass();
        this.a = f;
        this.b = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khy)) {
            return false;
        }
        khy khyVar = (khy) obj;
        return Float.compare(this.a, khyVar.a) == 0 && Intrinsics.g(this.b, khyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OddsFilterOddsTick(oddsValue=" + this.a + ", oddsUiText=" + this.b + ")";
    }
}
