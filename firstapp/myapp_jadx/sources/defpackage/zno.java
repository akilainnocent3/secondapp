package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public final class zno implements boo {
    public final ResourceUiText a;

    public zno(ResourceUiText resourceUiText) {
        this.a = resourceUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zno) && this.a.equals(((zno) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(R.drawable.ic_flexible_active) * 31);
    }

    public final String toString() {
        return oe90.a(this.a, "InstantWinTicketDetailInsureFlexiState(iconResId=2131231990, descriptionUiText=", ")");
    }
}
