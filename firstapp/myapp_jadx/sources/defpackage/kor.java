package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kor {
    public final qcn<ior> a;
    public final qcn<ior> b;

    public kor(qcn<ior> qcnVar, qcn<ior> qcnVar2) {
        qcnVar.getClass();
        qcnVar2.getClass();
        this.a = qcnVar;
        this.b = qcnVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kor)) {
            return false;
        }
        kor korVar = (kor) obj;
        return Intrinsics.g(this.a, korVar.a) && Intrinsics.g(this.b, korVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LastMatchesState(homeRecords=" + this.a + ", awayRecords=" + this.b + ")";
    }
}
