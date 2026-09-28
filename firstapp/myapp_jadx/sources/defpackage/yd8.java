package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class yd8 implements wvt {
    public final UiText a;

    public yd8(UiText uiText) {
        this.a = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yd8) && this.a.equals(((yd8) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.style.B1_M) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xh8.a(this.a, "Title(title=", ", styleRes=2132082716)");
    }
}
