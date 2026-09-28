package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ryj {
    public final long a;
    public final long b;
    public final long c;
    public final ak5 d;
    public final ak5 e;

    public ryj(long j, long j2, long j3, ak5 ak5Var, ak5 ak5Var2) {
        ak5Var.getClass();
        ak5Var2.getClass();
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = ak5Var;
        this.e = ak5Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryj)) {
            return false;
        }
        ryj ryjVar = (ryj) obj;
        long j = ryjVar.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && nbh0.a(this.b, ryjVar.b) && nbh0.a(this.c, ryjVar.c) && Intrinsics.g(this.d, ryjVar.d) && Intrinsics.g(this.e, ryjVar.e);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return this.e.hashCode() + ((this.d.hashCode() + f87.a(f87.a(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31)) * 31);
    }

    public final String toString() {
        String strI = j58.i(this.a);
        String strI2 = j58.i(this.b);
        String strI3 = j58.i(this.c);
        StringBuilder sbA = ux5.a("GeneralAlertDialogColors(containerColor=", strI, ", titleColor=", strI2, ", contentColor=");
        sbA.append(strI3);
        sbA.append(", confirmButtonColor=");
        sbA.append(this.d);
        sbA.append(", dismissButtonColor=");
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }
}
