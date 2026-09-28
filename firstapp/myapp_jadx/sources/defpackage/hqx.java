package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes6.dex */
public final class hqx {
    public final ResourceUiText a;
    public final ResourceUiText b;

    public hqx(ResourceUiText resourceUiText, ResourceUiText resourceUiText2) {
        this.a = resourceUiText;
        this.b = resourceUiText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqx)) {
            return false;
        }
        hqx hqxVar = (hqx) obj;
        return this.a.equals(hqxVar.a) && this.b.equals(hqxVar.b);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) - 616455632;
    }

    public final String toString() {
        return "NewFeatureHintUiState(titleUiText=" + this.a + ", contentUiText=" + this.b + ", prefKey=PREF_KEY_NEW_FEATURE_HINT_SET_DEFAULT)";
    }
}
