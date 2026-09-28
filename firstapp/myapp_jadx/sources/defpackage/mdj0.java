package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mdj0 {
    public static final int u;
    public final int a;
    public final String b;
    public final mfj0 c;
    public final u4f d;
    public final lcj0 e;
    public final UiText f;
    public final String g;
    public final ResourceUiText h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final usd0 o;
    public final asd0 p;
    public final jdj0 q;
    public final qcj0 r;
    public final String s;
    public final UiText t;

    static {
        int i = u4f.d;
        u = 8;
    }

    public mdj0(int i, String str, mfj0 mfj0Var, u4f u4fVar, lcj0 lcj0Var, ResourceUiText resourceUiText, String str2, ResourceUiText resourceUiText2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, usd0 usd0Var, asd0 asd0Var, jdj0 jdj0Var, qcj0 qcj0Var, String str6, ResourceUiText resourceUiText3) {
        str4.getClass();
        asd0Var.getClass();
        qcj0Var.getClass();
        this.a = i;
        this.b = str;
        this.c = mfj0Var;
        this.d = u4fVar;
        this.e = lcj0Var;
        this.f = resourceUiText;
        this.g = str2;
        this.h = resourceUiText2;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = usd0Var;
        this.p = asd0Var;
        this.q = jdj0Var;
        this.r = qcj0Var;
        this.s = str6;
        this.t = resourceUiText3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdj0)) {
            return false;
        }
        mdj0 mdj0Var = (mdj0) obj;
        return this.a == mdj0Var.a && this.b.equals(mdj0Var.b) && Intrinsics.g(this.c, mdj0Var.c) && this.d.equals(mdj0Var.d) && this.e == mdj0Var.e && Intrinsics.g(this.f, mdj0Var.f) && this.g.equals(mdj0Var.g) && this.h.equals(mdj0Var.h) && this.i.equals(mdj0Var.i) && Intrinsics.g(this.j, mdj0Var.j) && this.k.equals(mdj0Var.k) && this.l == mdj0Var.l && this.m == mdj0Var.m && this.n == mdj0Var.n && this.o.equals(mdj0Var.o) && Intrinsics.g(this.p, mdj0Var.p) && Intrinsics.g(this.q, mdj0Var.q) && Intrinsics.g(this.r, mdj0Var.r) && this.s.equals(mdj0Var.s) && Intrinsics.g(this.t, mdj0Var.t);
    }

    public final int hashCode() {
        int iA = gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        mfj0 mfj0Var = this.c;
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((iA + (mfj0Var == null ? 0 : mfj0Var.hashCode())) * 31)) * 31)) * 31;
        UiText uiText = this.f;
        int iHashCode2 = (this.p.hashCode() + ((this.o.hashCode() + mtg0.a(mtg0.a(mtg0.a(gmf0.a(gmf0.a(gmf0.a(wh8.a(gmf0.a((iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n)) * 31)) * 31;
        jdj0 jdj0Var = this.q;
        int iA2 = gmf0.a((this.r.hashCode() + ((iHashCode2 + (jdj0Var == null ? 0 : jdj0Var.hashCode())) * 31)) * 31, 31, this.s);
        UiText uiText2 = this.t;
        return iA2 + (uiText2 != null ? uiText2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "WinningPopupDoubleOrNothingState(roundIndex=", ", headerAmountText=", this.b, ", myEventsState=");
        sbA.append(this.c);
        sbA.append(", stepperState=");
        sbA.append(this.d);
        sbA.append(", bannerStatus=");
        sbA.append(this.e);
        sbA.append(", streakText=");
        sbA.append(this.f);
        sbA.append(", countdownText=");
        sbA.append(this.g);
        sbA.append(", winningAmountHeaderText=");
        sbA.append(this.h);
        sbA.append(", winningAmountText=");
        hxa.c(sbA, this.i, ", currencyText=", this.j, ", toWinAmountText=");
        uts.b(this.k, ", isCountdownFinished=", ", shouldShowCountdownShadow=", sbA, this.l);
        nng.a(", shouldShowStakeKeyboard=", ", stakeKeyboardUiState=", sbA, this.m, this.n);
        sbA.append(this.o);
        sbA.append(", stakeInputState=");
        sbA.append(this.p);
        sbA.append(", stakeInputHintState=");
        sbA.append(this.q);
        sbA.append(", bottomButtonsState=");
        sbA.append(this.r);
        sbA.append(", cashoutButtonText=");
        sbA.append(this.s);
        sbA.append(", errorMessage=");
        sbA.append(this.t);
        sbA.append(")");
        return sbA.toString();
    }
}
