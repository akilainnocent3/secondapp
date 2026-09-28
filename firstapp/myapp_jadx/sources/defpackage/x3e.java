package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x3e {
    public static final x3e e = new x3e(Ctry.d, false, null, false);
    public final Ctry a;
    public final boolean b;
    public final rry c;
    public final boolean d;

    public x3e(Ctry ctry, boolean z, rry rryVar, boolean z2) {
        ctry.getClass();
        this.a = ctry;
        this.b = z;
        this.c = rryVar;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3e)) {
            return false;
        }
        x3e x3eVar = (x3e) obj;
        return Intrinsics.g(this.a, x3eVar.a) && this.b == x3eVar.b && Intrinsics.g(this.c, x3eVar.c) && this.d == x3eVar.d;
    }

    public final int hashCode() {
        int iA = mtg0.a(this.a.hashCode() * 31, 31, this.b);
        rry rryVar = this.c;
        return Boolean.hashCode(this.d) + ((iA + (rryVar == null ? 0 : rryVar.hashCode())) * 31);
    }

    public final String toString() {
        return "DepositOneTimeAccountUiState(promotion=" + this.a + ", isPromotionDetailVisible=" + this.b + ", howToDeposit=" + this.c + ", isHowToDepositExpanded=" + this.d + ")";
    }
}
