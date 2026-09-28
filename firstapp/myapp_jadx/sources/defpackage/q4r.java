package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q4r {
    public final qcn<b4r> a;
    public final boolean b;

    public q4r(qcn<b4r> qcnVar, boolean z) {
        qcnVar.getClass();
        this.a = qcnVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4r)) {
            return false;
        }
        q4r q4rVar = (q4r) obj;
        return Intrinsics.g(this.a, q4rVar.a) && this.b == q4rVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LNQuickPickState(list=" + this.a + ", isExpanded=" + this.b + ")";
    }

    public q4r(int i) {
        this(n1a0.c, true);
    }

    public q4r() {
        this(0);
    }
}
