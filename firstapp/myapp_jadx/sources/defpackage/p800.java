package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p800 {
    public final List<String> a;
    public final boolean b;
    public final int c;

    public p800(int i, List list, boolean z) {
        list.getClass();
        this.a = list;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p800)) {
            return false;
        }
        p800 p800Var = (p800) obj;
        return Intrinsics.g(this.a, p800Var.a) && this.b == p800Var.b && this.c == p800Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentProviders(paymentMethods=");
        sb.append(this.a);
        sb.append(", isLegacy=");
        sb.append(this.b);
        sb.append(", maxLogoColumns=");
        return zk1.a(this.c, ")", sb);
    }

    public p800() {
        this(0);
    }

    public p800(int i) {
        this(3, m2g.a, false);
    }
}
