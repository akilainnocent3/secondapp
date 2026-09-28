package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class xl2 extends kni0 {
    public final String b;
    public final String c;
    public final String d;
    public final qcn<fp20> e;

    public xl2(String str, String str2, String str3, uf00 uf00Var) {
        str.getClass();
        uf00Var.getClass();
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = uf00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl2)) {
            return false;
        }
        xl2 xl2Var = (xl2) obj;
        return Intrinsics.g(this.b, xl2Var.b) && Intrinsics.g(this.c, xl2Var.c) && Intrinsics.g(this.d, xl2Var.d) && Intrinsics.g(this.e, xl2Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BetCountTier(requiredBets=" + this.b + ", currency=" + this.c + ", stakeAmount=" + this.d + ", supportedGames=" + this.e + ')';
    }
}
