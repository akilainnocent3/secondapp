package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dok {
    public final String a;
    public final gok b;
    public final UiText c;
    public final String d;
    public final UiText e;
    public final UiText f;
    public final UiText g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;

    public dok(String str, gok gokVar, UiText uiText, String str2, UiText uiText2, UiText uiText3, UiText uiText4, String str3, String str4, boolean z, boolean z2) {
        str.getClass();
        uiText.getClass();
        uiText2.getClass();
        str3.getClass();
        this.a = str;
        this.b = gokVar;
        this.c = uiText;
        this.d = str2;
        this.e = uiText2;
        this.f = uiText3;
        this.g = uiText4;
        this.h = str3;
        this.i = str4;
        this.j = z;
        this.k = z2;
    }

    public static dok a(dok dokVar, boolean z, boolean z2, int i) {
        String str = dokVar.a;
        gok gokVar = dokVar.b;
        UiText uiText = dokVar.c;
        String str2 = dokVar.d;
        UiText uiText2 = dokVar.e;
        UiText uiText3 = dokVar.f;
        UiText uiText4 = dokVar.g;
        String str3 = dokVar.h;
        String str4 = dokVar.i;
        if ((i & 512) != 0) {
            z = dokVar.j;
        }
        boolean z3 = z;
        if ((i & 1024) != 0) {
            z2 = dokVar.k;
        }
        str.getClass();
        uiText.getClass();
        uiText2.getClass();
        str3.getClass();
        return new dok(str, gokVar, uiText, str2, uiText2, uiText3, uiText4, str3, str4, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dok)) {
            return false;
        }
        dok dokVar = (dok) obj;
        return Intrinsics.g(this.a, dokVar.a) && this.b == dokVar.b && Intrinsics.g(this.c, dokVar.c) && this.d.equals(dokVar.d) && Intrinsics.g(this.e, dokVar.e) && this.f.equals(dokVar.f) && this.g.equals(dokVar.g) && Intrinsics.g(this.h, dokVar.h) && this.i.equals(dokVar.i) && this.j == dokVar.j && this.k == dokVar.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + mtg0.a(gmf0.a(gmf0.a(yvf.a(yvf.a(yvf.a(gmf0.a(yvf.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
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
        uts.b(this.i, ", isSelected=", vZBMKENANSz.dDodzQEgWFAa, sb, this.j);
        return mq0.a(sb, this.k, ")");
    }
}
