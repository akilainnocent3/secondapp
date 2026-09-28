package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class ms90 {
    public final ns90 a;
    public final ResourceUiText b;

    public ms90(ns90 ns90Var, ResourceUiText resourceUiText) {
        this.a = ns90Var;
        this.b = resourceUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms90)) {
            return false;
        }
        ms90 ms90Var = (ms90) obj;
        return this.a == ms90Var.a && this.b.equals(ms90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SimulationTicketDetailSelectionDescriptionState(descriptionType=" + this.a + ", descriptionUiText=" + this.b + ")";
    }
}
