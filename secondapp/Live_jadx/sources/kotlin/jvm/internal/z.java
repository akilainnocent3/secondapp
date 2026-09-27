package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class z extends d1<double[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final double[] f102820d;

    public z(int i10) {
        super(i10);
        this.f102820d = new double[i10];
    }

    public final void h(double d10) {
        double[] dArr = this.f102820d;
        int iB = b();
        e(iB + 1);
        dArr[iB] = d10;
    }

    @Override // kotlin.jvm.internal.d1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@oy.l double[] dArr) {
        m0.p(dArr, "<this>");
        return dArr.length;
    }

    @oy.l
    public final double[] j() {
        return g(this.f102820d, new double[f()]);
    }
}
