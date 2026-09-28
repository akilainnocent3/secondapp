package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class iki0 {
    public final qcn<kwv> a;
    public final ucn<Integer> b;
    public final ucn<Integer> c;
    public final int d;
    public final int e;

    public iki0(qcn<kwv> qcnVar, ucn<Integer> ucnVar, ucn<Integer> ucnVar2, int i, int i2) {
        qcnVar.getClass();
        ucnVar.getClass();
        ucnVar2.getClass();
        this.a = qcnVar;
        this.b = ucnVar;
        this.c = ucnVar2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iki0)) {
            return false;
        }
        iki0 iki0Var = (iki0) obj;
        return Intrinsics.g(this.a, iki0Var.a) && Intrinsics.g(this.b, iki0Var.b) && Intrinsics.g(this.c, iki0Var.c) && this.d == iki0Var.d && this.e == iki0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + gpp.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VirtualLobbyMissionUiState(missions=");
        sb.append(this.a);
        sb.append(", expandedMissionIds=");
        sb.append(this.b);
        sb.append(", processingMissionIds=");
        sb.append(this.c);
        sb.append(", ongoingCount=");
        sb.append(this.d);
        sb.append(", completedCount=");
        return zk1.a(this.e, ")", sb);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public iki0(int i) {
        n1a0 n1a0Var = n1a0.c;
        pg00 pg00Var = pg00.e;
        this(n1a0Var, pg00Var, pg00Var, 0, 0);
    }
}
