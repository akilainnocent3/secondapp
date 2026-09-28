package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class gu40 {
    public final ResourceUiText a;
    public final ResourceUiText b;
    public final int c;
    public final ResourceUiText d;
    public final ResourceUiText e;
    public final String f;

    public gu40(ResourceUiText resourceUiText, ResourceUiText resourceUiText2, int i, ResourceUiText resourceUiText3, ResourceUiText resourceUiText4, String str) {
        this.a = resourceUiText;
        this.b = resourceUiText2;
        this.c = i;
        this.d = resourceUiText3;
        this.e = resourceUiText4;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu40)) {
            return false;
        }
        gu40 gu40Var = (gu40) obj;
        return this.a.equals(gu40Var.a) && this.b.equals(gu40Var.b) && this.c == gu40Var.c && this.d.equals(gu40Var.d) && this.e.equals(gu40Var.e) && this.f.equals(gu40Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + wh8.a(wh8.a(gpp.a(this.c, wh8.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "RegisterOtpUiSpec(smsInfo=" + this.a + ", telegramInfo=" + this.b + ", resendHintRes=" + this.c + ", selectorTitle=" + this.d + ", selectorSubtitle=" + this.e + ", selectorImageUrl=" + this.f + ")";
    }
}
