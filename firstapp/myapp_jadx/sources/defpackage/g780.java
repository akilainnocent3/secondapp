package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g780 {
    public final float a;
    public final float b;

    public g780(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g780)) {
            return false;
        }
        return g7f.b(0.0f, 0.0f) && g7f.b(0.0f, 0.0f) && g7f.b(0.0f, 0.0f) && g7f.b(this.a, ((g780) obj).a) && g7f.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + tvh.a(this.a, tvh.a(0.0f, tvh.a(0.0f, Float.hashCode(0.0f) * 31, 31), 31), 31);
    }
}
