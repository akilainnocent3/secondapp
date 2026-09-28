package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w3x {
    public final f4x a;
    public final uf00<b4x> b;

    public w3x(f4x f4xVar, uf00<b4x> uf00Var) {
        f4xVar.getClass();
        uf00Var.getClass();
        this.a = f4xVar;
        this.b = uf00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3x)) {
            return false;
        }
        w3x w3xVar = (w3x) obj;
        return this.a == w3xVar.a && Intrinsics.g(this.b, w3xVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NCState(selectedTab=" + this.a + ", tabList=" + this.b + ")";
    }
}
