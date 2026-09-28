package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class mrd0 extends kni0 {
    public final String b;
    public final String c;
    public final qcn<fp20> d;

    public mrd0(uf00 uf00Var, String str, String str2) {
        uf00Var.getClass();
        this.b = str;
        this.c = str2;
        this.d = uf00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrd0)) {
            return false;
        }
        mrd0 mrd0Var = (mrd0) obj;
        return Intrinsics.g(this.b, mrd0Var.b) && Intrinsics.g(this.c, mrd0Var.c) && Intrinsics.g(this.d, mrd0Var.d);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "StakeCountTier(currency=" + this.b + ", stakeAmount=" + this.c + ", supportedGames=" + this.d + ')';
    }
}
