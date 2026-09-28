package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wo70 {
    public final float a;
    public final long b;
    public final Float c;
    public final tmz d;

    public wo70(float f, long j, Float f2, umz umzVar, int i) {
        f = (i & 1) != 0 ? 8.0f : f;
        j = (i & 2) != 0 ? j58.e : j;
        f2 = (i & 4) != 0 ? null : f2;
        umzVar = (i & 16) != 0 ? new umz(0.0f, 0.0f, 0.0f, 0.0f) : umzVar;
        this.a = f;
        this.b = j;
        this.c = f2;
        this.d = umzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo70)) {
            return false;
        }
        wo70 wo70Var = (wo70) obj;
        if (!g7f.b(this.a, wo70Var.a)) {
            return false;
        }
        long j = wo70Var.b;
        int i = j58.n;
        return nbh0.a(this.b, j) && Intrinsics.g(this.c, wo70Var.c) && Intrinsics.g(this.d, wo70Var.d);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        int iA = f87.a(iHashCode, this.b, 31);
        Float f = this.c;
        return this.d.hashCode() + ((iA + (f == null ? 0 : f.hashCode())) * 961);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ScrollBarConfig(indicatorThickness=", g7f.c(this.a), ", indicatorColor=", j58.i(this.b), ", alpha=");
        sbA.append(this.c);
        sbA.append(", alphaAnimationSpec=null, padding=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
