package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u760 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final qcn<Integer> e;

    public u760(int i, int i2, int i3, int i4, qcn<Integer> qcnVar) {
        qcnVar.getClass();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u760)) {
            return false;
        }
        u760 u760Var = (u760) obj;
        return this.a == u760Var.a && this.b == u760Var.b && this.c == u760Var.c && this.d == u760Var.d && Intrinsics.g(this.e, u760Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gpp.a(this.d, gpp.a(this.c, gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "SBAutoSpinData(maxSpin=" + this.a + ", minSpin=" + this.b + ", stepSpin=" + this.c + ", defaultSpin=" + this.d + ", preDefined=" + this.e + ')';
    }
}
