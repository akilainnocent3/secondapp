package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class v3l {
    public final float a;

    public v3l(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3l) && g7f.b(this.a, ((v3l) obj).a) && Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return tug.a("GlowLayer(blurRadius=", g7f.c(this.a), ", alpha=1.0)");
    }
}
