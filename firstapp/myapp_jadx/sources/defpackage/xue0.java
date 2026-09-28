package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class xue0 {
    public final String a;
    public final int b;
    public final double c;
    public final double d;

    public xue0(double d, double d2, int i, String str) {
        this.a = str;
        this.b = i;
        this.c = d;
        this.d = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xue0)) {
            return false;
        }
        xue0 xue0Var = (xue0) obj;
        return Intrinsics.g(this.a, xue0Var.a) && this.b == xue0Var.b && Double.compare(this.c, xue0Var.c) == 0 && Double.compare(this.d, xue0Var.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + nrg0.a(gpp.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TGCave(name=");
        sb.append(this.a);
        sb.append(", index=");
        sb.append(this.b);
        sb.append(", maxMultiplier=");
        sb.append(this.c);
        sb.append(", hitRate=");
        return org0.a(sb, this.d, ')');
    }

    public xue0() {
        this(0);
    }

    public /* synthetic */ xue0(int i) {
        this(0.0d, 0.0d, 0, "");
    }
}
