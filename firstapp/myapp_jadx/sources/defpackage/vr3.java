package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vr3 implements km3 {
    public final qcn<as3> a;
    public final UiText b;
    public final lr4 c;
    public final zv3 d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final dqk k;
    public final sg10 l;
    public final boolean m;

    public vr3(qcn qcnVar, ResourceUiText resourceUiText, lr4 lr4Var, zv3 zv3Var, String str, String str2, String str3, String str4, String str5, String str6, dqk dqkVar, sg10 sg10Var, boolean z) {
        qcnVar.getClass();
        str2.getClass();
        this.a = qcnVar;
        this.b = resourceUiText;
        this.c = lr4Var;
        this.d = zv3Var;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = dqkVar;
        this.l = sg10Var;
        this.m = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr3)) {
            return false;
        }
        vr3 vr3Var = (vr3) obj;
        return Intrinsics.g(this.a, vr3Var.a) && Intrinsics.g(this.b, vr3Var.b) && this.c.equals(vr3Var.c) && this.d.equals(vr3Var.d) && Intrinsics.g(this.e, vr3Var.e) && Intrinsics.g(this.f, vr3Var.f) && Intrinsics.g(this.g, vr3Var.g) && Intrinsics.g(this.h, vr3Var.h) && Intrinsics.g(this.i, vr3Var.i) && this.j.equals(vr3Var.j) && Intrinsics.g(this.k, vr3Var.k) && this.l.equals(vr3Var.l) && this.m == vr3Var.m;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        UiText uiText = this.b;
        int iHashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31)) * 31)) * 31;
        String str = this.e;
        int iA = gmf0.a((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        int iHashCode3 = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iA2 = gmf0.a((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.j);
        dqk dqkVar = this.k;
        return Boolean.hashCode(this.m) + ((this.l.hashCode() + ((iA2 + (dqkVar != null ? dqkVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetslipMultipleContentState(selectionStates=");
        sb.append(this.a);
        sb.append(", exceedMaxStakeLimitUiText=");
        sb.append(this.b);
        sb.append(", bonusHintState=");
        sb.append(this.c);
        sb.append(", stakePerBetState=");
        sb.append(this.d);
        sb.append(", totalStakeValueText=");
        hxa.c(sb, this.e, ", totalOddsValueText=", this.f, ", withholdingTaxValueText=");
        hxa.c(sb, this.g, ", exciseTaxValueText=", this.h, ", bonusValueText=");
        hxa.c(sb, this.i, ", winningAmountValueText=", this.j, ", giftPickerButtonState=");
        sb.append(this.k);
        sb.append(", placeBetButtonState=");
        sb.append(this.l);
        sb.append(", shouldShowAcceptChangesButton=");
        return mq0.a(sb, this.m, ")");
    }
}
