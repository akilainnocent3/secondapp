package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q7f0 {
    public final uf00<ahh> a;
    public final uf00<fpg> b;
    public final uf00<fpg> c;
    public final uf00<a4g0> d;

    public q7f0(uf00<ahh> uf00Var, uf00<fpg> uf00Var2, uf00<fpg> uf00Var3, uf00<a4g0> uf00Var4) {
        uf00Var2.getClass();
        uf00Var3.getClass();
        uf00Var4.getClass();
        this.a = uf00Var;
        this.b = uf00Var2;
        this.c = uf00Var3;
        this.d = uf00Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7f0)) {
            return false;
        }
        q7f0 q7f0Var = (q7f0) obj;
        return this.a.equals(q7f0Var.a) && Intrinsics.g(this.b, q7f0Var.b) && Intrinsics.g(this.c, q7f0Var.c) && Intrinsics.g(this.d, q7f0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + yvz.a(this.c, yvz.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "TeamOverviewUiModel(topNews=" + this.a + ", recentResults=" + this.b + ", fixtures=" + this.c + ", tournaments=" + this.d + ")";
    }
}
