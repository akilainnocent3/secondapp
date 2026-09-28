package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ymd0 {
    public final long a;
    public final int b;
    public final int c;
    public final List<cpd0> d;

    public ymd0(long j, int i, int i2, List<cpd0> list) {
        list.getClass();
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymd0)) {
            return false;
        }
        ymd0 ymd0Var = (ymd0) obj;
        return this.a == ymd0Var.a && this.b == ymd0Var.b && this.c == ymd0Var.c && Intrinsics.g(this.d, ymd0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gpp.a(this.c, gpp.a(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StackerGameInitialConfiguration(id=");
        sb.append(this.a);
        sb.append(", rowsCount=");
        sb.append(this.b);
        sb.append(", columnsCount=");
        sb.append(this.c);
        sb.append(", rowConfiguration=");
        return o8i.a(sb, this.d, ')');
    }
}
