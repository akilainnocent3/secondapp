package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kk3 {
    public final qcn<sk3> a;
    public final sk3 b;

    public kk3() {
        throw null;
    }

    public kk3(sk3 sk3Var) {
        qcn<sk3> qcnVarB = a4h.b(sk3.v);
        qcnVarB.getClass();
        sk3Var.getClass();
        this.a = qcnVarB;
        this.b = sk3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk3)) {
            return false;
        }
        kk3 kk3Var = (kk3) obj;
        return Intrinsics.g(this.a, kk3Var.a) && this.b == kk3Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BetslipAnimationModeState(options=" + this.a + ", currentSelectedMode=" + this.b + ")";
    }
}
