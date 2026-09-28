package defpackage;

import com.sporty.android.common_ui.uitext.UiText;

/* JADX INFO: loaded from: classes5.dex */
public final class rfh0 {
    public final String a;
    public final UiText b;
    public final boolean c;

    public rfh0(UiText uiText, String str, boolean z) {
        this.a = str;
        this.b = uiText;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfh0)) {
            return false;
        }
        rfh0 rfh0Var = (rfh0) obj;
        return this.a.equals(rfh0Var.a) && this.b.equals(rfh0Var.b) && this.c == rfh0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + yvf.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return mq0.a(x45.a(this.b, "UniversalSpecifierButtonState(universalSpecifierType=", this.a, ", universalSpecifierUiText=", ", activate="), this.c, ")");
    }
}
