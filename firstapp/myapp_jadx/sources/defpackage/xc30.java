package defpackage;

import com.appsflyer.internal.m;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xc30 implements yc30 {
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final int h;
    public final x280 i;
    public final ed30 j;
    public final UiText k;
    public final zrd0.b l;
    public final asd0 m;
    public final UiText n;
    public final dqk o;
    public final boolean p;
    public final usd0 q;
    public final dg30 r;
    public final sg10 s;
    public final boolean t;

    public xc30(String str, int i, String str2, int i2, int i3, int i4, String str3, int i5, x280 x280Var, ed30 ed30Var, ResourceUiText resourceUiText, zrd0.b bVar, asd0 asd0Var, ResourceUiText resourceUiText2, dqk dqkVar, boolean z, usd0 usd0Var, dg30 dg30Var, sg10 sg10Var, boolean z2) {
        m.a(str, str2, str3);
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = str3;
        this.h = i5;
        this.i = x280Var;
        this.j = ed30Var;
        this.k = resourceUiText;
        this.l = bVar;
        this.m = asd0Var;
        this.n = resourceUiText2;
        this.o = dqkVar;
        this.p = z;
        this.q = usd0Var;
        this.r = dg30Var;
        this.s = sg10Var;
        this.t = z2;
    }

    @Override // defpackage.yc30
    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc30)) {
            return false;
        }
        xc30 xc30Var = (xc30) obj;
        return Intrinsics.g(this.a, xc30Var.a) && this.b == xc30Var.b && Intrinsics.g(this.c, xc30Var.c) && this.d == xc30Var.d && this.e == xc30Var.e && this.f == xc30Var.f && Intrinsics.g(this.g, xc30Var.g) && this.h == xc30Var.h && this.i.equals(xc30Var.i) && this.j.equals(xc30Var.j) && Intrinsics.g(this.k, xc30Var.k) && this.l.equals(xc30Var.l) && this.m.equals(xc30Var.m) && Intrinsics.g(this.n, xc30Var.n) && Intrinsics.g(this.o, xc30Var.o) && this.p == xc30Var.p && this.q.equals(xc30Var.q) && this.r.equals(xc30Var.r) && this.s.equals(xc30Var.s) && this.t == xc30Var.t;
    }

    public final int hashCode() {
        int iHashCode = (this.j.hashCode() + ((this.i.hashCode() + gpp.a(this.h, gmf0.a(gpp.a(this.f, gpp.a(this.e, gpp.a(this.d, gmf0.a(gpp.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31), 31), 31, this.g), 31)) * 31)) * 31;
        UiText uiText = this.k;
        int iHashCode2 = (this.m.hashCode() + gmf0.a((iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31, 31, this.l.a)) * 31;
        UiText uiText2 = this.n;
        int iHashCode3 = (iHashCode2 + (uiText2 == null ? 0 : uiText2.hashCode())) * 31;
        dqk dqkVar = this.o;
        return Boolean.hashCode(this.t) + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + mtg0.a((iHashCode3 + (dqkVar != null ? dqkVar.hashCode() : 0)) * 31, 31, this.p)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "QuickBetSingleSelectionState(outcomeId=", this.a, ", backgroundColorResId=", ", oddsText=");
        wxa.b(this.d, this.c, ", oddsTextColorResId=", ", sportIconResId=", sbA);
        d5d.a(sbA, this.e, ", sportIconTintResId=", this.f, ", primaryText=");
        wxa.b(this.h, this.g, ", primaryTextColorResId=", ", secondaryContent=", sbA);
        sbA.append(this.i);
        sbA.append(", tertiaryTextState=");
        sbA.append(this.j);
        sbA.append(", tagUiText=");
        sbA.append(this.k);
        sbA.append(", stakeInputSingleType=");
        sbA.append(this.l);
        sbA.append(", stakeInputState=");
        sbA.append(this.m);
        sbA.append(", stakeInputErrorUiText=");
        sbA.append(this.n);
        sbA.append(", giftPickerButtonState=");
        sbA.append(this.o);
        sbA.append(", shouldShowStakeKeyboard=");
        sbA.append(this.p);
        sbA.append(", stakeKeyboardUiState=");
        sbA.append(this.q);
        sbA.append(", winningInfoState=");
        sbA.append(this.r);
        sbA.append(", placeBetButtonState=");
        sbA.append(this.s);
        sbA.append(", shouldShowAcceptChangesButton=");
        sbA.append(this.t);
        sbA.append(")");
        return sbA.toString();
    }
}
