package defpackage;

import android.util.Range;
import defpackage.pnh0;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface snh0<T extends pnh0> extends h5f0<T>, d9n {
    public static final wg1 C;
    public static final wg1 D;
    public static final wg1 E;
    public static final wg1 F;
    public static final wg1 G;
    public static final wg1 H;
    public static final wg1 I;
    public static final wg1 J;
    public static final wg1 K;
    public static final wg1 L;
    public static final wg1 M;
    public static final wg1 y = hoa.a.a(wf80.class, "camerax.core.useCase.defaultSessionConfig");
    public static final wg1 z = hoa.a.a(ue6.class, "camerax.core.useCase.defaultCaptureConfig");
    public static final wg1 A = hoa.a.a(wf80.e.class, "camerax.core.useCase.sessionConfigUnpacker");
    public static final wg1 B = hoa.a.a(ue6.b.class, "camerax.core.useCase.captureConfigUnpacker");

    public class a implements h4f0.b {
        public a() {
        }

        @Override // h4f0.b
        public final m4f0 a(h8n.a aVar) {
            return new m4f0(aVar);
        }
    }

    public interface b<T extends pnh0, C extends snh0<T>, B> extends v1h<T> {
        C d();
    }

    static {
        Class cls = Integer.TYPE;
        C = hoa.a.a(cls, "camerax.core.useCase.surfaceOccupancyPriority");
        D = hoa.a.a(cls, "camerax.core.useCase.sessionType");
        E = hoa.a.a(Range.class, "camerax.core.useCase.targetFrameRate");
        F = hoa.a.a(Boolean.class, "camerax.core.useCase.isStrictFrameRateRequired");
        Class cls2 = Boolean.TYPE;
        G = hoa.a.a(cls2, "camerax.core.useCase.zslDisabled");
        H = hoa.a.a(cls2, "camerax.core.useCase.highResolutionDisabled");
        I = hoa.a.a(tnh0.b.class, "camerax.core.useCase.captureType");
        J = hoa.a.a(cls, "camerax.core.useCase.previewStabilizationMode");
        K = hoa.a.a(cls, "camerax.core.useCase.videoStabilizationMode");
        L = hoa.a.a(h4f0.b.class, "camerax.core.useCase.takePictureManagerProvider");
        M = hoa.a.a(o8e0.class, "camerax.core.useCase.streamUseCase");
    }

    default boolean A() {
        Boolean bool = (Boolean) b(F, Boolean.FALSE);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    default boolean C() {
        return ((Boolean) b(G, Boolean.FALSE)).booleanValue();
    }

    default wf80 I() {
        return (wf80) b(y, null);
    }

    default int J() {
        return ((Integer) b(C, 0)).intValue();
    }

    default wf80.e K() {
        return (wf80.e) b(A, null);
    }

    default wf80 M() {
        return (wf80) d(y);
    }

    default o8e0 O() {
        o8e0 o8e0Var = (o8e0) b(M, o8e0.DEFAULT);
        Objects.requireNonNull(o8e0Var);
        return o8e0Var;
    }

    default tnh0.b P() {
        return (tnh0.b) d(I);
    }

    default boolean S() {
        return e(E);
    }

    default int i() {
        return ((Integer) b(D, 0)).intValue();
    }

    default h4f0.b n() {
        h4f0.b bVar = (h4f0.b) b(L, new a());
        Objects.requireNonNull(bVar);
        return bVar;
    }

    default boolean o() {
        return ((Boolean) b(H, Boolean.FALSE)).booleanValue();
    }

    default int u() {
        return ((Integer) b(K, 0)).intValue();
    }

    default Range<Integer> w(Range<Integer> range) {
        return (Range) b(E, range);
    }

    default int z() {
        return ((Integer) b(J, 0)).intValue();
    }
}
