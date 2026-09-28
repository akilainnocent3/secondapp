package defpackage;

import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ov3 {
    public final String a;
    public final int b;
    public final xt3 c;
    public final UiText d;
    public final ut3 e;
    public final String f;
    public final int g;
    public final zrd0.b h;
    public final asd0 i;
    public final UiText j;
    public final boolean k;
    public final usd0 l;

    public ov3(String str, int i, xt3 xt3Var, ResourceUiText resourceUiText, ut3 ut3Var, String str2, int i2, zrd0.b bVar, asd0 asd0Var, ResourceUiText resourceUiText2, boolean z, usd0 usd0Var) {
        str.getClass();
        usd0Var.getClass();
        this.a = str;
        this.b = i;
        this.c = xt3Var;
        this.d = resourceUiText;
        this.e = ut3Var;
        this.f = str2;
        this.g = i2;
        this.h = bVar;
        this.i = asd0Var;
        this.j = resourceUiText2;
        this.k = z;
        this.l = usd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov3)) {
            return false;
        }
        ov3 ov3Var = (ov3) obj;
        return Intrinsics.g(this.a, ov3Var.a) && this.b == ov3Var.b && Intrinsics.g(this.c, ov3Var.c) && Intrinsics.g(this.d, ov3Var.d) && this.e.equals(ov3Var.e) && this.f.equals(ov3Var.f) && this.g == ov3Var.g && this.h.equals(ov3Var.h) && this.i.equals(ov3Var.i) && Intrinsics.g(this.j, ov3Var.j) && this.k == ov3Var.k && Intrinsics.g(this.l, ov3Var.l);
    }

    public final int hashCode() {
        int iA = gpp.a(this.b, this.a.hashCode() * 31, 31);
        xt3 xt3Var = this.c;
        int iHashCode = (iA + (xt3Var == null ? 0 : xt3Var.hashCode())) * 31;
        UiText uiText = this.d;
        int iHashCode2 = (this.i.hashCode() + gmf0.a(gpp.a(this.g, gmf0.a((this.e.hashCode() + ((iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31)) * 31, 31, this.f), 31), 31, this.h.a)) * 31;
        UiText uiText2 = this.j;
        return this.l.hashCode() + mtg0.a((iHashCode2 + (uiText2 != null ? uiText2.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "BetslipSingleSelectionState(outcomeId=", this.a, ", backgroundColorResId=", ", groupTitleState=");
        sbA.append(this.c);
        sbA.append(", tagUiText=");
        sbA.append(this.d);
        sbA.append(", content=");
        sbA.append(this.e);
        sbA.append(", marketTitleText=");
        sbA.append(this.f);
        sbA.append(", marketTitleTextColorResId=");
        sbA.append(this.g);
        sbA.append(", stakeInputSingleType=");
        sbA.append(this.h);
        sbA.append(", stakeInputState=");
        sbA.append(this.i);
        sbA.append(", stakeInputErrorUiText=");
        sbA.append(this.j);
        sbA.append(", shouldShowStakeKeyboard=");
        sbA.append(this.k);
        sbA.append(", stakeKeyboardUiState=");
        sbA.append(this.l);
        sbA.append(lobGSRIlnSGJY.eaoghQ);
        return sbA.toString();
    }
}
