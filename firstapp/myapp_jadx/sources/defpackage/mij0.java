package defpackage;

import com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mij0 {
    public final WithdrawAlertHintStatus a;
    public final boolean b;
    public final boolean c;

    public mij0(WithdrawAlertHintStatus withdrawAlertHintStatus, boolean z, boolean z2) {
        withdrawAlertHintStatus.getClass();
        this.a = withdrawAlertHintStatus;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mij0)) {
            return false;
        }
        mij0 mij0Var = (mij0) obj;
        return Intrinsics.g(this.a, mij0Var.a) && this.b == mij0Var.b && this.c == mij0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WithdrawBankHintBundleState(withdrawAlertHintStatus=");
        sb.append(this.a);
        sb.append(", showKYCHint=");
        sb.append(this.b);
        sb.append(", showSportyPinHint=");
        return mq0.a(sb, this.c, ")");
    }

    public mij0() {
        this(0);
    }

    public /* synthetic */ mij0(int i) {
        this(WithdrawAlertHintStatus.Gone.a, false, false);
    }
}
