package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zv3 {
    public final ResourceUiText a;
    public final String b;
    public final zrd0 c;
    public final asd0 d;
    public final UiText e;
    public final boolean f;
    public final usd0 g;

    public zv3(ResourceUiText resourceUiText, String str, zrd0 zrd0Var, asd0 asd0Var, ResourceUiText resourceUiText2, boolean z, usd0 usd0Var) {
        str.getClass();
        zrd0Var.getClass();
        this.a = resourceUiText;
        this.b = str;
        this.c = zrd0Var;
        this.d = asd0Var;
        this.e = resourceUiText2;
        this.f = z;
        this.g = usd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv3)) {
            return false;
        }
        zv3 zv3Var = (zv3) obj;
        return this.a.equals(zv3Var.a) && Intrinsics.g(this.b, zv3Var.b) && Intrinsics.g(this.c, zv3Var.c) && this.d.equals(zv3Var.d) && Intrinsics.g(this.e, zv3Var.e) && this.f == zv3Var.f && this.g.equals(zv3Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        UiText uiText = this.e;
        return this.g.hashCode() + mtg0.a((iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        return "BetslipStakePerBetState(titleUiText=" + this.a + ", currencyText=" + this.b + ", stakeInputSingleType=" + this.c + ", stakeInputState=" + this.d + ", stakeInputErrorUiText=" + this.e + ", shouldShowStakeKeyboard=" + this.f + ", stakeKeyboardUiState=" + this.g + ")";
    }
}
