package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p1k {
    public final int a;
    public final qai0 b;

    public p1k(int i, qai0 qai0Var) {
        qai0Var.getClass();
        this.a = i;
        this.b = qai0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1k)) {
            return false;
        }
        p1k p1kVar = (p1k) obj;
        return this.a == p1kVar.a && Intrinsics.g(this.b, p1kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.a + ", hint=" + this.b + ')';
    }
}
