package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xkc0 implements vkc0 {
    public final UiText a;
    public final String b;
    public final StringUiText c;

    public xkc0(UiText uiText, String str, StringUiText stringUiText) {
        uiText.getClass();
        str.getClass();
        this.a = uiText;
        this.b = str;
        this.c = stringUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkc0)) {
            return false;
        }
        xkc0 xkc0Var = (xkc0) obj;
        return Intrinsics.g(this.a, xkc0Var.a) && Intrinsics.g(this.b, xkc0Var.b) && this.c.equals(xkc0Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "SportyLegendsSettlementBetOddsStateCommon(outcomeTitle=" + this.a + ", marketTitle=" + this.b + ", outcomeDesc=" + this.c + ")";
    }
}
