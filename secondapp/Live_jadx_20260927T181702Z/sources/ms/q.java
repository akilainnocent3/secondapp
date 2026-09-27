package ms;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class q implements r<Float> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f115160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f115161c;

    public q(float f10, float f11) {
        this.f115160b = f10;
        this.f115161c = f11;
    }

    private final boolean f(float f10, float f11) {
        return f10 <= f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ms.r
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return b(((Number) comparable).floatValue());
    }

    public boolean b(float f10) {
        return f10 >= this.f115160b && f10 < this.f115161c;
    }

    @Override // ms.r
    @oy.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float e() {
        return Float.valueOf(this.f115161c);
    }

    @Override // ms.r
    @oy.l
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float m() {
        return Float.valueOf(this.f115160b);
    }

    public boolean equals(@oy.m Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        if (isEmpty() && ((q) obj).isEmpty()) {
            return true;
        }
        q qVar = (q) obj;
        return this.f115160b == qVar.f115160b && this.f115161c == qVar.f115161c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.floatToIntBits(this.f115160b) * 31) + Float.floatToIntBits(this.f115161c);
    }

    @Override // ms.r
    public boolean isEmpty() {
        return this.f115160b >= this.f115161c;
    }

    @oy.l
    public String toString() {
        return this.f115160b + "..<" + this.f115161c;
    }
}
