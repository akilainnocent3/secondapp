package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class slo {
    public final ResourceUiText a;
    public final ResourceUiText b;

    public slo(ResourceUiText resourceUiText, ResourceUiText resourceUiText2) {
        this.a = resourceUiText;
        this.b = resourceUiText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slo)) {
            return false;
        }
        slo sloVar = (slo) obj;
        return this.a.equals(sloVar.a) && this.b.equals(sloVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InstantWinSelectionDescriptionBottomSheetState(titleUiText=" + this.a + ", descriptionUiText=" + this.b + ")";
    }
}
