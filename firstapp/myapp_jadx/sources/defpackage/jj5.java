package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jj5 {
    public final ij5 a;
    public final int b;
    public final int c;

    public jj5(ij5 ij5Var, int i, int i2) {
        this.a = ij5Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj5)) {
            return false;
        }
        jj5 jj5Var = (jj5) obj;
        return Intrinsics.g(this.a, jj5Var.a) && this.b == jj5Var.b && this.c == jj5Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BulletSpanWithLevel(bullet=");
        sb.append(this.a);
        sb.append(", indentationLevel=");
        sb.append(this.b);
        sb.append(", start=");
        return rr1.b(sb, this.c, ')');
    }
}
