package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qhj0 {
    public static final qhj0 d = new qhj0(false, false, vch0.a);
    public final boolean a;
    public final boolean b;
    public final UiText c;

    public qhj0(boolean z, boolean z2, UiText uiText) {
        uiText.getClass();
        this.a = z;
        this.b = z2;
        this.c = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhj0)) {
            return false;
        }
        qhj0 qhj0Var = (qhj0) obj;
        return this.a == qhj0Var.a && this.b == qhj0Var.b && Intrinsics.g(this.c, qhj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return plf.a(cwz.a("WithdrawAlertVisibilityConfig(showDropAlert=", ", showCreditDelaysHint=", ", alertContent=", this.a, this.b), this.c, ")");
    }
}
