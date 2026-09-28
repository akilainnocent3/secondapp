package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zy40 {
    public final js40 a;
    public final boolean b;
    public final ijf0 c;
    public final UiText d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final String k;
    public final boolean l;
    public final is40 m;

    public zy40(js40 js40Var, boolean z, ijf0 ijf0Var, UiText uiText, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, String str, boolean z7, is40 is40Var) {
        js40Var.getClass();
        this.a = js40Var;
        this.b = z;
        this.c = ijf0Var;
        this.d = uiText;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = i;
        this.k = str;
        this.l = z7;
        this.m = is40Var;
    }

    public static zy40 a(zy40 zy40Var, js40 js40Var, ijf0 ijf0Var, UiText uiText, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, String str, boolean z6, is40 is40Var, int i2) {
        if ((i2 & 1) != 0) {
            js40Var = zy40Var.a;
        }
        js40 js40Var2 = js40Var;
        boolean z7 = zy40Var.b;
        ijf0 ijf0Var2 = (i2 & 4) != 0 ? zy40Var.c : ijf0Var;
        UiText uiText2 = (i2 & 8) != 0 ? zy40Var.d : uiText;
        boolean z8 = (i2 & 16) != 0 ? zy40Var.e : z;
        boolean z9 = (i2 & 32) != 0 ? zy40Var.f : z2;
        boolean z10 = (i2 & 64) != 0 ? zy40Var.g : z3;
        boolean z11 = (i2 & 128) != 0 ? zy40Var.h : z4;
        boolean z12 = (i2 & 256) != 0 ? zy40Var.i : z5;
        int i3 = (i2 & 512) != 0 ? zy40Var.j : i;
        String str2 = (i2 & 1024) != 0 ? zy40Var.k : str;
        boolean z13 = (i2 & 2048) != 0 ? zy40Var.l : z6;
        is40 is40Var2 = (i2 & 4096) != 0 ? zy40Var.m : is40Var;
        zy40Var.getClass();
        js40Var2.getClass();
        return new zy40(js40Var2, z7, ijf0Var2, uiText2, z8, z9, z10, z11, z12, i3, str2, z13, is40Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy40)) {
            return false;
        }
        zy40 zy40Var = (zy40) obj;
        return this.a == zy40Var.a && this.b == zy40Var.b && this.c.equals(zy40Var.c) && Intrinsics.g(this.d, zy40Var.d) && this.e == zy40Var.e && this.f == zy40Var.f && this.g == zy40Var.g && this.h == zy40Var.h && this.i == zy40Var.i && this.j == zy40Var.j && this.k.equals(zy40Var.k) && this.l == zy40Var.l && this.m.equals(zy40Var.m);
    }

    public final int hashCode() {
        int iB = ey1.b(this.c, mtg0.a(this.a.hashCode() * 31, 31, this.b), 31);
        UiText uiText = this.d;
        return this.m.hashCode() + mtg0.a(gmf0.a(gpp.a(this.j, mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a((iB + (uiText == null ? 0 : uiText.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegistrationSuccessfulUiState(variant=");
        sb.append(this.a);
        sb.append(", showReferralCodeField=");
        sb.append(this.b);
        sb.append(", referralCode=");
        sb.append(this.c);
        sb.append(", referralCodeError=");
        sb.append(this.d);
        sb.append(", isReferralCodeValid=");
        nng.a(", isApplyingReferralCode=", ", isApplyButtonVisible=", sb, this.e, this.f);
        nng.a(", shouldAutoNavigateToDeposit=", ", showWelcomeBonus=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", countdownSecond=");
        sb.append(this.j);
        sb.append(", depositBannerRegisterDesc=");
        uts.b(this.k, ", shouldReportCampaignConversion=", ", bottomSheetCopy=", sb, this.l);
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }
}
