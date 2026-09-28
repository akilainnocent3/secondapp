package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class nrd0 extends b3 {
    public final String c;
    public final String d;
    public final qcn<zo20> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrd0(uf00 uf00Var, String str, String str2) {
        super(1);
        uf00Var.getClass();
        this.c = str;
        this.d = str2;
        this.e = uf00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrd0)) {
            return false;
        }
        nrd0 nrd0Var = (nrd0) obj;
        return Intrinsics.g(this.c, nrd0Var.c) && Intrinsics.g(this.d, nrd0Var.d) && Intrinsics.g(this.e, nrd0Var.e);
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.b3
    public final String toString() {
        return "StakeCountTier(currency=" + this.c + ", stakeAmount=" + this.d + ", supportedGames=" + this.e + ')';
    }
}
