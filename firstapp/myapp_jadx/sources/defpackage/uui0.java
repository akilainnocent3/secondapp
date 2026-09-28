package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class uui0 {
    public final String a;
    public final double b;

    public uui0(String str, double d) {
        str.getClass();
        this.a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uui0)) {
            return false;
        }
        uui0 uui0Var = (uui0) obj;
        return Intrinsics.g(this.a, uui0Var.a) && Double.compare(this.b, uui0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WDUserAmount(currency=");
        sb.append(this.a);
        sb.append(", balance=");
        return org0.a(sb, this.b, ')');
    }

    public /* synthetic */ uui0(int i) {
        this("", -1.0d);
    }

    public uui0() {
        this(0);
    }
}
