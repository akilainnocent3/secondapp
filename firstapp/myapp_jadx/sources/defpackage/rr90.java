package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rr90 {
    public final ResourceUiText a;
    public final String b;
    public final UiText c;
    public final qs90 d;
    public final vr90 e;
    public final UiText f;
    public final int g;
    public final String h;
    public final UiText i;
    public final String j;
    public final String k;
    public final String l;

    public rr90(ResourceUiText resourceUiText, String str, UiText uiText, qs90 qs90Var, vr90 vr90Var, UiText uiText2, int i, String str2, ResourceUiText resourceUiText2, String str3, String str4, String str5) {
        uiText.getClass();
        str3.getClass();
        this.a = resourceUiText;
        this.b = str;
        this.c = uiText;
        this.d = qs90Var;
        this.e = vr90Var;
        this.f = uiText2;
        this.g = i;
        this.h = str2;
        this.i = resourceUiText2;
        this.j = str3;
        this.k = str4;
        this.l = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr90)) {
            return false;
        }
        rr90 rr90Var = (rr90) obj;
        return this.a.equals(rr90Var.a) && this.b.equals(rr90Var.b) && Intrinsics.g(this.c, rr90Var.c) && this.d.equals(rr90Var.d) && Intrinsics.g(this.e, rr90Var.e) && this.f.equals(rr90Var.f) && this.g == rr90Var.g && this.h.equals(rr90Var.h) && Intrinsics.g(this.i, rr90Var.i) && Intrinsics.g(this.j, rr90Var.j) && this.k.equals(rr90Var.k) && this.l.equals(rr90Var.l);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + yvf.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        vr90 vr90Var = this.e;
        int iA = gmf0.a(gpp.a(this.g, yvf.a((iHashCode + (vr90Var == null ? 0 : vr90Var.hashCode())) * 31, 31, this.f), 31), 31, this.h);
        UiText uiText = this.i;
        return this.l.hashCode() + gmf0.a(gmf0.a((iA + (uiText != null ? uiText.hashCode() : 0)) * 31, 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimulationTicketDetailHeaderState(roundIdUiText=");
        sb.append(this.a);
        sb.append(", ticketTimeText=");
        sb.append(this.b);
        sb.append(", betslipTypeUiText=");
        sb.append(this.c);
        sb.append(", ticketResultState=");
        sb.append(this.d);
        sb.append(", insureState=");
        sb.append(this.e);
        sb.append(", totalReturnUiText=");
        sb.append(this.f);
        sb.append(", totalReturnTextColorResId=");
        f78.b(this.g, ", totalStakeText=", this.h, ", giftAmountUiText=", sb);
        sb.append(this.i);
        sb.append(", totalOddsText=");
        sb.append(this.j);
        sb.append(", totalBonusText=");
        return kwi.a(sb, this.k, ", totalWithholdingTaxText=", this.l, ")");
    }
}
