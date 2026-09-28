package defpackage;

import com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rij0 {
    public static final rij0 i = new rij0(true, true, true, true, false, true, true, WithdrawAlertHintStatus.Gone.a);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final WithdrawAlertHintStatus h;

    public rij0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, WithdrawAlertHintStatus withdrawAlertHintStatus) {
        withdrawAlertHintStatus.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = withdrawAlertHintStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rij0)) {
            return false;
        }
        rij0 rij0Var = (rij0) obj;
        return this.a == rij0Var.a && this.b == rij0Var.b && this.c == rij0Var.c && this.d == rij0Var.d && this.e == rij0Var.e && this.f == rij0Var.f && this.g == rij0Var.g && Intrinsics.g(this.h, rij0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("WithdrawBankUiState(isBankSelectable=", ", isAccountEditable=", ", isSwitchBankClickable=", this.a, this.b);
        nng.a(", isAmountEditable=", ", shouldShowUnsupportedHint=", sbA, this.c, this.d);
        nng.a(", isAccountAddable=", ", isDefaultChangeable=", sbA, this.e, this.f);
        sbA.append(this.g);
        sbA.append(", withdrawAlertHintStatus=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}
