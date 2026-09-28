package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o2s {
    public final int a;
    public final fx90 b;

    public o2s(int i) {
        this(i, new fx90.a(24));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2s)) {
            return false;
        }
        o2s o2sVar = (o2s) obj;
        return this.a == o2sVar.a && Intrinsics.g(this.b, o2sVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        fx90 fx90Var = this.b;
        return iHashCode + (fx90Var == null ? 0 : fx90Var.hashCode());
    }

    public final String toString() {
        return "LeadingIcon(resId=" + this.a + ", size=" + this.b + ")";
    }

    public o2s(int i, fx90 fx90Var) {
        this.a = i;
        this.b = fx90Var;
    }
}
