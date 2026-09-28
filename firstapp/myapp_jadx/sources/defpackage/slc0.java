package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class slc0 {
    public static final slc0 f;
    public final fqo a;
    public final hlc0 b;
    public final clc0 c;
    public final qcn<vkc0> d;
    public final wlc0 e;

    static {
        clc0 clc0Var = clc0.h;
        qcn qcnVarB = a4h.b(m2g.a);
        f = new slc0(new fqo(new fqo.a.b(null), vch0.a), hlc0.d, clc0Var, qcnVarB, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public slc0(fqo fqoVar, hlc0 hlc0Var, clc0 clc0Var, qcn<? extends vkc0> qcnVar, wlc0 wlc0Var) {
        hlc0Var.getClass();
        clc0Var.getClass();
        qcnVar.getClass();
        this.a = fqoVar;
        this.b = hlc0Var;
        this.c = clc0Var;
        this.d = qcnVar;
        this.e = wlc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slc0)) {
            return false;
        }
        slc0 slc0Var = (slc0) obj;
        return this.a.equals(slc0Var.a) && Intrinsics.g(this.b, slc0Var.b) && Intrinsics.g(this.c, slc0Var.c) && Intrinsics.g(this.d, slc0Var.d) && this.e == slc0Var.e;
    }

    public final int hashCode() {
        int iA = shu.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
        wlc0 wlc0Var = this.e;
        return iA + (wlc0Var == null ? 0 : wlc0Var.hashCode());
    }

    public final String toString() {
        return "SportyLegendsSettlementRunningPageState(topAppBarState=" + this.a + ", matchTrackerPlayerState=" + this.b + ", eventState=" + this.c + ", betOddsState=" + this.d + ", statusHeaderState=" + this.e + ")";
    }
}
