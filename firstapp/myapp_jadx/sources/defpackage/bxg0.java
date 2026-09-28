package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class bxg0<A, B, C> implements Serializable {
    public final A a;
    public final B b;
    public final C c;

    public bxg0(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxg0)) {
            return false;
        }
        bxg0 bxg0Var = (bxg0) obj;
        return Intrinsics.g(this.a, bxg0Var.a) && Intrinsics.g(this.b, bxg0Var.b) && Intrinsics.g(this.c, bxg0Var.c);
    }

    public final int hashCode() {
        A a = this.a;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.b;
        int iHashCode2 = (iHashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.c;
        return iHashCode2 + (c != null ? c.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        return ekw.a(sb, this.c, ')');
    }
}
