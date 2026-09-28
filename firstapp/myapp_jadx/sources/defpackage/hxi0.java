package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class hxi0 {
    public final double a;
    public final String b;

    public hxi0(double d, String str) {
        str.getClass();
        this.a = d;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxi0)) {
            return false;
        }
        hxi0 hxi0Var = (hxi0) obj;
        return Double.compare(this.a, hxi0Var.a) == 0 && Intrinsics.g(this.b, hxi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WalletInfo(balance=");
        sb.append(this.a);
        sb.append(", currency=");
        return j26.a(sb, this.b, ')');
    }

    public hxi0() {
        this(0);
    }

    public /* synthetic */ hxi0(int i) {
        this(0.0d, "");
    }
}
