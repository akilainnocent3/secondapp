package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jli0 {
    public final qcn<vki0> a;
    public final vki0 b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public jli0(qcn<? extends vki0> qcnVar, vki0 vki0Var, int i) {
        qcnVar.getClass();
        vki0Var.getClass();
        this.a = qcnVar;
        this.b = vki0Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jli0)) {
            return false;
        }
        jli0 jli0Var = (jli0) obj;
        return Intrinsics.g(this.a, jli0Var.a) && Intrinsics.g(this.b, jli0Var.b) && this.c == jli0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VirtualLobbyTabState(tabs=");
        sb.append(this.a);
        sb.append(", selectedTab=");
        sb.append(this.b);
        sb.append(", selectedIndex=");
        return zk1.a(this.c, ")", sb);
    }
}
