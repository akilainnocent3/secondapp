package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class lof0 {
    public final d68 a;
    public final eah0 b;

    public lof0(d68 d68Var, eah0 eah0Var) {
        this.a = d68Var;
        this.b = eah0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lof0)) {
            return false;
        }
        lof0 lof0Var = (lof0) obj;
        return Intrinsics.g(this.a, lof0Var.a) && Intrinsics.g(this.b, lof0Var.b);
    }

    public final int hashCode() {
        d68 d68Var = this.a;
        int iHashCode = (d68Var == null ? 0 : d68Var.hashCode()) * 31;
        eah0 eah0Var = this.b;
        return iHashCode + (eah0Var != null ? eah0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ThemeParameters(colorScheme=" + this.a + ", typography=" + this.b + ")";
    }
}
