package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y7n implements snh0<x7n>, x9n, pof0 {
    public static final wg1 O = hoa.a.a(x7n.a.class, "camerax.core.imageAnalysis.backpressureStrategy");
    public static final wg1 P = hoa.a.a(Integer.TYPE, "camerax.core.imageAnalysis.imageQueueDepth");
    public static final wg1 Q = hoa.a.a(kan.class, "camerax.core.imageAnalysis.imageReaderProxyProvider");
    public final w2z N;

    static {
        hoa.a.a(x7n.d.class, "camerax.core.imageAnalysis.outputImageFormat");
        hoa.a.a(Boolean.class, "camerax.core.imageAnalysis.onePixelShiftEnabled");
        hoa.a.a(Boolean.class, "camerax.core.imageAnalysis.outputImageRotationEnabled");
    }

    public y7n(w2z w2zVar) {
        this.N = w2zVar;
    }

    @Override // defpackage.q340
    public final hoa l() {
        return this.N;
    }

    @Override // defpackage.d9n
    public final int m() {
        return 35;
    }
}
