package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class bv1 {
    public final String a;
    public final Double b;
    public final Double c;

    public bv1(String str, Double d, Double d2) {
        str.getClass();
        this.a = str;
        this.b = d;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv1)) {
            return false;
        }
        bv1 bv1Var = (bv1) obj;
        return Intrinsics.g(this.a, bv1Var.a) && Intrinsics.g(this.b, bv1Var.b) && Intrinsics.g(this.c, bv1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.c;
        return iHashCode2 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserBalance(currency=");
        sb.append(this.a);
        sb.append(", balance=");
        sb.append(this.b);
        sb.append(", diff=");
        return itu.a(sb, this.c, ')');
    }

    public bv1() {
        this(0);
    }

    public /* synthetic */ bv1(int i) {
        this("", null, null);
    }
}
