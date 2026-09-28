package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class axc0 {
    public final String a;
    public final qcn<vyc0> b;

    public axc0(qcn qcnVar, String str) {
        qcnVar.getClass();
        this.a = str;
        this.b = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axc0)) {
            return false;
        }
        axc0 axc0Var = (axc0) obj;
        return this.a.equals(axc0Var.a) && Intrinsics.g(this.b, axc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SportyPenaltyMarketCategoryInfoState(marketCategoryId=" + this.a + ", marketStates=" + this.b + ")";
    }
}
