package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes.dex */
public final class loo {
    public final moo a;
    public final ResourceUiText b;

    public loo(moo mooVar, ResourceUiText resourceUiText) {
        this.a = mooVar;
        this.b = resourceUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loo)) {
            return false;
        }
        loo looVar = (loo) obj;
        return this.a == looVar.a && this.b.equals(looVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InstantWinTicketDetailSelectionDescriptionState(descriptionType=" + this.a + ", descriptionUiText=" + this.b + ")";
    }
}
