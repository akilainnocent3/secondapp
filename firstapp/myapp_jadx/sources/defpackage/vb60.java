package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vb60 {
    public final qcn<lg6> a;
    public final boolean b;

    public vb60(uf00 uf00Var, boolean z) {
        uf00Var.getClass();
        this.a = uf00Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb60)) {
            return false;
        }
        vb60 vb60Var = (vb60) obj;
        return Intrinsics.g(this.a, vb60Var.a) && this.b == vb60Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SBCardRowState(cardItems=");
        sb.append(this.a);
        sb.append(", isWinLine=");
        return ruw.a(sb, this.b, ')');
    }
}
