package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class iv3 implements km3 {
    public final qcn<ov3> a;
    public final UiText b;
    public final zv3 c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final dqk h;
    public final sg10 i;
    public final boolean j;
    public final kk3 k;

    public iv3(qcn qcnVar, ResourceUiText resourceUiText, zv3 zv3Var, String str, String str2, String str3, String str4, dqk dqkVar, sg10 sg10Var, boolean z, kk3 kk3Var) {
        qcnVar.getClass();
        this.a = qcnVar;
        this.b = resourceUiText;
        this.c = zv3Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = dqkVar;
        this.i = sg10Var;
        this.j = z;
        this.k = kk3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv3)) {
            return false;
        }
        iv3 iv3Var = (iv3) obj;
        return Intrinsics.g(this.a, iv3Var.a) && Intrinsics.g(this.b, iv3Var.b) && this.c.equals(iv3Var.c) && this.d.equals(iv3Var.d) && Intrinsics.g(this.e, iv3Var.e) && Intrinsics.g(this.f, iv3Var.f) && this.g.equals(iv3Var.g) && Intrinsics.g(this.h, iv3Var.h) && this.i.equals(iv3Var.i) && this.j == iv3Var.j && Intrinsics.g(this.k, iv3Var.k);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        UiText uiText = this.b;
        int iA = gmf0.a((this.c.hashCode() + ((iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31)) * 31, 31, this.d);
        String str = this.e;
        int iHashCode2 = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iA2 = gmf0.a((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g);
        dqk dqkVar = this.h;
        int iA3 = mtg0.a((this.i.hashCode() + ((iA2 + (dqkVar == null ? 0 : dqkVar.hashCode())) * 31)) * 31, 31, this.j);
        kk3 kk3Var = this.k;
        return iA3 + (kk3Var != null ? kk3Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetslipSingleContentState(selectionStates=");
        sb.append(this.a);
        sb.append(", exceedMaxStakeLimitUiText=");
        sb.append(this.b);
        sb.append(", stakePerBetState=");
        sb.append(this.c);
        sb.append(", totalStakeValueText=");
        sb.append(this.d);
        sb.append(", withholdingTaxValueText=");
        hxa.c(sb, this.e, ", exciseTaxValueText=", this.f, ", winningAmountValueText=");
        sb.append(this.g);
        sb.append(", giftPickerButtonState=");
        sb.append(this.h);
        sb.append(", placeBetButtonState=");
        sb.append(this.i);
        sb.append(", shouldShowAcceptChangesButton=");
        sb.append(this.j);
        sb.append(", animationModeState=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
