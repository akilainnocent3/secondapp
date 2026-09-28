package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hz00 {
    public final uf00<d08> a;
    public final gz00 b;

    /* JADX WARN: Multi-variable type inference failed */
    public hz00(uf00<? extends d08> uf00Var, gz00 gz00Var) {
        uf00Var.getClass();
        this.a = uf00Var;
        this.b = gz00Var;
    }

    public static hz00 a(hz00 hz00Var, uf00 uf00Var, gz00 gz00Var, int i) {
        if ((i & 1) != 0) {
            uf00Var = hz00Var.a;
        }
        if ((i & 2) != 0) {
            gz00Var = hz00Var.b;
        }
        hz00Var.getClass();
        uf00Var.getClass();
        return new hz00(uf00Var, gz00Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz00)) {
            return false;
        }
        hz00 hz00Var = (hz00) obj;
        return Intrinsics.g(this.a, hz00Var.a) && this.b.equals(hz00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PinCodeState(boxList=" + this.a + ", focus=" + this.b + ")";
    }
}
