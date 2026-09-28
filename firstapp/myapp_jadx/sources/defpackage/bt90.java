package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;

/* JADX INFO: loaded from: classes2.dex */
public final class bt90 {
    public final ResourceUiText a;
    public final int b;

    public bt90(int i, ResourceUiText resourceUiText) {
        this.a = resourceUiText;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt90)) {
            return false;
        }
        bt90 bt90Var = (bt90) obj;
        return this.a.equals(bt90Var.a) && this.b == bt90Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SimulationTopBarState(titleUiText=" + this.a + ", backgroundResId=" + this.b + dLRYz.jowWSozP;
    }
}
