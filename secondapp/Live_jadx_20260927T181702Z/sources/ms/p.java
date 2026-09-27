package ms;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class p implements r<Double> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f115158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f115159c;

    public p(double d10, double d11) {
        this.f115158b = d10;
        this.f115159c = d11;
    }

    private final boolean f(double d10, double d11) {
        return d10 <= d11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ms.r
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return b(((Number) comparable).doubleValue());
    }

    public boolean b(double d10) {
        return d10 >= this.f115158b && d10 < this.f115159c;
    }

    @Override // ms.r
    @oy.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Double e() {
        return Double.valueOf(this.f115159c);
    }

    @Override // ms.r
    @oy.l
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Double m() {
        return Double.valueOf(this.f115158b);
    }

    public boolean equals(@oy.m Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        if (isEmpty() && ((p) obj).isEmpty()) {
            return true;
        }
        p pVar = (p) obj;
        return this.f115158b == pVar.f115158b && this.f115159c == pVar.f115159c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (f0.i.a(this.f115158b) * 31) + f0.i.a(this.f115159c);
    }

    @Override // ms.r
    public boolean isEmpty() {
        return this.f115158b >= this.f115159c;
    }

    @oy.l
    public String toString() {
        return this.f115158b + "..<" + this.f115159c;
    }
}
