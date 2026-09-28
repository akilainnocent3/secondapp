package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ovf0 {
    public final qcn<auf0> a;
    public final auf0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ovf0(uf00 uf00Var, auf0 auf0Var, boolean z, int i) {
        this((i & 1) != 0 ? n1a0.c : uf00Var, (i & 2) != 0 ? new auf0(0) : auf0Var, (i & 4) != 0 ? false : z, false, false);
    }

    public static ovf0 a(ovf0 ovf0Var, auf0 auf0Var, boolean z, boolean z2, int i) {
        qcn<auf0> qcnVar = ovf0Var.a;
        if ((i & 2) != 0) {
            auf0Var = ovf0Var.b;
        }
        auf0 auf0Var2 = auf0Var;
        if ((i & 4) != 0) {
            z = ovf0Var.c;
        }
        boolean z3 = z;
        boolean z4 = (i & 8) != 0 ? ovf0Var.d : true;
        if ((i & 16) != 0) {
            z2 = ovf0Var.e;
        }
        ovf0Var.getClass();
        qcnVar.getClass();
        auf0Var2.getClass();
        return new ovf0(qcnVar, auf0Var2, z3, z4, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovf0)) {
            return false;
        }
        ovf0 ovf0Var = (ovf0) obj;
        return Intrinsics.g(this.a, ovf0Var.a) && Intrinsics.g(this.b, ovf0Var.b) && this.c == ovf0Var.c && this.d == ovf0Var.d && this.e == ovf0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + mtg0.a(mtg0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeAlertUIState(listOptions=");
        sb.append(this.a);
        sb.append(", selectedOption=");
        sb.append(this.b);
        sb.append(", isTimeAlertEnabled=");
        nng.a(", isLoadingTimeAlert=", ", hasChangedTheOption=", sb, this.c, this.d);
        return mq0.a(sb, this.e, ")");
    }

    public ovf0(qcn<auf0> qcnVar, auf0 auf0Var, boolean z, boolean z2, boolean z3) {
        qcnVar.getClass();
        auf0Var.getClass();
        this.a = qcnVar;
        this.b = auf0Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public ovf0() {
        this(null, null, false, 31);
    }
}
