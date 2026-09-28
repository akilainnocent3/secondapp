package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class zte {
    public final ResourceUiText a;
    public final wae b;

    public zte(ResourceUiText resourceUiText, wae waeVar) {
        this.a = resourceUiText;
        this.b = waeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zte)) {
            return false;
        }
        zte zteVar = (zte) obj;
        return this.a.equals(zteVar.a) && this.b == zteVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DobBenefitCardAction(actionTitle=" + this.a + ", destination=" + this.b + ")";
    }
}
