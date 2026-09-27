package fx;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final z0 f85747a = new z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f85748b = 65536;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final y0 f85749c = new y0(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f85750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final AtomicReference<y0>[] f85751e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f85750d = iHighestOneBit;
        AtomicReference<y0>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f85751e = atomicReferenceArr;
    }

    @cs.o
    public static final void d(@oy.l y0 segment) {
        AtomicReference<y0> atomicReferenceA;
        y0 y0Var;
        y0 andSet;
        kotlin.jvm.internal.m0.p(segment, "segment");
        if (segment.f85745f != null || segment.f85746g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f85743d || (andSet = (atomicReferenceA = f85747a.a()).getAndSet((y0Var = f85749c))) == y0Var) {
            return;
        }
        int i10 = andSet != null ? andSet.f85742c : 0;
        if (i10 >= f85748b) {
            atomicReferenceA.set(andSet);
            return;
        }
        segment.f85745f = andSet;
        segment.f85741b = 0;
        segment.f85742c = i10 + 8192;
        atomicReferenceA.set(segment);
    }

    @oy.l
    @cs.o
    public static final y0 e() {
        AtomicReference<y0> atomicReferenceA = f85747a.a();
        y0 y0Var = f85749c;
        y0 andSet = atomicReferenceA.getAndSet(y0Var);
        if (andSet == y0Var) {
            return new y0();
        }
        if (andSet == null) {
            atomicReferenceA.set(null);
            return new y0();
        }
        atomicReferenceA.set(andSet.f85745f);
        andSet.f85745f = null;
        andSet.f85742c = 0;
        return andSet;
    }

    public final AtomicReference<y0> a() {
        return f85751e[(int) (Thread.currentThread().getId() & (((long) f85750d) - 1))];
    }

    public final int b() {
        y0 y0Var = a().get();
        if (y0Var == null) {
            return 0;
        }
        return y0Var.f85742c;
    }

    public final int c() {
        return f85748b;
    }
}
