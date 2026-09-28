package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class eok {
    public final String a;
    public final hok b;
    public final UiText c;
    public final String d;
    public final UiText e;
    public final UiText f;
    public final UiText g;
    public final String h;
    public final String i;
    public final boolean j;
    public final xik k;
    public final boolean l;

    public eok(String str, hok hokVar, UiText uiText, String str2, UiText uiText2, UiText uiText3, UiText uiText4, String str3, String str4, boolean z, xik xikVar, boolean z2) {
        str.getClass();
        uiText.getClass();
        str2.getClass();
        uiText2.getClass();
        str3.getClass();
        this.a = str;
        this.b = hokVar;
        this.c = uiText;
        this.d = str2;
        this.e = uiText2;
        this.f = uiText3;
        this.g = uiText4;
        this.h = str3;
        this.i = str4;
        this.j = z;
        this.k = xikVar;
        this.l = z2;
    }

    public static eok a(eok eokVar, boolean z) {
        String str = eokVar.a;
        hok hokVar = eokVar.b;
        UiText uiText = eokVar.c;
        String str2 = eokVar.d;
        UiText uiText2 = eokVar.e;
        UiText uiText3 = eokVar.f;
        UiText uiText4 = eokVar.g;
        String str3 = eokVar.h;
        String str4 = eokVar.i;
        boolean z2 = eokVar.j;
        xik xikVar = eokVar.k;
        str.getClass();
        uiText.getClass();
        str2.getClass();
        uiText2.getClass();
        str3.getClass();
        return new eok(str, hokVar, uiText, str2, uiText2, uiText3, uiText4, str3, str4, z2, xikVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eok)) {
            return false;
        }
        eok eokVar = (eok) obj;
        return Intrinsics.g(this.a, eokVar.a) && this.b == eokVar.b && Intrinsics.g(this.c, eokVar.c) && Intrinsics.g(this.d, eokVar.d) && Intrinsics.g(this.e, eokVar.e) && this.f.equals(eokVar.f) && this.g.equals(eokVar.g) && Intrinsics.g(this.h, eokVar.h) && this.i.equals(eokVar.i) && this.j == eokVar.j && this.k == eokVar.k && this.l == eokVar.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + ((this.k.hashCode() + mtg0.a(gmf0.a(gmf0.a(yvf.a(yvf.a(yvf.a(gmf0.a(yvf.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftItemState(giftId=");
        sb.append(this.a);
        sb.append(", giftKindUi=");
        sb.append(this.b);
        sb.append(", giftConditionText=");
        sb.append(this.c);
        sb.append(", currencyText=");
        sb.append(this.d);
        sb.append(", giftAmountText=");
        vh8.a(sb, this.e, ", giftExpiredTimeText=", this.f, ", giftKindText=");
        sb.append(this.g);
        sb.append(", giftTitle=");
        sb.append(this.h);
        sb.append(", giftContent=");
        uts.b(this.i, ", isSelected=", ", availabilityStatus=", sb, this.j);
        sb.append(this.k);
        sb.append(", isExpanded=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }
}
