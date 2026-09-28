package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h7f implements y4b {
    public final float a;

    public h7f(float f) {
        this.a = f;
    }

    @Override // defpackage.y4b
    public final float a(long j, mmd mmdVar) {
        return mmdVar.C1(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7f) && g7f.b(this.a, ((h7f) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return wi1.a(this.a, ".dp)", new StringBuilder("CornerSize(size = "));
    }
}
