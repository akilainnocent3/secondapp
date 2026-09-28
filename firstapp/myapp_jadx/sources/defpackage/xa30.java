package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xa30 implements y4b {
    public final float a;

    public xa30(float f) {
        this.a = f;
    }

    @Override // defpackage.y4b
    public final float a(long j, mmd mmdVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xa30) && Float.compare(this.a, ((xa30) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return wi1.a(this.a, ".px)", new StringBuilder("CornerSize(size = "));
    }
}
