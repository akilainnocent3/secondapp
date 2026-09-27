package wh;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public final class y5 implements x5 {
    @Override // wh.x5
    public int a(double[] dArr) {
        return c.b(dArr[0], dArr[1], dArr[2]);
    }

    @Override // wh.x5
    public double b(double[] dArr, double[] dArr2) {
        double d10 = dArr[0] - dArr2[0];
        double d11 = dArr[1] - dArr2[1];
        double d12 = dArr[2] - dArr2[2];
        return (d10 * d10) + (d11 * d11) + (d12 * d12);
    }

    @Override // wh.x5
    public double[] c(int i10) {
        double[] dArrL = c.l(i10);
        return new double[]{dArrL[0], dArrL[1], dArrL[2]};
    }
}
