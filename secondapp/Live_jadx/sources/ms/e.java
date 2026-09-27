package ms;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class e implements f<Float> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f115132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f115133c;

    public e(float f10, float f11) {
        this.f115132b = f10;
        this.f115133c = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ms.f, ms.g
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return c(((Number) comparable).floatValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ms.f
    public /* bridge */ /* synthetic */ boolean b(Comparable comparable, Comparable comparable2) {
        return g(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public boolean c(float f10) {
        return f10 >= this.f115132b && f10 <= this.f115133c;
    }

    @Override // ms.g
    @oy.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Float d() {
        return Float.valueOf(this.f115133c);
    }

    public boolean equals(@oy.m Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.f115132b == eVar.f115132b && this.f115133c == eVar.f115133c;
    }

    @Override // ms.g
    @oy.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Float m() {
        return Float.valueOf(this.f115132b);
    }

    public boolean g(float f10, float f11) {
        return f10 <= f11;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.floatToIntBits(this.f115132b) * 31) + Float.floatToIntBits(this.f115133c);
    }

    @Override // ms.f, ms.g
    public boolean isEmpty() {
        return this.f115132b > this.f115133c;
    }

    @oy.l
    public String toString() {
        return this.f115132b + ".." + this.f115133c;
    }
}
