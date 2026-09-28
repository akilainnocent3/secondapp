package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes6.dex */
public final class t75 {
    public final int a;
    public final ResourceUiText b;

    public t75(int i, ResourceUiText resourceUiText) {
        this.a = i;
        this.b = resourceUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t75)) {
            return false;
        }
        t75 t75Var = (t75) obj;
        return this.a == t75Var.a && this.b.equals(t75Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BrContactItem(icon=" + this.a + ", text=" + this.b + ")";
    }
}
