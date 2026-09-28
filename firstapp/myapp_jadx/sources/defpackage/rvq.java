package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rvq {
    public final int a;
    public final String b;
    public final qcn<Integer> c;
    public final boolean d;

    public rvq(int i, String str, qcn<Integer> qcnVar, boolean z) {
        str.getClass();
        qcnVar.getClass();
        this.a = i;
        this.b = str;
        this.c = qcnVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvq)) {
            return false;
        }
        rvq rvqVar = (rvq) obj;
        return this.a == rvqVar.a && Intrinsics.g(this.b, rvqVar.b) && Intrinsics.g(this.c, rvqVar.c) && this.d == rvqVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + shu.a(this.c, gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "LNMyNumberItemState(id=", ", name=", this.b, ", mainNumbers=");
        sbA.append(this.c);
        sbA.append(", canApply=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
