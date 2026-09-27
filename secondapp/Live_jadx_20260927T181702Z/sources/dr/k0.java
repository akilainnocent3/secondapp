package dr;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class k0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f79467a;

        static {
            int[] iArr = new int[m0.values().length];
            try {
                iArr[m0.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m0.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m0.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f79467a = iArr;
        }
    }

    @oy.l
    public static <T> i0<T> a(@oy.l m0 mode, @oy.l ds.a<? extends T> initializer) {
        kotlin.jvm.internal.m0.p(mode, "mode");
        kotlin.jvm.internal.m0.p(initializer, "initializer");
        int i10 = a.f79467a[mode.ordinal()];
        int i11 = 2;
        if (i10 == 1) {
            kotlin.jvm.internal.x xVar = null;
            return new s1(initializer, xVar, i11, xVar);
        }
        if (i10 == 2) {
            return new k1(initializer);
        }
        if (i10 == 3) {
            return new x2(initializer);
        }
        throw new o0();
    }

    @oy.l
    public static <T> i0<T> b(@oy.l ds.a<? extends T> initializer) {
        kotlin.jvm.internal.m0.p(initializer, "initializer");
        kotlin.jvm.internal.x xVar = null;
        return new s1(initializer, xVar, 2, xVar);
    }

    @oy.l
    public static final <T> i0<T> c(@oy.m Object obj, @oy.l ds.a<? extends T> initializer) {
        kotlin.jvm.internal.m0.p(initializer, "initializer");
        return new s1(initializer, obj);
    }
}
