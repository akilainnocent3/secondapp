package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ovk {
    public static final ovk f;
    public final boolean a;
    public final qcn<eok> b;
    public final qcn<eok> c;
    public final boolean d;
    public final ipk e;

    static {
        n1a0 n1a0Var = n1a0.c;
        f = new ovk(false, n1a0Var, n1a0Var, false, ipk.a);
    }

    public ovk(boolean z, qcn<eok> qcnVar, qcn<eok> qcnVar2, boolean z2, ipk ipkVar) {
        qcnVar.getClass();
        qcnVar2.getClass();
        this.a = z;
        this.b = qcnVar;
        this.c = qcnVar2;
        this.d = z2;
        this.e = ipkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovk)) {
            return false;
        }
        ovk ovkVar = (ovk) obj;
        return this.a == ovkVar.a && Intrinsics.g(this.b, ovkVar.b) && Intrinsics.g(this.c, ovkVar.c) && this.d == ovkVar.d && this.e == ovkVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + mtg0.a(shu.a(this.c, shu.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        return "GiftSelectorUiState(isVisible=" + this.a + ", applicableGiftList=" + this.b + ", nonApplicableGiftList=" + this.c + ", isUseCashOnlyVisible=" + this.d + ", loadState=" + this.e + ")";
    }
}
