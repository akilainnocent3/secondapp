package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class sl2 {
    public final boolean a;
    public final boolean b;
    public final mz1 c;
    public final cj5 d;

    public sl2(boolean z, boolean z2, mz1 mz1Var, cj5 cj5Var) {
        mz1Var.getClass();
        cj5Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = mz1Var;
        this.d = cj5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl2)) {
            return false;
        }
        sl2 sl2Var = (sl2) obj;
        return this.a == sl2Var.a && this.b == sl2Var.b && Intrinsics.g(this.c, sl2Var.c) && Intrinsics.g(this.d, sl2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("BetContainerDataClass(resetWhole=", ", showGif=", ", gameColor=", this.a, this.b);
        sbA.append(this.c);
        sbA.append(", buildVariantColors=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
