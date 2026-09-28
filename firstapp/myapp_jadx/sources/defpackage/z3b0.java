package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z3b0 {
    public final qcn<Integer> a;

    public z3b0(qcn<Integer> qcnVar) {
        qcnVar.getClass();
        this.a = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z3b0) && Intrinsics.g(this.a, ((z3b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vf5.a(this.a, "Spin2WinRecords(list=", ")");
    }

    public z3b0() {
        this(0);
    }

    public z3b0(int i) {
        this(n1a0.c);
    }
}
