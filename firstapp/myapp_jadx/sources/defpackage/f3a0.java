package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f3a0 implements uov.a {
    public final float a;
    public final int b;

    public f3a0(int i, float f) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f3a0.class == obj.getClass()) {
            f3a0 f3a0Var = (f3a0) obj;
            if (this.a == f3a0Var.a && this.b == f3a0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.a).hashCode() + 527) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }
}
