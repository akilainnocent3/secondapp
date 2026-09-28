package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class jx30 {
    public final ResourceUiText a;
    public final float b;

    public jx30(ResourceUiText resourceUiText, float f) {
        this.a = resourceUiText;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx30)) {
            return false;
        }
        jx30 jx30Var = (jx30) obj;
        return this.a.equals(jx30Var.a) && Float.compare(this.b, jx30Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RakebackUiData(title=" + this.a + ", value=" + this.b + ")";
    }
}
