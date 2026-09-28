package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vj1 {
    public final uj1 a;
    public final uj1 b;
    public final uj1 c;
    public final uj1 d;

    public vj1(uj1 uj1Var, uj1 uj1Var2, uj1 uj1Var3, uj1 uj1Var4) {
        if (uj1Var == null) {
            bmy.a("Null previewOutputSurface");
            throw null;
        }
        this.a = uj1Var;
        if (uj1Var2 == null) {
            bmy.a("Null imageCaptureOutputSurface");
            throw null;
        }
        this.b = uj1Var2;
        this.c = uj1Var3;
        this.d = uj1Var4;
    }

    public final uj1 a() {
        return this.c;
    }

    public final uj1 b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vj1)) {
            return false;
        }
        vj1 vj1Var = (vj1) obj;
        if (!this.a.equals(vj1Var.a) || !this.b.equals(vj1Var.b)) {
            return false;
        }
        uj1 uj1Var = this.c;
        if (uj1Var == null) {
            if (vj1Var.a() != null) {
                return false;
            }
        } else if (!uj1Var.equals(vj1Var.a())) {
            return false;
        }
        uj1 uj1Var2 = this.d;
        if (uj1Var2 == null) {
            return vj1Var.b() == null;
        }
        return uj1Var2.equals(vj1Var.b());
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        uj1 uj1Var = this.c;
        int iHashCode2 = (iHashCode ^ (uj1Var == null ? 0 : uj1Var.hashCode())) * 1000003;
        uj1 uj1Var2 = this.d;
        return iHashCode2 ^ (uj1Var2 != null ? uj1Var2.hashCode() : 0);
    }

    public final String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.a + ", imageCaptureOutputSurface=" + this.b + ", imageAnalysisOutputSurface=" + this.c + ", postviewOutputSurface=" + this.d + "}";
    }
}
