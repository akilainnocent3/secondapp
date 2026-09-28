package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i8n implements snh0<h8n>, x9n, v0p {
    public static final wg1 O;
    public static final wg1 P;
    public static final wg1 Q;
    public static final wg1 R;
    public static final wg1 S;
    public static final wg1 T;
    public static final wg1 U;
    public static final wg1 V;
    public static final wg1 W;
    public static final wg1 X;
    public static final wg1 Y;
    public static final wg1 Z;
    public final w2z N;

    static {
        Class cls = Integer.TYPE;
        O = hoa.a.a(cls, "camerax.core.imageCapture.captureMode");
        P = hoa.a.a(cls, "camerax.core.imageCapture.flashMode");
        Q = hoa.a.a(pe6.class, "camerax.core.imageCapture.captureBundle");
        R = hoa.a.a(Integer.class, "camerax.core.imageCapture.bufferFormat");
        S = hoa.a.a(Integer.class, "camerax.core.imageCapture.outputFormat");
        hoa.a.a(Integer.class, "camerax.core.imageCapture.maxCaptureStages");
        T = hoa.a.a(kan.class, "camerax.core.imageCapture.imageReaderProxyProvider");
        U = hoa.a.a(Boolean.TYPE, "camerax.core.imageCapture.useSoftwareJpegEncoder");
        V = hoa.a.a(cls, "camerax.core.imageCapture.flashType");
        W = hoa.a.a(cls, "camerax.core.imageCapture.jpegCompressionQuality");
        X = hoa.a.a(h8n.i.class, "camerax.core.imageCapture.screenFlash");
        Y = hoa.a.a(xf50.class, "camerax.core.useCase.postviewResolutionSelector");
        Z = hoa.a.a(Boolean.class, "camerax.core.useCase.isPostviewEnabled");
    }

    public i8n(w2z w2zVar) {
        this.N = w2zVar;
    }

    @Override // defpackage.q340
    public final hoa l() {
        return this.N;
    }

    @Override // defpackage.d9n
    public final int m() {
        return ((Integer) d(d9n.h)).intValue();
    }
}
