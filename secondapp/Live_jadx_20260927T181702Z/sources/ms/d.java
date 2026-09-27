package ms;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class d implements f<Double> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f115130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f115131c;

    public d(double d10, double d11) {
        this.f115130b = d10;
        this.f115131c = d11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ms.f, ms.g
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return c(((Number) comparable).doubleValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ms.f
    public /* bridge */ /* synthetic */ boolean b(Comparable comparable, Comparable comparable2) {
        return g(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    public boolean c(double d10) {
        return d10 >= this.f115130b && d10 <= this.f115131c;
    }

    @Override // ms.g
    @oy.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Double d() {
        return Double.valueOf(this.f115131c);
    }

    public boolean equals(@oy.m Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f115130b == dVar.f115130b && this.f115131c == dVar.f115131c;
    }

    @Override // ms.g
    @oy.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Double m() {
        return Double.valueOf(this.f115130b);
    }

    public boolean g(double d10, double d11) {
        return d10 <= d11;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (f0.i.a(this.f115130b) * 31) + f0.i.a(this.f115131c);
    }

    @Override // ms.f, ms.g
    public boolean isEmpty() {
        return this.f115130b > this.f115131c;
    }

    @oy.l
    public String toString() {
        return this.f115130b + ".." + this.f115131c;
    }
}
