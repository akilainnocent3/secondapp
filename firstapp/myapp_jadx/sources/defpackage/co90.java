package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class co90 implements jo90 {
    public final ResourceUiText a;

    public co90(ResourceUiText resourceUiText) {
        this.a = resourceUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof co90) && this.a.equals(((co90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oe90.a(this.a, "SimulationSettlementFlexiInsureState(descriptionUiText=", ")");
    }
}
