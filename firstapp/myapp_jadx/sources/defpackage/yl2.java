package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class yl2 extends b3 {
    public final String c;
    public final String d;
    public final String e;
    public final qcn<zo20> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl2(String str, String str2, String str3, uf00 uf00Var) {
        super(1);
        str.getClass();
        uf00Var.getClass();
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = uf00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl2)) {
            return false;
        }
        yl2 yl2Var = (yl2) obj;
        return Intrinsics.g(this.c, yl2Var.c) && Intrinsics.g(this.d, yl2Var.d) && Intrinsics.g(this.e, yl2Var.e) && Intrinsics.g(this.f, yl2Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.b3
    public final String toString() {
        return "BetCountTier(requiredBets=" + this.c + ", currency=" + this.d + ", stakeAmount=" + this.e + ", supportedGames=" + this.f + ')';
    }
}
