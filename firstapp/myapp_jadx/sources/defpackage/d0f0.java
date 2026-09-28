package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d0f0 {
    public final q0f0 a;
    public final uf00<oze0> b;

    public d0f0(int i) {
        this(new q0f0("", ""), n1a0.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0f0)) {
            return false;
        }
        d0f0 d0f0Var = (d0f0) obj;
        return Intrinsics.g(this.a, d0f0Var.a) && Intrinsics.g(this.b, d0f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TGSidePanelState(userInfo=" + this.a + ", list=" + this.b + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0f0(q0f0 q0f0Var, uf00<? extends oze0> uf00Var) {
        uf00Var.getClass();
        this.a = q0f0Var;
        this.b = uf00Var;
    }

    public d0f0() {
        this(0);
    }
}
