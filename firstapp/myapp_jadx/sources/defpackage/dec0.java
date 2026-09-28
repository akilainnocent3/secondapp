package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dec0 {
    public final String a;
    public final qcn<tfc0> b;

    public dec0(qcn qcnVar, String str) {
        qcnVar.getClass();
        this.a = str;
        this.b = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dec0)) {
            return false;
        }
        dec0 dec0Var = (dec0) obj;
        return this.a.equals(dec0Var.a) && Intrinsics.g(this.b, dec0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SportyLegendsMarketCategoryInfoState(marketCategoryId=" + this.a + ", marketStates=" + this.b + ")";
    }
}
