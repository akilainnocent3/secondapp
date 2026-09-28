package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class vz2 {
    public final String a;
    public final wz2 b;
    public final boolean c;
    public final yj60 d;

    public vz2(String str, wz2 wz2Var, boolean z, yj60 yj60Var) {
        wz2Var.getClass();
        this.a = str;
        this.b = wz2Var;
        this.c = z;
        this.d = yj60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz2)) {
            return false;
        }
        vz2 vz2Var = (vz2) obj;
        return Intrinsics.g(this.a, vz2Var.a) && Intrinsics.g(this.b, vz2Var.b) && this.c == vz2Var.c && Intrinsics.g(this.d, vz2Var.d);
    }

    public final int hashCode() {
        int iA = mtg0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        yj60 yj60Var = this.d;
        return iA + (yj60Var == null ? 0 : yj60Var.hashCode());
    }

    public final String toString() {
        return "BetSliderAmountState(betAmount=" + this.a + ", errorState=" + this.b + ", isGift=" + this.c + ", icon=" + this.d + ')';
    }

    public vz2() {
        this(0);
    }

    public /* synthetic */ vz2(int i) {
        this("", wz2.b.a, false, null);
    }
}
