package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class aua0 {
    public final String a;
    public final qcn<bua0> b;

    public aua0(String str, uf00 uf00Var) {
        str.getClass();
        uf00Var.getClass();
        this.a = str;
        this.b = uf00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aua0)) {
            return false;
        }
        aua0 aua0Var = (aua0) obj;
        return Intrinsics.g(this.a, aua0Var.a) && Intrinsics.g(this.b, aua0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SpeedOptionBarState(selectedSpeedOptionId=" + this.a + ", speedOptionStates=" + this.b + ")";
    }
}
