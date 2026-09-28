package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fr2 {
    public final UiText a;
    public final UiText b;
    public final UiText c;
    public final bbj0 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public fr2(ResourceUiText resourceUiText, UiText uiText, UiText uiText2, bbj0 bbj0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        this((UiText) ((i & 1) != 0 ? null : resourceUiText), (i & 2) != 0 ? vch0.a : uiText, (i & 4) != 0 ? vch0.a : uiText2, (i & 8) != 0 ? bbj0.a : bbj0Var, (i & 16) != 0 ? false : z, (i & 32) != 0 ? true : z2, (i & 64) != 0 ? true : z3, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? true : z5, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr2)) {
            return false;
        }
        fr2 fr2Var = (fr2) obj;
        return Intrinsics.g(this.a, fr2Var.a) && Intrinsics.g(this.b, fr2Var.b) && Intrinsics.g(this.c, fr2Var.c) && this.d == fr2Var.d && this.e == fr2Var.e && this.f == fr2Var.f && this.g == fr2Var.g && this.h == fr2Var.h && this.i == fr2Var.i && this.j == fr2Var.j;
    }

    public final int hashCode() {
        UiText uiText = this.a;
        return Boolean.hashCode(this.j) + mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a((this.d.hashCode() + yvf.a(yvf.a((uiText == null ? 0 : uiText.hashCode()) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbA = uh8.a(this.a, this.b, "BetHistoryFilterState(dateRangeUiText=", ", betStatusUiText=", ", betResultUiText=");
        sbA.append(this.c);
        sbA.append(", winningFilterType=");
        sbA.append(this.d);
        sbA.append(", isDeleteMode=");
        nng.a(", isInitBetStatus=", ", isInitBetResult=", sbA, this.e, this.f);
        nng.a(", isDeleteEnabled=", ", isBetResultEnabled=", sbA, this.g, this.h);
        return lng.a(", isDeleteHintShown=", ")", sbA, this.i, this.j);
    }

    public fr2() {
        this((ResourceUiText) null, (UiText) null, (UiText) null, (bbj0) null, false, false, false, false, false, 1023);
    }

    public fr2(UiText uiText, UiText uiText2, UiText uiText3, bbj0 bbj0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        uiText2.getClass();
        uiText3.getClass();
        bbj0Var.getClass();
        this.a = uiText;
        this.b = uiText2;
        this.c = uiText3;
        this.d = bbj0Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
    }
}
