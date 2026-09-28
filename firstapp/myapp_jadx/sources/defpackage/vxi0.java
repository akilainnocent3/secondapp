package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class vxi0 {
    public final double a;
    public final String b;
    public final double c;

    public vxi0(double d, String str, double d2) {
        str.getClass();
        this.a = d;
        this.b = str;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxi0)) {
            return false;
        }
        vxi0 vxi0Var = (vxi0) obj;
        return Double.compare(this.a, vxi0Var.a) == 0 && Intrinsics.g(this.b, vxi0Var.b) && Double.compare(this.c, vxi0Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + gmf0.a(Double.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WalletState(balance=");
        sb.append(this.a);
        sb.append(", currency=");
        sb.append(this.b);
        sb.append(", diff=");
        return org0.a(sb, this.c, ')');
    }

    public vxi0() {
        this(0);
    }

    public /* synthetic */ vxi0(int i) {
        this(0.0d, "", 0.0d);
    }
}
