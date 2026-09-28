package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes.dex */
public final class o990 implements id90 {
    public final ResourceUiText a;

    public o990(ResourceUiText resourceUiText) {
        this.a = resourceUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o990) && this.a.equals(((o990) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oe90.a(this.a, "ShowDialog(message=", ")");
    }
}
