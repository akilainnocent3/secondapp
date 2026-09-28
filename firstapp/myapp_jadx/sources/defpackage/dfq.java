package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dfq {
    public final leq a;
    public final boolean b;

    public dfq(leq leqVar, boolean z) {
        leqVar.getClass();
        this.a = leqVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfq)) {
            return false;
        }
        dfq dfqVar = (dfq) obj;
        return Intrinsics.g(this.a, dfqVar.a) && this.b == dfqVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LNGiftTabState(content=" + this.a + ", isRefreshing=" + this.b + ")";
    }

    public dfq() {
        this(0);
    }

    public /* synthetic */ dfq(int i) {
        this(leq.c.a, false);
    }
}
