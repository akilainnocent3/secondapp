package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xh0 {
    public final uf00<ecb0> a;
    public final rn30 b;
    public final ecb0 c;

    public xh0(uf00<ecb0> uf00Var, rn30 rn30Var, ecb0 ecb0Var) {
        uf00Var.getClass();
        this.a = uf00Var;
        this.b = rn30Var;
        this.c = ecb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh0)) {
            return false;
        }
        xh0 xh0Var = (xh0) obj;
        return Intrinsics.g(this.a, xh0Var.a) && Intrinsics.g(this.b, xh0Var.b) && Intrinsics.g(this.c, xh0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        rn30 rn30Var = this.b;
        int iHashCode2 = (iHashCode + (rn30Var == null ? 0 : rn30Var.hashCode())) * 31;
        ecb0 ecb0Var = this.c;
        return iHashCode2 + (ecb0Var != null ? ecb0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AnimationInternalEvent(animations=" + this.a + ", endAction=" + this.b + ", endAnimation=" + this.c + ')';
    }

    public /* synthetic */ xh0(uf00 uf00Var, rn30 rn30Var) {
        this(uf00Var, rn30Var, (ecb0) CollectionsKt.d0(uf00Var));
    }
}
