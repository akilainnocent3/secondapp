package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wu1 {
    public final double a;
    public final UiText b;

    public /* synthetic */ wu1(int i, ResourceUiText resourceUiText) {
        this(0.0d, (UiText) ((i & 2) != 0 ? new ResourceUiText(R.string.app_common__no_cash) : resourceUiText));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu1)) {
            return false;
        }
        wu1 wu1Var = (wu1) obj;
        return Double.compare(this.a, wu1Var.a) == 0 && Intrinsics.g(this.b, wu1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BalanceInfoState(balanceValue=" + this.a + ", balance=" + this.b + ")";
    }

    public wu1(double d, UiText uiText) {
        uiText.getClass();
        this.a = d;
        this.b = uiText;
    }

    public wu1() {
        this(3, (ResourceUiText) null);
    }
}
