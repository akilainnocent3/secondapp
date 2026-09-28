package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qfi {
    public final String a;
    public final ResourceUiText b;
    public final int c;
    public final UiText d;
    public final Integer e;
    public final ResourceUiText f;
    public final pci g;
    public final String h;
    public final int i;
    public final String j;
    public final UiText k;
    public final UiText l;
    public final String m;
    public final String n;
    public final UiText o;

    public qfi(String str, ResourceUiText resourceUiText, int i, UiText uiText, Integer num, ResourceUiText resourceUiText2, pci pciVar, String str2, int i2, String str3, ResourceUiText resourceUiText3, ResourceUiText resourceUiText4, String str4, String str5, ResourceUiText resourceUiText5) {
        this.a = str;
        this.b = resourceUiText;
        this.c = i;
        this.d = uiText;
        this.e = num;
        this.f = resourceUiText2;
        this.g = pciVar;
        this.h = str2;
        this.i = i2;
        this.j = str3;
        this.k = resourceUiText3;
        this.l = resourceUiText4;
        this.m = str4;
        this.n = str5;
        this.o = resourceUiText5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfi)) {
            return false;
        }
        qfi qfiVar = (qfi) obj;
        return this.a.equals(qfiVar.a) && this.b.equals(qfiVar.b) && this.c == qfiVar.c && Intrinsics.g(this.d, qfiVar.d) && Intrinsics.g(this.e, qfiVar.e) && this.f.equals(qfiVar.f) && Intrinsics.g(this.g, qfiVar.g) && this.h.equals(qfiVar.h) && this.i == qfiVar.i && this.j.equals(qfiVar.j) && Intrinsics.g(this.k, qfiVar.k) && Intrinsics.g(this.l, qfiVar.l) && Intrinsics.g(this.m, qfiVar.m) && Intrinsics.g(this.n, qfiVar.n) && Intrinsics.g(this.o, qfiVar.o);
    }

    public final int hashCode() {
        int iA = gpp.a(R.color.text_inverse_primary, gpp.a(this.c, wh8.a(this.a.hashCode() * 31, 31, this.b), 31), 31);
        UiText uiText = this.d;
        int iHashCode = (iA + (uiText == null ? 0 : uiText.hashCode())) * 31;
        Integer num = this.e;
        int iA2 = wh8.a((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f);
        pci pciVar = this.g;
        int iA3 = gmf0.a(gpp.a(this.i, gmf0.a((iA2 + (pciVar == null ? 0 : pciVar.hashCode())) * 31, 31, this.h), 31), 31, this.j);
        UiText uiText2 = this.k;
        int iHashCode2 = (iA3 + (uiText2 == null ? 0 : uiText2.hashCode())) * 31;
        UiText uiText3 = this.l;
        int iHashCode3 = (iHashCode2 + (uiText3 == null ? 0 : uiText3.hashCode())) * 31;
        String str = this.m;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.n;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UiText uiText4 = this.o;
        return iHashCode5 + (uiText4 != null ? uiText4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FootballFamilySettlementTicketState(ticketId=");
        sb.append(this.a);
        sb.append(", ticketNumberUiText=");
        sb.append(this.b);
        sb.append(", headerBackgroundColorResId=");
        sb.append(this.c);
        sb.append(", headerOnBackgroundColorResId=2131101781, betslipTypeUiText=");
        sb.append(this.d);
        sb.append(", resultIconResId=");
        sb.append(this.e);
        sb.append(", resultUiText=");
        sb.append(this.f);
        sb.append(", insureState=");
        sb.append(this.g);
        sb.append(", totalReturnValueText=");
        sb.append(this.h);
        sb.append(", totalReturnValueColorResId=");
        f78.b(this.i, ", totalStakeValueText=", this.j, ", giftNameUiText=", sb);
        vh8.a(sb, this.k, ", giftAmountUiText=", this.l, ", totalOddsValueText=");
        hxa.c(sb, this.m, ", totalBonusValueText=", this.n, ", withholdingTaxValueUiText=");
        return plf.a(sb, this.o, ")");
    }
}
