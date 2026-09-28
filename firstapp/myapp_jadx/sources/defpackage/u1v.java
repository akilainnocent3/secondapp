package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u1v {
    public final qcn<t1v> a;
    public final qcn<l1v> b;

    public u1v(uf00 uf00Var, uf00 uf00Var2) {
        uf00Var.getClass();
        uf00Var2.getClass();
        this.a = uf00Var;
        this.b = uf00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1v)) {
            return false;
        }
        u1v u1vVar = (u1v) obj;
        return Intrinsics.g(this.a, u1vVar.a) && Intrinsics.g(this.b, u1vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchEventDetailEventSwitcherState(leagueTabStates=" + this.a + ", eventStates=" + this.b + ")";
    }
}
