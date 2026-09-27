package su;

import dr.o0;
import kotlin.jvm.internal.m0;
import ou.w1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class s {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135529a;

        static {
            int[] iArr = new int[w1.values().length];
            try {
                iArr[w1.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w1.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w1.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f135529a = iArr;
        }
    }

    @oy.l
    public static final w a(@oy.l w1 w1Var) {
        m0.p(w1Var, "<this>");
        int i10 = a.f135529a[w1Var.ordinal()];
        if (i10 == 1) {
            return w.INV;
        }
        if (i10 == 2) {
            return w.IN;
        }
        if (i10 == 3) {
            return w.OUT;
        }
        throw new o0();
    }
}
