package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class pui0 {
    public final xri0 a;
    public final ari0 b;

    public pui0(xri0 xri0Var, ari0 ari0Var) {
        xri0Var.getClass();
        ari0Var.getClass();
        this.a = xri0Var;
        this.b = ari0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pui0)) {
            return false;
        }
        pui0 pui0Var = (pui0) obj;
        return Intrinsics.g(this.a, pui0Var.a) && Intrinsics.g(this.b, pui0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WDState(loadingState=" + this.a + ", dialogState=" + this.b + ')';
    }
}
