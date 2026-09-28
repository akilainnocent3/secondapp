package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;

/* JADX INFO: loaded from: classes2.dex */
public final class lr4 {
    public final ResourceUiText a;
    public final float b;

    public lr4(ResourceUiText resourceUiText, float f) {
        this.a = resourceUiText;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr4)) {
            return false;
        }
        lr4 lr4Var = (lr4) obj;
        return this.a.equals(lr4Var.a) && Float.compare(this.b, lr4Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BonusHintState(uiText=" + this.a + DZsoPoBl.kOV + this.b + ")";
    }
}
