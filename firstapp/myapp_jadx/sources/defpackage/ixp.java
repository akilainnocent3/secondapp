package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ixp {
    public final qcn<j58> a;
    public final int b;
    public final zkq c;

    public ixp(qcn<j58> qcnVar, int i, zkq zkqVar) {
        this.a = qcnVar;
        this.b = i;
        this.c = zkqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixp)) {
            return false;
        }
        ixp ixpVar = (ixp) obj;
        return Intrinsics.g(this.a, ixpVar.a) && this.b == ixpVar.b && this.c == ixpVar.c;
    }

    public final int hashCode() {
        qcn<j58> qcnVar = this.a;
        return this.c.hashCode() + gpp.a(this.b, (qcnVar == null ? 0 : qcnVar.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "LNBall(color=" + this.a + ", number=" + this.b + ", hotCold=" + this.c + ")";
    }
}
