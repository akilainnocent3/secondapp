package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;

/* JADX INFO: loaded from: classes6.dex */
public final class irf {
    public final cr10 a;
    public final int b;
    public final StringUiText c;
    public final ResourceUiText d;
    public final ResourceUiText e;
    public final ResourceUiText f;

    public irf(cr10 cr10Var, int i, StringUiText stringUiText, ResourceUiText resourceUiText, ResourceUiText resourceUiText2, ResourceUiText resourceUiText3) {
        cr10Var.getClass();
        this.a = cr10Var;
        this.b = i;
        this.c = stringUiText;
        this.d = resourceUiText;
        this.e = resourceUiText2;
        this.f = resourceUiText3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irf)) {
            return false;
        }
        irf irfVar = (irf) obj;
        return this.a == irfVar.a && this.b == irfVar.b && this.c.equals(irfVar.c) && this.d.equals(irfVar.d) && this.e.equals(irfVar.e) && this.f.equals(irfVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + wh8.a(wh8.a((this.c.a.hashCode() + gpp.a(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "EditPlayTimeConfirmationUI(type=" + this.a + ", optionSelectedInDays=" + this.b + ", dateText=" + this.c + ", title=" + this.d + ", description=" + this.e + ", textButton=" + this.f + ")";
    }
}
