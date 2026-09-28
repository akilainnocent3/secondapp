package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hlc0 {
    public static final hlc0 d = new hlc0(n1a0.c, glc0.MUTED, false);
    public final qcn<flc0> a;
    public final glc0 b;
    public final boolean c;

    public hlc0(qcn<flc0> qcnVar, glc0 glc0Var, boolean z) {
        qcnVar.getClass();
        this.a = qcnVar;
        this.b = glc0Var;
        this.c = z;
    }

    public static hlc0 a(hlc0 hlc0Var, qcn qcnVar, glc0 glc0Var, int i) {
        if ((i & 1) != 0) {
            qcnVar = hlc0Var.a;
        }
        if ((i & 2) != 0) {
            glc0Var = hlc0Var.b;
        }
        boolean z = (i & 4) != 0 ? hlc0Var.c : true;
        hlc0Var.getClass();
        qcnVar.getClass();
        return new hlc0(qcnVar, glc0Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlc0)) {
            return false;
        }
        hlc0 hlc0Var = (hlc0) obj;
        return Intrinsics.g(this.a, hlc0Var.a) && this.b == hlc0Var.b && this.c == hlc0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportyLegendsSettlementMatchTrackerPlayerState(matchTrackerItemStates=");
        sb.append(this.a);
        sb.append(", muteState=");
        sb.append(this.b);
        sb.append(", isGameOver=");
        return mq0.a(sb, this.c, ")");
    }
}
