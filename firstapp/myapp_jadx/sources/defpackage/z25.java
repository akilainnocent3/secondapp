package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z25 {
    public t70 a = null;
    public h40 b = null;
    public qc6 c = null;
    public j90 d = null;

    public z25(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z25)) {
            return false;
        }
        z25 z25Var = (z25) obj;
        return Intrinsics.g(this.a, z25Var.a) && Intrinsics.g(this.b, z25Var.b) && Intrinsics.g(this.c, z25Var.c) && Intrinsics.g(this.d, z25Var.d);
    }

    public final int hashCode() {
        t70 t70Var = this.a;
        int iHashCode = (t70Var == null ? 0 : t70Var.hashCode()) * 31;
        h40 h40Var = this.b;
        int iHashCode2 = (iHashCode + (h40Var == null ? 0 : h40Var.hashCode())) * 31;
        qc6 qc6Var = this.c;
        int iHashCode3 = (iHashCode2 + (qc6Var == null ? 0 : qc6Var.hashCode())) * 31;
        j90 j90Var = this.d;
        return iHashCode3 + (j90Var != null ? j90Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
