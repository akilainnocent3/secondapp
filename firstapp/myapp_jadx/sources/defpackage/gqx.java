package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class gqx {
    public final ResourceUiText a;
    public final ResourceUiText b = new ResourceUiText(R.string.page_transaction__new_feature_alert);

    public gqx(ResourceUiText resourceUiText) {
        this.a = resourceUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gqx) && this.a.equals(((gqx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oe90.a(this.a, "NewFeatureAlertUiState(description=", ")");
    }
}
