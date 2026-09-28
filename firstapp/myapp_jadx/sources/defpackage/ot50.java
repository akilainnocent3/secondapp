package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ot50 {
    public final long a;
    public final nt50 b;

    public ot50(long j, nt50 nt50Var) {
        this.a = j;
        this.b = nt50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot50)) {
            return false;
        }
        ot50 ot50Var = (ot50) obj;
        long j = ot50Var.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && Intrinsics.g(this.b, ot50Var.b);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        int iHashCode = Long.hashCode(this.a) * 31;
        nt50 nt50Var = this.b;
        return iHashCode + (nt50Var != null ? nt50Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleConfiguration(color=");
        ofz.a(this.a, ", rippleAlpha=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
