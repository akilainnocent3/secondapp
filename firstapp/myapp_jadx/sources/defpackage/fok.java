package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fok {
    public final String a;
    public final awk b;
    public final UiText c;
    public final String d;
    public final UiText e;
    public final ResourceUiText f;
    public final UiText g;
    public final UiText h;
    public final String i;
    public final String j;
    public final boolean k;
    public final yik l;
    public final int m;
    public final Integer n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final boolean t;
    public final eik u;

    public fok(String str, awk awkVar, UiText uiText, String str2, UiText uiText2, ResourceUiText resourceUiText, UiText uiText3, ResourceUiText resourceUiText2, String str3, String str4, boolean z, yik yikVar, int i, Integer num, int i2, int i3, int i4, int i5, int i6, boolean z2, eik eikVar) {
        str.getClass();
        uiText2.getClass();
        uiText3.getClass();
        str3.getClass();
        this.a = str;
        this.b = awkVar;
        this.c = uiText;
        this.d = str2;
        this.e = uiText2;
        this.f = resourceUiText;
        this.g = uiText3;
        this.h = resourceUiText2;
        this.i = str3;
        this.j = str4;
        this.k = z;
        this.l = yikVar;
        this.m = i;
        this.n = num;
        this.o = i2;
        this.p = i3;
        this.q = i4;
        this.r = i5;
        this.s = i6;
        this.t = z2;
        this.u = eikVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fok)) {
            return false;
        }
        fok fokVar = (fok) obj;
        return Intrinsics.g(this.a, fokVar.a) && this.b == fokVar.b && Intrinsics.g(this.c, fokVar.c) && this.d.equals(fokVar.d) && Intrinsics.g(this.e, fokVar.e) && this.f.equals(fokVar.f) && Intrinsics.g(this.g, fokVar.g) && Intrinsics.g(this.h, fokVar.h) && Intrinsics.g(this.i, fokVar.i) && Intrinsics.g(this.j, fokVar.j) && this.k == fokVar.k && this.l.equals(fokVar.l) && this.m == fokVar.m && Intrinsics.g(this.n, fokVar.n) && this.o == fokVar.o && this.p == fokVar.p && this.q == fokVar.q && this.r == fokVar.r && this.s == fokVar.s && this.t == fokVar.t && this.u.equals(fokVar.u);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        UiText uiText = this.c;
        int iA = yvf.a(wh8.a(yvf.a(gmf0.a((iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        UiText uiText2 = this.h;
        int iA2 = gmf0.a((iA + (uiText2 == null ? 0 : uiText2.hashCode())) * 31, 31, this.i);
        String str = this.j;
        int iA3 = gpp.a(this.m, (this.l.hashCode() + mtg0.a((iA2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.k)) * 31, 31);
        Integer num = this.n;
        return this.u.hashCode() + mtg0.a(gpp.a(this.s, gpp.a(this.r, gpp.a(this.q, gpp.a(this.p, gpp.a(this.o, (iA3 + (num != null ? num.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31, this.t);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftItemUiModel(giftId=");
        sb.append(this.a);
        sb.append(", giftType=");
        sb.append(this.b);
        sb.append(", conditionText=");
        sb.append(this.c);
        sb.append(", currency=");
        sb.append(this.d);
        sb.append(", amountText=");
        sb.append(this.e);
        sb.append(", expiryText=");
        sb.append(this.f);
        sb.append(", typeName=");
        vh8.a(sb, this.g, ", exclusiveForLabel=", this.h, ", title=");
        hxa.c(sb, this.i, ", description=", this.j, ", hasDescription=");
        sb.append(this.k);
        sb.append(", button=");
        sb.append(this.l);
        sb.append(", topDrawableRes=");
        sb.append(this.m);
        sb.append(", topTintColorRes=");
        sb.append(this.n);
        sb.append(", bottomDrawableRes=");
        d5d.a(sb, this.o, ", topTextColorRes=", this.p, ", secondaryColorRes=");
        d5d.a(sb, this.q, ", moreTextColorRes=", this.r, ", arrowTintColorRes=");
        sb.append(this.s);
        sb.append(", isWorldCupPass=");
        sb.append(this.t);
        sb.append(", gift=");
        sb.append(this.u);
        sb.append(")");
        return sb.toString();
    }
}
