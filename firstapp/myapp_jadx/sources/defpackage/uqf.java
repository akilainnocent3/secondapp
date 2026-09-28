package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes6.dex */
public final class uqf {
    public final int a;
    public final ResourceUiText b;
    public final ResourceUiText c;

    public uqf(int i, ResourceUiText resourceUiText, ResourceUiText resourceUiText2) {
        this.a = i;
        this.b = resourceUiText;
        this.c = resourceUiText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqf)) {
            return false;
        }
        uqf uqfVar = (uqf) obj;
        return this.a == uqfVar.a && this.b.equals(uqfVar.b) && this.c.equals(uqfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wh8.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "EditPlayTimeConfirmationDialogUI(imageResource=" + this.a + ", title=" + this.b + ", description=" + this.c + ")";
    }
}
