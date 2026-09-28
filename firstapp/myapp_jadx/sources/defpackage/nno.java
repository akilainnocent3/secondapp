package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nno {
    public final String a;
    public final boolean b;
    public final ResourceUiText c;
    public final Integer d;
    public final UiText e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final UiText j;
    public final boolean k;
    public final Integer l;

    public nno(String str, boolean z, ResourceUiText resourceUiText, Integer num, ColoredUiText coloredUiText, String str2, String str3, String str4, String str5, ResourceUiText resourceUiText2, boolean z2, Integer num2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = resourceUiText;
        this.d = num;
        this.e = coloredUiText;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = resourceUiText2;
        this.k = z2;
        this.l = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nno)) {
            return false;
        }
        nno nnoVar = (nno) obj;
        return Intrinsics.g(this.a, nnoVar.a) && this.b == nnoVar.b && this.c.equals(nnoVar.c) && Intrinsics.g(this.d, nnoVar.d) && Intrinsics.g(this.e, nnoVar.e) && this.f.equals(nnoVar.f) && this.g.equals(nnoVar.g) && Intrinsics.g(this.h, nnoVar.h) && Intrinsics.g(this.i, nnoVar.i) && Intrinsics.g(this.j, nnoVar.j) && this.k == nnoVar.k && Intrinsics.g(this.l, nnoVar.l);
    }

    public final int hashCode() {
        int iA = wh8.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        UiText uiText = this.e;
        int iA2 = gmf0.a(gmf0.a((iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31, 31, this.f), 31, this.g);
        String str = this.h;
        int iHashCode2 = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UiText uiText2 = this.j;
        int iA3 = mtg0.a((iHashCode3 + (uiText2 == null ? 0 : uiText2.hashCode())) * 31, 31, this.k);
        Integer num2 = this.l;
        return iA3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = z620.a("InstantWinTicketDetailGroupState(betGroupId=", this.a, ", isExpanded=", ", titleUiText=", this.b);
        sbA.append(this.c);
        sbA.append(", wonIconResId=");
        sbA.append(this.d);
        sbA.append(", resultUiText=");
        sbA.append(this.e);
        sbA.append(", returnValueText=");
        sbA.append(this.f);
        sbA.append(", stakeValueText=");
        hxa.c(sbA, this.g, ", oddsValueText=", this.h, ", bonusValueText=");
        sbA.append(this.i);
        sbA.append(", withholdingTaxValueUiText=");
        sbA.append(this.j);
        sbA.append(", isFirst=");
        sbA.append(this.k);
        sbA.append(", leadingIconResId=");
        sbA.append(this.l);
        sbA.append(")");
        return sbA.toString();
    }
}
