package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sg10 {
    public final ResourceUiText a;
    public final String b;
    public final ResourceUiText c;
    public final String d;
    public final a e;

    public enum a {
        c(R.color.text_disabled_action, "DISABLED"),
        d(R.color.text_inverse_primary, "ENABLED");

        public final int a;
        public final int b;

        a(int i, String str) {
            this.a = i;
            this.b = i;
        }
    }

    public sg10(ResourceUiText resourceUiText, String str, ResourceUiText resourceUiText2, String str2, a aVar) {
        this.a = resourceUiText;
        this.b = str;
        this.c = resourceUiText2;
        this.d = str2;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg10)) {
            return false;
        }
        sg10 sg10Var = (sg10) obj;
        return this.a.equals(sg10Var.a) && Intrinsics.g(this.b, sg10Var.b) && this.c.equals(sg10Var.c) && this.d.equals(sg10Var.d) && this.e == sg10Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + gmf0.a(wh8.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "PlaceBetButtonState(topUiText=" + this.a + ", topResourceId=" + this.b + ", bottomUiText=" + this.c + ", bottomResourceId=" + this.d + ", state=" + this.e + ")";
    }
}
