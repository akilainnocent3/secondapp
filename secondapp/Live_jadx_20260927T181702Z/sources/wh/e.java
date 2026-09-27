package wh;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f143048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f143049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f143050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f143051d;

    public e(double d10, double d11, double d12, double d13) {
        this.f143048a = d10;
        this.f143049b = d11;
        this.f143050c = d12;
        this.f143051d = d13;
    }

    public double a(double d10) {
        if (d10 <= -1.0d) {
            return this.f143048a;
        }
        if (d10 < 0.0d) {
            return w5.d(this.f143048a, this.f143049b, (d10 - (-1.0d)) / 1.0d);
        }
        if (d10 < 0.5d) {
            return w5.d(this.f143049b, this.f143050c, (d10 - 0.0d) / 0.5d);
        }
        return d10 < 1.0d ? w5.d(this.f143050c, this.f143051d, (d10 - 0.5d) / 0.5d) : this.f143051d;
    }
}
