package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class wmd0 {
    public final qcn<bpd0> a;

    public wmd0(qcn<bpd0> qcnVar) {
        qcnVar.getClass();
        this.a = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wmd0) && Intrinsics.g(this.a, ((wmd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StackerGameBoardState(rowsConfiguration=" + this.a + ')';
    }
}
