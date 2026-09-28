package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xt5 implements Comparable<xt5> {
    public final int a;
    public final int b;
    public final int c;
    public final long d;

    public xt5(int i, int i2, int i3, long j) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(xt5 xt5Var) {
        return Intrinsics.i(this.d, xt5Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt5)) {
            return false;
        }
        xt5 xt5Var = (xt5) obj;
        return this.a == xt5Var.a && this.b == xt5Var.b && this.c == xt5Var.c && this.d == xt5Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + gpp.a(this.c, gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarDate(year=");
        sb.append(this.a);
        sb.append(", month=");
        sb.append(this.b);
        sb.append(", dayOfMonth=");
        sb.append(this.c);
        sb.append(", utcTimeMillis=");
        return uvh.a(sb, this.d, ')');
    }
}
