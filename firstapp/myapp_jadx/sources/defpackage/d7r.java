package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d7r {
    public final qcn<x6r> a;
    public final tlq b;

    public d7r(tlq tlqVar, uf00 uf00Var) {
        uf00Var.getClass();
        this.a = uf00Var;
        this.b = tlqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7r)) {
            return false;
        }
        d7r d7rVar = (d7r) obj;
        return Intrinsics.g(this.a, d7rVar.a) && this.b == d7rVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LNResults(data=" + this.a + ", endState=" + this.b + ")";
    }
}
