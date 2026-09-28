package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class sg90 {
    public final hph0 a;
    public final uf00<ce90> b;

    public sg90(int i) {
        this(new hph0("", ""), n1a0.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg90)) {
            return false;
        }
        sg90 sg90Var = (sg90) obj;
        return Intrinsics.g(this.a, sg90Var.a) && Intrinsics.g(this.b, sg90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SidePanelState(userInfo=" + this.a + ", list=" + this.b + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sg90(hph0 hph0Var, uf00<? extends ce90> uf00Var) {
        uf00Var.getClass();
        this.a = hph0Var;
        this.b = uf00Var;
    }

    public sg90() {
        this(0);
    }
}
