package defpackage;

import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class zu1 {
    public final boolean a;
    public final boolean b;
    public final Integer c;
    public final boolean d;

    public /* synthetic */ zu1(boolean z, boolean z2, Integer num, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : num, (i & 8) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu1)) {
            return false;
        }
        zu1 zu1Var = (zu1) obj;
        return this.a == zu1Var.a && this.b == zu1Var.b && Intrinsics.g(this.c, zu1Var.c) && this.d == zu1Var.d;
    }

    public final int hashCode() {
        int iA = mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        return Boolean.hashCode(this.d) + ((iA + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("BalanceKycUiState(showLockIcon=", rarBonoqWB.PxTbbZeqGgP, ", statusText=", this.a, this.b);
        sbA.append(this.c);
        sbA.append(", isDanger=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }

    public zu1(boolean z, boolean z2, Integer num, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = num;
        this.d = z3;
    }
}
