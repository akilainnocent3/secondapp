package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ow4 {
    public final ya5 a;
    public final ya5 b;
    public final j58 c;

    public ow4(ya5 ya5Var, ya5 ya5Var2, j58 j58Var) {
        this.a = ya5Var;
        this.b = ya5Var2;
        this.c = j58Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow4)) {
            return false;
        }
        ow4 ow4Var = (ow4) obj;
        return this.a.equals(ow4Var.a) && this.b.equals(ow4Var.b) && Intrinsics.g(this.c, ow4Var.c);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        j58 j58Var = this.c;
        if (j58Var == null) {
            iHashCode = 0;
        } else {
            long j = j58Var.a;
            nbh0.a aVar = nbh0.b;
            iHashCode = Long.hashCode(j);
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        return "BonusVaultToastVisualStyle(backgroundBrush=" + this.a + ", borderBrush=" + this.b + ", glowColor=" + this.c + ')';
    }
}
