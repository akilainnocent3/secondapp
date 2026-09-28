package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class bpd0 {
    public final long a;
    public final String b;
    public final qcn<uf4> c;

    /* JADX WARN: Multi-variable type inference failed */
    public bpd0(long j, String str, qcn<? extends uf4> qcnVar) {
        str.getClass();
        qcnVar.getClass();
        this.a = j;
        this.b = str;
        this.c = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpd0)) {
            return false;
        }
        bpd0 bpd0Var = (bpd0) obj;
        return this.a == bpd0Var.a && Intrinsics.g(this.b, bpd0Var.b) && Intrinsics.g(this.c, bpd0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "StackerRowConfiguration(stackerRefreshRate=" + this.a + ", reward=" + this.b + ", blockStates=" + this.c + ')';
    }
}
