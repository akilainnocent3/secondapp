package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class wl90 implements yl90 {
    public final ResourceUiText a;

    public wl90(ResourceUiText resourceUiText) {
        this.a = resourceUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wl90) && this.a.equals(((wl90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(R.drawable.ic_flexible_active) * 31);
    }

    public final String toString() {
        return oe90.a(this.a, "SimulationBetHistoryInsureFlexiState(iconResId=2131231990, descriptionUiText=", ")");
    }
}
