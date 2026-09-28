package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class kqe0 {
    public final String a;
    public final int b;
    public final int c;

    public kqe0(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqe0)) {
            return false;
        }
        kqe0 kqe0Var = (kqe0) obj;
        return Intrinsics.g(this.a, kqe0Var.a) && this.b == kqe0Var.b && this.c == kqe0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return rr1.b(sb, this.c, ')');
    }
}
