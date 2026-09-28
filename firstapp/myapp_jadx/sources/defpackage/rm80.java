package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.bethistory.presentation.dialog.BetDialogResult;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rm80 {
    public final ResourceUiText a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final BetDialogResult e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rm80(int i) {
        this(new ResourceUiText(R.string.bet_history__settled), true, false, false, null);
        StringUiText stringUiText = vch0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm80)) {
            return false;
        }
        rm80 rm80Var = (rm80) obj;
        return Intrinsics.g(this.a, rm80Var.a) && this.b == rm80Var.b && this.c == rm80Var.c && this.d == rm80Var.d && Intrinsics.g(this.e, rm80Var.e);
    }

    public final int hashCode() {
        int iA = mtg0.a(mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        BetDialogResult betDialogResult = this.e;
        return iA + (betDialogResult == null ? 0 : betDialogResult.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettlementUiState(initUiText=");
        sb.append(this.a);
        sb.append(", isInit=");
        sb.append(this.b);
        sb.append(", isUnsettled=");
        nng.a(", isDeleteEnabled=", ", dialogResult=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public rm80(ResourceUiText resourceUiText, boolean z, boolean z2, boolean z3, BetDialogResult betDialogResult) {
        this.a = resourceUiText;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = betDialogResult;
    }

    public rm80() {
        this(0);
    }
}
