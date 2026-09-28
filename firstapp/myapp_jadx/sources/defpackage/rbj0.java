package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rbj0 implements pbj0 {
    public final int a;
    public final UiText b;
    public final UiText c;
    public final String d;

    public rbj0(int i, UiText uiText, UiText uiText2, String str) {
        uiText.getClass();
        uiText2.getClass();
        str.getClass();
        this.a = i;
        this.b = uiText;
        this.c = uiText2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbj0)) {
            return false;
        }
        rbj0 rbj0Var = (rbj0) obj;
        return this.a == rbj0Var.a && Intrinsics.g(this.b, rbj0Var.b) && Intrinsics.g(this.c, rbj0Var.c) && Intrinsics.g(this.d, rbj0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + yvf.a(yvf.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "WinningPopupBetOddsStateCommon(statusIconResId=" + this.a + ", outcomeTitle=" + this.b + ", outcomeDesc=" + this.c + ", marketTitle=" + this.d + ")";
    }
}
