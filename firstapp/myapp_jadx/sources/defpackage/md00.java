package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class md00 implements y4b {
    public final float a;

    public md00(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            zkn.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.y4b
    public final float a(long j, mmd mmdVar) {
        return (this.a / 100.0f) * yw90.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof md00) && Float.compare(this.a, ((md00) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return wi1.a(this.a, "%)", new StringBuilder("CornerSize(size = "));
    }
}
