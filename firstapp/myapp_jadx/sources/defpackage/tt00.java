package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class tt00 {
    public final UiText a;
    public final a b;

    public enum a {
        DISABLED(R.color.bg_disabled, R.color.text_disabled_action, R.color.transparent),
        ENABLED(R.color.bg_brand_sub_secondary_d_base, R.color.text_brand_sub_secondary, R.color.transparent),
        SELECTED(R.color.bg_brand_sub_primary_d_base, R.color.text_inverse_primary, R.color.transparent),
        PICKED(R.color.instant_win_pickable_button_picked_background, R.color.text_brand_sub_secondary, R.color.border_brand_sub),
        LOCKED(R.color.bg_disabled, R.color.transparent, R.color.transparent);

        public final int a;
        public final int b;
        public final int c;

        a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public tt00(UiText uiText, a aVar) {
        this.a = uiText;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt00)) {
            return false;
        }
        tt00 tt00Var = (tt00) obj;
        return this.a.equals(tt00Var.a) && this.b == tt00Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PickableButtonState(labelUiText=" + this.a + ", state=" + this.b + ")";
    }
}
