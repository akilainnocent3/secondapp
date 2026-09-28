package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bnc0 {
    public final smc0 a;
    public final smc0 b;
    public final mcc0 c;
    public final rmc0 d;
    public final float e;

    public bnc0(smc0 smc0Var, smc0 smc0Var2, mcc0 mcc0Var, rmc0 rmc0Var, float f) {
        this.a = smc0Var;
        this.b = smc0Var2;
        this.c = mcc0Var;
        this.d = rmc0Var;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnc0)) {
            return false;
        }
        bnc0 bnc0Var = (bnc0) obj;
        return this.a.equals(bnc0Var.a) && this.b.equals(bnc0Var.b) && Intrinsics.g(this.c, bnc0Var.c) && this.d == bnc0Var.d && g7f.b(this.e, bnc0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        mcc0 mcc0Var = this.c;
        return Float.hashCode(this.e) + ((this.d.hashCode() + ((iHashCode + (mcc0Var == null ? 0 : mcc0Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        String strC = g7f.c(this.e);
        StringBuilder sb = new StringBuilder("SportyLegendsStatsState(leftCardState=");
        sb.append(this.a);
        sb.append(", rightCardState=");
        sb.append(this.b);
        sb.append(", headToHeadStats=");
        sb.append(this.c);
        sb.append(", bannerState=");
        sb.append(this.d);
        sb.append(", bannerHeight=");
        return uf80.a(sb, strC, ")");
    }
}
