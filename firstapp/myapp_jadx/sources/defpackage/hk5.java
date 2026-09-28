package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hk5 {
    public final float a;
    public final float b;

    public hk5(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof hk5)) {
            return false;
        }
        hk5 hk5Var = (hk5) obj;
        return g7f.b(this.a, hk5Var.a) && g7f.b(0.0f, 0.0f) && g7f.b(0.0f, 0.0f) && g7f.b(this.b, hk5Var.b) && g7f.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + tvh.a(this.b, tvh.a(0.0f, tvh.a(0.0f, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
