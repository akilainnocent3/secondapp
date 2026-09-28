package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ffs implements f9i {
    public final float a;

    public ffs(float f) {
        this.a = f;
    }

    @Override // defpackage.f9i
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.f9i
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ffs) && Float.compare(this.a, ((ffs) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return h70.a(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}
