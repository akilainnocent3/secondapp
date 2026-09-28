package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class uk10 {
    public final kk10 a;
    public final sj10 b;

    public uk10() {
        this(null, new sj10(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk10)) {
            return false;
        }
        uk10 uk10Var = (uk10) obj;
        return Intrinsics.g(this.b, uk10Var.b) && Intrinsics.g(this.a, uk10Var.a);
    }

    public final int hashCode() {
        kk10 kk10Var = this.a;
        int iHashCode = (kk10Var != null ? kk10Var.hashCode() : 0) * 31;
        sj10 sj10Var = this.b;
        return iHashCode + (sj10Var != null ? sj10Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }

    public uk10(kk10 kk10Var, sj10 sj10Var) {
        this.a = kk10Var;
        this.b = sj10Var;
    }
}
