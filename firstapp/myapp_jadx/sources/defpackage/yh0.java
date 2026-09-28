package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class yh0 {
    public final uf00<fcb0> a;
    public final uf00<fcb0> b;
    public final uf00<String> c;
    public final z8x d;

    public yh0(uf00<fcb0> uf00Var, uf00<fcb0> uf00Var2, uf00<String> uf00Var3, z8x z8xVar) {
        uf00Var.getClass();
        uf00Var2.getClass();
        uf00Var3.getClass();
        this.a = uf00Var;
        this.b = uf00Var2;
        this.c = uf00Var3;
        this.d = z8xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh0)) {
            return false;
        }
        yh0 yh0Var = (yh0) obj;
        return Intrinsics.g(this.a, yh0Var.a) && Intrinsics.g(this.b, yh0Var.b) && Intrinsics.g(this.c, yh0Var.c) && Intrinsics.g(this.d, yh0Var.d);
    }

    public final int hashCode() {
        int iA = yvz.a(this.c, yvz.a(this.b, this.a.hashCode() * 31, 31), 31);
        z8x z8xVar = this.d;
        return iA + (z8xVar == null ? 0 : z8xVar.hashCode());
    }

    public final String toString() {
        return "AnimationInternalEvent(nightDayChannel=" + this.a + ", resultChannel=" + this.b + ", endAnimations=" + this.c + ", endAction=" + this.d + ')';
    }
}
