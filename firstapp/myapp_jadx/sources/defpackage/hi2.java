package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class hi2 {
    public final ResourceUiText a;
    public final ResourceUiText b;

    public hi2(ResourceUiText resourceUiText, ResourceUiText resourceUiText2) {
        this.a = resourceUiText;
        this.b = resourceUiText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi2)) {
            return false;
        }
        hi2 hi2Var = (hi2) obj;
        return this.a.equals(hi2Var.a) && this.b.equals(hi2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BetBuilderTutorialItem(imageUrlUiText=" + this.a + ", descriptionUiText=" + this.b + ")";
    }
}
