package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class epo implements omo {
    public final Integer a;
    public final Integer b;
    public final ResourceUiText c;
    public final String d;
    public final String e;
    public final Integer f;
    public final UiText g;
    public final a h;
    public final ColoredUiText i;
    public final boo j;
    public final ColoredUiText k;
    public final String l;
    public final UiText m;
    public final UiText n;
    public final String o;
    public final String p;
    public final UiText q;

    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return n36.a("WonIcon(resId=", this.a, this.b, ", tintResId=", ")");
        }
    }

    public epo(Integer num, Integer num2, ResourceUiText resourceUiText, String str, String str2, Integer num3, UiText uiText, a aVar, ColoredUiText coloredUiText, boo booVar, ColoredUiText coloredUiText2, String str3, ResourceUiText resourceUiText2, ResourceUiText resourceUiText3, String str4, String str5, ResourceUiText resourceUiText4) {
        str.getClass();
        this.a = num;
        this.b = num2;
        this.c = resourceUiText;
        this.d = str;
        this.e = str2;
        this.f = num3;
        this.g = uiText;
        this.h = aVar;
        this.i = coloredUiText;
        this.j = booVar;
        this.k = coloredUiText2;
        this.l = str3;
        this.m = resourceUiText2;
        this.n = resourceUiText3;
        this.o = str4;
        this.p = str5;
        this.q = resourceUiText4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epo)) {
            return false;
        }
        epo epoVar = (epo) obj;
        return Intrinsics.g(this.a, epoVar.a) && Intrinsics.g(this.b, epoVar.b) && this.c.equals(epoVar.c) && Intrinsics.g(this.d, epoVar.d) && this.e.equals(epoVar.e) && Intrinsics.g(this.f, epoVar.f) && Intrinsics.g(this.g, epoVar.g) && Intrinsics.g(this.h, epoVar.h) && this.i.equals(epoVar.i) && Intrinsics.g(this.j, epoVar.j) && this.k.equals(epoVar.k) && this.l.equals(epoVar.l) && Intrinsics.g(this.m, epoVar.m) && Intrinsics.g(this.n, epoVar.n) && Intrinsics.g(this.o, epoVar.o) && Intrinsics.g(this.p, epoVar.p) && Intrinsics.g(this.q, epoVar.q);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iA = gmf0.a(gmf0.a(wh8.a((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        Integer num3 = this.f;
        int iHashCode2 = (iA + (num3 == null ? 0 : num3.hashCode())) * 31;
        UiText uiText = this.g;
        int iHashCode3 = (iHashCode2 + (uiText == null ? 0 : uiText.hashCode())) * 31;
        a aVar = this.h;
        int iHashCode4 = (this.i.hashCode() + ((iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
        boo booVar = this.j;
        int iA2 = gmf0.a((this.k.hashCode() + ((iHashCode4 + (booVar == null ? 0 : booVar.hashCode())) * 31)) * 31, 31, this.l);
        UiText uiText2 = this.m;
        int iHashCode5 = (iA2 + (uiText2 == null ? 0 : uiText2.hashCode())) * 31;
        UiText uiText3 = this.n;
        int iHashCode6 = (iHashCode5 + (uiText3 == null ? 0 : uiText3.hashCode())) * 31;
        String str = this.o;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.p;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UiText uiText4 = this.q;
        return iHashCode8 + (uiText4 != null ? uiText4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstantWinTicketDetailTicketInfoCellState(watermarkUrlStringResId=");
        sb.append(this.a);
        sb.append(", sportNameStringResId=");
        sb.append(this.b);
        sb.append(", ticketNumberUiText=");
        sb.append(this.c);
        sb.append(", ticketNumber=");
        sb.append(this.d);
        sb.append(", datetimeText=");
        oie.a(this.f, this.e, ", sportIconResId=", ", betslipTypeUiText=", sb);
        sb.append(this.g);
        sb.append(", wonIcon=");
        sb.append(this.h);
        sb.append(", resultUiText=");
        sb.append(this.i);
        sb.append(", insureState=");
        sb.append(this.j);
        sb.append(", totalReturnValueUiText=");
        sb.append(this.k);
        sb.append(", totalStakeValueText=");
        sb.append(this.l);
        sb.append(", giftNameUiText=");
        vh8.a(sb, this.m, ", giftAmountUiText=", this.n, ", totalOddsValueText=");
        hxa.c(sb, this.o, ", totalBonusValueText=", this.p, ", withholdingTaxValueUiText=");
        return plf.a(sb, this.q, ")");
    }
}
